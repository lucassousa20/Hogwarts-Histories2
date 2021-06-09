package br.com.ddm.hogwartshistories

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.core.view.isVisible
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.toolbar.*

class TelaInicialActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val intent =  Intent(this, CasasActivity::class.java)

        setSupportActionBar(toolbar)

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

        configuraMenuLateral()
    }

    private fun configuraMenuLateral () {
        var toogle = ActionBarDrawerToggle(
            this,
            layout_menu_lateral,
            toolbar,
            R.string.open,
            R.string.closed
        )

        layout_menu_lateral.addDrawerListener(toogle)
        toogle.syncState()

        nav_menu_lateral.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_displiciplinas -> {
                Toast.makeText(this, "Clicou Disciplicnas", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_forum -> {
                Toast.makeText(this, "Clicou Forum", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_localizacao -> {
                Toast.makeText(this, "Clicou Disciplicnas", Toast.LENGTH_SHORT).show()
            }
        }
        layout_menu_lateral.closeDrawer(GravityCompat.START)
        return true
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