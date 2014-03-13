package com.zwarm.gradleexpirements;

import android.content.pm.PackageInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView mainTextView;
    TextView resultsTextView;
    TextView versionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = (TextView) findViewById(R.id.mainTextView);
        resultsTextView = (TextView) findViewById(R.id.resultsTextView);
        versionTextView = (TextView) findViewById(R.id.versionTextView);

        resultsTextView.setText("Nothing more to see here");

        String versionName = "No version name";
        try {
            versionName = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;

        }
        catch (Exception e)
        {
        }
        versionTextView.setText("Version: " + versionName);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
