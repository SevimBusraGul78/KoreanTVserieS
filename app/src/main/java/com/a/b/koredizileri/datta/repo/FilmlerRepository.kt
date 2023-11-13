package com.a.b.koredizileri.datta.repo

import com.a.b.koredizileri.datta.Datasource.FilmlerDataSource
import com.a.b.koredizileri.datta.entitty.Filmler

class FilmlerRepository {
    var fds=FilmlerDataSource()
    suspend fun filmleriYukle(): List<Filmler> = fds.filmleriYukle() //repositoryden aldığım bilgileri buna yükle


}