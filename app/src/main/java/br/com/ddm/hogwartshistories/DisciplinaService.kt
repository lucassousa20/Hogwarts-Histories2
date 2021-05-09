package br.com.ddm.hogwartshistories
import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object DisciplinaService {

    val host = "https://http://mvitoria.pythonanywhere.com"
    val TAG = "WS_HH"

    fun getDisciplinas (context: Context) : List<Disciplina> {

        val url ="$host/usuarios"
        val json = HttpHelper.get(url)

        Log.d(TAG, json)

        var disciplinas = parseJson<List<Disciplina>>(json)

        return disciplinas
    }

    fun saveDisciplina(disciplina: Disciplina) : String {
        val json =HttpHelper.post("$host/usuarios", disciplina.toJson())
        return json
    }
    inline fun <reified T> parseJson(json: String) : T {
        val type = object: TypeToken<T>(){}.type
        return Gson().fromJson<T>(json, type)
    }
}