package sg.edu.rp.c346.id20046523.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView anProg;
    TextView dsaf;
    TextView webApp;
    TextView oss;
    TextView iN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anProg = findViewById(R.id.C346);
        dsaf = findViewById(R.id.C331);
        webApp = findViewById(R.id.C203);
        oss = findViewById(R.id.C228);
        iN = findViewById(R.id.C328);

        anProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent an = new Intent(MainActivity.this, ModulesDesc.class);
                an.putExtra("Module","C346");
                startActivity(an);
            }
        });

        dsaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ds = new Intent(MainActivity.this, ModulesDesc.class);
                ds.putExtra("Module","C331");
                startActivity(ds);
            }
        });

        webApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(MainActivity.this, ModulesDesc.class);
                web.putExtra("Module","C203");
                startActivity(web);
            }
        });

        oss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent os = new Intent(MainActivity.this, ModulesDesc.class);
                os.putExtra("Module","C228");
                startActivity(os);
            }
        });

        iN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModulesDesc.class);
                i.putExtra("Module","C328");
                startActivity(i);
            }
        });
    }
}