package com.example.alessandrycruz.dummydisplaygif.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.alessandrycruz.dummydisplaygif.R;
import com.example.alessandrycruz.dummydisplaygif.gif.GifImageView;

/**
 * Created by alessandry.cruz on 6/7/2017.
 */

public class Loading_Dialog extends DialogFragment {
    public static final String TAG = Loading_Dialog.class.getSimpleName();
    public static final String KEY_MESSAGE = "key_message";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Get the LayoutInflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_loading, null);

        // Get the GifImageView
        GifImageView gifImageView = (GifImageView) view.findViewById(R.id.gif_image_view);
        gifImageView.setGifImageResource(R.drawable.loading);

        // Sets the Message
        String message = getArguments().getString(KEY_MESSAGE);
        TextView textViewMessage = (TextView) view.findViewById(R.id.text_view_message);
        textViewMessage.setText(message);

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(view);

        // Add action buttons
//                .setPositiveButton("Sign In", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int id) {
//                    }
//                })
//                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        Loading_Dialog.this.getDialog().cancel();
//                    }
//                });

        return builder.create();
    }
}