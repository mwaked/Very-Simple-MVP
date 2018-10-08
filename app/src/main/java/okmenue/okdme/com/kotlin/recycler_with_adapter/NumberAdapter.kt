package okmenue.okdme.com.kotlin.recycler_with_adapter

import android.content.Context
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_number.view.*
import okmenue.okdme.com.kotlin.R

class NumberAdapter(val items : List<NumberModel> , val context : Context) : RecyclerView.Adapter<NumberAdapter.NumberViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): NumberViewHolder {
        return NumberViewHolder(LayoutInflater.from(context).inflate(R.layout.row_number, parent, false))
    }

    override fun onBindViewHolder(viewHolder: NumberViewHolder, position: Int) {
        viewHolder.itemView.rowTvNumber.text = items.get(position).number.toString()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            viewHolder.itemView.rowTvNumber.backgroundTintList = context.resources.getColorStateList(items.get(position).color)
        }


    }


    class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}