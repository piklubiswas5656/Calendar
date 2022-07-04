package bengali.calendar.panjika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowCalendarDetailActivity extends AppCompatActivity {
    //var
    private String festival;
    //wid
    private TextView showdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_calendar_detail);
        showdate = findViewById(R.id.showdata);
        festival = getIntent().getStringExtra(Conn.Festival);
        showdate.setText(String.valueOf(festival));

    }
}