package com.example.skin_v5.adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skin_v5.R;

public class ModsAdapter extends RecyclerView.Adapter<ModsAdapter.ViewHolder>{

    public interface OnClickItem {
        void onClicked(String id);
    }

    private OnClickItem listener;

    public ModsAdapter(OnClickItem listener) {
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

    }

    @Override
    public int getItemCount() {
        return 0;
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
