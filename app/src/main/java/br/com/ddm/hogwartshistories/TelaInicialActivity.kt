package br.com.ddm.hogwartshistories

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_tela_inicial.*

class TelaInicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val intent =  Intent(this, CasasActivity::class.java)

        botao_grifinoria.setOnClickListener {
            val botao_grifinoria = botao_grifinoria.text.toString()
            val params = Bundle()
            params.putString("botao", botao_grifinoria)
            intent.putExtras(params)
            startActivity(intent)
        }

        botao_sonserina.setOnClickListener{
            val botao_sonserina = botao_sonserina.text.toString()
            val params = Bundle()
            params.putString("botao", botao_sonserina)
            intent.putExtras(params)
            startActivity(intent)
        }

        botao_lufalufa.setOnClickListener{
            val botao_fufalufa = botao_lufalufa.text.toString()
            val params = Bundle()
            params.putString("botao", botao_fufalufa)
            intent.putExtras(params)
            startActivity(intent)
        }

        botao_corvinal.setOnClickListener {
            val botao_corvinal = botao_corvinal.text.toString()
            val params = Bundle()
            params.putString("botao", botao_corvinal)
            intent.putExtras(params)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)

        val manager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchItem = menu?.findItem(R.id.action_buscar)
        val searchView = searchItem?.actionView as androidx.appcompat.widget.SearchView

        searchView.setSearchableInfo(manager.getSearchableInfo(componentName))

        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                searchView.setQuery("", false)
                searchItem.collapseActionView()
                Toast.makeText(this@TelaInicialActivity, "Procurando por $query", Toast.LENGTH_LONG).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                return false
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_configurar) {
            val intent = Intent(this, ConfiguracoesActivity::class.java)
            startActivity(intent)
        } else if (id == R.id.action_sair) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}