package com.wilis.edittext;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class edittext extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        EditText f=(EditText)findViewById(R.id.tampil);
        f.setText("Ini adalah tampilan EditText di Android 2.3 " +
        		  " Anda bisa memanggil fungsi EditText setelah anda" +
        		  " import libraries android.widget.EditText, Tampilan " +
        		  " EditText menjadi beberada baris karena " +
        		  " android:singleline=false");
        
    }
}