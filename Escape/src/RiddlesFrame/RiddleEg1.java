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
public class RiddleEg1 extends javax.swing.JPanel {

    /**
     * Creates new form RiddleEg1
     */
    public RiddleEg1() {
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

        storryteller = new javax.swing.JLabel();
        photo4 = new javax.swing.JLabel();
        Data data = new Data();
        photo1 = new javax.swing.JLabel();
        photo3 = new javax.swing.JLabel();
        photo2 = new javax.swing.JLabel();
        photo5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        ans1 = new javax.swing.JComboBox<>();
        Q2 = new javax.swing.JLabel();
        ans2 = new javax.swing.JComboBox<>();
        Q3 = new javax.swing.JLabel();
        ans3 = new javax.swing.JComboBox<>();
        Q4 = new javax.swing.JLabel();
        ans4 = new javax.swing.JComboBox<>();
        Q5 = new javax.swing.JLabel();
        ans5 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(175, 156, 77));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storryteller.setBackground(new java.awt.Color(255, 255, 204));
        storryteller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesR/storyteller1.png"))); // NOI18N
        storryteller.setText("archaeologist");
        storryteller.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(storryteller, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 200, 240));

        photo4.setIcon(data.getImageTextEg().getImages().get(0));
        photo4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(214, 190, 112)));
        photo4.setMaximumSize(new java.awt.Dimension(125, 125));
        photo4.setMinimumSize(new java.awt.Dimension(125, 125));
        add(photo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 80, 125));

        photo1.setIcon(data.getImageTextEg().getImages().get(1));
        photo1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(214, 190, 112)));
        photo1.setMaximumSize(new java.awt.Dimension(209, 125));
        photo1.setMinimumSize(new java.awt.Dimension(209, 125));
        photo1.setPreferredSize(new java.awt.Dimension(209, 125));
        add(photo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 125));

        photo3.setIcon(data.getImageTextEg().getImages().get(2));
        photo3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(214, 190, 112)));
        photo3.setMaximumSize(new java.awt.Dimension(201, 125));
        photo3.setMinimumSize(new java.awt.Dimension(201, 125));
        photo3.setPreferredSize(new java.awt.Dimension(201, 125));
        add(photo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 150, 125));

        photo2.setIcon(data.getImageTextEg().getImages().get(3));
        photo2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(214, 190, 112)));
        add(photo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 130, 125));

        photo5.setIcon(data.getImageTextEg().getImages().get(4));
        photo5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(214, 190, 112)));
        add(photo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 140, 125));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(151, 114, 0));
        jLabel5.setText(" 5");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 114, 0), 3, true));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 40, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(151, 114, 0));
        jLabel8.setText(" 1");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 114, 0), 3, true));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 40, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(151, 114, 0));
        jLabel9.setText(" 2");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 114, 0), 3, true));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 40, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(151, 114, 0));
        jLabel10.setText(" 3");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 114, 0), 3, true));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 40, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(151, 114, 0));
        jLabel11.setText(" 4");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 114, 0), 3, true));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 40, -1));

        Q1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Q1.setForeground(new java.awt.Color(151, 114, 0));
        Q1.setText(data.getImageTextEg().getText().get(0));
        Q1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(Q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        ans1.setBackground(new java.awt.Color(255, 204, 102));
        ans1.setForeground(new java.awt.Color(151, 114, 0));
        ans1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4", "5" }));
        ans1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, -1));

        Q2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Q2.setForeground(new java.awt.Color(151, 114, 0));
        Q2.setText(data.getImageTextEg().getText().get(1));
        Q2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(Q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        ans2.setBackground(new java.awt.Color(255, 204, 102));
        ans2.setForeground(new java.awt.Color(151, 114, 0));
        ans2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4", "5" }));
        ans2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        Q3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Q3.setForeground(new java.awt.Color(151, 114, 0));
        Q3.setText(data.getImageTextEg().getText().get(2));
        Q3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(Q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, -1, -1));

        ans3.setBackground(new java.awt.Color(255, 204, 102));
        ans3.setForeground(new java.awt.Color(151, 114, 0));
        ans3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4", "5" }));
        ans3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, -1, -1));

        Q4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Q4.setForeground(new java.awt.Color(151, 114, 0));
        Q4.setText(data.getImageTextEg().getText().get(3));
        Q4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(Q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, -1, -1));

        ans4.setBackground(new java.awt.Color(255, 204, 102));
        ans4.setForeground(new java.awt.Color(151, 114, 0));
        ans4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4", "5" }));
        ans4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(ans4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, -1, -1));

        Q5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Q5.setForeground(new java.awt.Color(151, 114, 0));
        Q5.setText(data.getImageTextEg().getText().get(4));
        Q5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(Q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, -1, -1));

        ans5.setBackground(new java.awt.Color(255, 204, 102));
        ans5.setForeground(new java.awt.Color(151, 114, 0));
        ans5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4", "5" }));
        ans5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new javax.swing.ImageIcon(getClass().getResource("/ImagesR/EgFrame.jpg")))); // NOI18N
        add(ans5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 570, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JComboBox<String> ans1;
    private javax.swing.JComboBox<String> ans2;
    private javax.swing.JComboBox<String> ans3;
    private javax.swing.JComboBox<String> ans4;
    private javax.swing.JComboBox<String> ans5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel photo1;
    private javax.swing.JLabel photo2;
    private javax.swing.JLabel photo3;
    private javax.swing.JLabel photo4;
    private javax.swing.JLabel photo5;
    private javax.swing.JLabel storryteller;
    // End of variables declaration//GEN-END:variables
}
