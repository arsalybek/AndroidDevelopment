package com.example.firstprojectjob;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class PostsContainer {
    private static  PostsContainer postsContainer;
    private List<Post> posts;
    private List<Post> likedPosts = new ArrayList<>();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM", Locale.ENGLISH);
    public static PostsContainer PostsContainer()
    {
        if (postsContainer == null)
        {
            postsContainer = new PostsContainer();
        }
        return postsContainer;
    }
    public List<Post> getAllPosts()
    {
        return posts;
    }

    public  List<Post> getLikedPosts(){
        for (Post post:posts){
            if(post.isLiked()){
                likedPosts.add(post);
            }
        }
        return likedPosts;
    }
    private PostsContainer(){
        //createPosts();
    }

    public void createPosts(){
        posts = new ArrayList<>();
          posts.add(new Post("канский","@Beisekeyev","‧ "+dateFormat.format(new Date()),"В общем, цены авиабилетов для экономики Казахстана очень необоснованны. Имхо. " +
                  "Где средняя зп в кз - 45к, как могут билеты стоять около 70-100 000тг и больше.",
                  R.drawable.a,"4","13",170));
          posts.add(new Post("comme des fuck down","","‧ "+dateFormat.format(new Date()),"Скрываю свои чувства,как аудиозаписи вк",
                  R.drawable.b,"","3",25));
          posts.add(new Post("Aisultan","@aisultan","‧ "+dateFormat.format(new Date()),"Нет больше оправданий! Сегодня «паразиты» доказали, что можно " +
                  "снимать на своей родной земле, на своём языке и разъебать с этим весь мир! Лучшие!",
                  R.drawable.c,"16","219",2786));
          posts.add(new Post("Ринат Балгабаев","@Rinat_...","‧ "+dateFormat.format(new Date()),"Американцы нанимают Айсултана,чтобы клип посмотрели как минимум " +
                  "несколько миллионов казахов",
                  R.drawable.d,"4","5",248));
          posts.add(new Post("Poem Heaven","@PoemHeaven","‧ "+dateFormat.format(new Date()),"how’s your 2020 going so far?",
                  R.drawable.e,"200","153",1122));
          posts.add(new Post("Trevor Holmes","@tholmesmu..","‧ "+dateFormat.format(new Date()),"Life doesn’t happen the way you want it to happen. " +
                  "It happens the way you need it to happen",
                  R.drawable.f,"4","41",155));
          posts.add(new Post("Elon Musk","@elonmusk","‧ "+dateFormat.format(new Date()),"Run a physics sim long enough & you’ll get intelligence",
                  R.drawable.g,"2,751","6,544",108000));
          posts.add(new Post("Литература","@literabook","‧ "+dateFormat.format(new Date()),"Мы никогда не узнаем почему и чем мы раздражаем людей, чем мы милы им и чем смешны; наш собственный образ остается для нас величайшей тайной.\n\n" +
                  "М.Кундера \"Бессмертие\"",
                  R.drawable.h,"2","120",868));
          posts.add(new Post("Литература","@literabook","‧ "+dateFormat.format(new Date()),"Покупка книг была бы хорошей идеей,если бы можно было также купить и время для их чтения.\n\n" +
                  "А.Шопенгауэр",
                  R.drawable.h,"4","200",1177));
          posts.add(new Post("Великие слова","@topcitat","‧ "+dateFormat.format(new Date()),"Не в возрасте дело,а в культуре общения и уровне интеллектуального развития.",
                  R.drawable.i,"1","28",139));
      }




}
