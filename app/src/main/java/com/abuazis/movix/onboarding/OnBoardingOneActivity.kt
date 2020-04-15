package com.abuazis.movix.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abuazis.movix.R
import com.abuazis.movix.sign.signin.SignInActivity
import com.abuazis.movix.utils.Preferences
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnBoardingOneActivity : AppCompatActivity() {

    lateinit var preferences : Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        setContentView(R.layout.activity_onboarding)

        preferences = Preferences(this)

        if(preferences.getValues("onboarding").equals("1")) {
            finishAffinity()

            val intent = Intent(this@OnBoardingOneActivity,
                SignInActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        tv_skip.setOnClickListener {
            val intent = Intent(this@OnBoardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }

        btn_tiket.setOnClickListener {
            val intent = Intent(this@OnBoardingOneActivity,
                OnBoardingTwoActivity::class.java)
            startActivity(intent)
        }
    }
}
