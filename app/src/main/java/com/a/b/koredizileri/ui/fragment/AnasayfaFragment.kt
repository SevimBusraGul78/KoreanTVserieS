package com.a.b.koredizileri.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.a.b.koredizileri.R
import com.a.b.koredizileri.databinding.FragmentAnasayfaBinding
import com.a.b.koredizileri.datta.entitty.Filmler
import com.a.b.koredizileri.ui.adapter.FilmlerAdapter
import com.a.b.koredizileri.ui.viewmodel.AnasayfaViewModel

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)


        binding.anasayfaToolbarBaslK="KORE DİZİLERİ"

     viewModel.filmlerListesi.observe(viewLifecycleOwner){
         val filmlerAdapter=FilmlerAdapter(requireContext(),it)//adapterda göster
         binding.filmlerAdapet=filmlerAdapter

     }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:AnasayfaViewModel by viewModels()
        viewModel=tempViewModel


    }

}