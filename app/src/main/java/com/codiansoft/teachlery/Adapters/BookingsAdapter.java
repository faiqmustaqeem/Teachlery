package com.codiansoft.teachlery.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.codiansoft.teachlery.Models.BookingsModel;
import com.codiansoft.teachlery.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodianSoft on 06/01/2018.
 */

public class BookingsAdapter extends RecyclerView.Adapter<BookingsAdapter.MyViewHolder> implements Filterable {


    List<BookingsModel> bookingsModels;
    List<BookingsModel> bookingsModelsFiltered;

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    bookingsModelsFiltered = bookingsModels;
                } else {
                    List<BookingsModel> filteredList = new ArrayList<>();
                    for (BookingsModel row : bookingsModels) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getCourse_name().toLowerCase().contains(charString.toLowerCase()) ) {
                            filteredList.add(row);
                        }
                    }

                    bookingsModelsFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = bookingsModelsFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                bookingsModelsFiltered = (ArrayList<BookingsModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name;
        TextView course_name;
        TextView date;
        TextView time;
        TextView status;

        public MyViewHolder(View itemView) {
            super(itemView);

            name= itemView.findViewById(R.id.name);
            course_name=itemView.findViewById(R.id.course_name);
            date=itemView.findViewById(R.id.date);
            time=itemView.findViewById(R.id.time);
            status=itemView.findViewById(R.id.status);

        }
    }
    public BookingsAdapter(List<BookingsModel> bookingsModels)
    {
        this.bookingsModels=bookingsModels;
    }


    @Override
    public BookingsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bookings_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BookingsAdapter.MyViewHolder holder, int position) {

        holder.name.setText(bookingsModels.get(position).getName());
        holder.course_name.setText(bookingsModels.get(position).getCourse_name());
        holder.date.setText(bookingsModels.get(position).getDate());
        holder.time.setText(bookingsModels.get(position).getTime());
        holder.status.setText(bookingsModels.get(position).getStatus());

    }

    @Override
    public int getItemCount() {
        return bookingsModels.size();
    }
}
