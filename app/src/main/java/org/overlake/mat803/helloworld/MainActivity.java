package org.overlake.mat803.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Method #1: Create an actual Listener object:
        findViewById(R.id.button).setOnClickListener(new Listener(this));

        // Method #2: Use an anonymous class:
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button clicked from Anonymous class", Toast.LENGTH_SHORT).show();
            }
        });

        // Method #3: Use a lambda function:
        findViewById(R.id.button).setOnClickListener(v-> {
            Toast.makeText(this, "Button clicked from lambda", Toast.LENGTH_SHORT).show();
            }
        );

        // --> Note: a View can only have one OnClickListener, so each of the above examples
        // overwrites the previous.
    }
}