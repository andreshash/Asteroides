package com.example.asteroides;

import java.util.List;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferencias extends PreferenceActivity {

	  @SuppressWarnings("deprecation")
	  @Override protected void onCreate(Bundle savedInstanceState) {

	      super.onCreate(savedInstanceState);
	      
	      if (Build.VERSION.SDK_INT<Build.VERSION_CODES.HONEYCOMB) {
	          addPreferencesFromResource(R.xml.preferencias);
	        
	        }
	   }
	  @SuppressLint("NewApi")
	@Override
	  public void onBuildHeaders(List<Header> target) {
	    loadHeadersFromResource(R.xml.preferencias, target);
	  }
}

