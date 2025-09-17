package Factory;
import Inimigos.Inimigo;
import Inimigos.Orc;
import Itens.Arma;
import Itens.Espada;

public class MedievalFactory implements  GameFactory{
    public Inimigo criarInimigo() {
        return new Orc(); }
    public Arma criarArma() {
        return new Espada(); }
}
