package com.example.latihanuts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

        holder.titleTV.setOnClickListener(e -> {
            if(albums.get(position).getTitle().equals("How Did We Get So Dark?")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.howdidwegetsodark);
                intent.putExtra("DefaultTitle", "How Did We Get So Dark?");
                intent.putExtra("DefaultDetail", "How Did We Get So Dark? is the second studio album by British hard rock duo Royal Blood. The album was released by Warner Bros. Records on 16 June 2017.");

                context.startActivity(intent);
            }else if(albums.get(position).getTitle().equals("Suck It And See")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.suckitandsee);
                intent.putExtra("DefaultTitle", "Suck It And See");
                intent.putExtra("DefaultDetail", "Suck It and See is the fourth studio album by English rock band Arctic Monkeys, released on 6 June 2011 by Domino Recording Company. It was produced by the band's longtime collaborator James Ford and was recorded at Sound City Studios in Los Angeles in early 2011.");

                context.startActivity(intent);
            }else if(albums.get(position).getTitle().equals("Kid A")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.kida);
                intent.putExtra("DefaultTitle", "Kid A");
                intent.putExtra("DefaultDetail", "Kid A is the fourth studio album by the English rock band Radiohead, released on 2 October 2000 by Parlophone. It was recorded with their producer, Nigel Godrich, in Paris, Copenhagen, Gloucestershire and Oxfordshire.");

                context.startActivity(intent);
            }else if(albums.get(position).getTitle().equals("Is This It")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.isthisit);
                intent.putExtra("DefaultTitle", "Is This It");
                intent.putExtra("DefaultDetail", "Is This It is the debut studio album by American rock band the Strokes. It was first released on July 30, 2001, in Australia, with RCA Records handling the release internationally and Rough Trade Records handling the United Kingdom release.");

                context.startActivity(intent);
            }else if(albums.get(position).getTitle().equals("Songs for The Deaf")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.songsforthedeaf);
                intent.putExtra("DefaultTitle", "Songs for The Deaf");
                intent.putExtra("DefaultDetail", "Songs for the Deaf is the third studio album by the American rock band Queens of the Stone Age, released on August 27, 2002 by Interscope Records. It features guest musicians including Dave Grohl on drums, and was the last Queens of the Stone Age album to feature the bassist Nick Oliveri as a band member.");

                context.startActivity(intent);
            }else if(albums.get(position).getTitle().equals("Peripheral Vision")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.peripheralvision);
                intent.putExtra("DefaultTitle", "Peripheral Vision");
                intent.putExtra("DefaultDetail", "Peripheral Vision is the second studio album by American rock band Turnover. Produced by Will Yip, the album was released on May 4, 2015 through Run for Cover Records.");

                context.startActivity(intent);
            }
        });
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
