package uz.abbos.a12_school

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.abbos.a12_school.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding
    private lateinit var mClassList: ArrayList<ClassData>
    private lateinit var classAdapter: ClassAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        getInit()
        return binding!!.root

    }

    private fun getInit() {
        mClassList = ArrayList()
        mClassList.add(ClassData("1"))
        mClassList.add(ClassData("2"))
        mClassList.add(ClassData("3"))
        mClassList.add(ClassData("4"))
        mClassList.add(ClassData("5"))
        mClassList.add(ClassData("6"))
        mClassList.add(ClassData("7"))
        mClassList.add(ClassData("8"))
        mClassList.add(ClassData("9"))
        mClassList.add(ClassData("10"))
        mClassList.add(ClassData("11"))

        val myLayoutManager = GridLayoutManager(requireContext(), 2)
        classAdapter = ClassAdapter(requireContext(), mClassList)
        binding!!.rewClassTable.apply {
            adapter = classAdapter
            layoutManager = myLayoutManager
        }

    }


}