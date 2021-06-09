package br.com.ddm.hogwartshistories

import com.google.gson.GsonBuilder
import java.io.Serializable

class Disciplina: Serializable   {

    var id: Long = 0
    var nome = ""
    var ementa = ""
    var foto = ""
    var professor = ""

    fun toJson(): String {
        return GsonBuilder().create().toJson(this)
    }

}