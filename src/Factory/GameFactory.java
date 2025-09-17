package Factory;
import Inimigos.Inimigo;
import Itens.Arma;

public interface GameFactory {
    Inimigo criarInimigo();
    Arma criarArma();
}
