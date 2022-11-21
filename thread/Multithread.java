public class Multithread extends Thread{
    
    private int threadNumber;
    public Multithread (int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 1; i<5; i++){
            System.out.println(i + " Feita pela thread: " + threadNumber );
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            } 
        }
        

    }
}
