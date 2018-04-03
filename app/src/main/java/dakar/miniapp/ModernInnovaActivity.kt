package dakar.miniapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_modern_innova.*

class ModernInnovaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modern_innova)

        btn_back2.setOnClickListener {
            val intent = Intent(this, AppsActivity::class.java)
            startActivity(intent)
        }
        web_modern.getSettings().setJavaScriptEnabled(true);
        web_modern.loadUrl("http://moderninnova.com/")
    }

}
