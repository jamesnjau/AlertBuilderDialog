package com.example.james.alertbuilderdialog;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by JAMES on 11/1/2017.
 */

public class MyAlert extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder =new AlertDialog.Builder(getActivity());

        builder.setTitle("My Dialog");
        //builder.setMessage("Do you like this dialog");

      /* builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(getActivity(),"Item was clicked "+which,Toast.LENGTH_SHORT).show();

           }
       });*/
      builder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which, boolean isChecked) {
              Toast.makeText(getActivity(),"Item from position "+which+" was selected "+isChecked,Toast.LENGTH_SHORT).show();

          }
      });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Negative button wasclicked",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Positive button was clicked",Toast.LENGTH_SHORT).show();
            }
        });
        Dialog dialog = builder.create();
        dialog.setCancelable(true);
        return dialog;
    }
}
