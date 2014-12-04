package edu.np.edu.mapg.mp1.s10147628;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	int myNumber =	8;
    EditText stMessage;
    TextView textView1;
    Button btOk;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		stMessage = (EditText) this.findViewById(R.id.stMessage);
		textView1 = (TextView) this.findViewById(R.id.textView1);
		btOk = (Button) this.findViewById(R.id.btOk);
		btOk.setOnClickListener(listener);
	}
	
	private View.OnClickListener listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String message = stMessage.getText().toString();
			int num =	Integer.parseInt(message);
			// TODO Auto-generated method stub
			
			if (num == myNumber){
				Toast.makeText(getBaseContext(), "Bingo! Correct number.", Toast.LENGTH_LONG).show();
			}
			else {
				Toast.makeText(getBaseContext(), "Wrong! Try again.", Toast.LENGTH_LONG).show();
			}
			
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
