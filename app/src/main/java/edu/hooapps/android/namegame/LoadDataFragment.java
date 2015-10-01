package edu.hooapps.android.namegame;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.hooapps.android.namegame.api.model.Photo;

public class LoadDataFragment extends Fragment implements LoaderManager.LoaderCallbacks<Photo> {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_game, container, false);
        return rootView;
    }

    @Override
    public Loader<Photo> onCreateLoader(int i, Bundle bundle) {
        // TODO implement this
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Photo> loader, Photo photo) {
        // TODO implement this
    }

    @Override
    public void onLoaderReset(Loader<Photo> loader) {
        // This can be left blank
    }
}
