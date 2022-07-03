package bengali.calendar.panjika.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import bengali.calendar.panjika.Adapter.PageAdapter;
import bengali.calendar.panjika.Conn;
import bengali.calendar.panjika.R;

public class CalendarActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem tabItemone, tabitemtwo, tabitemthree, tabitemfour;
    ViewPager viewPager;
    PageAdapter pageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        innit();
        getSupportActionBar().hide();
    }

    private void innit() {

        tabLayout = findViewById(R.id.tablayout1);
        tabItemone = findViewById(R.id.tab1);
        tabitemtwo = findViewById(R.id.tab2);
        tabitemthree = findViewById(R.id.tab3);
        tabitemfour = findViewById(R.id.tab4);
        viewPager = findViewById(R.id.viewpager);
        pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
//        /** default tab selected **/
//        viewPager.setCurrentItem(0);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2 || tab.getPosition() == 3 || tab.getPosition() == 4 || tab.getPosition() == 5 || tab.getPosition() == 6 || tab.getPosition() == 7 || tab.getPosition() == 8 || tab.getPosition() == 9 || tab.getPosition() == 10 || tab.getPosition() == 11) {
                    pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }


}