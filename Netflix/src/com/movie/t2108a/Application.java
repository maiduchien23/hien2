package com.movie.t2108a;

import com.movie.t2108a.controller.NetflixController;
import com.movie.t2108a.model.Netflix;
import com.movie.t2108a.repository.NetflixRepository;

import javax.swing.plaf.synth.SynthDesktopPaneUI;
import java.util.*;


public class Application {
    public static void main(String [] args){

        NetflixRepository netflixRepository = new NetflixRepository();
        NetflixController netflixController = new NetflixController();

        netflixRepository.getData();
        System.out.println("=====================================================");
        List<Netflix> netflixList = netflixRepository.netflixList;
        Scanner sc = new Scanner(System.in);

        while (true){
            menu();
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1://Sap xep film theo ten fil
                    Collections.sort(netflixList, new Comparator<Netflix>() {
                        @Override
                        public int compare(Netflix o1, Netflix o2) {
                            return o1.getTitle().compareTo(o2.getTitle());
                        }
                    });
                    printList(netflixList);

                    break;
                case 2: // Tim theo ten film
                    System.out.println("Nhap ten phim can tim: ");
                    String name = sc.nextLine();
                    System.out.println("Danh sach phim: " + name+":" );
                    netflixController.seachByName(netflixList,name);
                    break;
                case 3:
                    System.out.println("Nhap ten loai phim can tim: ");
                    String genres = sc.nextLine();
                    System.out.println("Danh muc phim: " + genres+":" );
                    netflixController.seachByCategory(netflixList,genres);
                    break;
                case 4:
                    System.out.println("Nhap ngon ngu phim can tim: ");
                    String language = sc.nextLine();
                    System.out.println("Danh sach phim: " + language+":" );
                    netflixController.seachByLanguage(netflixList,language);
                    break;
                case 5:
                    netflixController.getAllMovieCategory(netflixList);
                    break;
                case 0:
                    System.exit(1);
                default:break;
            }
        }
    }
    public static void printList(List<Netflix> list){
        for (Netflix netflix : list){
            System.out.println(netflix);
        }
    }
    public static void menu(){
        System.out.println("Cac tuy chon cua ban voi film tren netflix");
        System.out.println("1. Sap xep phim");
        System.out.println("2. Tim phim theo ten");
        System.out.println("3. Lim phim theo the loai");
        System.out.println("4. Liet ke cac bo phim theo the loai");
        System.out.println("5. Tim theo ngon ngu");
        System.out.println("6. Ket thuc chuong trinh");
    }
}
