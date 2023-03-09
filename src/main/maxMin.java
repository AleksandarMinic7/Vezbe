package main;


import java.util.Arrays;

public class maxMin {

    public static void main(String[] args) {
//            int mojNiz[] = { 55, 67, -20, 0, 88 };
//            Arrays.sort(mojNiz);

//            int min = mojNiz[0];
//            System.out.println(min);
//
//            int max = mojNiz[mojNiz.length-1];
//            System.out.println(max);
//        }


        int mojNiz[] = {55, 67, -20, 2, 88};
        int max = 0;
        for (int i = 0; i <= mojNiz.length - 1; i++) {
            if (mojNiz[i] > max) {
                max = mojNiz[i];
            }

        }
        System.out.println("Max vrednost je: " + max);

        int min = 100;
        for (int i = 1; i < mojNiz.length - 1; i++){
            if (mojNiz[i] < min) {
                min = mojNiz[i];
            }
        }
        System.out.println("Minimalna vrednost je: " + min);


    }
}






