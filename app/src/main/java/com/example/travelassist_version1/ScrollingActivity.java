package com.example.travelassist_version1;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.design.widget.BottomNavigationView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {
    Button hello, welcome, thanks, sorry, bye, cost, place, toilet, no_understand, speak_eng,bill,helloAudio;
    Spinner translateFrom, translateTo;
    ArrayAdapter<CharSequence> adapter;
    SharedPreferences preferences = getSharedPreferences("values", MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Button hello = (Button) findViewById(R.id.hello);
        Button welcome = (Button) findViewById(R.id.ur_welcome);
        Button thanks = (Button) findViewById(R.id.thanks);
        Button sorry = (Button) findViewById(R.id.sorry);
        Button bye = (Button) findViewById(R.id.bye);
        Button cost = (Button) findViewById(R.id.cost);
        Button place = (Button) findViewById(R.id.place);
        Button toilet = (Button) findViewById(R.id.toilet);
        Button no_understand = (Button) findViewById(R.id.no_understand);
        Button speak_eng = (Button) findViewById(R.id.speak_eng);
        Button bill = (Button) findViewById(R.id.bill);
        final ImageButton helloAudio = (ImageButton) findViewById(R.id.helloAudio);
        final MediaPlayer helloAudioFile = (MediaPlayer) MediaPlayer.create(this, R.raw.hello_en);
        Spinner translateFrom = (Spinner) findViewById(R.id.translateFrom);
        adapter = ArrayAdapter.createFromResource(this, R.array.translateFrom, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        translateFrom.setAdapter(adapter);
        translateTo.setAdapter(adapter);
        translateFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                preferences.edit().putInt("translateFrom", position).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                preferences.edit().putInt("translateFrom", 0).apply();
            }
        });
        translateTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                preferences.edit().putInt("translateTo", position).apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                preferences.edit().putInt("translateTo", 0).apply();
            }
        });
        Spinner translateTo = (Spinner) findViewById(R.id.translateTo);

        final int translateFromLan = preferences.getInt("translateFrom", 0);
        final int tranlateToLan = preferences.getInt("translateTo", 0);
        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tranlateToLan == 0){
                    //
                }
                else
                if (tranlateToLan == 1) {
                    hello.setText(R.string.helloCHN);
                }
                else if (tranlateToLan == 2){
                    hello.setText(getString(R.string.helloJPN));
                }
                else{
                    hello.setText(getString(R.string.helloMYN));
                }
            }
        });

        helloAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloAudioFile.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.setting) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
