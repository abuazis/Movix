package com.abuazis.movix.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abuazis.movix.R
import com.abuazis.movix.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_onboarding_three.*

class OnBoardingThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        setContentView(R.layout.activity_onboarding_three)

        btn_tiket.setOnClickListener {
            val intent = Intent(this@OnBoardingThreeActivity,
                SignInActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
}
