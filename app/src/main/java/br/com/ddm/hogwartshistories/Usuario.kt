package br.com.ddm.hogwartshistories

import com.google.gson.GsonBuilder
import java.io.Serializable


class Usuario : Serializable {

    var id:Long = 0
    var nome = ""
    var senha = ""


    fun toJson() : String{
        return GsonBuilder().create().toJson(this)
    }

    override fun toString(): String {
        return "Usuario (nome='$nome')"
    }

}