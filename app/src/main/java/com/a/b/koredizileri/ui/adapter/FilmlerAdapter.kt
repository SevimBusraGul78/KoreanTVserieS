package com.a.b.koredizileri.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.a.b.koredizileri.databinding.CardTasarimBinding
import com.a.b.koredizileri.databinding.FragmentAnasayfaBinding
import com.a.b.koredizileri.datta.entitty.Filmler
import com.a.b.koredizileri.ui.fragment.AnasayfaFragment
import com.a.b.koredizileri.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mContext: Context,var filmlerListesi:List<Filmler>)
    :RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>(){
    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
       val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent, false)
       return CardTasarimTutucu(binding)  //bu sınıf sayesinde tasarım üzerindeki görsel nesnelere erişebilirriz
    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        //holder bize kartın üzerindeki görsel nesne erişmemizi sağlar
        // position ise imageslari indexiyle sıralar
        val film =filmlerListesi.get(position)
        val t=holder.tasarim
        t.imageViewFilm.setImageResource(
            mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))
        t.textViewFiyat.text="${film.fiyat} ₺"


        t.CardViewFilm.setOnClickListener{
        val gecis=AnasayfaFragmentDirections.detayGecis(film=film)
            Navigation.findNavController(it).navigate(gecis)
        }

         t.buttonSpet.setOnClickListener {
             Snackbar.make(it,"${film.ad} sepete eklendi",Snackbar.LENGTH_SHORT).show()



         }



    }
    override fun getItemCount(): Int {
   return filmlerListesi.size
    }

}