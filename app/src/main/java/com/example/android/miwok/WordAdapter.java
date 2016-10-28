package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by toddskinner on 10/22/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceID;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResource) {
        super(context, 0, words);
        mColorResourceID = colorResource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage())
        {
            imageView.setImageResource(currentWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        englishTextView.setText(currentWord.getEnglishTranslation());

        View textContainer = (View) listItemView.findViewById(R.id.text_container);
        //textContainer.setBackgroundResource(mColorResourceID);
        View arrowContainer = (View) listItemView.findViewById(R.id.arrow_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);
        arrowContainer.setBackgroundColor(color);

        return listItemView;
    }
}
