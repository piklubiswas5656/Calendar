package bengali.calendar.panjika;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

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

import bengali.calendar.panjika.Activity.CalendarActivity;
import bengali.calendar.panjika.Activity.PrivacyActivity;

public class MainActivity extends AppCompatActivity {
    private Context context = MainActivity.this;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);;
        innit();
        navigationViewitemclick();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void innit() {
        drawerLayout = findViewById(R.id.layoutparent);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


        navigationView = findViewById(R.id.navigationDrawer);
        navigationView.setCheckedItem(R.id.navHome);
    }
    private void navigationViewitemclick() {
        navigationView.setNavigationItemSelectedListener(menuItem -> {
            navigationDrawerItemSelector(menuItem);
            return false;
        });
    }


    private void navigationDrawerItemSelector(MenuItem menuItem) {
        switch (menuItem.getItemId()) {

            case R.id.navHome:
                startActivity(new Intent(context, CalendarActivity.class));
                break;
//            case R.id.navShare:
//                //Share
//                Intent sendIntent = new Intent();
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.putExtra(Intent.EXTRA_TEXT, Conn.baseurl + getPackageName());
//                sendIntent.setType("text/plain");
//
//                Intent shareIntent = Intent.createChooser(sendIntent, "Share by");
//                startActivity(shareIntent);
//                break;
            case R.id.navpri:
                startActivity(new Intent(getApplicationContext(), PrivacyActivity.class));
                break;

        }

        closeDrawer();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.shareright:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Conn.baseurl + getPackageName()));
                startActivity(intent);
                return true;
        }
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void closeDrawer() {
        this.drawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.right_menu, menu);

        for (int i = 0; i < menu.size(); i++) {
            MenuItem menuItem = menu.getItem(i);
            SpannableString spannable = new SpannableString(
                    menu.getItem(i).getTitle().toString());
            spannable.setSpan(new ForegroundColorSpan(Color.YELLOW), 0, spannable.length(), 0);
            menuItem.setTitle(spannable);
        }
        return true;
    }
}