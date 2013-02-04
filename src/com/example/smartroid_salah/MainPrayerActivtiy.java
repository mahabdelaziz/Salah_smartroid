package com.example.smartroid_salah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainPrayerActivtiy extends Activity implements OnClickListener {
	ViewFlipper vf;
	Button next;
	Button prev;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		if (intent.getIntExtra("PRAY", 0) == 1)
			setContentView(R.layout.fajr_prayer_main_layout);
		next = (Button) findViewById(R.id.nextBtn);
		prev = (Button) findViewById(R.id.prevBtn);
		next.setOnClickListener(this);
		prev.setOnClickListener(this);
		vf = (ViewFlipper) findViewById(R.id.viewFlipper1);
	}

	@Override
	public void onClick(View v) {
		if (v == prev) {
			vf.showPrevious();
		} else if (v == next) {
			vf.showNext();
		}
	}

}
