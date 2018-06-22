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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numberlist = new ArrayList<>();
        numberlist.add(new Word ("Where are you going?","minto wuksus"));
        numberlist.add(new Word("What is your name?","tinnә oyaase'nә"));
        numberlist.add(new Word("How are you feeling?","michәksәs?"));
        numberlist.add(new Word("My name is...","oyaaset..."));
        numberlist.add(new Word("I’m feeling good.","kuchi achit"));
        numberlist.add(new Word("Are you coming?","әәnәs'aa?"));
        numberlist.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        numberlist.add(new Word("I’m coming.","әәnәm"));
        numberlist.add(new Word("Let’s go.","yoowutis"));
        numberlist.add(new Word("Come here.","әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this,numberlist,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
       /* LinearLayout rootView  = (LinearLayout) findViewById(R.id.rootView);
        int index = 0;
        for(index =0; index<numberlist.size();index++)
        {
            TextView wordView = new TextView(this);
            wordView.setText(numberlist.get(index));
            rootView.addView(wordView);}*/



    }
}
