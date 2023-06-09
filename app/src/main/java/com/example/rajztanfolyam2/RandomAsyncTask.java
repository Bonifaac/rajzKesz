package com.example.rajztanfolyam2;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class RandomAsyncTask extends AsyncTask<Void,Void, String> {

    private WeakReference<TextView> mTextView;

    RandomAsyncTask(TextView tv) {
        mTextView = new WeakReference<>(tv);
    }

    /**
     * Runs on the background thread.
     *
     * @param voids No parameters in this use case.
     * @return Returns the string including the amount of time that
     * the background thread slept.
     */
    @Override
    protected String doInBackground(Void... voids) {
        return "";
    }

    protected void onPostExecute(String result) {
        mTextView.get().setText(result);
    }
}
