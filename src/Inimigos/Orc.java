package Inimigos;
public class Orc implements Inimigo {
        private int hp = 33;
        public String nome() {
            return "Orc"; }
        public int ataque() {
            return 6; }
        public int BarraDeVida() {
            return hp; }
}
