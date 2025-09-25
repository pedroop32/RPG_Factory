public class MagoFactory implements JogadorFactory {
    public Personagem criarPersonagem() {
        return new Mago();
    }

    public Arma criarArma() {
        return new Cajado();
    }

    public int atribuirVida() {
        return 70;
    }

    public int atribuirDano() {
        return 30;
    }

    public double atribuirAcerto() {
        return 0.7;
    }
}