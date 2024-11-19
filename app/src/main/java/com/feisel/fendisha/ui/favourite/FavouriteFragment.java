package com.feisel.fendisha.ui.favourite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.feisel.fendisha.R;
import com.feisel.fendisha.fragments.FragementAdapter;
import com.google.android.material.tabs.TabLayout;


public class FavouriteFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragementAdapter fragementAdapter;
    private FragmentActivity myContext;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_favourite, container, false);

        tabLayout = root.findViewById(R.id.tab_layout);
        viewPager2 = root.findViewById(R.id.view_pager);

        FragmentManager fm = getActivity().getSupportFragmentManager();
        fragementAdapter = new FragementAdapter(fm, getLifecycle());

        viewPager2.setAdapter(fragementAdapter);

        tabLayout.addTab(tabLayout.newTab().setText("Featured"));
        tabLayout.addTab(tabLayout.newTab().setText("Popular"));
        tabLayout.addTab(tabLayout.newTab().setText("New"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

        return root;
    }
}