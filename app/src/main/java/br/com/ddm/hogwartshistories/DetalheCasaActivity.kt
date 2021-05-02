package br.com.ddm.hogwartshistories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetalheCasaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_casa)

        /*val intent =  Intent(this, CasasActivity::class.java)

        botao_grifinoria.setOnClickListener {
            val botao_grifinoria = botao_grifinoria.text.toString()
            val params = Bundle()
            params.putString("botao", botao_grifinoria)
            intent.putExtras(params)
            startActivity(intent)
        }

        botao_sonserina.setOnClickListener{
            val botao_sonserina = botao_sonserina.text.toString()
            val params = Bundle()
            params.putString("botao", botao_sonserina)
            intent.putExtras(params)
            startActivity(intent)
        }

        botao_lufalufa.setOnClickListener{
            val botao_fufalufa = botao_lufalufa.text.toString()
            val params = Bundle()
            params.putString("botao", botao_fufalufa)
            intent.putExtras(params)
            startActivity(intent)
        }

        botao_corvinal.setOnClickListener {
            val botao_corvinal = botao_corvinal.text.toString()
            val params = Bundle()
            params.putString("botao", botao_corvinal)
            intent.putExtras(params)
            startActivity(intent)
        }*/
    }
}