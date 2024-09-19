package no.hvl.dat100;

import javax.swing.JOptionPane;

public class oppgaveO2 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Skriv inn din lønn: ");
        int lønn = Integer.parseInt(input);

        if (lønn <= 208050 && lønn >= 0) {
            JOptionPane.showMessageDialog(null, "Du skal ikke betale skatt");
        } else if (lønn >= 208051 && lønn <= 292850) {
            double skatt = (lønn - 208050) * 0.017;
            JOptionPane.showMessageDialog(null, "Du skal betale " + skatt + " kr i skatt");
        } else if (lønn >= 292851 && lønn <= 670000) {
            double skatt = (292850 - 208050) * 0.017 + (lønn - 292850) * 0.04;
            JOptionPane.showMessageDialog(null, "Du skal betale " + skatt + " kr i skatt");
        } else if (lønn >= 670001 && lønn <= 937900) {
            double skatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (lønn - 670000) * 0.136;
            JOptionPane.showMessageDialog(null, "Du skal betale " + skatt + " kr i skatt");
        } else if (lønn >= 937901 && lønn <= 1350000) {
            double skatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (937900 - 670000) * 0.136 + (lønn - 937900) * 0.166;
            JOptionPane.showMessageDialog(null, "Du skal betale " + skatt + " kr i skatt");
        } else if (lønn >= 1350001) {
            double skatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (937900 - 670000) * 0.136 + (1350000 - 937900) * 0.166 + (lønn - 1350000) * 0.176;
            JOptionPane.showMessageDialog(null, "Du skal betale " + skatt + " kr i skatt");
        } else {
            JOptionPane.showMessageDialog(null, "Ugyldig tall.");
        }
    }
}

