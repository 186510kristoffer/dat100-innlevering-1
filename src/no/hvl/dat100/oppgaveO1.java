package no.hvl.dat100;

import javax.swing.JOptionPane;

public class oppgaveO1 {

	public static void main(String[] args) {
	
		
		for(int forsøk=1; forsøk<=10; forsøk++) {
			String input=JOptionPane.showInputDialog("Skriv inn poengsum.   ");
		int poeng=Integer.parseInt(input);
		if (poeng>=90 && poeng<=100) {
			JOptionPane.showMessageDialog(null,"Du fikk A");
		}
		else if(poeng<90 && poeng>79) {
			JOptionPane.showMessageDialog(null,"Du fikk B");
		}
		else if(poeng<80 && poeng>59) {
			JOptionPane.showMessageDialog(null,"Du fikk C");
		}
		else if(poeng<60 && poeng>49) {
			JOptionPane.showMessageDialog(null,"Du fikk D");
		}
		else if(poeng<50 && poeng>39) {
			JOptionPane.showMessageDialog(null,"Du fikk E");
		}
		else if(poeng<40 && poeng>=0) {
			JOptionPane.showMessageDialog(null,"Du fikk F");
		}else {forsøk=forsøk-1;
			JOptionPane.showMessageDialog(null,"Feil tall, prøv på nytt.");}}
	
	}

}
