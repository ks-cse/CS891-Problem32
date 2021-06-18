package com.ksinha.countrylistr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryRAdapter extends RecyclerView.Adapter<CountryRAdapter.ViewHolder> {
    private Country country;

    public CountryRAdapter(){
        country = new Country();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull CountryRAdapter.ViewHolder holder, int position) {
        holder.flag.setImageResource(country.getFlag(position));
        holder.tv_country.setText(country.getCountry(position));
        holder.tv_capital.setText(country.getCapital(position));
    }

    @Override
    public int getItemCount() {
        return country.getCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView flag;
        TextView tv_country, tv_capital;

        public ViewHolder(View itemView) {
            super(itemView);

            flag = itemView.findViewById(R.id.icon_flag);
            tv_country = itemView.findViewById(R.id.tv_country);
            tv_capital = itemView.findViewById(R.id.tv_capital);
        }
    }
}
