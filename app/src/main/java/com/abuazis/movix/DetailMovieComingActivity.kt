package com.abuazis.movix

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.abuazis.movix.checkout.ChoseSeatActivity
import com.abuazis.movix.home.dashboard.PlaysAdapter
import com.abuazis.movix.home.model.Comingsoon
import com.abuazis.movix.home.model.Plays
import com.bumptech.glide.Glide
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieComingActivity : AppCompatActivity() {

    lateinit var mDatabase: DatabaseReference
    private var dataList = ArrayList<Plays>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie_coming)

        val data = intent.getParcelableExtra<Comingsoon>("data")

//        mDatabase = FirebaseDatabase.getInstance().getReference("Film").child(data.judul.toString()).child("play")
        mDatabase = FirebaseDatabase.getInstance().getReference("Play")

        tv_judul.text = data.judul
        tv_genre.text = data.genre
        tv_desc.text = data.desc
        tv_rate.text = data.rating.toString()

        Glide.with(this).load(data.pict).into(iv_poster)

        btn_play.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(data.trailer))
            startActivity(intent)
        }

        btn_pilih_bangku.setOnClickListener {
            val intent = Intent(this@DetailMovieComingActivity, ChoseSeatActivity::class.java).putExtra("data", data)
            startActivity(intent)
        }

        iv_back.setOnClickListener {
            finish()
        }

        rv_whoplay.layoutManager = LinearLayoutManager(this@DetailMovieComingActivity, LinearLayoutManager.HORIZONTAL, false)
        getData()
    }

    private fun getData() {
        mDatabase.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                dataList.clear()

                for (getdataSnapshot in dataSnapshot.getChildren()) {
                    val film = getdataSnapshot.getValue(Plays::class.java!!)
                    dataList.add(film!!)
                }

                rv_whoplay.adapter = PlaysAdapter(dataList) {

                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@DetailMovieComingActivity, ""+error.message, Toast.LENGTH_LONG).show()
            }
        })
    }
}
