package com.bubenheimer.firedance;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;

public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final String id = FirebaseInstanceId.getInstance().getId();
        final View view = findViewById(R.id.stateview);
        ((TextView)view).setText("Instance ID " + id);
    }
}
