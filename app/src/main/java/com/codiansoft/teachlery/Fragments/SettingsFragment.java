package com.codiansoft.teachlery.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.codiansoft.teachlery.Activities.AboutUsActivity;
import com.codiansoft.teachlery.Activities.SignInActivity;
import com.codiansoft.teachlery.Adapters.SettingsAdapter;
import com.codiansoft.teachlery.Interfaces.RecyclerTouchListener;
import com.codiansoft.teachlery.R;

import java.util.ArrayList;
import java.util.List;

public class SettingsFragment extends Fragment {


    RecyclerView recyclerView;
    SettingsAdapter adapter;

    public SettingsFragment() {
    }



    public static SettingsFragment newInstance(String param1, String param2) {
        SettingsFragment fragment = new SettingsFragment();

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
        View rootView = inflater.inflate(R.layout.fragment_settings, container, false);

        recyclerView=(RecyclerView)rootView.findViewById(R.id.recycle_view_settings);
        adapter=new SettingsAdapter(getItems());

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(
                        getContext(), new RecyclerTouchListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // TODO Handle item click
                        //Toast.makeText(getActivity() , "item "+position , Toast.LENGTH_LONG).show();
                       switch (position)
                       {
                           case 0:



                               break;
                           case 1:
                               Intent i=new Intent(getActivity() , AboutUsActivity.class);
                               startActivity(i);
                               break;
                           case 4:
                               new MaterialDialog.Builder(getActivity())
                                       .title("Logout")
                                       .content("Are you sure you want to logout ?")
                                       .positiveText("Yes")
                                       .onPositive(new MaterialDialog.SingleButtonCallback() {
                                           @Override
                                           public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                               Intent i=new Intent(getActivity() , SignInActivity.class);
                                               startActivity(i);
                                           }
                                       })
                                       .negativeText("N0")
                                       .onNegative(new MaterialDialog.SingleButtonCallback() {
                                           @Override
                                           public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                                           }
                                       })
                                       .show();
                               break;

                       }
                    }
                })
        );


        return  rootView;
    }
    List<String> getItems()
    {
        List<String> list=new ArrayList<>();
        list.add("Contact us");
        list.add("About us");
        list.add("Terms and Condition");
        list.add("Share to friends");
        list.add("Logout");


        return list;

    }


}
