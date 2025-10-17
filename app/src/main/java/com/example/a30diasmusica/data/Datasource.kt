
package com.example.a30diasmusica.data

import com.example.a30diasmusica.R
import com.example.a30diasmusica.model.Musica
class Datasource() {

    fun loadAnimale(): List<Musica> {
        return listOf<Musica>(
            Musica(R.string.musica1, R.drawable.rap),
            Musica(R.string.musica1, R.drawable.rap),
            Musica(R.string.musica1, R.drawable.rap),
            Musica(R.string.musica1, R.drawable.rap),
        )
    }
}
