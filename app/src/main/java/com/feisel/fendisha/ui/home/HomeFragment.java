package com.feisel.fendisha.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.feisel.fendisha.R;
import com.feisel.fendisha.adapters.HomeHorAdapter;
import com.feisel.fendisha.adapters.HomeVerAdapter;
import com.feisel.fendisha.adapters.UpdateVerRec;
import com.feisel.fendisha.models.HomeHorModel;
import com.feisel.fendisha.models.HomeVerModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements UpdateVerRec {

    RecyclerView homeHorRec, homeVerRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    //***Vertical***///
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorRec = root.findViewById(R.id.home_hor_rec);
        homeVerRec = root.findViewById(R.id.home_ver_rec);

        //***Horizontal RecyclerView***//
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel("Pizza",R.drawable.pizza));
        homeHorModelList.add(new HomeHorModel("HamBUrger",R.drawable.hamburger));
        homeHorModelList.add(new HomeHorModel("Fries",R.drawable.fried_potatoes));
        homeHorModelList.add(new HomeHorModel("Ice Cream",R.drawable.ice_cream));
        homeHorModelList.add(new HomeHorModel("Sandwich",R.drawable.sandwich));

        homeHorAdapter = new HomeHorAdapter(this, getActivity(),homeHorModelList);
        homeHorRec.setAdapter(homeHorAdapter);
        homeHorRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorRec.setHasFixedSize(true);
        homeHorRec.setNestedScrollingEnabled(false);

        //***Vertical RecyclerView***//

        homeVerModelList = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(), homeVerModelList);
        homeVerRec.setAdapter(homeVerAdapter);
        homeVerRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));


        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(), list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerRec.setAdapter(homeVerAdapter);
    }
}