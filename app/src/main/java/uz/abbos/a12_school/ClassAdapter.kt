package uz.abbos.a12_school

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.FirebaseDatabase
import uz.abbos.a12_school.databinding.LessonItemBinding
import uz.abbos.a12_school.databinding.RewClassItemBinding

class ClassAdapter(private var mList: List<ClassData>, private val c: Context) :
    RecyclerView.Adapter<ClassAdapter.CategoryViewHolder>() {

    inner class CategoryViewHolder(var binding: RewClassItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val classDataTv = binding.itemTxt
        val classHarfTv = binding.itemHarf

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding =
            RewClassItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currentItem = mList[position]
        val id = currentItem.id
        val classNumber = currentItem.classNumber
        val classHarf = currentItem.harf
        val timestamp = currentItem.timesTamp

        holder.classDataTv.text = classNumber
        holder.classHarfTv.text = classHarf.lowercase()



        holder.itemView.setOnClickListener {
            val i = Intent(c, ClassTableActivity::class.java)
            i.putExtra("classNumber", classNumber)
            i.putExtra("classNumberId", id)
            i.putExtra("harf", classHarf)

            c.startActivity(i)

        }


    }


    override fun getItemCount(): Int {
        return mList.size
    }



}