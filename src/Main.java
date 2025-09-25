import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int jogar = 1;
        int turno = 1;
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);
        Jogador jogador1 = null;
        Jogador jogador2 = null;

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                    Bem vindo ao Epic Battle Simulator!");
        System.out.println("----------------------------------------------------------------------------");

        while(jogar == 1) {
            turno = 1;
            escolha = 0;
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("Escolha o personagem do jogador 1:\n[1] para Guerreiro\n[2] para Mago\n[3] para Assassino\n");
            System.out.println("----------------------------------------------------------------------------");
            while(escolha != 1 && escolha != 2 && escolha != 3) { 
                escolha = scanner.nextInt();

                switch(escolha) {
                    case 1:
                        JogadorFactory fabricaGuerreiro1 = new GuerreiroFactory();
                        jogador1 = new Jogador(fabricaGuerreiro1);
                        System.out.printf("Jogador 1 definido como %s!\n\n", jogador1.getPersonagem());
                        break;

                    case 2:
                        JogadorFactory fabricaMago1 = new MagoFactory();
                        jogador1 = new Jogador(fabricaMago1);
                        System.out.printf("Jogador 1 definido como %s!\n\n", jogador1.getPersonagem());
                        break;

                    case 3:
                        JogadorFactory fabricaAssassino1 = new AssassinoFactory();
                        jogador1 = new Jogador(fabricaAssassino1);
                        System.out.printf("Jogador 1 definido como %s!\n\n", jogador1.getPersonagem());
                        break;

                    default:
                        System.out.println("Opcao invalida, tente novamente");
                        break;
                }
            }

            escolha = 0;
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("Escolha o personagem do jogador 2:\n[1] para Guerreiro\n[2] para Mago\n[3] para Assassino\n");
            System.out.println("----------------------------------------------------------------------------");
            while(escolha != 1 && escolha != 2 && escolha != 3) { 
                escolha = scanner.nextInt();

                switch(escolha) {
                    case 1:
                        JogadorFactory fabricaGuerreiro2 = new GuerreiroFactory();
                        jogador2 = new Jogador(fabricaGuerreiro2);
                        System.out.printf("Jogador 2 definido como %s!\n\n", jogador2.getPersonagem());
                        break;

                    case 2:
                        JogadorFactory fabricaMago2 = new MagoFactory();
                        jogador2 = new Jogador(fabricaMago2);
                        System.out.printf("Jogador 2 definido como %s!\n\n", jogador2.getPersonagem());
                        break;

                    case 3:
                        JogadorFactory fabricaAssassino2 = new AssassinoFactory();
                        jogador2 = new Jogador(fabricaAssassino2);
                        System.out.printf("Jogador 2 definido como %s!\n\n", jogador2.getPersonagem());
                        break;

                    default:
                        System.out.println("Opcao invalida, tente novamente");
                        break;
                }
            }
            
            Thread.sleep(1000);
            System.out.println("\n----------------------------------------------------------------------------");
            System.out.println("                           A batalha vai começar!");
            System.out.println("---------------------------------------------------------------------------\n");
            Thread.sleep(1000);

            while(jogador1.getVida() > 0 && jogador2.getVida() > 0) {
                System.out.println("\n----------------------------------------------------------------------------");
                System.out.printf("TURNO %d\n", turno);
                System.out.println("----------------------------------------------------------------------------");
                System.out.printf("JOGADOR 1: %s VIDA: %d\nJOGADOR 2: %s VIDA: %d\n", jogador1.getPersonagem(), jogador1.getVida(), jogador2.getPersonagem(), jogador2.getVida());
                System.out.println("----------------------------------------------------------------------------\n");
                Thread.sleep(500);
                jogador1.Atacar(1);
                Thread.sleep(500);
                if(jogador1.Acerto() == 0) System.out.printf("JOGADOR 1 (%s) errou!\n", jogador1.getPersonagem());
                else jogador2.danoSofrido(jogador1.danoCausado());
                Thread.sleep(500);
                if(jogador2.getVida() <= 0) break;
                jogador2.Atacar(2);
                Thread.sleep(500);
                if(jogador2.Acerto() == 0) System.out.printf("JOGADOR 2 (%s) errou!\n", jogador2.getPersonagem());
                else jogador1.danoSofrido(jogador2.danoCausado());
                Thread.sleep(500);
                turno++;
            }

            Thread.sleep(1000);
            System.out.println("\n----------------------------------------------------------------------------");
            if(jogador1.getVida() <= 0) System.out.printf("JOGADOR 2 (%s) venceu!", jogador2.getPersonagem());
            else System.out.printf("JOGADOR 1 (%s) venceu!", jogador1.getPersonagem());
            System.out.println("\n----------------------------------------------------------------------------");
            Thread.sleep(1000);

            System.out.println("Quer jogar de novo?\n[1] para SIM\n[0] para NAO");
            while(true) {            
                jogar = scanner.nextInt();

                if(jogar == 1 || jogar == 0) break;
                else System.out.println("Opcao invalida, tente novamente");
            }

            jogador1 = null;
            jogador2 = null;
        }

        System.out.println("\n----------------------------------------------------------------------------");
        System.out.println("                             Obrigado por jogar!");
        System.out.println("----------------------------------------------------------------------------");
        scanner.close();
    }    
}
