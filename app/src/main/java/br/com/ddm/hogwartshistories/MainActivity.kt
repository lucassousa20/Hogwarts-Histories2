package br.com.ddm.hogwartshistories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.tela_login.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        login_botao.setOnClickListener {
            val nome_usuario = campo_usuario.text.toString()
            val senha_usuario = campo_senha.text.toString()
//            if (nome_usuario == "aluno" && senha_usuario == "impacta") {
                val intent = Intent(this, TelaInicialActivity::class.java)
                startActivity(intent)
//            } else {
//                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show()
//            }
        }
    }
}