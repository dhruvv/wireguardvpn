package com.koulutos.venkyvpn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button button = findViewById(R.id.button1);
    final TextView textView = findViewById(R.id.textView);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            textView.setText("Tunnel opening");
            Intent intent = Intent(MainActivity.this, VpnActivity.this)
        }


    });

}
}