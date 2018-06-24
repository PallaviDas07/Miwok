/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer ;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> numberlist = new ArrayList<>();
        numberlist.add(new Word ("One","lutti", R.drawable.number_one, R.raw.number_one));
        numberlist.add(new Word("Two","ottiko",R.drawable.number_two, R.raw.number_two));
        numberlist.add(new Word("Three","tolookossu",R.drawable.number_three, R.raw.number_three));
        numberlist.add(new Word("Four","oyissa",R.drawable.number_four, R.raw.number_four));
        numberlist.add(new Word("Five","massoka",R.drawable.number_five, R.raw.number_five));
        numberlist.add(new Word("Six","temmoka",R.drawable.number_six, R.raw.number_six));
        numberlist.add(new Word("Seven","kenekaku",R.drawable.number_seven, R.raw.number_seven));
        numberlist.add(new Word("Eight","kawanita",R.drawable.number_eight,R.raw.number_eight));
        numberlist.add(new Word("Nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        numberlist.add(new Word("Ten","na'aacha",R.drawable.number_ten, R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this,numberlist,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(itemsAdapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override


            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = numberlist.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });



    }
}
