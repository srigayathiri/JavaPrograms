/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class SimpleNotepad extends JFrame implements ActionListener {

    private JTextArea textArea;
    private File currentFile;

    public SimpleNotepad() {
        super("Simple Notepad");

        // Create the text area
        textArea = new JTextArea();
        textArea.setEditable(true);

        // Create the scroll pane and add the text area to it
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the scroll pane to the frame
        add(scrollPane, BorderLayout.CENTER);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");

        // Create the "Open" menu item and add it to the file menu
        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(this);
        fileMenu.add(openMenuItem);

        // Create the "Save" menu item and add it to the file menu
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(this);
        fileMenu.add(saveMenuItem);

        // Create the "Save As" menu item and add it to the file menu
        JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
        saveAsMenuItem.addActionListener(this);
        fileMenu.add(saveAsMenuItem);

        // Create the "Exit" menu item and add it to the file menu
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);

        // Add the file menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Set the default close operation
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set the size of the frame
        setSize(800, 600);

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the "Open" menu item
                // Handle the "Open" menu item
        if (e.getActionCommand().equals("Open")) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                currentFile = selectedFile;
                openFile(selectedFile);
            }
        }
        
        // Handle the "Save" menu item
        else if (e.getActionCommand().equals("Save")) {
            if (currentFile != null) {
                saveFile(currentFile);
            } else {
                saveAs();
            }
        }
        
        // Handle the "Save As" menu item
        else if (e.getActionCommand().equals("Save As...")) {
            saveAs();
        }
        
        // Handle the "Exit" menu item
        else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }
    
    private void openFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            textArea.setText(content.toString());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error opening file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void saveFile(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(textArea.getText());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void saveAs() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            currentFile = selectedFile;
            saveFile(selectedFile);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleNotepad().setVisible(true);
            }
        });
    }
}
