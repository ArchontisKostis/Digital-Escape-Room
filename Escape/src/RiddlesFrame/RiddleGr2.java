/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package RiddlesFrame;

/**
 *
 * @author 30694
 */
import EscapeRoom.*;
public class RiddleGr2 extends javax.swing.JPanel {

    /**
     * Creates new form RiddleGr2
     */
    public RiddleGr2() {
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

        atlas = new javax.swing.JLabel();
        prometheus = new javax.swing.JLabel();
        sisyphus = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ans3 = new javax.swing.JComboBox<>();
        ans1 = new javax.swing.JComboBox<>();
        ans2 = new javax.swing.JComboBox<>();
        storyteller = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuestionBox = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Data data = new Data();
        atlas.setIcon(data.getImageTextGr().getImages().get(1));
        atlas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        atlas.setPreferredSize(new java.awt.Dimension(210, 210));
        add(atlas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, 210));

        prometheus.setIcon(data.getImageTextGr().getImages().get(2));
        prometheus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        add(prometheus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 210, 210));

        sisyphus.setIcon(data.getImageTextGr().getImages().get(3));
        sisyphus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        add(sisyphus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 431, 126));

        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 0, 0));
        label1.setLabelFor(prometheus);
        label1.setText(" 1");
        label1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 40, 40));

        label2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(153, 0, 0));
        label2.setText(" 2 ");
        label2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        label3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(153, 0, 0));
        label3.setText(" 3 ");
        label3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 3, true));
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        ans3.setBackground(new java.awt.Color(153, 0, 0));
        ans3.setForeground(new java.awt.Color(255, 153, 153));
        ans3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1.", "2.", "3." }));
        add(ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 50, -1));

        ans1.setBackground(new java.awt.Color(153, 0, 0));
        ans1.setForeground(new java.awt.Color(255, 153, 153));
        ans1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1.", "2.", "3." }));
        add(ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 50, -1));

        ans2.setBackground(new java.awt.Color(153, 0, 0));
        ans2.setForeground(new java.awt.Color(255, 153, 153));
        ans2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1.", "2.", "3." }));
        add(ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 50, 20));

        storyteller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/storyteller1.png"))); // NOI18N
        storyteller.setText("jLabel10");
        storyteller.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/woodFrame.jpg")))); // NOI18N
        add(storyteller, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 210, 240));

        QuestionBox.setBackground(new java.awt.Color(255, 204, 204));
        QuestionBox.setColumns(20);
        QuestionBox.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        QuestionBox.setForeground(new java.awt.Color(153, 0, 0));
        QuestionBox.setRows(3);
        QuestionBox.setText("  \n    Προμηθέας\n    Σίσυφος\n    Άτλας");
        QuestionBox.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/woodFrame.jpg")))); // NOI18N
        jScrollPane1.setViewportView(QuestionBox);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 300, 130));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("READY!");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/woodFrame.jpg")))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea QuestionBox;
    private javax.swing.JComboBox<String> ans1;
    private javax.swing.JComboBox<String> ans2;
    private javax.swing.JComboBox<String> ans3;
    private javax.swing.JLabel atlas;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel prometheus;
    private javax.swing.JLabel sisyphus;
    private javax.swing.JLabel storyteller;
    // End of variables declaration//GEN-END:variables
}
