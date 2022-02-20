package com.mindorks.framework.services

import android.app.Service
import android.content.Intent
import android.os.IBinder

class DownloadService: Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

}