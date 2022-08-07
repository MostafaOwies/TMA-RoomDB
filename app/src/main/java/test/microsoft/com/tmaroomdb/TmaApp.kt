package test.microsoft.com.tmaroomdb

import android.app.Application
import test.microsoft.com.tmaroomdb.roomdb.TmaDataBase

class TmaApp:Application (){
    val myDb by lazy {
        TmaDataBase.getInstance(this)
    }
}