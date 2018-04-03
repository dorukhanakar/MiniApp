package dakar.miniapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_modern_innova_project.*
import ss.com.bannerslider.banners.Banner
import ss.com.bannerslider.banners.RemoteBanner
import java.util.*

class ModernInnovaProject : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modern_innova_project)
        setupBannerSlider()
        btn_back3.setOnClickListener {
            val intent = Intent(this, AppsActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupBannerSlider() {

        addBanners()

        banner_slider1.setOnBannerClickListener { position -> Toast.makeText(this, "Banner with position " + position.toString() + " clicked!", Toast.LENGTH_SHORT).show() }
    }

    private fun addBanners() {
        val remoteBanners1 = ArrayList<Banner>()


        remoteBanners1.add(RemoteBanner(
                "http://ozanust.com/wp-content/uploads/2017/11/peugeot.png"
        ))
        remoteBanners1.add(RemoteBanner(
                "http://moderninnova.com/wp-content/uploads/2017/11/empatisimulasyonu-2.png"
        ))
        remoteBanners1.add(RemoteBanner(
                "http://moderninnova.com/wp-content/uploads/2017/11/empatisimulasyonu.png"
        ))
        remoteBanners1.add(RemoteBanner(
                "http://moderninnova.com/wp-content/uploads/2017/11/mimarisimulasyon.png"
        ))
        banner_slider1.setBanners(remoteBanners1)

    }
}
