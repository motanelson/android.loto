package p1.c1.app;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import android.app.*;
import android.os.*;
import android.app.AlertDialog;
import android.app.Activity;
import android.widget.Toast;
import java.util.Random;
import 	java.nio.charset.Charset;
import android.app.Activity; 
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;

public class MainActivity extends Activity
{
    Double d=0.00;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
        
		final Button B = (Button)findViewById(R.id.button); 

		final EditText ED = (EditText)findViewById(R.id.textEdit);

		final TextView TV = (TextView)findViewById(R.id.textView);

		B.setOnClickListener(new OnClickListener(){ 
				
				public void onClick(View arg0)
				{ 
					String s="",ss="";
                                                                    double i = 0.00;
					String TextEntered = ED.getText().toString(); 
                                                                     i=Double.parseDouble(TextEntered);
                                                                     d=d+i;
                                                                     TV.setText(Double.toString(d));
		}	
                  });		
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        
    }
}
