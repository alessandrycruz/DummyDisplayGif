package com.example.alessandrycruz.dummydisplaygif;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;

import com.example.alessandrycruz.dummydisplaygif.dialogs.Loading_Dialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogFragment newFragment = new Loading_Dialog();
        Bundle bundle = new Bundle();
        bundle.putString(Loading_Dialog.KEY_MESSAGE, "Capturing GPS coordinates.");
        newFragment.setArguments(bundle);
        newFragment.show(getSupportFragmentManager(), Loading_Dialog.TAG);
    }
}