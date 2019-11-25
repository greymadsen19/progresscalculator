/* 
* To change this license header, choose License Headers in Project Properties. 
* To change this template file, choose Tools | Templates 
* and open the template in the editor. 
*/ 

package progresscalculator; 

import java.awt.*; 
import javax.swing.*; 

/** 
* 
* @author Jacob Madsen 
*  
* This class builds the panel 
* for setting the completed and 
* required Hours. It contains 
* a text field and read only textfield 
* as well as a slider for setting the values. 
*/ 

public class HoursPanel extends JPanel{ 

    private JLabel completedHoursLabel;//The label for the completed hours 
    private JLabel hoursPerMonthLabel;//The hours required for each month label 

    protected JTextField completedHoursField;//The text field for the completed hours 
    private JTextField hoursPerMonthField;//The text field for the hoursPerMonth 

    private JSlider hoursPerWeekSlider;//The hours attended weach week slider 

    private double hoursRequired;//The hours required for each month 
    private double hoursPerWeek;//The hours for each week 
    private String completedHours; 

    /** 
     * Constructor to build the 
     * panel for the hours and 
     * slider 
     */ 
    public HoursPanel() 
    { 
        setLayout(new GridBagLayout()); 

        //Create the label for completed hours 
        completedHoursLabel = new JLabel("Enter the hours you completed: "); 

        //Create a text field for entering the completed progress hours 
        completedHoursField = new JTextField(10); 

        //Create a jlabel for the required hours 
        hoursPerMonthLabel = new JLabel("Total Required Hours: "); 

        //Create a readonly text field that will store the required hours 
        hoursPerMonthField = new JTextField(10); 
        hoursPerMonthField.setEditable(false); 

        //Use GridBag layout to set the layout of the components 
        GridBagConstraints gbc = new GridBagConstraints(); 
        gbc.gridy = 0; 
        gbc.gridx = 0; 
        gbc.anchor = GridBagConstraints.NORTHWEST; 

        //Add the completed hours label 
        add(completedHoursLabel, gbc); 

        //Add the completed hours field to the next x grid 
        gbc.gridx++; 
        add(completedHoursField, gbc); 

        //Add the hours perMonth label to the west on the next row 
        gbc.anchor = GridBagConstraints.WEST; 
        gbc.gridy++; 
        gbc.gridx = 0; 
        add(hoursPerMonthLabel, gbc); 

        //Add the hours per month text field to the next cell 
        gbc.gridx++; 
        add(hoursPerMonthField, gbc); 
    } 

    /** 
     * Method to set the text in 
     * the read only text field 
     * @param requiredHours The require hours 
     */ 
    public void setRequiredHours(Double requiredHours) 
    { 
        hoursPerMonthField.setText(String.format("%.0f", requiredHours)); 
    } 

    public String getCompletedHours() 
    { 
        return completedHoursField.getText(); 
    } 
} 