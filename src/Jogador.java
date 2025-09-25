import java.util.Random;

public class Jogador {
    private Personagem personagem;
    private Arma arma;
    private int vida;
    private int dano;
    private double acerto;

    public Jogador(JogadorFactory factory) {
        personagem = factory.criarPersonagem();
        arma = factory.criarArma();
        vida = factory.atribuirVida();
        dano = factory.atribuirDano();
        acerto = factory.atribuirAcerto();
    }

    public String getPersonagem() {
        return personagem.getPersonagem();
    }

    public void Atacar(int numero) {
        System.out.printf("JOGADOR %d (%s) ataca com %s!\n", numero, personagem.getPersonagem(), arma.getArma());
    }

    public int Acerto() {
        Random rand = new Random();
        if((rand.nextDouble() < acerto ? 1 : 0) == 1) return 1;
        else return 0;
    }

    public int danoCausado() {
        return dano;
    }

    public void danoSofrido(int dano) {
        System.out.printf("Ataque causou %d de dano!\n", dano);
        vida -= dano;
    }

    public int getVida() {
        return vida;
    }
}
