package bengali.calendar.panjika.Adapter;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import bengali.calendar.panjika.Conn;
import bengali.calendar.panjika.MainActivity;
import bengali.calendar.panjika.Model.AlldayModel;
import bengali.calendar.panjika.R;
import bengali.calendar.panjika.ShowCalendarDetailActivity;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.BoyshikHolder> {
    private ArrayList<AlldayModel> data;

    public CalendarAdapter(ArrayList<AlldayModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public BoyshikHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.day_layout_itme, parent, false);
        return new BoyshikHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BoyshikHolder holder, int position) {
        AlldayModel model = data.get(position);
        holder.englisdate.setText(Conn.monthDate(model.getEnglishdate()));
        holder.bengalidate.setText(model.getBdate());
        holder.festival.setText(model.getFestival());
        if (position == 0 || position == 7 || position == 14 || position == 21 || position == 28 || position == 35) {
            holder.bengalidate.setTextColor(Color.RED);
        }
        if ("1".equals(model.getEnglishdate())) {
            holder.layoutBackgourn.setBackgroundColor(Color.rgb(250, 244, 122));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (model.getEnglishdate().equals("") || model.getEnglishdate() == null) {

                } else {
                    Intent intent = new Intent(holder.itemView.getContext(), ShowCalendarDetailActivity.class);
                    intent.putExtra(Conn.Festival, model.getFestival());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    holder.itemView.getContext().startActivity(intent);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class BoyshikHolder extends RecyclerView.ViewHolder {
        private TextView englisdate, bengalidate, festival;
        private LinearLayout layoutBackgourn;

        public BoyshikHolder(@NonNull View itemView) {
            super(itemView);
            englisdate = itemView.findViewById(R.id.english_date);
            bengalidate = itemView.findViewById(R.id.bengali_date);
            festival = itemView.findViewById(R.id.festival);
            layoutBackgourn = itemView.findViewById(R.id.backgourdLayout);
        }
    }
}
