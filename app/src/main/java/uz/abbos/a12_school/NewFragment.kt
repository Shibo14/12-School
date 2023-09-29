package uz.abbos.a12_school

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import uz.abbos.a12_school.databinding.FragmentHomeBinding
import uz.abbos.a12_school.databinding.FragmentNewBinding


class NewFragment : Fragment() {

    private var _binding: FragmentNewBinding? = null
    private val binding get() = _binding
    lateinit var mNewsList: ArrayList<NewsData>
    lateinit var newsAdapter: NewsAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentNewBinding.inflate(inflater, container, false)
        getInit()
        return binding!!.root
    }

    private fun getInit() {
        mNewsList = ArrayList()
        mNewsList.add(NewsData(R.drawable.img,"holiday"))
        mNewsList.add(NewsData(R.drawable.img,"holiday"))
        mNewsList.add(NewsData(R.drawable.img,"holiday"))
        mNewsList.add(NewsData(R.drawable.img,"holiday"))
        mNewsList.add(NewsData(R.drawable.img,"holiday"))
        mNewsList.add(NewsData(R.drawable.img,"holiday"))
        mNewsList.add(NewsData(R.drawable.img,"holiday"))

        val myLayoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        newsAdapter = NewsAdapter(requireContext(), mNewsList)
        binding!!.rewNews.apply {
            adapter = newsAdapter
            layoutManager = myLayoutManager
        }

    }
}