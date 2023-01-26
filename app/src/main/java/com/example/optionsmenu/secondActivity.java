package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class secondActivity extends AppCompatActivity
{
    Button btnToFirst;
    LinearLayout layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnToFirst = findViewById(R.id.button2);
        layout = findViewById(R.id.RL2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400, "Purple");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        String str = item.getTitle().toString();
        if(str.equals("Red"))
        {
            layout.setBackgroundColor(Color.rgb(255, 0, 0));
        }
        else if(str.equals("Green"))
        {
            layout.setBackgroundColor(Color.rgb(0, 255, 0));
        }
        else if(str.equals("Blue"))
        {
            layout.setBackgroundColor(Color.rgb(0, 0, 255));
        }
        else if(str.equals("Purple"))
        {
            layout.setBackgroundColor(Color.rgb(255, 0, 255));
        }
        return true;
    }

    public void goToFirst(View view)
    {
        Intent si = new Intent(this, MainActivity.class);
        startActivity(si);
    }
}