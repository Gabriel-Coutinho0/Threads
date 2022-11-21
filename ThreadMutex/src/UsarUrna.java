public class UsarUrna extends Thread {
    Urna urna;
    Thread t;
    private int tempo;
    String nomeUsu[];

    public UsarUrna(String nome, Urna urna, int tempo, String nomeUsu[]) {
        this.urna = urna;
        this.tempo = tempo;
        this.nomeUsu = nomeUsu;
        t = new Thread(this,nome);
        t.start();

    }

    public void run() {
        if (t.getName().equalsIgnoreCase("Ocupado")) {
            for (int i = 0; i < nomeUsu.length; i++) {
                urna.vazio(true);
                System.out.println("Urna vazia, pode votar!");
                System.out.println("RG por favor!!");
                System.out.println(nomeUsu[i] + " está entrando!");
                
              
                try {
                    Thread.sleep(tempo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            urna.vazio(false);

        } else {
            for (int i = 0; i < nomeUsu.length; i++) {
                urna.ocupado(true);
                System.out.println("Urna ocupada, " + nomeUsu[i] + " está votando!");
                System.out.println("");
                System.out.println("...Votação em andamento...");
                try {
                    Thread.sleep(tempo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            urna.ocupado(false);
        }
       
    }
    
}
