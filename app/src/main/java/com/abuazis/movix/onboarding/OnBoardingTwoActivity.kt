package com.abuazis.movix.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abuazis.movix.R
import kotlinx.android.synthetic.main.activity_onboarding_three.*

class OnBoardingTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        setContentView(R.layout.activity_onboarding_two)

        btn_tiket.setOnClickListener {
            val intent = Intent(this@OnBoardingTwoActivity,
                OnBoardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}
