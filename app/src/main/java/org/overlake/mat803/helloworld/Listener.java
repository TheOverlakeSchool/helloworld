package org.overlake.mat803.helloworld;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

class Listener implements View.OnClickListener {

    Context context;

    Listener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Log.d("Listener","onClick method called");
        Toast.makeText(context, "Button Clicked from Listener object", Toast.LENGTH_SHORT).show();
    }
}
