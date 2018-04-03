package dakar.miniapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        btn_back4.setOnClickListener {

            val intent = Intent(this, AppsActivity::class.java)
            startActivity(intent)

        }
        videoView1.setVideoPath(
                "http://techslides.com/demos/sample-videos/small.mp4")

        videoView1.start()
    }
}
