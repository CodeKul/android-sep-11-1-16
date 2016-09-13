package com.codekul.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnOkay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeCircle();
            }
        });
    }

    private void changeCircle(){
        ((MyView)findViewById(R.id.myView))
                .changeAttrs(getCx(),getCy(),getRadius());
    }

    private float getCx(){
        return Float.parseFloat(((EditText)findViewById(R.id.edtCx))
                .getText()
                .toString());
    }

    private float getCy(){
        return Float.parseFloat(((EditText)findViewById(R.id.edtCy))
                .getText()
                .toString());
    }

    private float getRadius(){
        return Float.parseFloat(((EditText)findViewById(R.id.edtCenter))
                .getText()
                .toString());
    }
}
