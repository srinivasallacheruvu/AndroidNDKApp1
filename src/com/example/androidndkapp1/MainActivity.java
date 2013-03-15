package com.example.androidndkapp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
EditText input;
Button sendto,getfrom;
TextView result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		input=(EditText) findViewById(R.id.editText1);
		sendto=(Button) findViewById(R.id.button1);
		sendto.setOnClickListener(this);
		getfrom=(Button) findViewById(R.id.button2);
		getfrom.setOnClickListener(this);
		result=(TextView) findViewById(R.id.textView1);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			new Data().stringtojni(input.getText().toString());
			input.setText("");
			 break;
		case R.id.button2:
			result.setText(new Data().stringfromjni());
			break;
		}
	}

	

}
