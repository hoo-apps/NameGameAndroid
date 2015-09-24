package edu.hooapps.android.namegame;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class GameActivityFragment extends Fragment {

    public GameActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_game, container, false);

        Intent intent = getActivity().getIntent();
        String myStringFromIntent = intent.getStringExtra("myString");

        //TextView myTextView = (TextView) rootView.findViewById(R.id.my_id);
        //myTextView.setText(myStringFromIntent);

        return rootView;
    }
}
