package com.example.asteroides;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Puntuaciones extends ListActivity {
	
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        
/*     llamado a las  listview normal   
 *     setListAdapter(new ArrayAdapter<String>(this,
        		       android.R.layout.simple_list_item_1,
                       Asteroides.almacen.listaPuntuaciones(10)));*/
         setListAdapter(new MiAdaptador(this,
                Asteroides.almacen.listaPuntuaciones(10)));
    }
    
/*    Un ListView puede tener diferentes componentes que nos permitan interaccionar con el usuario. 
    Por ejemplo,cada elemento definido en getView() puede tener botones para diferentes acciones.
    Hay un tipo de interacción muy sencilla de definir. La clase ListActivity tiene un método que es 
    invocado cada vez que se pulsa sobre un elemento de la lista. El siguiente ejercicio ilustra cómo utilizarlo.   */
    
    @Override protected void onListItemClick(ListView listView, 
            View view, int position, long id) {
		super.onListItemClick(listView, view, position, id);
		Object o = getListAdapter().getItem(position);
		Toast.makeText(this, "Selección: " + Integer.toString(position)
		+  " - " + o.toString(),Toast.LENGTH_LONG).show();
		}
}