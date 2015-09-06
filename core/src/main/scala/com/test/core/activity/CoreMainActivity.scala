package com.test.core.activity

import android.os.Bundle
import org.scaloid.common._

/**
 * Copyright (c) 2014 Aptekarsk LLC. All rights reserved.
 * Created by aafanasiev on 01.05.14.
 */

class CoreMainActivity extends SActivity {

  protected override def onCreate(b: Bundle): Unit = {
    super.onCreate(b)

    contentView = new SVerticalLayout {
      STextView("change me! 3")
    }.padding(20)
  }

}




