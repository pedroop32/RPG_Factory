import java.util.Random;

import Factory.GameFactory;
import Inimigos.Inimigo;
import Itens.Arma;

public class Jogo {
    private final GameFactory factory;
    private final Inimigo inimigo;
    private final Arma arma;

    public Jogo(GameFactory factory) {
        this.factory = factory;
        this.inimigo = factory.criarInimigo();
        this.arma = factory.criarArma();
    }

    public void start() throws InterruptedException {
        Random rand = new Random();
        int vidaJogador = 25;
        int vidaInimigo = inimigo.BarraDeVida();

        System.out.println("=== Mini Game — Abstract Factory ===");
        System.out.println("Arma do jogador: " + arma.nome() + " (dano base " + arma.dano() + ")");
        System.out.println("Inimigo encontrado: " + inimigo.nome() + " (ataque base " + inimigo.ataque() + ")");

        int turno = 1;
        while (vidaJogador > 0 && vidaInimigo > 0) {
            System.out.println("-- Turno " + turno++ + " --");

            boolean jogadorAcerta = rand.nextDouble() < 0.85;
            boolean inimigoAcerta = rand.nextDouble() < 0.75;


            if (!jogadorAcerta && !inimigoAcerta) {
                if (rand.nextBoolean()) jogadorAcerta = true;
                else inimigoAcerta = true;
            }


            if (jogadorAcerta) {
                int variacaoJogador = rand.nextInt(3); // 0..2
                int danoJogador = Math.max(1, arma.dano() - variacaoJogador);
                vidaInimigo -= danoJogador;
                System.out.println("Você acerta com " + arma.nome() + ": -" + danoJogador + " HP (inimigo: " + Math.max(vidaInimigo, 0) + ")");
            } else {
                System.out.println("Você erra o golpe!");
            }

            if (vidaInimigo <= 0)
                break;

            if (inimigoAcerta) {
                int variacaoInimigo = rand.nextInt(3); // 0..2
                int danoInimigo = Math.max(1, inimigo.ataque() - variacaoInimigo);
                vidaJogador -= danoInimigo;
                System.out.println(inimigo.nome() + " acerta: -" + danoInimigo + " HP (você: " + Math.max(vidaJogador, 0) + ")\n");
            } else {
                System.out.println(inimigo.nome() + " erra o ataque!\n");
            }

            Thread.sleep(3700);
        }

        if (vidaJogador > 0) {
            System.out.println("\nVitória! Você derrotou o " + inimigo.nome() + ".");
        } else {
            System.out.println("\nDerrota... O " + inimigo.nome() + " venceu.");
        }
    }
}

