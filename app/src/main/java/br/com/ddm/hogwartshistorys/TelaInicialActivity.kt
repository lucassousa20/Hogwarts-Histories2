package br.com.ddm.hogwartshistorys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_atualizar) {
            Toast.makeText(this, "Atualizar", Toast.LENGTH_SHORT).show()
        } else if (id == R.id.action_configurar) {
            val intent = Intent(this, ConfiguracoesActivity::class.java)
            startActivity(intent)
        } else if (id == R.id.action_sair) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}