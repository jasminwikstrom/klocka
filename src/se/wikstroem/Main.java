package se.wikstroem;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {



     // Få in antal sekunder från användaren
        String s =JOptionPane.showInputDialog("Ange antal sekunder");
         int tid=Integer.parseInt(s);
         int tim,min, sek;
         tim= tid / 3600;
         tid= tid% 3600; //lagra resten med hjälp av av %
        min= tid / 60;
        tid= tid % 60;
        sek = tid;

       // JOptionPane.showMessageDialog(null, tim);// för att testa att timmar funkar


        //JOptionPane.showMessageDialog(null,"Tim:"+ tim+ "\nResten är" + tid); // testar att mata in sekunder som ger mer än en timme

        JOptionPane.showMessageDialog(null, tim + ":" + min +":" + "\nResten"+ tid);




    }
}
