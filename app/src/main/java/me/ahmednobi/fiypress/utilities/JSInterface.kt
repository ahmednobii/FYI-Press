package me.ahmednobi.fiypress.utilities

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.Settings.Global.getString
import android.util.Log
import android.webkit.JavascriptInterface
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.getSystemService
import me.ahmednobi.fiypress.MainActivity
import me.ahmednobi.fiypress.R

//this class is used to to add a javasctipt inteface
class JSInterface  (val context :Context)
{
    val CLASS_TAG = "WebInterface"
    @JavascriptInterface
    fun test (text :String) {
        Log.d(CLASS_TAG , "Loaded")
    }

    fun notificatiioBuilder(data: MutableMap<String, String>) {
        val intent = Intent(context.applicationContext, MainActivity::class.java)


        val pendingIntent =
            PendingIntent.getActivity(context.applicationContext, 0, intent, PendingIntent.FLAG_ONE_SHOT)

        val style = NotificationCompat.BigPictureStyle()
        val builder = NotificationCompat.Builder(context.applicationContext, "0")




        builder.setContentTitle(data["title"])
            .setSmallIcon(R.drawable.fyipress)
            .setColor(context.resources.getColor(R.color.colorPrimary))
            .setContentText(data["body"])
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .setCategory(NotificationCompat.CATEGORY_CALL)
            .setLights(NotificationCompat.DEFAULT_LIGHTS, 2, 1)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = context.getString(R.string.channel_name)
            val descriptionText = context.getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_HIGH
            val mChannel = NotificationChannel("0", name, importance)
            mChannel.description = descriptionText
            mChannel.enableLights(true)
            mChannel.enableVibration(true)

            mChannel.lockscreenVisibility = Notification.VISIBILITY_PUBLIC


            val systemService = context.getSystemService(context.packageName)
            val notificationManager = (if (systemService != null) systemService else throw KotlinNullPointerException()) as NotificationManager
            notificationManager.createNotificationChannel(mChannel)
            notificationManager.notify(0, builder.build())
        }
    }

}