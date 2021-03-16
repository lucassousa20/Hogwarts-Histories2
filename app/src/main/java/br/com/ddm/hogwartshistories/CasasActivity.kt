package br.com.ddm.hogwartshistories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_casas.*

class CasasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_casas)


        var params = intent.extras
        val botao = params?.getString("botao")
        if (botao == "Grifinória"){
            supportActionBar?.title = "Grifinória"
            imagem_casa.setImageResource(R.drawable.grifinoria_simbolo)
        } else if (botao == "Sonserina") {
            supportActionBar?.title = "Sonserina"
            imagem_casa.setImageResource(R.drawable.sonserina_simbolo)
        } else if (botao == "Lufa-Lufa") {
            supportActionBar?.title = "Lufa-Lufa"
            imagem_casa.setImageResource(R.drawable.lufalufa_simbolo)
        } else if (botao == "Corvinal") {
            supportActionBar?.title = "Corvinal"
            imagem_casa.setImageResource(R.drawable.corvinal_simbolo)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}