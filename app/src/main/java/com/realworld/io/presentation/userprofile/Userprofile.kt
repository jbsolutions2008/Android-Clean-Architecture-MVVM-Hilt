package com.realworld.io.presentation.userprofile

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.realworld.io.R
import com.realworld.io.databinding.FragmentDashBaordBinding
import com.realworld.io.databinding.FragmentUserprofileBinding
import com.realworld.io.presentation.dashboard.ArticleViewModel


class Userprofile : Fragment() {
    private val viewModel : ArticleViewModel by viewModels()
    private  var _binding: FragmentUserprofileBinding?= null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserprofileBinding.inflate(inflater,container,false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.update_btn,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.update -> {
                findNavController().navigate(R.id.action_dashBaord_to_addArticleFragment)
                true
            }

            else ->{
                false
            }
        }
        return super.onOptionsItemSelected(item)
    }
}