package com.example.assignment2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
public class ItemAdapter
        extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Item[] item;

    public ItemAdapter(Item[] item) {
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;

        ImageView imageView = cardView.findViewById(R.id.item_image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), item[position].getImageID());
        imageView.setImageDrawable(dr);

        TextView name = cardView.findViewById(R.id.item_name);
        name.setText(item[position].getName());


        cardView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), ItemDetails.class);
            intent.setData(Uri.parse(position + ""));
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return item.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }
}