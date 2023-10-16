package uz.abbos.a12_school

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import uz.abbos.a12_school.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding
    private lateinit var classAdapter: ClassAdapter
    private lateinit var mList: ArrayList<ClassData>

 //5 = 1
    //
    private val firebaseData = FirebaseDatabase.getInstance().getReference("Class")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        loadDataTable()

        return binding!!.root

    }



    private fun loadDataTable() {

        mList = ArrayList()

        firebaseData.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                mList.clear()
                for (i in snapshot.children) {
                    val data = i.getValue(ClassData::class.java)
                    mList.add(data!!)

                }

                binding?.prgClass?.visibility = View.GONE

                classAdapter = ClassAdapter(mList, requireContext())
                binding!!.rewClass.setHasFixedSize(true)
                binding!!.rewClass.layoutManager = GridLayoutManager(requireContext(),2)
                binding!!.rewClass.adapter = classAdapter

            }

            override fun onCancelled(error: DatabaseError) {

            }
        })

    }
}