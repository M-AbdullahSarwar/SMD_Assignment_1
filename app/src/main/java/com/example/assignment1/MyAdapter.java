package com.example.assignment1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {
    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

//        if (position ==0)
//            return new //pehla;
//        else if (position == 1)
//            return new //dosra;
//        else if (position == 2)
//            return new //teesra;
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
