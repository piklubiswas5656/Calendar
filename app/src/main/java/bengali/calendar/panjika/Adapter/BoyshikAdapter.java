package bengali.calendar.panjika.Adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import bengali.calendar.panjika.Model.DayModel;
import bengali.calendar.panjika.R;

public class BoyshikAdapter extends RecyclerView.Adapter<BoyshikAdapter.BoyshikHolder> {
    private ArrayList<DayModel> data;

    public BoyshikAdapter(ArrayList<DayModel> data) {
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
        DayModel model = data.get(position);
        holder.englisdate.setText(model.getEnglishday());
        holder.bengalidate.setText(model.getBengaliday());
        holder.festival.setText(model.getFestival());
        if (position == 0 || position == 7 || position == 14 || position == 21 || position == 28 || position == 35) {
            holder.bengalidate.setTextColor(Color.RED);
        }
        if ("1".equals(model.getEnglishday())) {
            holder.layoutBackgourn.setBackgroundColor(Color.rgb(250, 244, 122));
        }


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
