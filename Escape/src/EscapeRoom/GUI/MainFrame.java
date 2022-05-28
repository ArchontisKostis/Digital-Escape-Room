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
public class MainFrame extends javax.swing.JFrame {
    // Variable Declaration
    private String state = "none";
    private CreditsFrame creditsFrame;
    private SettingsFrame settingsFrame;
    
    
    public MainFrame() {
        initComponents();
        this.makeCustomCursor();
        this.addKeyListener(new myKeyListener());
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
        startGamePanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        closeLabel = new javax.swing.JLabel();
        tutorialLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        creditsLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startGamePanel.setBackground(new java.awt.Color(0, 0, 0));
        startGamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setBackground(new java.awt.Color(255, 255, 255));
        headerLabel.setFont(new java.awt.Font("DPComic", 0, 48)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setText("SELECT ONE TO CONTINUE");
        startGamePanel.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        newGameButton.setBackground(new java.awt.Color(224, 151, 34));
        newGameButton.setFont(new java.awt.Font("DPComic", 0, 48)); // NOI18N
        newGameButton.setForeground(new java.awt.Color(255, 255, 255));
        newGameButton.setText("NEW GAME");
        newGameButton.setAlignmentY(0.0F);
        newGameButton.setBorder(null);
        newGameButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        newGameButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        startGamePanel.add(newGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 360, 90));

        loadButton.setBackground(new java.awt.Color(224, 151, 34));
        loadButton.setFont(new java.awt.Font("DPComic", 0, 48)); // NOI18N
        loadButton.setForeground(new java.awt.Color(255, 255, 255));
        loadButton.setText("LOAD GAME");
        loadButton.setAlignmentY(0.0F);
        loadButton.setBorder(null);
        loadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loadButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        startGamePanel.add(loadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 360, 90));

        closeLabel.setBackground(new java.awt.Color(255, 255, 255));
        closeLabel.setFont(new java.awt.Font("DPComic", 0, 36)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setText("X");
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        startGamePanel.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 20, 30));

        mainPanel.add(startGamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 680, 470));
        startGamePanel.setVisible(false);

        tutorialLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EscapeRoom/guiAssets/tutorialIcon.png"))); // NOI18N
        tutorialLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tutorialLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tutorialLabelMouseExited(evt);
            }
        });
        mainPanel.add(tutorialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 110, 110));

        startLabel.setBackground(new java.awt.Color(255, 255, 255));
        startLabel.setFont(new java.awt.Font("DPComic", 0, 52)); // NOI18N
        startLabel.setForeground(new java.awt.Color(255, 255, 255));
        startLabel.setText("START");
        startLabel.setEnabled(false);
        startLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startLabelMouseExited(evt);
            }
        });
        mainPanel.add(startLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, -1));

        settingsLabel.setBackground(new java.awt.Color(255, 255, 255));
        settingsLabel.setFont(new java.awt.Font("DPComic", 0, 52)); // NOI18N
        settingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        settingsLabel.setText("SETTINGS");
        settingsLabel.setEnabled(false);
        settingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsLabelMouseExited(evt);
            }
        });
        mainPanel.add(settingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 200, 60));

        creditsLabel.setBackground(new java.awt.Color(255, 255, 255));
        creditsLabel.setFont(new java.awt.Font("DPComic", 0, 52)); // NOI18N
        creditsLabel.setForeground(new java.awt.Color(255, 255, 255));
        creditsLabel.setText("CREDITS");
        creditsLabel.setEnabled(false);
        creditsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditsLabelMouseExited(evt);
            }
        });
        mainPanel.add(creditsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 180, -1));

        exitLabel.setBackground(new java.awt.Color(255, 255, 255));
        exitLabel.setFont(new java.awt.Font("DPComic", 0, 52)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setText("EXIT");
        exitLabel.setEnabled(false);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });
        mainPanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 100, -1));

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EscapeRoom/guiAssets/mainMenuBg.png"))); // NOI18N
        mainPanel.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void makeCustomCursor(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage(getClass().getResource("/EscapeRoom/guiAssets/cursor.png"));
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "cursor"); 
        setCursor(cursor);        
    }
    
    // Provides Visual feedback to the user when the mouse enters the Tutorial Label
    private void tutorialLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorialLabelMouseEntered
        try {
            tutorialLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EscapeRoom/assets/tutorialIconHover.png")));
        }
        catch(Exception e){
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_tutorialLabelMouseEntered

    private void tutorialLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorialLabelMouseExited
        try {
            tutorialLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EscapeRoom/assets/tutorialIcon.png")));
        }
        catch(Exception e){
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_tutorialLabelMouseExited

    private void startLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startLabelMouseEntered
       // Change the state
       state = "start";
       // Disable all other labels and Enable Start Label
       startLabel.setEnabled(true);
       settingsLabel.setEnabled(false);
       creditsLabel.setEnabled(false);
       exitLabel.setEnabled(false);
       
    }//GEN-LAST:event_startLabelMouseEntered

    private void startLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startLabelMouseExited
        state = "none";
        this.disableAllLabels();
    }//GEN-LAST:event_startLabelMouseExited

    private void settingsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseEntered
        // Change the state
        state = "settings";
        // Disable all other labels and Enable Start Label
        startLabel.setEnabled(false);
        settingsLabel.setEnabled(true);
        creditsLabel.setEnabled(false);
        exitLabel.setEnabled(false);
    }//GEN-LAST:event_settingsLabelMouseEntered

    private void settingsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseExited
        state = "none";
        this.disableAllLabels();
    }//GEN-LAST:event_settingsLabelMouseExited

    private void creditsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsLabelMouseEntered
        // Change the state
        state = "credits";
        // Disable all other labels and Enable Start Label
        startLabel.setEnabled(false);
        settingsLabel.setEnabled(false);
        creditsLabel.setEnabled(true);
        exitLabel.setEnabled(false);
    }//GEN-LAST:event_creditsLabelMouseEntered

    private void creditsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsLabelMouseExited
        state = "none";
        this.disableAllLabels();
    }//GEN-LAST:event_creditsLabelMouseExited

    private void exitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseEntered
        // Change the state
        state = "exit";
        // Disable all other labels and Enable Start Label
        startLabel.setEnabled(false);
        settingsLabel.setEnabled(false);
        creditsLabel.setEnabled(false);
        exitLabel.setEnabled(true);
    }//GEN-LAST:event_exitLabelMouseEntered

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        state = "none";
        this.disableAllLabels();
    }//GEN-LAST:event_exitLabelMouseExited

    private void creditsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsLabelMouseClicked
        creditsFrame = new CreditsFrame();
        creditsFrame.setVisible(true);
    }//GEN-LAST:event_creditsLabelMouseClicked

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadButtonActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        startGamePanel.setVisible(false);
    }//GEN-LAST:event_closeLabelMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame menuFrame = new MainFrame();
                menuFrame.setVisible(true);
                
            }
        });
    }
    
    private void disableAllLabels() {
       startLabel.setEnabled(false);
       settingsLabel.setEnabled(false);
       creditsLabel.setEnabled(false);
       exitLabel.setEnabled(false);
    }
    
    // Action Listener Class
    class myKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // ---- MENU NAVIGATION ----
            // If UP KEY is pressed
            if(e.getKeyCode() == java.awt.event.KeyEvent.VK_UP){
                // Check the pointer state
                switch (state) {
                    case "none":
                        // Change the state
                        state = "start";
                        // Disable Start Label and Enable Exit Label
                        startLabel.setEnabled(true);
                        break;
                        
                    case "start":
                        // Change the state
                        state = "exit";
                        // Disable Start Label and Enable Exit Label
                        exitLabel.setEnabled(true);
                        startLabel.setEnabled(false);
                        break;
                        
                    case "settings":
                        // Change the state
                        state = "start";
                        // Disable Credits Label and Enable Start Label
                        startLabel.setEnabled(true);
                        settingsLabel.setEnabled(false);
                        break;
                        
                    case "credits":
                        // Change the state
                        state = "settings";
                        // Disable Credits Label and Enable Start Label
                        settingsLabel.setEnabled(true);
                        creditsLabel.setEnabled(false);
                        break;
                    case "exit":
                        // Change the state
                        state = "credits";
                        // Disable Credits Label and Enable Start Label
                        creditsLabel.setEnabled(true);
                        exitLabel.setEnabled(false);
                        break;
                }
            }
            
            // If DOWN KEY is pressed
            if(e.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN){
                switch (state) {
                    case "none":
                        state="start";
                        startLabel.setEnabled(true);
                        break;
                
                    case "start":
                        // Change the state
                        state = "settings";
                        // Disable Start Label and Enable Credits Label
                        settingsLabel.setEnabled(true);
                        startLabel.setEnabled(false);
                        break;
                    
                    case "settings":
                        // Change the state
                        state = "credits";
                        // Disable Settings Label and Enable Credits Label
                        creditsLabel.setEnabled(true);
                        settingsLabel.setEnabled(false);
                        break;
                
                    case "credits":
                        // Change the state
                        state = "exit";
                        // Disable Start Label and Enable Exit Label
                        exitLabel.setEnabled(true);
                        creditsLabel.setEnabled(false);
                        break;
                
                    case "exit":
                        // Change the state
                        state = "start";
                        // Disable Start Label and Enable Exit Label
                        startLabel.setEnabled(true);
                        exitLabel.setEnabled(false);     
                        break;
                } 
            }
            
            // ---- USER CONFIRMATION ACTION ----
            if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                switch (state) {
                    case "start":
                        System.out.println("START CLICKED\n--------------");
                        startGamePanel.setVisible(true);
                        break;
                    case "settings":
                        System.out.println("SETTINGS CLICKED\n--------------");
                        settingsFrame = new SettingsFrame();
                        settingsFrame.setVisible(true);
                        break;
                    case "credits":
                        System.out.println("CREDITS CLICKED\n--------------");
                        creditsFrame = new CreditsFrame();
                        creditsFrame.setVisible(true);
                        break;
                    case "exit":
                        System.out.println("EXIT CLICKED\n--------------");
                        break;
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e){}
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JButton loadButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JPanel startGamePanel;
    private javax.swing.JLabel startLabel;
    private javax.swing.JLabel tutorialLabel;
    // End of variables declaration//GEN-END:variables
}
