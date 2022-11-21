public class Multithreading{

    public static void main (String[] args){


        for (int i = 0; i<3; i++){
            Multithread mythgin = new Multithread(i);
            mythgin.start();
        }
        

    }
}