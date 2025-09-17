package Inimigos;
public class Alien implements Inimigo {
    private int hp = 28;
    public String nome() {
        return "Alien"; }
    public int ataque() {
        return 7; }
    public int BarraDeVida() {
        return hp; }
}
