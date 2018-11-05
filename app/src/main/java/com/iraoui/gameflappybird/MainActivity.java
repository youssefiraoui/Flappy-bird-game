package com.iraoui.gameflappybird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppConstants.initialization(this.getApplicationContext());
    }

    public void startGame(View view) {
       // Log.i("ImageButton", "Clicked");
        //System.out.println("Click button play");
        //Toast.makeText(this," Button clicked",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
        finish();
    }
}
