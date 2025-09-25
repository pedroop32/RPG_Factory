public interface JogadorFactory {
    Personagem criarPersonagem();
    Arma criarArma();
    int atribuirVida();
    int atribuirDano();
    double atribuirAcerto();
}