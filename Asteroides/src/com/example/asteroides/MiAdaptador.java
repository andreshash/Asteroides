package com.example.asteroides;

import java.util.Vector;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/*En el ejercicio anterior hemos visto como podíamos asociar un Layout definido por nosotros 
alListView y personalizar uno de sus textos. Si queremos algo más adaptable, como cambiar
las fotos o cambiar varios textos, tendremos que escribir nuestro propio adaptador de ListView 
extendiendo la clase BaseAdapter. En esta clase habrá que sobreescribir los siguientes cuatro métodos:
	
View getView(int position, View convertView, ViewGroup parent)

Este método ha de construir un nuevo objeto View con el Layout correspondiente a la posición position
y devolverlo. Opcionalmente podemos partir de una vista base convertView para generar más rápido las vistas.
El último parámetro corresponde al padre al que la vista va  a ser añadida.*/
public class MiAdaptador extends BaseAdapter {

    private final Activity actividad;
    private final Vector<String> lista;

    public MiAdaptador(Activity actividad, Vector<String> lista) {
          super();
          this.actividad = actividad;
          this.lista = lista;
    }

    public View getView(int position, View convertView, 
                                     ViewGroup parent) {
          LayoutInflater inflater = actividad.getLayoutInflater();
          View view = inflater.inflate(R.layout.elemento_lista, null,
                                                                                                                             true);
          TextView textView =(TextView)view.findViewById(R.id.titulo);
          textView.setText(lista.elementAt(position));
          ImageView imageView=(ImageView)view.findViewById(R.id.icono);
          switch (Math.round((float)Math.random()*3)){
          case 0:
                 imageView.setImageResource(R.drawable.asteroide1);
                 break;
          case 1:
                 imageView.setImageResource(R.drawable.asteroide2);
                 break;
          default:
                 imageView.setImageResource(R.drawable.asteroide3);
                 break;
          }
          return view;
    }

    //Devuelve el número de elementos de la lista. 
    public int getCount() {
          return lista.size();
    }
 //Devuelve el elemento en una determinada posición de la lista.
    public Object getItem(int arg0) {
          return lista.elementAt(arg0);
    }
//Devuelve el identificador de fila de una determinada posición de la lista.
    public long getItemId(int position) {
          return position;
    }
    
/*    En el constructor de la clase se indica la actividad donde se ejecutará y la lista de datos a visualizar.
    El método más importante de esta clase es getView() el cual tiene que construir los diferentes Layouts 
    que serán añadidos en la lista. Comenzamos construyendo un objeto View a partir del código xml definido
    en elemento_lista.xml. Este trabajo se realiza por medio de la clase LayoutInflater.Luego, se modifica el 
    texto de uno de los TextView según el array que se pasó en el constructor. Finalmente, se obtiene un número
    al azar (Math.round()) 
    y se asigna uno de los tres gráficos de forma aleatoria.
*/
}