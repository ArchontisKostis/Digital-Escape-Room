/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package EscapeRoom.GUI;

/**
 *
 * @author Christos
 */
public class Room3 extends javax.swing.JPanel {

    /**
     * Creates new form Room3
     */
    public Room3() {
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

        Ship = new javax.swing.JLabel();
        Room = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ship.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoomAssets/Ship.png"))); // NOI18N
        Ship.setText("jLabel1");
        add(Ship, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1850, 830));

        Room.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoomAssets/Room.png"))); // NOI18N
        Room.setText("jLabel1");
        add(Room, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Room;
    private javax.swing.JLabel Ship;
    // End of variables declaration//GEN-END:variables
}
