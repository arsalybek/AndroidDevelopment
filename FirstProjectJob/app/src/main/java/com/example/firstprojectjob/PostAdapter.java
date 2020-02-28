package com.example.firstprojectjob;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.MovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {
    private List<Post> posts;

    public PostAdapter (List<Post> posts){
        this.posts = posts;
    }
    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.post_row,parent,false);
        return new PostHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final PostHolder holder, int position) {
        final Post post = posts.get(position);
        holder.name.setText(post.getName());
        holder.login.setText(post.getLogin());
        holder.date.setText(post.getDate());
        holder.post.setText(post.getPost());
        holder.commentCnt.setText(post.getCommentCnt());
        holder.tweetCnt.setText(post.getTweetCnt());
        holder.likeCnt.setText(String.valueOf(post.getLikeCnt()));
        holder.profileImg.setImageResource(post.getProfileImg());

        holder.like.setOnClickListener(new View.OnClickListener() {
            int cnt = 0;
            @Override
            public void onClick(View v) {
                cnt++;
                if(cnt%2==1) {
                    holder.like.setImageResource(R.drawable.ic_like_clicked_row);
                    Log.e("Like", "Isliked true");
                    post.setLiked(true);
                }
                else
                    holder.like.setImageResource(R.drawable.ic_heart_row);
            }
        });
    }


    @Override
    public int getItemCount() {
        return posts.size();
    }


    public class PostHolder extends RecyclerView.ViewHolder {

        public TextView name,login,date,post,commentCnt,tweetCnt,likeCnt;
        public ImageView profileImg;
        public ImageButton like;

        public PostHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_txt);
            login = itemView.findViewById(R.id.login_txt);
            date = itemView.findViewById(R.id.date);
            post = itemView.findViewById(R.id.post_txt);
            commentCnt = itemView.findViewById(R.id.comments_cnt);
            tweetCnt = itemView.findViewById(R.id.reTweet_cnt);
            likeCnt = itemView.findViewById(R.id.likes_cnt);
            profileImg = itemView.findViewById(R.id.profile_img);
            like = itemView.findViewById(R.id.ic_like);
        }
    }
}
