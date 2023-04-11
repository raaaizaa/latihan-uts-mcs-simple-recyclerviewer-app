package com.example.latihanuts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;
public class albumAdapter extends RecyclerView.Adapter<albumAdapter.ViewHolder> {

    private Vector<album> albums;
    private Context context;

    public albumAdapter(Vector<album> albums, Context context){
        this.albums = albums;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.album_card, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.titleTV.setText(albums.get(position).getTitle());
        holder.artistTV.setText(albums.get(position).getArtist());
        holder.yearTV.setText(albums.get(position).getYear());
        holder.imageIV.setImageResource(albums.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView titleTV, artistTV, yearTV;
        ImageView imageIV;
        LinearLayoutCompat parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTV = itemView.findViewById(R.id.title);
            artistTV = itemView.findViewById(R.id.artist);
            yearTV = itemView.findViewById(R.id.year);
            imageIV = itemView.findViewById(R.id.imageTemplate);
        }
    }
}
