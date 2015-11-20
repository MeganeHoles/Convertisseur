import javax.swing.*;
import java.awt.*;

/**
 * Created by _ on 20/11/2015.
 */
public class Fenetre extends JFrame{
    
    //Instanciation d'un objet JPanel
    private JPanel jPanTitle = new JPanel();
    private JPanel jPan = new JPanel();
    private JPanel jPan2 = new JPanel();
    private JPanel jPan3 = new JPanel();
    private JPanel jPan4 = new JPanel();



    //Instanciation d'un bouton
    private JButton boutonConvertir = new JButton("Convertir");

    //Instanciation d'un Label
    private JLabel labelChoix = new JLabel("Devise de départ : ");

    //Instanciation d'un comboBox
    private JComboBox choixDeviseDepart = new JComboBox();
    private JComboBox choixDeviseFinale = new JComboBox();

    public Fenetre(){
        this.setContentPane(jPan);
        //Définir un titre pour la fenêtre
        this.setTitle("Convertisseur De Devise");
        //Définir sa taille
        this.setSize(400, 400);
        //Positionner la fenêtre au centre de la fenêtre
        this.setLocationRelativeTo(null);
        //Terminer le processus lorsqu'on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Rendre visible la fenêtre
        this.setVisible(true);
        //Empêcher le redimensionnement de la fenêtre
        this.setResizable(false);

        //Ajouter le label au JPanel, la comboBox au JPanel
        this.setLayout(new BorderLayout());

        jPanTitle.setVisible(true);
        jPan.setVisible(true);
        jPan2.setVisible(true);
        jPan3.setVisible(true);

        jPan.add(labelChoix);
        jPan.add(choixDeviseDepart);
        jPan.add(choixDeviseFinale);

        setLayout(new FlowLayout());

        //Insérer des valeurs dans le comboBox
        choixDeviseDepart.addItem("Euro");
        choixDeviseDepart.addItem("Dollar");
        choixDeviseDepart.addItem("Livre");
        choixDeviseDepart.addItem("Franc Suisse");
        choixDeviseFinale.addItem("Euro");
        choixDeviseFinale.addItem("Dollar");
        choixDeviseFinale.addItem("Livre");
        choixDeviseFinale.addItem("Franc Suisse");

        this.setVisible(true);
    }

}
