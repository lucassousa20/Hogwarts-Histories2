package br.com.ddm.hogwartshistorys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tela_login.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        login_imagem.setImageResource(R.drawable.imagem_login)

        login_botao.setOnClickListener {
            val intent = Intent(this, TelaInicialActivity::class.java)

            startActivity(intent)
        }

    }

}