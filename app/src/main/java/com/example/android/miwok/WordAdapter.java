package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;

/**
 * Created by pallavi on 20/6/18.
 */
public class WordAdapter extends ArrayAdapter<Word>  {

    private int mColorResourceId;


    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());
        if(currentWord.hasImage()) {

            //Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(currentWord.getImageResouseId());
        }
        else
        {
            ImageView iconView = new ImageView(null);
            iconView.setVisibility(View.GONE);
        }
       //Set the theme color for the list item
                       View textContainer = listItemView.findViewById(R.id.text_container);
              // Find the color that the resource ID maps to
                      int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
               textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}