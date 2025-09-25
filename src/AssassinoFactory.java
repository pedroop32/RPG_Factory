public class AssassinoFactory implements JogadorFactory {
    public Personagem criarPersonagem() {
        return new Assassino();
    }

    public Arma criarArma() {
        return new Adaga();
    }

    public int atribuirVida() {
        return 90;
    }

    public int atribuirDano() {
        return 10;
    }

    public double atribuirAcerto() {
        return 0.9;
    }
}
