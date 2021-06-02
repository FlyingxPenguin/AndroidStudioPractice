package com.termproject.mybookshelf;

import android.content.Context;



public abstract class BookFetcher {
    private static final String TAG = "BookFetcher";
    public static final int fetcherID_DB = 0;
    public static final int fetcherID_OL = 1;
    protected Context mContext;

    protected Book mBook;


    protected abstract void getBookInfo(Context context, String isbn, final int mode);
}
