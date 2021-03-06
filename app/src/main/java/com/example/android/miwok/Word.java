package com.example.android.miwok;

/**
 * Created by pallavi on 20/6/18.
 */

public class Word {
    /** Default translation for the word */
    public String mDefaultTranslation;

    /** Miwok translation for the word */
    public String mMiwokTranslation;

    public int mImageResouseId;

    private  int mAudioResourceId;

    private  final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     +     *
     +     * @param defaultTranslation is the word in a language that the user is already familiar with
     +     *                           (such as English)
     +     * @param miwokTranslation is the word in the Miwok language
     +     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResouseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResouseId;
    }



    public Word(String defaultTranslation, String miwokTranslation, int imageResouseId, int audioResouseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResouseId = imageResouseId;
        mAudioResourceId = audioResouseId;
    }
    /**
     +     * Get the default translation of the word.
     +     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     +     * Get the Miwok translation of the word.
     +     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int  getImageResouseId()

    {
        return mImageResouseId;
    }
    public boolean hasImage()
    { return  mImageResouseId!=NO_IMAGE_PROVIDED;}

   /**
 +     * Return the audio resource ID of the word.
 +     */
           public int getAudioResourceId() {
                return mAudioResourceId;
            }
}
