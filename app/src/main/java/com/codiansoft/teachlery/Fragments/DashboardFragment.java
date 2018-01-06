package com.codiansoft.teachlery.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codiansoft.teachlery.Activities.MainActivity;
import com.codiansoft.teachlery.R;


public class DashboardFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
   // private static final String ARG_PARAM1 = "param1";
 //   private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
  //  private String mParam1;
   // private String mParam2;
//
//    private OnFragmentInteractionListener mListener;

    public DashboardFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();

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
        View view= inflater.inflate(R.layout.fragment_dashboard, container, false);
        MainActivity.frameLayout.setVisibility(View.GONE);
       // MainActivity.searchBar.setVisibility(View.GONE);
        return view;

    }

}
