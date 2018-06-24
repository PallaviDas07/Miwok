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

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<Word> numberlist = new ArrayList<>();
        numberlist.add(new Word ("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        numberlist.add(new Word("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        numberlist.add(new Word("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        numberlist.add(new Word("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        numberlist.add(new Word("I’m feeling good.","kuchi achit", R.raw.phrase_im_feeling_good));
        numberlist.add(new Word("Are you coming?","әәnәs'aa?", R.raw.phrase_are_you_coming));
        numberlist.add(new Word("Yes, I’m coming.","hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        numberlist.add(new Word("I’m coming.","әәnәm",R.raw.phrase_yes_im_coming));
        numberlist.add(new Word("Let’s go.","yoowutis",R.raw.phrase_lets_go));
        numberlist.add(new Word("Come here.","әnni'nem",R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this,numberlist,R.color.category_phrases);

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
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
