package com.a.b.koredizileri.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.a.b.koredizileri.datta.entitty.Filmler
import com.a.b.koredizileri.datta.repo.FilmlerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel :ViewModel(){

    var frepo=FilmlerRepository()
    var filmlerListesi = MutableLiveData<List<Filmler>>()
 init {
     filmleriYukle()
 }

    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
         filmlerListesi.value=frepo.filmleriYukle()
            //anasayfaview modelden anasayfafragmente data taşımak istiyorsak live data kullan
            //datasource ile repository coroutine ile bunu yaptı

        }
    }

}