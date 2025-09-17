package Factory;
import Inimigos.Alien;
import Inimigos.Inimigo;
import Itens.Arma;
import Itens.ArmaLaser;

public class EspacialFactory implements GameFactory {
    public Inimigo criarInimigo() {
        return new Alien(); }
    public Arma criarArma() {
        return new ArmaLaser(); }
}

