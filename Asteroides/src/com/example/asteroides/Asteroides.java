package com.example.asteroides;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroides extends Activity {
	 
	public static AlmacenPuntuaciones almacen=new AlmacenPuntuacionesArray();

	//private Button bSalir;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//Entonces, qué hacemos si queremos trabajar con una versión anterior a 1.6 o definir un evento distinto de onClick()
		
/*		this.bSalir.setText(R.string.exit);
		
		this.bSalir.setOnClickListener(new OnClickListener() {
			
		         public void Onsalir(View v) {
		            finish();
		         }

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
				}
		      });*/
	}

//definido para versiones despues de 1.6
	public void lanzarAcercaDe(View view){
	      Intent i = new Intent(this, AcercaDe.class);
          startActivity(i);

	    }
/*	 public void lanzarfinalizar(View view){
		 Intent intent = new Intent(Intent.ACTION_MAIN);
		 finish();
	  }*/
	
	public void lanzarPuntuaciones(View view) {
		Intent i = new Intent(this, Puntuaciones.class);
		startActivity(i);
    	}
	 
	 public boolean onCreateOptionsMenu(Menu menu) {
	       super.onCreateOptionsMenu(menu);
	       MenuInflater inflater = getMenuInflater();
	       inflater.inflate(R.menu.menu, menu);
	       return true; /** true -> el menú ya está visible */
	    }
	   
	    @Override public boolean onOptionsItemSelected(MenuItem item) {
	             switch (item.getItemId()) {
	             case R.id.acercaDeic_menu_info_details:
	                    lanzarAcercaDe(null);
	                    break;
	             case R.id.config:
	            	 lanzarPreferencias(null);
	            	 break;
	             }
	             return true; /** true -> consumimos el item, no se propaga*/
	    }
	    
		public void lanzarPreferencias(View view){
		      Intent i = new Intent(this,Preferencias.class);
	          startActivity(i);

		    }
	   
}
