import javax.swing.JOptionPane;

public class SJF {
    public static void main (String[] args){
        
    int Qtd_P, Gamb = 0;

    Qtd_P = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos processos?"));

    int Pro[] = new int[Qtd_P];
    int Pro2[] = new int[Qtd_P];

    for (int i = 0; i < Qtd_P; i++){
        Pro[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o tamanho do processo " + (i + 1) + " em ms?"));
        Pro2[i] = Pro[i];
    }

    for(int i = 0; i < Pro.length; i++){
		for(int j = 0; j < Pro.length; j++){
			if(Pro[i] < Pro[j]){
				Gamb = Pro[i];
				Pro[i] = Pro[j];
				Pro[j] = Gamb;
            }
        }
    }

    for (int i = 0; i < Pro.length; i++){
        for (int j = 0; j < Pro.length; j++){
            if (Pro2[j] == Pro[i])
                JOptionPane.showMessageDialog(null, "Processo " + (j + 1) + "\n" + Pro[i] + "ms...", "Executando...", 1);
        }
    }
    }
}