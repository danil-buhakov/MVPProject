package com.skillup.bigdig.mvpproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView {
  @InjectPresenter
  public MainPresenter presenter;

  Button btHelloWorld;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    btHelloWorld = findViewById(R.id.bt_hello_world);
    btHelloWorld.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        presenter.handleTextAndShowIt();
      }
    });
  }

  @Override
  public void showHelpToastWithText() {
    Toast.makeText(this,"text", Toast.LENGTH_SHORT).show();
  }

  @Override
  public void changeButtonText(String text) {
    btHelloWorld.setText(text);
  }
}
