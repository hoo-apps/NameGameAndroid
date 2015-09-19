package edu.hooapps.android.namegame;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button playButton;
    private Button addPhotoButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        playButton = (Button) rootView.findViewById(R.id.button_play);
        addPhotoButton = (Button) rootView.findViewById(R.id.button_camera);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGameActivity();
            }
        });

        addPhotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAddPhotoActivity();
            }
        });

        return rootView;
    }

    private void startGameActivity() {
        Intent gameIntent = new Intent(getActivity(), GameActivity.class);
        startActivity(gameIntent);
    }

    private void startAddPhotoActivity() {
        Intent addPhotoIntent = new Intent(getActivity(), AddPhotoActivity.class);
        startActivity(addPhotoIntent);
    }
}
