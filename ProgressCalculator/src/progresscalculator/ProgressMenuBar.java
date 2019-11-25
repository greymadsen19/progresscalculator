/* 
* To change this license header, choose License Headers in Project Properties. 
* To change this template file, choose Tools | Templates 
* and open the template in the editor. 
*/ 

package progresscalculator; 

/** 
* 
* @author Jacob Madsen 
*  
* This class is to build a menu 
* bar that contains menus for exiting the program 
* setting the required hours 
* and giveing info and help on the program 
*/ 

import java.awt.event.*; 
import javax.swing.*; 

public class ProgressMenuBar extends JMenuBar{ 
    //the three menus that the program will contain 
    private JMenu fileMenu; 
    private JMenu helpMenu; 

    //The items to be in the menus. 
    private JMenuItem exitMenuItem; 
    private JMenuItem help; 
    private JMenuItem about; 

    //Hours panel object for invoing non static methods 
    private HoursPanel hours = new HoursPanel(); 

    /** 
     * Constructor that creates the menu bar 
     * by invoking methods to build the menus 
     * and adds the menus to the menubar 
     */ 
    public ProgressMenuBar() 
    { 
        //Invoke methods that will build the menus 
        buildFileMenu(); 
        buildHelpMenu(); 

        //Add the menus to the menu bar 
        add(fileMenu); 
        add(helpMenu); 
    } 

    /** 
     * Method in which builds a 
     * file menu that contains an 
     * itemthat allow the user to close the 
     * program. 
     */ 
    public void buildFileMenu() 
    { 
        //Create the file menu 
        fileMenu = new JMenu("File"); 

        //Set a mnemonic for the file menu 
        fileMenu.setMnemonic(KeyEvent.VK_F); 

        //Create the exit menu item 
        exitMenuItem = new JMenuItem("Exit"); 
        exitMenuItem.setMnemonic(KeyEvent.VK_X); 

        //add an action listener to the exit menu item 
        exitMenuItem.addActionListener(new ExitListener()); 

        //Add the menu item to the file menu 
        fileMenu.add(exitMenuItem); 
    } 

    /** 
     * This method builds a menu 
     * that contains buttons that 
     * show helpful messages when clicked. 
     */ 
    public void buildHelpMenu() 
    { 
        //Create the help menu 
        helpMenu = new JMenu("Help"); 

        //Create the help menu item 
        help = new JMenuItem("Help Contents"); 

        //Add an action lsistener to the help menu item 
        help.addActionListener(new HelpListener()); 

        //Create a menu item for about the program 
        about = new JMenuItem("About"); 

        //Add ann actionlistener to the about menu item 
        about.addActionListener(new AboutListener()); 

        //Add the menu items to the help menu 
        helpMenu.add(help); 
        helpMenu.add(about); 
    } 

    /** 
     * This class handles an event for 
     * when Help Contents is clicked, when 
     * clicked a Paragraph of how to use the program 
     * is displayed on screen. 
     */ 
    private class HelpListener implements ActionListener 
    { 
        @Override 
        public void actionPerformed(ActionEvent e) { 
            JOptionPane.showMessageDialog(null, "For this program to run properly you must first enter the " + 
                                                 "\nCompleted hours into a text field. You must then click on the " + 
                                                 "\n hours per week combo box to select your hours per week." + 
                                                  "\n Doing this sets your required hours. After these values are set, " + 
                                                  "\nYou must click the 'Calculate' button to see your current progress." + 
                                                  "\n If you wish to exit the program you can either: Click the close button(The X)," + 
                                                 "\nClick the button next to Calculate called the exit button, or " + 
                                                  "\nYou can click File then Exit. To see more about the program click Help then About.", 
                                                   "Help", JOptionPane.INFORMATION_MESSAGE); 
        } 
    } 

    private class AboutListener implements ActionListener 
    { 
        @Override 
        public void actionPerformed(ActionEvent e) { 
            JOptionPane.showMessageDialog(null, "The Progress Calculator is a program that calculates and displays the " + 
                                                "\npercentage of progress the student has achieved based on their input" + 
                                                 "\nThe progress that is being calculated is the percentage of how much a" + 
                                                  "\nStudent at a Technical college has achieved." + 
                                                   "\nThis serves a useful purpose for tracking your student progress at tech school" + 
                                                "\nby allowing the user to calculate their progress without having to do an extra step of" + 
                                                "\nGoing to their student portal having to calculate it themselves because it hasn't been" + 
                                                "\nupdated yet. Instead they can calculate by entering the hours completed and selecting" + 
                                                "\nThe amount of hours enrolled per week to see the percentage of progress from what has been entered.",  
                                                "About", JOptionPane.INFORMATION_MESSAGE); 
        } 
    } 

    /** 
     * Create an inner class 
     * to handle an actionevent that 
     * is created by the exit menu item. 
     */ 
    private class ExitListener implements ActionListener 
    { 
        @Override 
        public void actionPerformed(ActionEvent e) { 
            System.exit(0); 
        } 
    } 
} 