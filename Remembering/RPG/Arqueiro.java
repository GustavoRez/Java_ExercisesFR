package RPG;

public class Arqueiro extends Personagem {

    public int precisao;

    public Arqueiro(String nome, int nivel, double vida, double forca) {
        super(nome, nivel, vida, forca);
    }

    @Override
    public void atacar(Personagem alvo) {
        if (alvo.vida <= 0) {
            System.out.println(alvo.nome + " já está derrotado.");
            return;
        }

        precisao = (int) (Math.random() * 11);
        double dano = precisao < 6 ? this.forca * ((double) precisao / 11)
                : precisao < 10 ? this.forca + precisao * 1.5 : this.forca * 3;

        alvo.vida -= dano;
        System.out.println(this.nome + " atacou " + alvo.nome + " causando " + Math.round(dano * 100) / 100
                + " de dano. Precisao: " + precisao);
        if (alvo.vida <= 0) {
            alvo.vida = 0;
            System.out.println(alvo.nome + " foi derrotado!");
        } else {
            if (precisao == 0)
                System.out.println(alvo.nome + " esquivou do seu golpe.");
            else if (precisao <= 4)
                System.out.println(alvo.nome + " desviou em cima da hora.");
            else if (precisao <= 7)
                System.out.println(alvo.nome + " se sente mais fraco.");
            else
                System.out.println(alvo.nome + " tomou um dano crítico.");

        }
    }
}