package component;

import javax.print.attribute.standard.JobName;
import javax.swing.*;
import java.awt.*;

public class FormComponent extends JFrame {
    public void initialize() {
        JLabel jpName = new JLabel("Nom :");
        JTextField jtName = new JTextField();
        JLabel jpEmail = new JLabel("Email :");
        JTextField jtEmail = new JTextField();
        JButton btnAdd = new JButton("Ajouter");
        JLabel jpGenre = new JLabel("Genre : ");
        JRadioButton btnF = new JRadioButton("Femme");
        JRadioButton btnM = new JRadioButton("Homme");
        JButton btnDetails = new JButton("Détails");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(btnF);
        genderGroup.add(btnM);

        JPanel jpForm = new JPanel();
        jpForm.setLayout(new GridLayout(5, 2, 10, 1));
        jpForm.add(jpName);
        jpForm.add(jtName);
        jpForm.add(jpEmail);
        jpForm.add(jtEmail);
        jpForm.add(jpGenre);
        jpForm.add(btnF);
        jpForm.add(btnM);
        jpForm.add(btnAdd);
        jpForm.add(btnDetails);

        JTextArea jtaResult = new JTextArea();
        JScrollPane jspPaneForResult = new JScrollPane(jtaResult);

        JPanel jpMainPanel = new JPanel();
        jpMainPanel.setLayout(new BorderLayout(10, 10));
        jpMainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


        jpMainPanel.add(jpForm, BorderLayout.NORTH);
        jpMainPanel.add(jtaResult, BorderLayout.CENTER);
        jpMainPanel.add(btnDetails, BorderLayout.SOUTH);




        add(jpMainPanel);

        setSize(900, 600);
        setMinimumSize(new Dimension(450, 300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        


        }
    }







