import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Myframe extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuItem cutItem;
    JMenuItem copyItem;
    JMenuItem pasteItem;
    JMenuItem contactItem;
    JMenuItem feedbackItem;
    JMenuItem subscriptionItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;
    ImageIcon cutIcon;
    ImageIcon copyIcon;
    ImageIcon pasteIcon;
    ImageIcon contactIcon;
    ImageIcon feedbackIcon;
    ImageIcon subscriptionIcon;
    Myframe(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");



        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("exit.png");


        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_I);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        cutIcon = new ImageIcon("cut.png");
        copyIcon = new ImageIcon("copy.png");
        pasteIcon = new ImageIcon("paste.png");

        cutItem.setIcon(cutIcon);
        copyItem.setIcon(copyIcon);
        pasteItem.setIcon(pasteIcon);

        cutItem.setMnemonic(KeyEvent.VK_A);
        copyItem.setMnemonic(KeyEvent.VK_C);
        pasteItem.setMnemonic(KeyEvent.VK_P);

        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        contactItem = new JMenuItem("Contact us");
        feedbackItem = new JMenuItem("Feedback");
        subscriptionItem = new JMenuItem("Subscription");

        helpMenu.add(contactItem);
        helpMenu.add(feedbackItem);
        helpMenu.add(subscriptionItem);

        contactIcon = new ImageIcon("contact.png");
        feedbackIcon = new ImageIcon("feedback.png");
        subscriptionIcon = new ImageIcon("subscribe.png");


        contactItem.setIcon(contactIcon);
        feedbackItem.setIcon(feedbackIcon);
        subscriptionItem.setIcon(subscriptionIcon);

        contactItem.setMnemonic(KeyEvent.VK_K);
        feedbackItem.setMnemonic(KeyEvent.VK_F);
        subscriptionItem.setMnemonic(KeyEvent.VK_D);

        contactItem.addActionListener(this);
        feedbackItem.addActionListener(this);
        subscriptionItem.addActionListener(this);


        this.setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem){
            System.out.println("Loading....");
        }
        else if(e.getSource() == saveItem) {
            System.out.println("File Saved!");

        }
        else if (e.getSource() == exitItem) {
            System.exit(0);

        }
        else if(e.getSource() == cutItem) {
            System.out.println("File Cut!");


        }
        else if(e.getSource() == copyItem) {
            System.out.println("File Copied!");

        }
        else if(e.getSource() == pasteItem) {
            System.out.println("File pasted!");

        }
        else if(e.getSource()==contactItem) {
            System.out.println("Contact us @Princesssopeju@gmail.com");

        }
        else if(e.getSource()== feedbackItem) {
            System.out.println("You can rate us on here!");

        }
        else if (e.getSource()== subscriptionItem ) {
            System.out.println("Would you like to renew your subscription ?");

        }
        else{
            System.out.println("You did nothing");
        }

    }
}
