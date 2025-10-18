
package com.example.a30diasmusica.data

import com.example.a30diasmusica.R
import com.example.a30diasmusica.model.Musica
class Datasource() {
    fun loadAnimale(): List<Musica> {
        return listOf( // 1. Se eliminó el redundante <Musica>
            Musica(R.string.musica1, R.drawable.rap),
            Musica(R.string.musica2, R.drawable.pop),
            Musica(R.string.musica4, R.drawable.jazz),
            Musica(R.string.musica5, R.drawable.blues),
            Musica(R.string.musica6, R.drawable.house),
            //Musica(R.string.musica7, R.drawable.electronica),
            Musica(R.string.musica8,  R.drawable.salsa),
            Musica(R.string.musica9,  R.drawable.cumbia),
            Musica(R.string.musica11, R.drawable.reggae),
            Musica(R.string.musica12, R.drawable.disco),
            Musica(R.string.musica13, R.drawable.metal),
            Musica(R.string.musica14, R.drawable.indie),
            Musica(R.string.musica15, R.drawable.flamenco),
            Musica(R.string.musica16, R.drawable.trap),
            Musica(R.string.musica17, R.drawable.afrobeat),
            Musica(R.string.musica18, R.drawable.soul),
            Musica(R.string.musica19, R.drawable.funk),
            Musica(R.string.musica20, R.drawable.disco),
            Musica(R.string.musica21, R.drawable.clasica) //2. Se quitó la coma (,) extra
        ) // 3. Paréntesis de cierre de listOf()
    }
}
