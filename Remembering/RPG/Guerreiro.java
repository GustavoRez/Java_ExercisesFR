package RPG;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int nivel, double vida, double forca) {
        super(nome, nivel, vida, (forca + nivel * 1.5));
    }


}