package com.example.smartroid_salah;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main5Daily extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main5_daily);
		Button b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main5_daily, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, MainPrayerActivtiy.class);
		intent.putExtra("PRAY", 1);
		startActivity(intent);
	}

}
