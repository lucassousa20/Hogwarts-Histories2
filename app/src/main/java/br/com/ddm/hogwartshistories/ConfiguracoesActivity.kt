package br.com.ddm.hogwartshistories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_configuracoes.*

class ConfiguracoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracoes)

        supportActionBar?.title = "Configurações"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recycler_disciplinas?.layoutManager = LinearLayoutManager(this)
    }


    private var disciplinas = listOf<Disciplina>()
    override fun onResume() {
        super.onResume()

        Thread {
            disciplinas = DisciplinaService.getDisciplinas()

            runOnUiThread{
                recycler_disciplinas?.adapter = DisciplinaAdapter(disciplinas) {
                    onClickDisciplina(it)
                }
            }
        }.start()
    }

    fun onClickDisciplina (disciplina: Disciplina) {
        Toast.makeText(this, "Clicou disciplina ${disciplina.nome}", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, DetalheDisciplinaActivity::class.java)

        intent.putExtra("disciplina", disciplina)

        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}