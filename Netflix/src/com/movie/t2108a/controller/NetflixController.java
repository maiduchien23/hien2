package com.movie.t2108a.controller;

import com.movie.t2108a.model.Netflix;
import com.movie.t2108a.repository.NetflixRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetflixController {
    NetflixRepository netflixRepository = new NetflixRepository();

    //Tim kiem theo ten flim
    public void seachByName(List<Netflix>list, String name){

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getTitle().contains(name));
            System.out.println(list.get(i));
        }

    }
    public void seachByCategory(List<Netflix>list, String category){
        for (int i =0 ; i < list.size(); i++){
            if (list.get(i).getCategary().contains(category)){
                System.out.println(list.get(i));
            }
        }
    }
    public void seachByLanguage(List<Netflix>list, String language){
        for (int i =0 ; i < list.size(); i++){
            if (list.get(i).getLanguage().contains(language)){
                System.out.println(list.get(i));
            }
        }
    }
    public void getAllMovieCategory(List<Netflix>list){
        Map<String , Integer> countMovieByCategory = new HashMap<>();

        for (int i = 0; i <  list.size(); i++){
            String category = list.get(i).getCategary();
            String arrayCategory[] = category.split("/");

            for (int  j = 0 ;j < arrayCategory.length; j++){
                Integer countMovie = countMovieByCategory.get(arrayCategory[j]);
                if (countMovie == null){
                    countMovieByCategory.put(arrayCategory[j],1);
                }else {
                    countMovieByCategory.put(arrayCategory[j], countMovie +1);
                }
            }

            for (Map.Entry<String, Integer> entry : countMovieByCategory.entrySet()){

                System.out.printf("%s : %d \n",entry.getKey(),entry.getValue());
            }
        }
    }

}
