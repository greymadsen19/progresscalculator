/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progresscalculator;

/**
 *
 * @author 4400098772
 */
public class HoursPanel extends javax.swing.JPanel {

    /**
     * Creates new form Hours
     */
    public HoursPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        completedHoursLabel = new javax.swing.JLabel();
        hoursPerMonthLabel = new javax.swing.JLabel();
        completedHoursField = new javax.swing.JTextField();
        hoursPerMonthField = new javax.swing.JTextField();

        completedHoursLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        completedHoursLabel.setLabelFor(completedHoursLabel);
        completedHoursLabel.setText("Enter the hours you completed: ");

        hoursPerMonthLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hoursPerMonthLabel.setLabelFor(hoursPerMonthLabel);
        hoursPerMonthLabel.setText("Total Required Hours: ");

        completedHoursField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        hoursPerMonthField.setEditable(false);
        hoursPerMonthField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(completedHoursLabel)
                    .addComponent(hoursPerMonthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoursPerMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completedHoursField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completedHoursLabel)
                    .addComponent(completedHoursField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursPerMonthLabel)
                    .addComponent(hoursPerMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setRequiredHours(Double requiredHours)
    {
        hoursPerMonthField.setText(String.format("%.0f", requiredHours));
    }
    
    public String getCompletedHours()
    {
        return completedHoursField.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField completedHoursField;
    private javax.swing.JLabel completedHoursLabel;
    private javax.swing.JTextField hoursPerMonthField;
    private javax.swing.JLabel hoursPerMonthLabel;
    // End of variables declaration//GEN-END:variables
}
