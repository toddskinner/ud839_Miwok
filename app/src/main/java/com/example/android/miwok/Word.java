package com.example.android.miwok;

import android.content.Context;

/**
 * Created by toddskinner on 10/22/16.
 */

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceID;

    /**
     * Constructs a new Word with initial values for miwok translation and english translation.
     */
    public Word(String miwokTranslation, String englishTranslation, int audioResourceID){
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Constructs a new Word with initial values for miwok translation, english translation, and image resource ID.
     */
    public Word(String miwokTranslation, String englishTranslation, int imageResourceID, int audioResourceID){
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
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

    public int getImageResourceID(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        if(mImageResourceID == NO_IMAGE_PROVIDED){
            return false;
        }
        else
        {
            return true;
        }
    }

    public int getAudioResourceID(){
        return mAudioResourceID;
    }
}
