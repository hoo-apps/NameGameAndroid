package edu.hooapps.android.namegame.api;

import android.content.Context;

import edu.hooapps.android.namegame.api.model.Photo;
import oak.util.OakAsyncLoader;

public class ApiLoader extends OakAsyncLoader<Photo> {

    public ApiLoader(Context context) {
        super(context);
    }

    @Override
    public Photo loadInBackground() {
        // TODO implement this
        return null;
    }
}
