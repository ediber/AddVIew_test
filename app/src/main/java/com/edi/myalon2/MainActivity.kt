package com.edi.myalon2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize.BANNER
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/// Create an ad request.
        var adRequestBuilder = AdRequest.Builder();

        // Optionally populate the ad request builder.
//        adRequestBuilder.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
        adRequestBuilder.addTestDevice("ca-app-pub-3940256099942544/6300978111")


        // Start loading the ad.
        adView.loadAd(adRequestBuilder.build());

    }
}
