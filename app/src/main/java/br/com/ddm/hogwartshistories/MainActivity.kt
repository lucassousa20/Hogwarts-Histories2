package br.com.ddm.hogwartshistories

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.tela_login.*

class MainActivity : AppCompatActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        login_botao.setOnClickListener {

            progress_login.visibility = View.VISIBLE
            Handler(Looper.getMainLooper()).postDelayed(
                    {
                        val nome_usuario = campo_usuario.text.toString()
                        val senha_usuario = campo_senha.text.toString()
                        if (nome_usuario == "aluno" && senha_usuario == "impacta") {
                            val intent = Intent(context, TelaInicialActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(context, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show()
                            progress_login.visibility = View.GONE
                        }
                    },
                    1000,
            )




        }

//        login_botao.setOnClickListener {
//            val intent = Intent(this, TelaInicialActivity::class.java)
//            startActivityForResult(intent, 1)
//        }


    }

    override fun onResume() {
        super.onResume()
        progress_login.visibility = View.GONE
    }


}