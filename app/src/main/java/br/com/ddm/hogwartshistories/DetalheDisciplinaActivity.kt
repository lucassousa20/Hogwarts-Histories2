package br.com.ddm.hogwartshistories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DetalheDisciplinaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_disciplina)
        val disciplina = intent.extras?.getSerializable("disciplina") as Disciplina

        Toast.makeText(this, "Clicou disciplina ${disciplina.nome}", Toast.LENGTH_SHORT).show()
    }
}