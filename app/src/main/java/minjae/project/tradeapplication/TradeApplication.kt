package minjae.project.tradeapplication

import android.app.Application
import android.content.Context

class TradeApplication: Application() {

    companion object {
        var appContext: Context? = null
            private set
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    override fun onTerminate() {
        super.onTerminate()
        appContext = null
    }

}