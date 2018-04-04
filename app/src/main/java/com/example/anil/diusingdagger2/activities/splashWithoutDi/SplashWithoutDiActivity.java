package com.example.anil.diusingdagger2.activities.splashWithoutDi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.anil.diusingdagger2.R;
import com.example.anil.diusingdagger2.activities.splashWithDi.SplashWithDiActivity;
import com.example.anil.diusingdagger2.retrofit.RestClient;

public class SplashWithoutDiActivity extends AppCompatActivity implements SplashWithoutDiView {

    SplashWitoutDiPresenter presenter = new SplashWitoutDiPresenterImpl(this, RestClient.getApiInterface());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.getAppVersion();
    }


    @Override
    public void moveToSplashWithDi() {
        startActivity(new Intent(this, SplashWithDiActivity.class));
    }

    @Override
    public void showError(final String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT);
    }
}
