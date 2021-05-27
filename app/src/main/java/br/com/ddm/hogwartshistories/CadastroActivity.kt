package br.com.ddm.hogwartshistories

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        botao_cadastro.setOnClickListener{
            val nomeTexto = nome_usuario.text.toString()
            val senhaTexto = senha_usuario.text.toString()

            val u = Usuario()
            u.nome = nomeTexto
            u.senha = senhaTexto

            Thread{
                UsuarioService.saveUsuario(u)
                runOnUiThread{
                    val intent = Intent(this, TelaInicialActivity::class.java)
                    startActivity(intent)
                }
            }.start()
        }
    }
}


//override fun onResume() {
//    super.onResume()
//    newUsuarios()
//}
//
//fun newUsuarios() {
//    // Criar a Thread
//
//    Thread {
////             Código para procurar os usuarios
////             que será executado em segundo plano / Thread separada
//        botao_cadastro.setOnClickListener{
//            val botao_cadastro = botao_cadastro.text.toString()
////                this.usuarios = UsuarioService.saveUsuario(context)
//        }
////            this.usuarios = UsuarioService.saveUsuario(context)
//        runOnUiThread {
//////                 Código para atualizar a UI com a lista de disciplinas
////                recyclerDisciplinas?.adapter = DisciplinaAdapter(this.disciplinas) { onClickDisciplina(it) }
//        }
//    }.start()
//
//}
//
////    fun onClickDisciplina(disciplina: Disciplina) {
////        Toast.makeText(context, "Clicou na disciplina de ${disciplina.nome}", Toast.LENGTH_SHORT).show()
////        val intent = Intent(context, DisciplinaActivity::class.java)
////        intent.putExtra("disciplina", disciplina)
////        startActivity(intent)
////    }