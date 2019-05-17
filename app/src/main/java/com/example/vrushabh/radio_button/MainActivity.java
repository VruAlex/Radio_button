package com.example.vrushabh.radio_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioSexGroup=(RadioGroup) findViewById(R.id.radioGroup);
        Display = (Button) findViewById(R.id.button);

        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                radioSexButton= (RadioButton) findViewById(selectedId);
                //Toast is used for popup massage when you click the button
                Toast toast =  Toast.makeText(MainActivity.this,radioSexButton.getText(),Toast.LENGTH_SHORT);
                // To set custom background of toast we have to make shape and color layout in drawable
                View view = toast.getView();
                view.setBackgroundResource(R.drawable.curve);
                toast.show();



            }
        });
    }



}
