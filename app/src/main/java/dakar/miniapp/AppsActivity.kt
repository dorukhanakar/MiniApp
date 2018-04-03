package dakar.miniapp

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_apps.*
import java.util.*

<<<<<<< HEAD
@Suppress("DEPRECATION")
=======

>>>>>>> First Commit <3
class AppsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apps)

        btn_back1.setOnClickListener {

            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }
        btn_webview.setOnClickListener {

            val intent = Intent(this, ModernInnovaActivity::class.java)
            startActivity(intent)
        }
        btn_projects.setOnClickListener {

            val intent = Intent(this, ModernInnovaProject::class.java)
            startActivity(intent)

        }
        btn_video.setOnClickListener {

            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)

        }
        btn_tomap.setOnClickListener {

            val uri = String.format(Locale.getDefault(), "https://www.google.com.tr/maps/place/Modern+Innova/@40.9721912,29.0435868,15z/data=!4m12!1m6!3m5!1s0x0:0x26bf09b1d31b18e!2sModern+Innova!8m2!3d40.9713169!4d29.0523419!3m4!1s0x0:0x26bf09b1d31b18e!8m2!3d40.9713169!4d29.0523419", 12f, 2f, "Modern Innova")
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intent.`package` = "com.google.android.apps.maps"
            startActivity(intent)

        }
        btn_xox.setOnClickListener {

            val intent = Intent(this, XOXOyna::class.java)
            startActivity(intent)

        }
        btn_pushntf.setOnClickListener {

            val pendingIntent = PendingIntent.getActivity(this@AppsActivity, 0, intent, 0)

            val notification = NotificationCompat.Builder(this)
                    .setTicker("")
                    .setContentTitle("Notification")
                    .setContentText("Merhaba")
                    .setSmallIcon(R.drawable.notification_icon_background)
                    .setContentIntent(pendingIntent).notification


            val notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0, notification)

        }
    }
}
