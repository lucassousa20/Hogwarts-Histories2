package br.com.ddm.hogwartshistorys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_inicial.*

class TelaInicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        botao_grifinoria.setOnClickListener{
            val intent =  Intent(this, GrifinoriaActivity::class.java)

            startActivity(intent)
        }
    }
}