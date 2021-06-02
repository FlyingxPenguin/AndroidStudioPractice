package com.termproject.mybookshelf;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;

import com.microsoft.appcenter.analytics.Analytics;

import java.util.HashMap;
import java.util.Map;



public class AboutActivity extends AppCompatActivity {
    private static final String TAG = "Aboutactivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Map<String, String> logEvents = new HashMap<>();
        logEvents.put("Activity", TAG);
        Analytics.trackEvent("onCreate", logEvents);

        logEvents.clear();
        logEvents.put("Name", "onCreate");
        Analytics.trackEvent(TAG, logEvents);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.about_toolbar);
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.about_preference_category_title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        if (savedInstanceState == null) {
            AboutFragment aboutFragment = new AboutFragment();
            getFragmentManager().beginTransaction().add(R.id.activity_about_container, aboutFragment).commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
