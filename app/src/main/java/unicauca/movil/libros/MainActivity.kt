package unicauca.movil.libros

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import unicauca.movil.libros.adapter.LibroAdapter
import unicauca.movil.libros.model.Libro

class MainActivity : AppCompatActivity() {

    val adapter:LibroAdapter = LibroAdapter()
    val data:MutableList<Libro> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.adapter = adapter

        loadData()
    }

    fun loadData(){
        val libro1 = Libro("Libro 1", "Dario Ch", 400)
        val libro2 = Libro("Libro 2", "Dario Ch", 200)
        val libro3 = Libro("Libro 3", "Dario Ch", 900)

        data.add(libro1)
        data.add(libro2)
        data.add(libro3)

        adapter.data = data
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_add -> toast("add")
            R.id.action_info -> toast("info")
            R.id.action_about -> toast("about")
        }
        return super.onOptionsItemSelected(item)
    }


}




