package com.gmail.farasabiyyu12.store;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gmail.farasabiyyu12.store.ResponseServer.DataItem;

import java.util.List;

/**
 *
 * Created by farasabiyyuhandoko on 29/03/2018.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    Context context;
    List<DataItem> data;
    public static final String WebUrl = "http://192.168.20.2/onlineshop/";

    public CustomAdapter(Context context, List<DataItem> dataItems) {
        this.context = context;
        this.data = dataItems;
    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item , parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CustomAdapter.ViewHolder holder, final int position) {

        holder.id.setText(data.get(position).getId());
        holder.price.setText(data.get(position).getPrice());
        holder.name.setText(data.get(position).getName());
        holder.brand.setText(data.get(position).getBrand());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("id", data.get(position).getId());
                intent.putExtra("name", data.get(position).getName());
                intent.putExtra("price", data.get(position).getPrice());
                intent.putExtra("brand", data.get(position).getBrand());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id, name, price, brand;

        public ViewHolder(View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.id);
            name = itemView.findViewById(R.id.nama);
            brand = itemView.findViewById(R.id.brand);
            price = itemView.findViewById(R.id.price);

        }
    }
}
