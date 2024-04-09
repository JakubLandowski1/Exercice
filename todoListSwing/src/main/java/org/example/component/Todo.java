package org.example.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Todo extends JFrame {
    private DefaultListModel<String> todoListModel;
    private JList<String> todoList;
    private JTextField taskField;
    private JButton addBtn;
    private JButton deleteBtn;

    public void initialize() {
        todoListModel = new DefaultListModel<>();
        todoList = new JList<>(todoListModel);

        todoList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 1) {
                    int index = todoList.locationToIndex(e.getPoint());
                    if (index != -1) {
                        String item = todoListModel.getElementAt(index);
                        if (item.startsWith("<html><strike>") && item.endsWith("</strike></html>")) {
                            todoListModel.setElementAt(item.substring(13, item.length() - 14), index);
                        } else {
                            todoListModel.setElementAt("<html><strike>" + item + "</strike></html>", index);
                        }
                    }
                }
            }
        });
        taskField = new JTextField();
        addBtn = new JButton("Ajouter");
        addBtn.addActionListener((ActionEvent e) -> {
            String newTask = taskField.getText();
            if (!newTask.isEmpty()) {
                todoListModel.addElement(newTask);
                taskField.setText("");
            }
        });

        deleteBtn = new JButton("Supprimer");
        deleteBtn.addActionListener((ActionEvent e) -> {
            int selectedIndex = todoList.getSelectedIndex();
            if (selectedIndex != -1) {
                todoListModel.remove(selectedIndex);
            }
        });

        JPanel jpTodo = new JPanel();
        jpTodo.setLayout(new GridLayout(3, 1, 10, 10));
        jpTodo.add(taskField);
        jpTodo.add(addBtn);

        JPanel jpMainPanel = new JPanel();
        jpMainPanel.setLayout(new BorderLayout(10, 10));
        jpMainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        jpMainPanel.add(jpTodo, BorderLayout.NORTH);
        jpMainPanel.add(new JScrollPane(todoList), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(deleteBtn);

        jpMainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(jpMainPanel);

        setSize(900, 600);
        setMinimumSize(new Dimension(450, 300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}