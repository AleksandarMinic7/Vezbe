package main;




    public class Random {
        public static void main(String[] args) {
            String[] reci = {"1", "2", "3", "4", "5"};
            Random r = new Random();
            int random = r.nextInt(reci.length);
            System.out.println(reci[random]);
        }

        private int nextInt(int reci1) {

            return reci1;
        }
    }

