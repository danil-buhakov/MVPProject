package com.skillup.bigdig.mvpproject;

import com.arellomobile.mvp.MvpView;

public interface MainView extends MvpView {

  void showHelpToastWithText();

  void changeButtonText(String text);
}
