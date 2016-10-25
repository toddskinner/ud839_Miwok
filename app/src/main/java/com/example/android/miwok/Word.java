package com.example.android.miwok;

import android.content.Context;

/**
 * Created by toddskinner on 10/22/16.
 */

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;

    /**
     * Constructs a new Word with initial values for miwok translation and english translation.
     */
    public Word(String miwokTranslation, String englishTranslation){
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
    }

    /**
     * Gets the string value of the miwok translation.
     *
     * @return current text in the miwokTranslation.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Gets the string value of the english translation.
     *
     * @return current text in the englishTranslation.
     */
    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }
}
