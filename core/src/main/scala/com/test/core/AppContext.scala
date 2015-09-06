package com.test.core

import android.content.Context
import android.support.multidex.MultiDexApplication


/**
 * Copyrighted by Aptekarsk LLC (c) 2014
 * Created by Alexey Afanasev on 13.08.14.
 */
object AppContext {
  private var instance: AppContext = null

  def getInstance: AppContext = {
    instance
  }

  def getContext: Context = {
    instance.getApplicationContext
  }
}

class AppContext extends MultiDexApplication {
  override def onCreate() {
    super.onCreate()
    AppContext.instance = this
    AppSettings.setup(this.getApplicationContext)
    com.hanhuy.android.protify.agent.Protify.install(this)
  }

  override def onLowMemory() {
    super.onLowMemory()
  }
}