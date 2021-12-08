
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oğuzhan
 */
public class proje2  extends JPanel{

    public static void main(String[] args) {

        AnaMenü menü = new AnaMenü();
        menü.setVisible(true);
        int puan = 0;
        Futbolcu ronaldo = new Futbolcu("Ronaldo", "futbolcu", 100, 95, 96);
        
        Futbolcu messi = new Futbolcu("Messi", "futbolcu", 95, 100, 95);
        Futbolcu sabri = new Futbolcu("Sabri", "futbolcu", 100, 100, 100);
        Futbolcu samatta = new Futbolcu("Samatta", "futbolcu", 80, 75, 60);
        Futbolcu lewandowski = new Futbolcu("Lewandowski", "futbolcu", 90, 85, 92);
        Futbolcu aguero = new Futbolcu("Aguero", "futbolcu", 82, 83, 84);
        Futbolcu foden = new Futbolcu("Foden", "futbolcu", 80, 78, 75);
        Futbolcu jesus = new Futbolcu("Jesus", "futbolcu", 81, 82, 93);
        
        Basketbolcu lebron = new Basketbolcu("Lebron","basketbolcu",94,92,90);
        Basketbolcu jordan = new Basketbolcu("Jordan","basketbolcu",97,90,95);
        Basketbolcu curry = new Basketbolcu("Curry","basketbolcu",80,82,80);
        Basketbolcu oneal = new Basketbolcu("Oneal","basketbolcu",90,84,85);
        Basketbolcu kevin = new Basketbolcu("Kevin","basketbolcu",75,84,80);
        Basketbolcu harden = new Basketbolcu("Harden","basketbolcu",88,84,85);
        Basketbolcu cedi = new Basketbolcu("Cedi","basketbolcu",95,84,88);
        Basketbolcu wade = new Basketbolcu("Wade","basketbolcu",83,78,85);
       

    }

}
