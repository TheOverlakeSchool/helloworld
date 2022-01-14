package org.overlake.mat803.helloworld;

import android.content.Context;
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
        Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show();
    }
}
