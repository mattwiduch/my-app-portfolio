package com.redraysoftware.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mButtonMoviesApp;
    private Button mButtonScoresApp;
    private Button mButtonLibraryApp;
    private Button mButtonBIBApp;
    private Button mButtonReaderApp;
    private Button mButtonCapstoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //initialise buttons
        mButtonMoviesApp = (Button) findViewById(R.id.button_movies_app);
        mButtonScoresApp = (Button) findViewById(R.id.button_scores_app);
        mButtonLibraryApp = (Button) findViewById(R.id.button_library_app);
        mButtonBIBApp = (Button) findViewById(R.id.button_bib_app);
        mButtonReaderApp = (Button) findViewById(R.id.button_reader_app);
        mButtonCapstoneApp = (Button) findViewById(R.id.button_capstone_app);

        //set listeners for each button
        mButtonMoviesApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createToast(mButtonMoviesApp.getText().toString());
            }
        });
        mButtonScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createToast(mButtonScoresApp.getText().toString());
            }
        });
        mButtonLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createToast(mButtonLibraryApp.getText().toString());
            }
        });
        mButtonBIBApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createToast(mButtonBIBApp.getText().toString());
            }
        });
        mButtonReaderApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createToast(mButtonReaderApp.getText().toString());
            }
        });
        mButtonCapstoneApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createToast(mButtonCapstoneApp.getText().toString());
            }
        });
    }

    private void createToast(String appTitle) {
        String message = "This button will launch " + appTitle;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
