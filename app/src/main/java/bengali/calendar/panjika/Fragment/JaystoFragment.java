package bengali.calendar.panjika.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bengali.calendar.panjika.Adapter.CalendarAdapter;
import bengali.calendar.panjika.Conn;
import bengali.calendar.panjika.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JaystoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JaystoFragment extends Fragment {
    //var
    CalendarAdapter adapter;

    //wid
    private RecyclerView recyclerView;
    View view;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JaystoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JaystoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static JaystoFragment newInstance(String param1, String param2) {
        JaystoFragment fragment = new JaystoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view = inflater.inflate(R.layout.fragment_jaysto, container, false);
        recyclerView = view.findViewById(R.id.jaistaRecyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 7));

        return view;
    }

}