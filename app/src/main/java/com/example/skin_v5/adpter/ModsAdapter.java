package com.example.skin_v5.adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skin_v5.R;
import com.example.skin_v5.model.Mod;

import java.util.List;

public class ModsAdapter extends RecyclerView.Adapter<ModsAdapter.ViewHolder>{

    public interface OnClickItem {
        void onClicked(String id);
    }

    private final List<Mod> items;
    private OnClickItem listener;

    public ModsAdapter(List<Mod> items, OnClickItem listener) {
        this.items = items;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mods_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mod mod = items.get(position);
        holder.titleView.setText(mod.getTitle());
        holder.imageMod.setImageResource(mod.getBigImages());

        holder.itemView.setOnClickListener(v -> {
            if (listener != null)
                listener.onClicked(items.get(position).getId());
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleView;
        ImageView imageMod;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageMod = itemView.findViewById(R.id.image);
            titleView = itemView.findViewById(R.id.title_text);
        }
    }
}
