/* 
* To change this license header, choose License Headers in Project Properties. 
* To change this template file, choose Tools | Templates 
* and open the template in the editor. 
*/ 

package progresscalculator; 

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

/** 
* 
* @author Jacob Madsen 
*  
* This is a program that assists 
* in tracking ones progress as 
* a Technical College. It does 
* this by allowing the user to enter 
* the hours they have completed this month. 
* The selected hours per week is multiplied by 4 
* and added to a textfield to display 
* the required hours for the monrh. After these values 
* are set the user can click a button to see 
* their progress percentage. 
*/ 

public class ProgressCalculator extends JFrame{ 

    private HoursPanel hours; 
    private JPanel buttons; 
    private JPanel weekHoursPanel; 

    private JButton calculateButton; 
    private JButton exitButton; 
    private JComboBox hoursPerWeek; 
    private static double requiredHours; 

    //the menu bar for the progress calculator 
    private ProgressMenuBar menuBar; 

    public ProgressCalculator() 
    { 
        setTitle("Progress Calculator");//Set the title of the window 
        setLayout(new BorderLayout());//Set the layout for the content pane 
        
        //add the ability to close the program by clicking th close button 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        //Create the panel for the horus 
        hours = new HoursPanel(); 
        menuBar = new ProgressMenuBar(); 

        //Build the week hours and button panels 
        buildWeekHours(); 
        buildButtonPanel(); 

        //Add the panels to the content pane 
        add(hours, BorderLayout.WEST); 
        add(weekHoursPanel, BorderLayout.CENTER); 
        add(buttons, BorderLayout.SOUTH); 

        setJMenuBar(menuBar); 
        pack(); 
        setSize(450, 150); 
        setVisible(true); 
    } 

    public void buildWeekHours() 
    { 
        //The options that will be in the combo box 
        String[] weekHours = {"6", "12", "15", "18", "24", "30"}; 

        //Create a combo box for the hours per week 
        hoursPerWeek = new JComboBox(weekHours); 
        hoursPerWeek.addActionListener(new ComboBoxListener()); 
        
        //Create the panel and give it a border 
        weekHoursPanel = new JPanel(); 
        weekHoursPanel.setBorder(BorderFactory.createTitledBorder("Hours Per Week")); 

        //Add the combo box to the panel 
        weekHoursPanel.add(hoursPerWeek); 
    } 

    /** 
     * To build a panel that 
     * contains a calculate button 
     * and an exit button 
     */ 
    public void buildButtonPanel() 
    { 
        //Create the calculate button 
        calculateButton = new JButton("Calculate"); 
        calculateButton.setToolTipText("Click here to calculate progress."); 
        calculateButton.addActionListener(new CalcListener()); 
         
        //Create the exit button 
        exitButton = new JButton("Exit"); 
        exitButton.setToolTipText("Click here to exit."); 
        exitButton.addActionListener(new ExitListener()); 

        buttons = new JPanel(); 

        //Add the buttons to the panel 
        buttons.add(calculateButton); 
        buttons.add(exitButton); 
    } 

    private class CalcListener implements ActionListener 
    { 
        @Override 
        public void actionPerformed(ActionEvent e) { 
            //To check if the user has entered the values properly 
            if(requiredHours == 0 || hours.getCompletedHours() == null) 
            { 
                JOptionPane.showMessageDialog(null, "Please specify your completed hours and your required hours!", "Error!",  
                                                JOptionPane.INFORMATION_MESSAGE); 
            } 
            else 
            { 
            double progressPercentage = (Double.parseDouble(hours.getCompletedHours()) / requiredHours) * 100; 

            //Display the progress percentage 
            JOptionPane.showMessageDialog(null, String.format("Your current progress is %.2f", progressPercentage) + 
                                          "%"); 
            } 
        } 
    } 

    private class ExitListener implements ActionListener 
    { 

        @Override 
        public void actionPerformed(ActionEvent e) { 
            System.exit(0); 
        } 
    } 

    /** 
     * Action listener that 
     * sets the required hours when 
     * an action event occures 
     */ 
    private class ComboBoxListener implements ActionListener 
    { 
        @Override 
        public void actionPerformed(ActionEvent e) { 
            requiredHours = Double.parseDouble((String) hoursPerWeek.getSelectedItem()) * 4; 
            hours.setRequiredHours(requiredHours); 
        } 
    } 

    /** 
     * @param args the command line arguments 
     */ 
    public static void main(String[] args) { 
        ProgressCalculator progressCalc = new ProgressCalculator(); 
    } 
} 