package com.abuazis.movix.home.dashboard


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.abuazis.movix.R
import com.abuazis.movix.home.model.Comingsoon

class ComingSoonAdapter(private var data: ArrayList<Comingsoon>,
                        private val listener: (Comingsoon) -> Unit)
    : RecyclerView.Adapter<ComingSoonAdapter.LeagueViewHolder>() {

    lateinit var ContextAdapter : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        ContextAdapter = parent.context
        val inflatedView: View = layoutInflater.inflate(R.layout.row_item_coming_soon, parent, false)

        return LeagueViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: LeagueViewHolder, position: Int) {
        holder.bindItem(data[position], listener, ContextAdapter)
    }

    override fun getItemCount(): Int = data.size

    class LeagueViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val tvTitle: TextView = view.findViewById(R.id.tv_kursi)
        private val tvGenre: TextView = view.findViewById(R.id.tv_genre)
        private val tvRate: TextView = view.findViewById(R.id.tv_rate)

        private val tvImage: ImageView = view.findViewById(R.id.iv_poster_image)

        fun bindItem(
            data: Comingsoon,
            listener: (Comingsoon) -> Unit,
            context: Context
        ) {

            tvTitle.text = data.judul
            tvGenre.text = data.genre
            tvRate.text = data.rating.toString()

            Glide.with(context)
                .load(data.pict)
                .into(tvImage)

            itemView.setOnClickListener {
                listener(data)
            }
        }

    }

}