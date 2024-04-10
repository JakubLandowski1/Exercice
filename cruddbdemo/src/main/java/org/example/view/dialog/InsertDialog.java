package org.example.view.dialog;

import org.example.dao.ContactDao;
import org.example.model.Contact;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertDialog extends JDialog {



    public InsertDialog(){
        JLabel jName = new JLabel("Name :");
        JTextField jtName = new JTextField();
        JLabel jNumber = new JLabel("Number :");
        JTextField jtNumber = new JTextField();
        JButton jButton = new JButton("OK");

        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Contact contat = new Contact();
                contat.setName(jtName.getText());
                contat.setNumber(jtNumber.getText());
                ContactDao contactDao = new ContactDao();
                int count = contactDao.addContact(contat);
                if(count>0){
                    JOptionPane.showConfirmDialog(null, "Operation succeed");
                }else{
                    JOptionPane.showConfirmDialog(null, "Operation Failed");
                } dispose();
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,2,10,10));
        mainPanel.add(jName);
        mainPanel.add(jtName);
        mainPanel.add(jNumber);
        mainPanel.add(jtNumber);
        mainPanel.add(jButton);


        add(mainPanel);
        setSize(900, 600);
        setMinimumSize(new Dimension(450, 300));
        setVisible(true);

    }




}
