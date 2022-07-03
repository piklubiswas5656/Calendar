package bengali.calendar.panjika.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import bengali.calendar.panjika.Fragment.AgroyanFragment;
import bengali.calendar.panjika.Fragment.AsharFragment;
import bengali.calendar.panjika.Fragment.AshinFragment;
import bengali.calendar.panjika.Fragment.BoyshikFragment;
import bengali.calendar.panjika.Fragment.ChatroFragment;
import bengali.calendar.panjika.Fragment.FalgunFragment;
import bengali.calendar.panjika.Fragment.JaystoFragment;
import bengali.calendar.panjika.Fragment.KartikFragment;
import bengali.calendar.panjika.Fragment.MagFragment;
import bengali.calendar.panjika.Fragment.PosFragment;
import bengali.calendar.panjika.Fragment.SrabonFragment;
import bengali.calendar.panjika.Fragment.VadroFragment;

public class PageAdapter extends FragmentPagerAdapter {
    int tabcout;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcout = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BoyshikFragment();
            case 1:
                return new JaystoFragment();
            case 2:
                return new AsharFragment();
            case 3:
                return new SrabonFragment();
            case 4:
                return new VadroFragment();
            case 5:
                return new AshinFragment();
            case 6:
                return new KartikFragment();
            case 7:
                return new AgroyanFragment();
            case 8:
                return new PosFragment();
            case 9:
                return new MagFragment();
            case 10:
                return new FalgunFragment();
            case 11:
                return new ChatroFragment();
            default:
                return new AshinFragment();
        }
    }

    @Override
    public int getCount() {
        return tabcout;
    }
}
