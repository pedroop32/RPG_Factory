import Factory.EspacialFactory;
import Factory.GameFactory;
import Factory.MedievalFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        String theme = args[0].toLowerCase();
        GameFactory factory;
        switch (theme) {
            case "medieval": factory = new MedievalFactory();
                break;
            case "espacial":

                factory = new EspacialFactory();
                break;
            default:
                System.out.println("Tema desconhecido: " + theme + ". Use 'medieval' ou 'espacial'.");
                return;
        }
        new Jogo(factory).start();
    }
}