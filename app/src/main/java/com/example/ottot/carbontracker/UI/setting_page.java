package com.example.ottot.carbontracker.UI;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
//import androidx.annotation.Nullable;
import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.ottot.carbontracker.R;


/*
    a class that handles the setting page. All settings are saved automatically into SharedPreference
    use

 */

public class setting_page extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.setting_toolBar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        getSupportActionBar().setTitle(R.string.setting);
        toolbar.setTitleTextColor(getResources().getColor(R.color.actionBarText));


        getFragmentManager().beginTransaction().replace(R.id.preference_frame,
                new preferencesSetting()).commit();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }




    public static Intent makeIntent(Context context) {
        return new Intent(context, setting_page.class);
    }
}
