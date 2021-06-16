package com.atg.util;

import com.atg.pages.HorsePage;

public class PageObjectManager {

  private HorsePage horsePage;

  public HorsePage getHorsePageObj() {
    return (horsePage == null) ? horsePage = new HorsePage() : horsePage;
  }

}
