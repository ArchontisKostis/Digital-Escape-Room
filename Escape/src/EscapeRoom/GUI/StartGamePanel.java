/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package EscapeRoom.GUI;

import javax.swing.JButton;

/**
 *
 * @author Archontis
 */
public class StartGamePanel extends javax.swing.JPanel {

    /**
     * Creates new form StartGamePanel
     */
    public StartGamePanel() {
        initComponents();
    }
    
    public JButton getLoadButton(){
        return this.loadGameButton;
    }
    
    public JButton getNewButton(){
        return this.newGameButton;
    }
    
    
    public void addListenerToButtons(MainFrame.ButtonListener aListener){
        this.loadGameButton.addActionListener(aListener);
        this.newGameButton.addActionListener(aListener);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        loadGameButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("DPComic", 0, 60)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setText("- START GAME -");
        add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        newGameButton.setBackground(new java.awt.Color(224, 151, 34));
        newGameButton.setFont(new java.awt.Font("DPComic", 0, 50)); // NOI18N
        newGameButton.setForeground(new java.awt.Color(255, 255, 255));
        newGameButton.setText("NEW GAME");
        newGameButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 35, 22), 5));
        add(newGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 350, 90));

        loadGameButton.setBackground(new java.awt.Color(224, 151, 34));
        loadGameButton.setFont(new java.awt.Font("DPComic", 0, 50)); // NOI18N
        loadGameButton.setForeground(new java.awt.Color(255, 255, 255));
        loadGameButton.setText("LOAD GAME");
        loadGameButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 35, 22), 5));
        add(loadGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 350, 90));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JButton loadGameButton;
    private javax.swing.JButton newGameButton;
    // End of variables declaration//GEN-END:variables
}
