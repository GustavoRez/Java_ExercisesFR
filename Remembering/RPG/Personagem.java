package RPG;

public class Personagem {
    public String nome;
    public int nivel;
    public double vida;
    public double forca;

    public Personagem(String nome, int nivel, double vida, double forca) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida * (nivel * 0.2);
        this.forca = forca * (nivel * 0.1);
    }

    public void atacar(Personagem alvo) {
        if (alvo.vida <= 0) {
            System.out.println(alvo.nome + " já está derrotado.");
            return;
        }
        alvo.vida -= this.forca;
        System.out.println(
                this.nome + " atacou " + alvo.nome + " causando " + Math.round(this.forca * 100) / 100 + " de dano.");
        if (alvo.vida <= 0) {
            alvo.vida = 0;
            System.out.println(alvo.nome + " foi derrotado!");
        } else {
            System.out.println(alvo.nome + " se sente mais fraco.");
        }
    }

    public void healar(int PV) {
        if (this.vida >= PV) {
            System.out.println(this.nome + " tentou se curar porém já se sentia muito bem.");
        } else {
            int heal = (int) Math.random() * 20 + 10;
            this.vida += heal;
            System.out.println(this.nome + " se curou em " + heal + " pontos de vida.");
        }
    }

    public void exibirStatus() {
        System.out.println("Nome: " + this.nome + "(" + this.nivel + ")" + " - PV: " + Math.round(this.vida * 100) / 100
                + " / PF: " + Math.round(this.forca * 100) / 100);
    }

    public int getVida() {
        return (int) Math.round(this.vida * 100) / 100;
    }
}