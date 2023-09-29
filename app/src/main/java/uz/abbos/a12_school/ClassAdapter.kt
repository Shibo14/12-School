package uz.abbos.a12_school

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.abbos.a12_school.databinding.LessonItemBinding

class ClassAdapter
    (val context: Context, val mList: ArrayList<ClassData>) :
    RecyclerView.Adapter<ClassAdapter.UserViewHolder>() {
    inner class UserViewHolder(private val binding: LessonItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(text: String) {
            binding.classTv.text = text

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        return UserViewHolder(
            LessonItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.bind(mList[position].text)

    }


}