public class Teste {
    public static void main(String[] args) {
        System.out.println("Todos devem votar!");
        System.out.println("");

        String lista[] = { "Gabriel", "Jeremias", "Denis", "Carlos", "Valério" };
        for (String i : lista) {
            System.out.println(i);
        }
        System.out.println("");

        Urna urna = new Urna();
        UsarUrna ocupado = new UsarUrna("Ocupado", urna, 500, lista);
        UsarUrna vazio = new UsarUrna("Vazio", urna, 1000, lista);

        
        try {
            vazio.join();
            ocupado.join();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
