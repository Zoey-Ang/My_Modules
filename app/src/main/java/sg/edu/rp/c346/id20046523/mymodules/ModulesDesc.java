package sg.edu.rp.c346.id20046523.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModulesDesc extends AppCompatActivity {

    TextView tvAns;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules_desc);

        tvAns = findViewById(R.id.textViewMod);
        btnBack = findViewById(R.id.back);

        //getting the user choice
        Intent recIntent = getIntent();
        String selectMod = recIntent.getStringExtra("Module");

        if(selectMod.equalsIgnoreCase("C346"))
        {
            tvAns.setText("Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2021\nSemester: 1\nModule Credit: 4\nVenue: E62E");
        }
        else if(selectMod.equalsIgnoreCase("C331"))
        {
            tvAns.setText("Module Code: C331\nModule Name: Digital Security and Forensics\nAcademic Year: 2021\nSemester: 1\nModule Credit: 4\nVenue: E62E");
        }

        else if(selectMod.equalsIgnoreCase("C203"))
        {
            tvAns.setText("Module Code: C203\nModule Name: Web Application Development in php\nAcademic Year: 2021\nSemester: 1\nModule Credit: 4\nVenue: W67L");
        }

        else if(selectMod.equalsIgnoreCase("C228"))
        {
            tvAns.setText("Module Code: C228\nModule Name: Operating Systems Security\nAcademic Year: 2021\nSemester: 1\nModule Credit: 4\nVenue: E62L");
        }

        else if(selectMod.equalsIgnoreCase("C328"))
        {
            tvAns.setText("Module Code: C328\nModule Name: Intelligent Networks\nAcademic Year: 2021\nSemester: 1\nModule Credit: 4\nVenue: E62C");
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goback = new Intent(ModulesDesc.this, MainActivity.class);
                startActivity(goback);
            }
        });
    }
}