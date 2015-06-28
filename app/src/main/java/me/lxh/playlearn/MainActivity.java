package me.lxh.playlearn;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import me.lxh.playlearn.google.AdMobActivity;
import me.lxh.playlearn.google.AnalyticsActivity;
import me.lxh.playlearn.google.AuthenticationActivity;
import me.lxh.playlearn.google.NotificationsActivity;

public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "me.lxh.playlearn.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                //openSearch();
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Called when the user clicks the Send button */
    public void startAdMobActivity(View view) {
        Intent intent = new Intent(this, AdMobActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Send button */
    public void startAnalyticsActivity(View view) {
        Intent intent = new Intent(this, AnalyticsActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Send button */
    public void startAuthenticationActivity(View view) {
        Intent intent = new Intent(this, AuthenticationActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Send button */
    public void startNotificationsActivity(View view) {
        Intent intent = new Intent(this, NotificationsActivity.class);
        startActivity(intent);
    }
}
