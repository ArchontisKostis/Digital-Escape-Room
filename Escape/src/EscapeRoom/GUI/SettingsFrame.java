/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EscapeRoom.GUI;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Archontis
 */
public class SettingsFrame extends javax.swing.JFrame {
    // Properties Declaration 
    private String state = "none";  // pointer state
    // These two properties are used to define if the music is on or off
    private boolean musicState = true;
    private boolean soundState = true;
    
    // Constructor
    public SettingsFrame() {
        initComponents();
        this.makeCustomCursor();
        this.addKeyListener(new SettingsFrame.myKeyListener());
    }
    
    
    private void makeCustomCursor(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage(getClass().getResource("/EscapeRoom/guiAssets/cursor.png"));
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "cursor"); 
        setCursor(cursor);        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        escText = new javax.swing.JLabel();
        soundToggle = new javax.swing.JLabel();
        musicToggle = new javax.swing.JLabel();
        settingsBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escText.setFont(new java.awt.Font("DPComic", 0, 18)); // NOI18N
        escText.setForeground(new java.awt.Color(255, 255, 255));
        escText.setText("Use ESC to go back to MAIN MENU");
        mainPanel.add(escText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        soundToggle.setBackground(new java.awt.Color(255, 255, 255));
        soundToggle.setFont(new java.awt.Font("DPComic", 0, 55)); // NOI18N
        soundToggle.setForeground(new java.awt.Color(255, 255, 255));
        soundToggle.setText("SOUND ON");
        soundToggle.setEnabled(false);
        soundToggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                soundToggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                soundToggleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                soundToggleMousePressed(evt);
            }
        });
        mainPanel.add(soundToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 260, -1));

        musicToggle.setBackground(new java.awt.Color(255, 255, 255));
        musicToggle.setFont(new java.awt.Font("DPComic", 0, 55)); // NOI18N
        musicToggle.setForeground(new java.awt.Color(255, 255, 255));
        musicToggle.setText("MUSIC ON");
        musicToggle.setEnabled(false);
        musicToggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musicToggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musicToggleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                musicToggleMousePressed(evt);
            }
        });
        mainPanel.add(musicToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 210, -1));

        settingsBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EscapeRoom/guiAssets/settings.png"))); // NOI18N
        mainPanel.add(settingsBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void musicToggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicToggleMouseEntered
        this.state = "music";
        this.musicToggle.setEnabled(true);
    }//GEN-LAST:event_musicToggleMouseEntered

    private void musicToggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicToggleMouseExited
        this.state = "none";
        this.musicToggle.setEnabled(false);
    }//GEN-LAST:event_musicToggleMouseExited

    private void musicToggleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicToggleMousePressed
        if(musicState == true){
            this.musicState = false;
            this.musicToggle.setText("MUSIC OFF");
        }
        else {
            this.musicState = true;
            this.musicToggle.setText("MUSIC ON");
        }
    }//GEN-LAST:event_musicToggleMousePressed

    private void soundToggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soundToggleMouseEntered
        this.state = "sound";
        this.soundToggle.setEnabled(true);
    }//GEN-LAST:event_soundToggleMouseEntered

    private void soundToggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soundToggleMouseExited
        this.state = "none";
        this.soundToggle.setEnabled(false);
    }//GEN-LAST:event_soundToggleMouseExited

    private void soundToggleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soundToggleMousePressed
        if(soundState == true){
            this.soundState = false;
            this.soundToggle.setText("SOUND OFF");
        }
        else {
            this.soundState = true;
            this.soundToggle.setText("SOUND ON");
        }
    }//GEN-LAST:event_soundToggleMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame().setVisible(true);
            }
        });
    }
    
    // Key Listener Class
    class myKeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // ---- NAVIGATION ----
            // If UP or DOWN KEY is pressed (there are only two options so we dont need another if)
            if(e.getKeyCode() == java.awt.event.KeyEvent.VK_UP || e.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN){
                // Check the pointer state
                switch(state){
                    case "none":
                        state = "music";
                        soundToggle.setEnabled(false);
                        musicToggle.setEnabled(true);
                        break;
                    case "music":
                        state = "sound";
                        soundToggle.setEnabled(true);
                        musicToggle.setEnabled(false);
                        break;
                    case "sound":
                        state = "music";
                        soundToggle.setEnabled(false);
                        musicToggle.setEnabled(true);
                        break;
                }
            }
            
            // ---- USER CONFIRMATION ----
            if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                switch(state) {
                    case "music":
                        if(musicState){
                            musicToggle.setText("MUSIC OFF");
                            musicState = false;
                        }
                        else {
                            musicToggle.setText("MUSIC ON");
                            musicState = true;
                        }
                        break;
                    
                    case "sound":
                        if(soundState){
                            soundToggle.setText("SOUND OFF");
                            soundState = false;
                        }
                        else {
                            soundToggle.setText("SOUND ON");
                            soundState = true;
                        }
                        break;
                }
            }
            
            // ---- USER EXITS ----
            if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE){
                setVisible(false);
            }
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel escText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel musicToggle;
    private javax.swing.JLabel settingsBg;
    private javax.swing.JLabel soundToggle;
    // End of variables declaration//GEN-END:variables
}
