package no.hvl.dat100;

import javax.swing.JOptionPane;

public class oppgaveO3 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Skriv inn et heltall>0:");
		int n =Integer.parseInt(input);
		int fakultet=1;
		for (int i = 1; i<=n; i++) {
			fakultet=fakultet*i;
		}
		JOptionPane.showMessageDialog(null, n+"! = "+fakultet);

	}

}
