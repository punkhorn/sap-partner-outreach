package com.example.demo_dv_fuse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	 private Spinner spinner1;
	 private Button button1;
	 String[] items;

	 
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		@SuppressWarnings("unused")
		final PrefMgr prefMgr = new PrefMgr(this);

		setContentView(R.layout.activity_main);
		
		addItemsOnSpinner1();
		addListenerOnButton();
	
		
	}
	
	// add items into spinner dynamically
	public void addItemsOnSpinner1() {	
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		List list = new ArrayList();
		list.add("Atlanta (ATL)");
		list.add("Charleston (CHS)");
		ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
	}

	public void addListenerOnButton() {
	 
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		button1 = (Button) findViewById(R.id.btnPrevious);
		button1.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
			    Intent myIntent = new Intent(MainActivity.this, DetailsScreen.class);
//			    myIntent.putExtra("key", value); //Optional parameters
			    MainActivity.this.startActivity(myIntent);
//						Toast.makeText(MainActivity.this,
//						"Result : " +
//								"\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),
//								Toast.LENGTH_SHORT).show();
				}
			});
		}
	
}
