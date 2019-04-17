package com.example.travelassist_version1;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class ScrollingActivity extends AppCompatActivity {
    Spinner translateFrom, translateTo;
    int fromLanguage;
    int toLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final SharedPreferences preferences = getSharedPreferences("values", MODE_PRIVATE);
        final Button hello = (Button) findViewById(R.id.hello);
        final Button welcome = (Button) findViewById(R.id.ur_welcome);
        final Button thanks = (Button) findViewById(R.id.thanks);
        final Button sorry = (Button) findViewById(R.id.sorry);
        final Button bye = (Button) findViewById(R.id.bye);
        final Button cost = (Button) findViewById(R.id.cost);
        final Button place = (Button) findViewById(R.id.place);
        final Button toilet = (Button) findViewById(R.id.toilet);
        final Button no_understand = (Button) findViewById(R.id.no_understand);
        final Button speak_eng = (Button) findViewById(R.id.speak_eng);
        final Button bill = (Button) findViewById(R.id.bill);
        final ImageButton helloAudio = (ImageButton) findViewById(R.id.helloAudio);
        final MediaPlayer helloEngAudioFile = (MediaPlayer) MediaPlayer.create(this, R.raw.hello_en);
        final MediaPlayer helloChnAudioFile = (MediaPlayer) MediaPlayer.create(this, R.raw.hello_chn);
        final MediaPlayer helloJpnAudioFile = (MediaPlayer) MediaPlayer.create(this, R.raw.hello_jpn);
        final MediaPlayer helloMynAudioFile = (MediaPlayer) MediaPlayer.create(this, R.raw.hello_myn);
        translateFrom = (Spinner) findViewById(R.id.translateFrom);
        translateTo = (Spinner) findViewById(R.id.translateTo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.translateFrom, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        translateFrom.setAdapter(adapter);
        translateTo.setAdapter(adapter);
        translateFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                fromLanguage = i;
                if (fromLanguage == 0){
                    hello.setText(R.string.helloEN);
                    thanks.setText(R.string.thanksEN);
                    bye.setText(R.string.byeEN);
                    welcome.setText(R.string.welcomeEN);
                    sorry.setText(R.string.sorryEN);
                    cost.setText(R.string.costEN);
                    toilet.setText(R.string.toiletEN);
                    no_understand.setText(R.string.noUnderstandEN);
                    bill.setText(R.string.billEN);
                    place.setText(R.string.placeEN);
                    speak_eng.setText(R.string.englishEN);
                }else if(fromLanguage == 1){
                    hello.setText(R.string.helloCHN);
                    bye.setText(R.string.byeCHN);
                    thanks.setText(R.string.thanksCHN);
                    welcome.setText(R.string.welcomeCHN);
                    sorry.setText(R.string.sorryCHN);
                    cost.setText(R.string.costCHN);
                    toilet.setText(R.string.toiletCHN);
                    no_understand.setText(R.string.noUnderstandCHN);
                    bill.setText(R.string.billCHN);
                    place.setText(R.string.placeCHN);
                    speak_eng.setText(R.string.englishCHN);
                }else if(fromLanguage == 2) {
                    hello.setText(R.string.helloJPN);
                    bye.setText(R.string.byeJPN);
                    thanks.setText(R.string.thanksJPN);
                    welcome.setText(R.string.welcomeJPN);
                    sorry.setText(R.string.sorryJPN);
                    cost.setText(R.string.costJPN);
                    toilet.setText(R.string.toiletJPN);
                    no_understand.setText(R.string.noUnderstandJPN);
                    bill.setText(R.string.billJPN);
                    place.setText(R.string.placeJPN);
                    speak_eng.setText(R.string.englishJPN);
                }else if(fromLanguage == 3){
                    hello.setText(R.string.helloKOR);
                    bye.setText(R.string.byeKOR);
                    thanks.setText(R.string.thanksKOR);
                    welcome.setText(R.string.welcomeKOR);
                    sorry.setText(R.string.sorryKOR);
                    cost.setText(R.string.costKOR);
                    toilet.setText(R.string.toiletKOR);
                    no_understand.setText(R.string.noUnderstandKOR);
                    bill.setText(R.string.billKOR);
                    place.setText(R.string.placeKOR);
                    speak_eng.setText(R.string.englishKOR);
                }else if(fromLanguage == 4){
                    hello.setText(R.string.helloMLY);
                    bye.setText(R.string.byeMLY);
                    thanks.setText(R.string.thanksMLY);
                    welcome.setText(R.string.welcomeMLY);
                    sorry.setText(R.string.sorryMLY);
                    cost.setText(R.string.costMLY);
                    toilet.setText(R.string.toiletMLY);
                    no_understand.setText(R.string.noUnderstandMLY);
                    bill.setText(R.string.billMLY);
                    place.setText(R.string.placeMLY);
                    speak_eng.setText(R.string.englishMLY);
                }else if(fromLanguage == 5) {
                    hello.setText(R.string.helloMYN);
                    bye.setText(R.string.byeMYN);
                    thanks.setText(R.string.thanksMYN);
                    welcome.setText(R.string.welcomeMYN);
                    sorry.setText(R.string.sorryMYN);
                    cost.setText(R.string.costMYN);
                    toilet.setText(R.string.toiletMYN);
                    no_understand.setText(R.string.noUnderstandMYN);
                    bill.setText(R.string.billMYN);
                    place.setText(R.string.placeMYN);
                    speak_eng.setText(R.string.englishMYN);
                }else if(fromLanguage==6){
                    hello.setText(R.string.helloKHM);
                    bye.setText(R.string.byeKHM);
                    thanks.setText(R.string.thanksKHM);
                    welcome.setText(R.string.welcomeKHM);
                    sorry.setText(R.string.sorryKHM);
                    cost.setText(R.string.costKHM);
                    toilet.setText(R.string.toiletKHM);
                    no_understand.setText(R.string.noUnderstandKHM);
                    bill.setText(R.string.billKHM);
                    place.setText(R.string.placeKHM);
                    speak_eng.setText(R.string.englishKHM);
                }else {
                    hello.setText(R.string.helloGRM);
                    bye.setText(R.string.byeGRM);
                    thanks.setText(R.string.thanksGRM);
                    welcome.setText(R.string.welcomeGRM);
                    sorry.setText(R.string.sorryGRM);
                    cost.setText(R.string.costGRM);
                    toilet.setText(R.string.toiletGRM);
                    no_understand.setText(R.string.noUnderstandGRM);
                    bill.setText(R.string.billGRM);
                    place.setText(R.string.placeGRM);
                    speak_eng.setText(R.string.englishGRM);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //
            }
        });

        translateTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                toLanguage = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //
            }
        });

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    hello.setText(R.string.helloEN);
                } else if (toLanguage == 1) {
                    hello.setText(R.string.helloCHN);
                } else if (toLanguage == 2) {
                    hello.setText(R.string.helloJPN);
                } else if (toLanguage == 3){
                    hello.setText(R.string.helloKOR);
                }else if (toLanguage == 4){
                    hello.setText(R.string.helloMLY);
                }else if (toLanguage == 5){
                    hello.setText(R.string.helloMYN);
                }else if (toLanguage == 6){
                    hello.setText(R.string.helloKHM);
                }else if (toLanguage == 7){
                    hello.setText(R.string.helloGRM);
                }
            }
        });

        thanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    thanks.setText(R.string.thanksEN);
                } else if (toLanguage == 1) {
                    thanks.setText(R.string.thanksCHN);
                } else if (toLanguage == 2) {
                    thanks.setText(R.string.thanksJPN);
                } else if (toLanguage == 3){
                    thanks.setText(R.string.thanksKOR);
                }else if (toLanguage == 4){
                    thanks.setText(R.string.thanksMLY);
                }else if (toLanguage == 5){
                    thanks.setText(R.string.thanksMYN);
                }else if (toLanguage == 6){
                    thanks.setText(R.string.thanksKHM);
                }else if (toLanguage == 7){
                    thanks.setText(R.string.thanksGRM);
                }
            }
        });

        bye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    bye.setText(R.string.byeEN);
                } else if (toLanguage == 1) {
                    bye.setText(R.string.byeCHN);
                } else if (toLanguage == 2) {
                    bye.setText(R.string.byeJPN);
                } else if (toLanguage == 3){
                    bye.setText(R.string.byeKOR);
                }else if (toLanguage == 4){
                    bye.setText(R.string.byeMLY);
                }else if (toLanguage == 5){
                    bye.setText(R.string.byeMYN);
                }else if (toLanguage == 6){
                    bye.setText(R.string.byeKHM);
                }else if (toLanguage == 7){
                    bye.setText(R.string.byeGRM);
                }
            }
        });

        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    welcome.setText(R.string.welcomeEN);
                } else if (toLanguage == 1) {
                    welcome.setText(R.string.welcomeCHN);
                } else if (toLanguage == 2) {
                    welcome.setText(R.string.welcomeJPN);
                } else if (toLanguage == 3){
                    welcome.setText(R.string.welcomeKOR);
                }else if (toLanguage == 4){
                    welcome.setText(R.string.welcomeMLY);
                }else if (toLanguage == 5){
                    welcome.setText(R.string.welcomeMYN);
                }else if (toLanguage == 6){
                    welcome.setText(R.string.welcomeKHM);
                }else if (toLanguage == 7){
                    welcome.setText(R.string.welcomeGRM);
                }
            }
        });

        sorry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    sorry.setText(R.string.sorryEN);
                } else if (toLanguage == 1) {
                    sorry.setText(R.string.sorryCHN);
                } else if (toLanguage == 2) {
                    sorry.setText(R.string.sorryJPN);
                } else if (toLanguage == 3){
                    sorry.setText(R.string.sorryKOR);
                }else if (toLanguage == 4){
                    sorry.setText(R.string.sorryMLY);
                }else if (toLanguage == 5){
                    sorry.setText(R.string.sorryMYN);
                }else if (toLanguage == 6){
                    sorry.setText(R.string.sorryKHM);
                }else if (toLanguage == 7){
                    sorry.setText(R.string.sorryGRM);
                }
            }
        });

        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    cost.setText(R.string.costEN);
                } else if (toLanguage == 1) {
                    cost.setText(R.string.costCHN);
                } else if (toLanguage == 2) {
                    cost.setText(R.string.costJPN);
                } else if (toLanguage == 3){
                    cost.setText(R.string.costKOR);
                }else if (toLanguage == 4){
                    cost.setText(R.string.costMLY);
                }else if (toLanguage == 5){
                    cost.setText(R.string.costMYN);
                }else if (toLanguage == 6){
                    cost.setText(R.string.costKHM);
                }else if (toLanguage == 7){
                    cost.setText(R.string.costGRM);
                }
            }
        });

        toilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    toilet.setText(R.string.toiletEN);
                } else if (toLanguage == 1) {
                    toilet.setText(R.string.toiletCHN);
                } else if (toLanguage == 2) {
                    toilet.setText(R.string.toiletJPN);
                } else if (toLanguage == 3){
                    toilet.setText(R.string.toiletKOR);
                }else if (toLanguage == 4){
                    toilet.setText(R.string.toiletMLY);
                }else if (toLanguage == 5){
                    toilet.setText(R.string.toiletMYN);
                }else if (toLanguage == 6){
                    toilet.setText(R.string.toiletKHM);
                }else if (toLanguage == 7){
                    toilet.setText(R.string.toiletGRM);
                }
            }
        });

        no_understand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    no_understand.setText(R.string.noUnderstandEN);
                } else if (toLanguage == 1) {
                    no_understand.setText(R.string.noUnderstandCHN);
                } else if (toLanguage == 2) {
                    no_understand.setText(R.string.noUnderstandJPN);
                } else if (toLanguage == 3){
                    no_understand.setText(R.string.noUnderstandKOR);
                }else if (toLanguage == 4){
                    no_understand.setText(R.string.noUnderstandMLY);
                }else if (toLanguage == 5){
                    no_understand.setText(R.string.noUnderstandMYN);
                }else if (toLanguage == 6){
                    no_understand.setText(R.string.noUnderstandKHM);
                }else if (toLanguage == 7){
                    no_understand.setText(R.string.noUnderstandGRM);
                }
            }
        });

        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    bill.setText(R.string.billEN);
                } else if (toLanguage == 1) {
                    bill.setText(R.string.billCHN);
                } else if (toLanguage == 2) {
                    bill.setText(R.string.billJPN);
                } else if (toLanguage == 3){
                    bill.setText(R.string.billKOR);
                }else if (toLanguage == 4){
                    bill.setText(R.string.billMLY);
                }else if (toLanguage == 5){
                    bill.setText(R.string.billMYN);
                }else if (toLanguage == 6){
                    bill.setText(R.string.billKHM);
                }else if (toLanguage == 7){
                    bill.setText(R.string.billGRM);
                }
            }
        });

        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    place.setText(R.string.placeEN);
                } else if (toLanguage == 1) {
                    place.setText(R.string.placeCHN);
                } else if (toLanguage == 2) {
                    place.setText(R.string.placeJPN);
                } else if (toLanguage == 3){
                    place.setText(R.string.placeKOR);
                }else if (toLanguage == 4){
                    place.setText(R.string.placeMLY);
                }else if (toLanguage == 5){
                    place.setText(R.string.placeMYN);
                }else if (toLanguage == 6){
                    place.setText(R.string.placeKHM);
                }else if (toLanguage == 7){
                    place.setText(R.string.placeGRM);
                }
            }
        });

        speak_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toLanguage == 0) {
                    speak_eng.setText(R.string.englishEN);
                } else if (toLanguage == 1) {
                    speak_eng.setText(R.string.englishCHN);
                } else if (toLanguage == 2) {
                    speak_eng.setText(R.string.englishJPN);
                } else if (toLanguage == 3){
                    speak_eng.setText(R.string.englishKOR);
                }else if (toLanguage == 4){
                    speak_eng.setText(R.string.englishMLY);
                }else if (toLanguage == 5){
                    speak_eng.setText(R.string.englishMYN);
                }else if (toLanguage == 6){
                    speak_eng.setText(R.string.englishKHM);
                }else if (toLanguage == 7){
                    speak_eng.setText(R.string.englishGRM);
                }
            }
        });


        helloAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String helloText = hello.getText().toString();
                if (helloText.equals(getString(R.string.helloEN))){
                    helloEngAudioFile.start();
                }else if(helloText.equals(getString(R.string.helloCHN))){
                    helloChnAudioFile.start();
                }else if(helloText.equals(getString(R.string.helloJPN))) {
                    helloJpnAudioFile.start();
                }else{
                    helloMynAudioFile.start();
                }
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
