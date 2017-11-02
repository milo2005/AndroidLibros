package unicauca.movil.libros.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.template_libro.view.*
import unicauca.movil.libros.R
import unicauca.movil.libros.model.Libro

class LibroAdapter:BaseAdapter(){

    var data:List<Libro> = emptyList()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun getView(pos: Int, convertView: View?, parent: ViewGroup): View {
        val view:View = convertView ?: LayoutInflater.from(parent.context)
                .inflate(R.layout.template_libro, parent, false)
        val libro = data[pos]

        view.nombre.text = libro.nombre
        view.autor.text = libro.autor
        view.pag.text = "${libro.paginas}"

        return view
    }

    override fun getItem(position: Int): Any = data[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = data.size

}
