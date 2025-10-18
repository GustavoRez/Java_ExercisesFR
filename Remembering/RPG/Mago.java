package RPG;

public class Mago extends Personagem {

    public int mana;

    public Mago(String nome, int nivel, double vida, double forca, int mana) {
        super(nome, nivel, vida, forca);
        this.mana = mana;
    }

    @Override
    public void exibirStatus() {
        System.out.println("Nome: " + this.nome + "(" + this.nivel + ")" + " - PV: " + Math.round(this.vida * 100) / 100
                + " / PF: " + Math.round(this.forca * 100) / 100 + " (Mana: " + this.mana + ")");
    }

    @Override
    public void atacar(Personagem alvo) {
        if (this.mana < 10) {
            System.out.println(this.nome + " não tem mana suficiente para atacar.");
            return;
        }
        this.mana -= 10;
        super.atacar(alvo);
    }

    @Override
    public void healar(int PV) {
        if (this.vida >= PV) {
            System.out.println(this.nome + " tentou se curar porém já se sentia muito bem.");
        } else {
            int heal = (int) (Math.random() * 30 + 20);
            this.vida += heal;
            System.out.println(this.nome + " se curou em " + heal + " pontos de vida.");
        }
    }

}
