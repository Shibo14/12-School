package uz.abbos.a12_school

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.abbos.a12_school.databinding.LessonItemBinding
import uz.abbos.a12_school.databinding.NewsItemBinding

class NewsAdapter(val context: Context, val mList: ArrayList<NewsData>) :
    RecyclerView.Adapter<NewsAdapter.NewViewHolder>() {
    inner class NewViewHolder(private val binding: NewsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: NewsData) {
            binding.textView6.text = data.country
            binding.imageView2.setImageResource(data.imageUrl)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {

        return NewViewHolder(
            NewsItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: NewViewHolder, position: Int) {

        val currentItem = mList[position]
        holder.bind(currentItem)

    }


}