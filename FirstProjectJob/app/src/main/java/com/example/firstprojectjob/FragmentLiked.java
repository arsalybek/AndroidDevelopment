package com.example.firstprojectjob;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class FragmentLiked extends Fragment {
    RecyclerView recyclerView;
    private  PostAdapter adapter;
    ImageButton like;
    PostsContainer postsContainer = PostsContainer.PostsContainer();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_liked,container,false);
        recyclerView = v.findViewById(R.id.recyclerView);
        adapter = new PostAdapter(postsContainer.getLikedPosts());
        RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mlayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(),LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
        like = v.findViewById(R.id.ic_like);
        return v;
    }
}
