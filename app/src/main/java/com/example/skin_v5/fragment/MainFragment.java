package com.example.skin_v5.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import com.example.skin_v5.R;

public class MainFragment extends Fragment {

    private View view;
    private String searchStr;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        View searchButton = view.findViewById(R.id.toolbar_search);
        searchButton.setOnClickListener(v -> setupSearch(true));

        View rate = view.findViewById(R.id.rate);
        rate.setOnClickListener(v -> {
            startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps")));
        });

        setupSearch(false);

        return view;
    }

    private void setupSearch(boolean show) {
        View searchButton = view.findViewById(R.id.toolbar_search);
        View toolbarText = view.findViewById(R.id.toolbar_name);
        SearchView searchView = view.findViewById(R.id.search);

        searchView.setOnCloseListener(() -> {
            setupSearch(false);
            //whatCurrent();
            return false;
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) { return false; }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchStr = newText;
                //filterData();
                return false;
            }
        });
        searchButton.setVisibility(show ? View.GONE : View.VISIBLE);
        toolbarText.setVisibility(show ? View.GONE : View.VISIBLE);
        searchView.setVisibility(show ? View.VISIBLE : View.GONE);

        if (show) {
            searchView.setIconified(false);
            searchView.requestFocusFromTouch();
        }
    }
}
