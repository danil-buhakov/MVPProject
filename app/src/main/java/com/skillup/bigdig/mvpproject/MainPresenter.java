package com.skillup.bigdig.mvpproject;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

  public void handleTextAndShowIt(){
    getViewState().showHelpToastWithText();
    getViewState().changeButtonText(
        MainModelCollection.mainModel.getButtonText());
  }

}
