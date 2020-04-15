package com.abuazis.movix.checkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.abuazis.movix.R
import com.abuazis.movix.checkout.model.Checkout
import com.abuazis.movix.home.model.Film
import kotlinx.android.synthetic.main.activity_chose_seat.*

class ChoseSeatActivity : AppCompatActivity() {

    var statusB3: Boolean = false
    var statusB4: Boolean = false
    var statusB5: Boolean = false
    var statusB6: Boolean = false
    var statusC2: Boolean = false
    var statusC3: Boolean = false
    var statusC4: Boolean = false
    var statusC5: Boolean = false
    var statusC6: Boolean = false
    var statusC7: Boolean = false
    var statusD3: Boolean = false
    var statusD4: Boolean = false
    var statusD5: Boolean = false
    var statusD6: Boolean = false
    var total: Int = 0

    private var dataList = ArrayList<Checkout>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_seat)

        val data = intent.getParcelableExtra<Film>("data")

        tv_judul.text = data.judul

        b3.setOnClickListener {
            if (statusB3) {
                b3.setImageResource(R.drawable.ic_rectangle_empty)
                statusB3 = false
                total -= 1
                belitiket(total)

            } else {
                b3.setImageResource(R.drawable.ic_rectangle_selected)
                statusB3 = true
                total += 1
                belitiket(total)

                val data = Checkout("B3", "70000")
                dataList.add(data)
            }
        }

        b4.setOnClickListener {
            if (statusB4) {
                b4.setImageResource(R.drawable.ic_rectangle_empty)
                statusB4 = false
                total -= 1
                belitiket(total)

            } else {
                b4.setImageResource(R.drawable.ic_rectangle_selected)
                statusB4 = true
                total += 1
                belitiket(total)

                val data = Checkout("B4", "70000")
                dataList.add(data)
            }
        }

        b5.setOnClickListener {
            if (statusB5) {
                b5.setImageResource(R.drawable.ic_rectangle_empty)
                statusB5 = false
                total -= 1
                belitiket(total)

            } else {
                b5.setImageResource(R.drawable.ic_rectangle_selected)
                statusB5 = true
                total += 1
                belitiket(total)

                val data = Checkout("B5", "70000")
                dataList.add(data)
            }
        }

        b6.setOnClickListener {
            if (statusB6) {
                b6.setImageResource(R.drawable.ic_rectangle_empty)
                statusB6 = false
                total -=1
                belitiket(total)
            } else {
                b6.setImageResource(R.drawable.ic_rectangle_selected)
                statusB6 = true
                total +=1
                belitiket(total)

                val data = Checkout("B6", "70000")
                dataList.add(data)
            }
        }

        c2.setOnClickListener {
            if (statusC2) {
                c2.setImageResource(R.drawable.ic_rectangle_empty)
                statusC2 = false
                total -=1
                belitiket(total)
            } else {
                c2.setImageResource(R.drawable.ic_rectangle_selected)
                statusC2 = true
                total +=1
                belitiket(total)

                val data = Checkout("C2", "70000")
                dataList.add(data)
            }
        }

        c3.setOnClickListener {
            if (statusC3) {
                c3.setImageResource(R.drawable.ic_rectangle_empty)
                statusC3 = false
                total -=1
                belitiket(total)
            } else {
                c3.setImageResource(R.drawable.ic_rectangle_selected)
                statusC3 = true
                total +=1
                belitiket(total)

                val data = Checkout("C3", "70000")
                dataList.add(data)
            }
        }

        c4.setOnClickListener {
            if (statusC4) {
                c4.setImageResource(R.drawable.ic_rectangle_empty)
                statusC4 = false
                total -=1
                belitiket(total)
            } else {
                c4.setImageResource(R.drawable.ic_rectangle_selected)
                statusC4= true
                total +=1
                belitiket(total)

                val data = Checkout("C4", "70000")
                dataList.add(data)
            }
        }

        c5.setOnClickListener {
            if (statusC5) {
                c5.setImageResource(R.drawable.ic_rectangle_empty)
                statusC5 = false
                total -=1
                belitiket(total)
            } else {
                c5.setImageResource(R.drawable.ic_rectangle_selected)
                statusC5 = true
                total +=1
                belitiket(total)

                val data = Checkout("C5", "70000")
                dataList.add(data)
            }
        }

        c6.setOnClickListener {
            if (statusC6) {
                c6.setImageResource(R.drawable.ic_rectangle_empty)
                statusC6 = false
                total -=1
                belitiket(total)
            } else {
                c6.setImageResource(R.drawable.ic_rectangle_selected)
                statusC6 = true
                total +=1
                belitiket(total)

                val data = Checkout("C6", "70000")
                dataList.add(data)
            }
        }

        c7.setOnClickListener {
            if (statusC7) {
                c7.setImageResource(R.drawable.ic_rectangle_empty)
                statusC7 = false
                total -=1
                belitiket(total)
            } else {
                c7.setImageResource(R.drawable.ic_rectangle_selected)
                statusC7 = true
                total +=1
                belitiket(total)

                val data = Checkout("C7", "70000")
                dataList.add(data)
            }
        }

        d3.setOnClickListener {
            if (statusD3) {
                d3.setImageResource(R.drawable.ic_rectangle_empty)
                statusD3 = false
                total -=1
                belitiket(total)
            } else {
                d3.setImageResource(R.drawable.ic_rectangle_selected)
                statusD3 = true
                total +=1
                belitiket(total)

                val data = Checkout("D3", "70000")
                dataList.add(data)
            }
        }

        d4.setOnClickListener {
            if (statusD4) {
                d4.setImageResource(R.drawable.ic_rectangle_empty)
                statusD4 = false
                total -=1
                belitiket(total)
            } else {
                d4.setImageResource(R.drawable.ic_rectangle_selected)
                statusD4 = true
                total +=1
                belitiket(total)

                val data = Checkout("D4", "70000")
                dataList.add(data)
            }
        }

        d5.setOnClickListener {
            if (statusD5) {
                d5.setImageResource(R.drawable.ic_rectangle_empty)
                statusD5 = false
                total -=1
                belitiket(total)
            } else {
                d5.setImageResource(R.drawable.ic_rectangle_selected)
                statusD5 = true
                total +=1
                belitiket(total)

                val data = Checkout("D5", "70000")
                dataList.add(data)
            }
        }

        d6.setOnClickListener {
            if (statusD6) {
                d6.setImageResource(R.drawable.ic_rectangle_empty)
                statusD6 = false
                total -=1
                belitiket(total)
            } else {
                d6.setImageResource(R.drawable.ic_rectangle_selected)
                statusD6 = true
                total +=1
                belitiket(total)

                val data = Checkout("D6", "70000")
                dataList.add(data)
            }
        }

        btn_belitiket.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java).putExtra("data", dataList).putExtra("datas", data)
            startActivity(intent)
        }

        iv_back.setOnClickListener{
            finish()
        }
    }

    private fun belitiket(total: Int) {
        if (total == 0) {
            btn_belitiket.setText("Beli Tiket")
            btn_belitiket.visibility = View.INVISIBLE
        } else {
            btn_belitiket.setText("Beli Tiket ("+total+")")
            btn_belitiket.visibility = View.VISIBLE
        }
    }
}
