/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package RiddlesFrame;

/**
 *
 * @author 30694
 */
public class RiddleEg2 extends javax.swing.JPanel {
    private RiddleEg3 nextRiddlePanel;

    /**
     * Creates new form RiddleEg2
     */
    public RiddleEg2() {
        initComponents();
    }
    
    public void hidePanel(){
        this.setVisible(false);
    }

    public void showPanel(){
        this.setVisible(true);
    }
    
    public void setNextRiddlePanel(RiddleEg3 aPanel){
        this.nextRiddlePanel = aPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        sekhmetButton = new javax.swing.JButton();
        apophisButton = new javax.swing.JButton();
        sethButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        storytellerImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 193));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(204, 153, 0));
        questionLabel.setText("«Ποιος είναι ο θεός του χάους και της καταστροφής;»");
        jPanel1.add(questionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        sekhmetButton.setBackground(new java.awt.Color(255, 255, 153));
        sekhmetButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        sekhmetButton.setForeground(new java.awt.Color(204, 153, 0));
        sekhmetButton.setText("Sekhmet");
        sekhmetButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        sekhmetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sekhmetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sekhmetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, -1));

        apophisButton.setBackground(new java.awt.Color(255, 255, 153));
        apophisButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        apophisButton.setForeground(new java.awt.Color(204, 153, 0));
        apophisButton.setText("Apophis");
        apophisButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        apophisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apophisButtonActionPerformed(evt);
            }
        });
        jPanel1.add(apophisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        sethButton.setBackground(new java.awt.Color(255, 255, 153));
        sethButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        sethButton.setForeground(new java.awt.Color(204, 153, 0));
        sethButton.setText("Seth");
        sethButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        sethButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sethButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sethButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("ΣΩΣΤΟ");
        jLabel1.setVisible(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, 240));

        storytellerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/storyteller1.png"))); // NOI18N
        storytellerImage.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(storytellerImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 210, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void sekhmetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sekhmetButtonActionPerformed
        System.out.println("WRONG");
        this.jLabel1.setText("ΛΑΘΟΣ");
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        this.jLabel1.setVisible(true);
    }//GEN-LAST:event_sekhmetButtonActionPerformed

    private void sethButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sethButtonActionPerformed
        System.out.println("WRONG");
        this.jLabel1.setText("ΛΑΘΟΣ");
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        this.jLabel1.setVisible(true);
    }//GEN-LAST:event_sethButtonActionPerformed

    private void apophisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apophisButtonActionPerformed
        this.setVisible(false);
        this.nextRiddlePanel.setVisible(true);
    }//GEN-LAST:event_apophisButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apophisButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton sekhmetButton;
    private javax.swing.JButton sethButton;
    private javax.swing.JLabel storytellerImage;
    // End of variables declaration//GEN-END:variables
}
