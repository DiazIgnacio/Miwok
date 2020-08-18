package com.example.android.miwok;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResouorceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mSoundResourceId ;

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int soundResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResouorceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }
    public  Word(String defaultTranslation,String miwokTranslation,int soundResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){ return mMiwokTranslation; }
    public int getImageResourceId(){return mImageResouorceId;}
    public int getSoundResourceId(){return  mSoundResourceId;}
    public boolean hasImage(){
        return mImageResouorceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResouorceId=" + mImageResouorceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}
