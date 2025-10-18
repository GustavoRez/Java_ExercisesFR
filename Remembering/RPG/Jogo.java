package RPG;

import java.util.Scanner;;

public class Jogo {

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar a tela.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Guerreiro guerreiro = new Guerreiro("Aragorn", 4, 100, 15);
        Mago mago = new Mago("Gandalf", 4, 80, 20, 100);
        Arqueiro arqueiro = new Arqueiro("Legolas", 4, 90, 18);

        int vidaInicialGuerreiro = guerreiro.getVida();
        int vidaInicialMago = mago.getVida();
        int vidaInicialArqueiro = arqueiro.getVida();

        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();
        System.out.println();

        System.out.print(
                "Escolha seu personagem:\n1 - Guerreiro (Mais força base)\n2 - Mago (Maior chance de cura alta)\n3 - Arqueiro (Chance de acertos críticos)\nEscolha: ");
        int pers = sc.nextInt();

        int PV = pers == 1 ? guerreiro.getVida() : pers == 2 ? mago.getVida() : arqueiro.getVida();

        String personagem = pers == 1 ? "Guerreiro Aragorn" : pers == 2 ? "Mago Gandalf" : "Arqueiro Legolas";

        System.out.println();
        System.out.println("Você escolheu o " + personagem);

        while (guerreiro.getVida() > 0 && mago.getVida() > 0 && arqueiro.getVida() > 0) {
            System.out.println();
            System.out.print("O que deseja fazer?\n1 - Atacar\n2 - Curar\nEscolha: ");
            int acao = sc.nextInt();
            System.out.println();
            if (acao == 1) {
                if (pers == 1) {
                    System.out.print("Escolha o alvo:\n1 - Mago Gandalf\n2 - Arqueiro Legolas\nEscolha: ");
                    int alvo = sc.nextInt();
                    System.out.println();
                    if (alvo == 1) {
                        guerreiro.atacar(mago);
                    } else {
                        guerreiro.atacar(arqueiro);
                    }
                } else if (pers == 2) {
                    System.out.print("Escolha o alvo:\n1 - Guerreiro Aragorn\n2 - Arqueiro Legolas\nEscolha: ");
                    int alvo = sc.nextInt();
                    System.out.println();
                    if (alvo == 1) {
                        mago.atacar(guerreiro);
                    } else {
                        mago.atacar(arqueiro);
                    }
                } else {
                    System.out.print("Escolha o alvo:\n1 - Guerreiro Aragorn\n2 - Mago Gandalf\nEscolha: ");
                    int alvo = sc.nextInt();
                    System.out.println();
                    if (alvo == 1) {
                        arqueiro.atacar(guerreiro);
                    } else {
                        arqueiro.atacar(mago);
                    }
                }

            } else if (acao == 2) {
                System.out.println();
                if (pers == 1) {
                    guerreiro.healar(PV);
                } else if (pers == 2) {
                    mago.healar(PV);
                } else {
                    arqueiro.healar(PV);
                }
            } else {
                System.out.println("Você cedeu a pressão e não soube o que fazer. Tente novamente na próxima rodada.");
                continue;
            }
            System.out.println();

            if (pers == 1) {
                int escolhaInimigo = (int) (Math.random() * (vidaInicialMago / 3 <= mago.getVida() ? 5 : 3));
                if (escolhaInimigo <= 2) {
                    int ATKInimigo = (int) (Math.random() * 2);
                    if (ATKInimigo == 0) {
                        mago.atacar(guerreiro);
                    } else {
                        mago.atacar(arqueiro);
                    }
                } else {
                    mago.healar(mago.getVida());
                    ;
                }
                System.out.println();
                escolhaInimigo = (int) (Math.random() * (vidaInicialArqueiro / 3 <= arqueiro.getVida() ? 5 : 3));
                if (escolhaInimigo <= 2) {
                    int ATKInimigo = (int) (Math.random() * 2);
                    if (ATKInimigo == 0) {
                        arqueiro.atacar(guerreiro);
                    } else {
                        arqueiro.atacar(mago);
                    }
                } else {
                    arqueiro.healar(arqueiro.getVida());
                }
                System.out.println();

            } else if (pers == 2) {
                int escolhaInimigo = (int) (Math.random() * (vidaInicialGuerreiro / 3 <= guerreiro.getVida() ? 5 : 3));
                if (escolhaInimigo <= 2) {
                    int ATKInimigo = (int) (Math.random() * 2);
                    if (ATKInimigo == 0) {
                        guerreiro.atacar(mago);
                    } else {
                        guerreiro.atacar(arqueiro);
                    }
                } else {
                    guerreiro.healar(guerreiro.getVida());
                }
                System.out.println();
                escolhaInimigo = (int) (Math.random() * (vidaInicialArqueiro / 3 <= arqueiro.getVida() ? 5 : 3));
                if (escolhaInimigo <= 2) {
                    int ATKInimigo = (int) (Math.random() * 2);
                    if (ATKInimigo == 0) {
                        arqueiro.atacar(guerreiro);
                    } else {
                        arqueiro.atacar(mago);
                    }
                } else {
                    arqueiro.healar(arqueiro.getVida());
                }
                System.out.println();

            } else {
                int escolhaInimigo = (int) (Math.random() * (vidaInicialGuerreiro / 3 <= guerreiro.getVida() ? 5 : 3));
                if (escolhaInimigo <= 2) {
                    int ATKInimigo = (int) (Math.random() * 2);
                    if (ATKInimigo == 0) {
                        guerreiro.atacar(mago);
                    } else {
                        guerreiro.atacar(arqueiro);
                    }
                } else {
                    guerreiro.healar(guerreiro.getVida());
                }
                System.out.println();
                escolhaInimigo = (int) (Math.random() * (vidaInicialMago / 3 <= mago.getVida() ? 5 : 3));
                if (escolhaInimigo <= 2) {
                    int ATKInimigo = (int) (Math.random() * 2);
                    if (ATKInimigo == 0) {
                        mago.atacar(guerreiro);
                    } else {
                        mago.atacar(arqueiro);
                    }
                } else {
                    mago.healar(mago.getVida());
                }
                System.out.println();
            }

            System.out.println("-------------------------------------------");
            sc.nextLine();
            sc.nextLine();
            limparTela();
            if (guerreiro.getVida() != 0 && mago.getVida() != 0 && arqueiro.getVida() != 0) {
                guerreiro.exibirStatus();
                mago.exibirStatus();
                arqueiro.exibirStatus();
            } else {
                System.out.println();
                System.out.println("O jogo acabou!");
                System.out.println();
                if (guerreiro.getVida() == 0) {
                    System.out.println("O Guerreiro Aragorn é o perdedor!");
                } else if (mago.getVida() == 0) {
                    System.out.println("O Mago Gandalf é o perdedor!");
                } else {
                    System.out.println("O Arqueiro Legolas é o perdedor!");
                }
                sc.nextLine();
            }
        }
        sc.close();
    }
}