package com.a.b.koredizileri.datta.Datasource

import com.a.b.koredizileri.datta.entitty.Filmler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource {
suspend fun filmleriYukle(): List<Filmler> =
    withContext(Dispatchers.IO){
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
 return@withContext filmlerListesi //bu verileri asenkron şekilde alıp verileri return şeklinde almamızı sağlar


    }
}