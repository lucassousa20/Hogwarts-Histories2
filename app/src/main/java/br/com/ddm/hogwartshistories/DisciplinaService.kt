package br.com.ddm.hogwartshistories

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URL

object DisciplinaService {

    val host = "https://fesousa.pythonanywhere.com"
    val TAG = "WS_LMSApp"

    fun getDisciplinas (): List<Disciplina> {

        var disciplina = mutableListOf<Disciplina>()

        val url = "$host/disciplinas"
        val json = HttpHelper.get(url)

        Log.d(TAG, json)

        var disciplinas = perserJson<List<Disciplina>>(json)

        return disciplinas
    }

    fun saveDisciplina(disciplina: Disciplina): String {
        val json = HttpHelper.post("$host/disciplinas", disciplina.toJson())
        return json
    }

    inline fun <reified T> perserJson(json: String) : T {
        val type = object: TypeToken<T>(){}.type
        return Gson().fromJson<T>(json, type)
    }
}