package com.a.b.koredizileri.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.a.b.koredizileri.R
import com.a.b.koredizileri.databinding.FragmentAnasayfaBinding
import com.a.b.koredizileri.datta.entitty.Filmler
import com.a.b.koredizileri.ui.adapter.FilmlerAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.filmRv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
          s
        binding.toolbarAnaSayfa.title="KORE DİZİLERİ"
        val filmlerListesi=ArrayList<Filmler>()
        val f1=Filmler(1,"Introverted Boss","a",50)
        val f2=Filmler(2,"The Heirs","b",90)
        val f3=Filmler(3,"goblin","goblin_2",100)
        val f4=Filmler(4,"Mr Sunshine","mr",30)
        val f5=Filmler(1,"Squid Game","squid_game",60)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)

        val filmlerAdapter=FilmlerAdapter(requireContext(),filmlerListesi)//adapterda göster
        binding.filmRv.adapter=filmlerAdapter


        return binding.root
    }


}