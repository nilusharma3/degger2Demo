package com.example.anil.diusingdagger2.retrofit;

import android.support.annotation.NonNull;

import com.google.gson.JsonSyntaxException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

import static com.example.anil.diusingdagger2.constants.StatusCodeConstant.DEFAULT_STATUS_CODE;


/**
 * Developer: Saurabh Verma
 * Dated: 7/3/17
 **/

/**
 * Custom Retrofit ResponseResolver
 *
 * @param <T> the type parameter
 */
public abstract class ResponseResolver<T> implements Callback<T> {
    /**
     * The constant UNEXPECTED_ERROR_OCCURRED.
     */
    static final String UNEXPECTED_ERROR_OCCURRED = "Something went wrong. Please try again later";
    private static final String NO_INTERNET_MESSAGE = "No internet connection. Please try again later.";
    private static final String REMOTE_SERVER_FAILED_MESSAGE = "Application server could not respond. Please try later.";
    private static final String PARSING_ERROR = "Parsing error";
    private static final String RESOLVE_NETWORK_ERROR = "Resolve Network Error = ";

    /**
     * Instantiates a new Response resolver.
     *
     * @param
     */
    public ResponseResolver() {
    }


    /**
     * Success.
     *
     * @param t the t
     */
    public abstract void success(T t);

    /**
     * Failure.
     *
     * @param error the error
     */
    public abstract void failure(APIError error);

    @Override
    public void onResponse(@NonNull final Call<T> t, @NonNull final Response<T> tResponse) {
//        try {
//            Timber.e(BuildConfig.APPLICATION_ID,
// String.format("Status Code >>> %s", new JSONObject(new Gson().toJson(tResponse.body())).getInt("statusCode")));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        if (tResponse.isSuccessful()) {
            success(tResponse.body());
        } else {
            fireError(ErrorUtils.parseError(tResponse));
        }
    }

    @Override
    public void onFailure(@NonNull final Call<T> t, @NonNull final Throwable throwable) {
        fireError(new APIError(DEFAULT_STATUS_CODE, resolveNetworkError(throwable)));
    }


    /**
     * Fire error.
     *
     * @param apiError the api error
     */
    private void fireError(final APIError apiError) {
        failure(apiError);
    }

    /**
     * Method resolve network errors
     *
     * @param cause Object of Throwable
     * @return message of network error
     */
    private String resolveNetworkError(final Throwable cause) {
        Timber.e(RESOLVE_NETWORK_ERROR, String.valueOf(cause.toString()));
        if (cause instanceof UnknownHostException) {
            return NO_INTERNET_MESSAGE;
        } else if (cause instanceof SocketTimeoutException) {
            return REMOTE_SERVER_FAILED_MESSAGE;
        } else if (cause instanceof ConnectException) {
            return NO_INTERNET_MESSAGE;
        } else if (cause instanceof JsonSyntaxException) {
            return PARSING_ERROR;
        } else if (cause instanceof IllegalArgumentException) {
            return cause.getMessage();
        }
        return UNEXPECTED_ERROR_OCCURRED;
    }
}
