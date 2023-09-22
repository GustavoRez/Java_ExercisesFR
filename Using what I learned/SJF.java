import javax.swing.JOptionPane;

public class SJF {
    public static void main (String[] args){
        
    int Qt_P, aux = 0;

    Qtd_P = Integer.parseInt(JOptionPane.showInputDialog(null, "How many process?"));

    int Pro[] = new int[Qt_P];
    int Pro2[] = new int[Qt_P];

    for (int i = 0; i < Qt_P; i++){
        Pro[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "How long is the process " + (i + 1) + " in ms?"));
        Pro2[i] = Pro[i];
    }

    for(int i = 0; i < Pro.length; i++){
		for(int j = 0; j < Pro.length; j++){
			if(Pro[i] < Pro[j]){
				aux = Pro[i];
				Pro[i] = Pro[j];
				Pro[j] = aux;
            }
        }
    }

    for (int i = 0; i < Pro.length; i++){
        for (int j = 0; j < Pro.length; j++){
            if (Pro2[j] == Pro[i])
                JOptionPane.showMessageDialog(null, "Process " + (j + 1) + "\n" + Pro[i] + "ms...", "Executing...", 1);
        }
    }
    }
}
