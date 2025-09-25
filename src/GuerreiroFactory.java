public class GuerreiroFactory implements JogadorFactory {
    public Personagem criarPersonagem() {
        return new Guerreiro();
    }

    public Arma criarArma() {
        return new Espada();
    }

    public int atribuirVida() {
        return 100;
    }

    public int atribuirDano() {
        return 20;
    }

    public double atribuirAcerto() {
        return 0.8;
    }
}
