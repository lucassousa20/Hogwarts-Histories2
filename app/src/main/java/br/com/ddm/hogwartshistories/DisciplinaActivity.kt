package br.com.ddm.hogwartshistories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_disciplina.*
import kotlinx.android.synthetic.main.toolbar.*

class DisciplinaActivity : AppCompatActivity() {
    
    var disciplina: Disciplina? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplina)

        disciplina = intent.getSerializableExtra("disciplina") as Disciplina

        setSupportActionBar(toolbar)

        supportActionBar?.title = disciplina?.nome
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nomeDisciplina.text = disciplina?.nome
        Picasso.with(this).load(disciplina?.foto).fit().into(imagemDisciplina,
            object: Callback{
                override fun onSuccess() {}

                override fun onError() { }
            })

    }
}