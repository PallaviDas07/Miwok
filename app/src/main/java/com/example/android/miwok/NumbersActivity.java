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


public class NumbersActivity extends AppCompatActivity {
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numberlist = new ArrayList<>();
        numberlist.add(new Word ("One","lutti", R.drawable.number_one));
        numberlist.add(new Word("Two","ottiko",R.drawable.number_two));
        numberlist.add(new Word("Three","tolookossu",R.drawable.number_three));
        numberlist.add(new Word("Four","oyissa",R.drawable.number_four));
        numberlist.add(new Word("Five","massoka",R.drawable.number_five));
        numberlist.add(new Word("Six","temmoka",R.drawable.number_six));
        numberlist.add(new Word("Seven","kenekaku",R.drawable.number_seven));
        numberlist.add(new Word("Eight","kawanita",R.drawable.number_eight));
        numberlist.add(new Word("Nine","wo'e",R.drawable.number_nine));
        numberlist.add(new Word("Ten","na'aacha",R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this,numberlist,R.color.category_numbers);

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
