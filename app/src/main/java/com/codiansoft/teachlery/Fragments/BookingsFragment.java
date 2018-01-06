package com.codiansoft.teachlery.Fragments;


import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import com.codiansoft.teachlery.Activities.MainActivity;
import com.codiansoft.teachlery.Adapters.BookingsAdapter;
import com.codiansoft.teachlery.Models.BookingsModel;
import com.codiansoft.teachlery.R;

import java.util.ArrayList;
import java.util.List;


public class BookingsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    public BookingsFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static BookingsFragment newInstance(String param1, String param2) {
        BookingsFragment fragment = new BookingsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bookings, container, false);

        MainActivity.frameLayout.setVisibility(View.VISIBLE);

        recyclerView=view.findViewById(R.id.bookingsRecycleView);
        adapter=new BookingsAdapter(getBookings());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

//        MainActivity.searchBar.setVisibility(View.VISIBLE);



        return view;
    }
    List<BookingsModel> getBookings()
    {
        List<BookingsModel> bookingsModels=new ArrayList<>();

        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));

        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));

        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));

        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));


        return  bookingsModels;
    }


}
