package main;


import java.util.Arrays;

public class maxMin {

        public static void main(String[] args) {
            int mojNiz[] = { 55, 67, -20, 0, 88 };
            Arrays.sort(mojNiz);

            int min = mojNiz[0];
            System.out.println(min);

            int max = mojNiz[mojNiz.length-1];
            System.out.println(max);
        }

    }






