/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Mes dossiers
 */
public class ScoreJFrame extends javax.swing.JFrame {
 private int xMouse;
 private int yMouse;
    /**
     * Creates new form scoreFrame
     */
    public ScoreJFrame() {
        this.setVisible(false);
        initComponents();
         ImageIcon menu=new ImageIcon(getClass().getResource("/world.png"));
             this.setIconImage (menu.getImage());
              this.setLocationRelativeTo(null);
        
    }
    public  JLabel getScrLbl(){
        return scrLbl;
    }
     public JLabel getMsgLbl(){
        return msgLbl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrLbl = new javax.swing.JLabel();
        msgLbl = new javax.swing.JLabel();
        rejouerBtu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        correctionLbl = new javax.swing.JLabel();
        defaultJl2 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        corLbl = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 617));
        setUndecorated(true);
        getContentPane().setLayout(null);

        scrLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        scrLbl.setForeground(new java.awt.Color(255, 255, 255));
        scrLbl.setText("omar");
        getContentPane().add(scrLbl);
        scrLbl.setBounds(350, 100, 560, 100);

        msgLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        msgLbl.setForeground(new java.awt.Color(255, 255, 255));
        msgLbl.setText("omar");
        getContentPane().add(msgLbl);
        msgLbl.setBounds(400, 160, 660, 60);

        rejouerBtu.setText("Menu");
        rejouerBtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejouerBtuActionPerformed(evt);
            }
        });
        getContentPane().add(rejouerBtu);
        rejouerBtu.setBounds(60, 510, 160, 50);

        jButton1.setText("Correction");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(730, 510, 160, 50);

        correctionLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        correctionLbl.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(correctionLbl);
        correctionLbl.setBounds(300, 250, 640, 300);

        defaultJl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultsimple.png"))); // NOI18N
        defaultJl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        defaultJl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                defaultJl2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                defaultJl2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                defaultJl2MouseReleased(evt);
            }
        });
        getContentPane().add(defaultJl2);
        defaultJl2.setBounds(897, 2, 30, 30);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExitSimple.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitMouseReleased(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(935, 1, 30, 30);

        FrameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDragMouseDragged(evt);
            }
        });
        FrameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDragMousePressed(evt);
            }
        });
        getContentPane().add(FrameDrag);
        FrameDrag.setBounds(0, 0, 980, 40);
        getContentPane().add(corLbl);
        corLbl.setBounds(0, 0, 980, 610);

        Background.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scoreBackground.png"))); // NOI18N
        Background.setText("ooo");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 980, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rejouerBtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejouerBtuActionPerformed
        // TODO ad this.setVisible(false);
        this.setVisible (false);
        new  NiveauJFrame().setVisible(true); 
    }//GEN-LAST:event_rejouerBtuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          correctionLbl.setText (NiveauJFrame.getNv1().correction());   
        String tt="/lbl.png";
             ImageIcon II=new ImageIcon(getClass().getResource(tt));
             corLbl.setIcon (II);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        // TODO add your handling code here:
         xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        // TODO add your handling code here:
     int x=evt.getXOnScreen();
     int y=evt.getYOnScreen();
    this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered

        ImageIcon exitIcon = new ImageIcon (getClass().getResource("/exitnt.png"));
        Exit.setIcon(exitIcon);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited

        ImageIcon exitIcon = new ImageIcon (getClass().getResource("/ExitSimple.png"));
        Exit.setIcon(exitIcon);
    }//GEN-LAST:event_ExitMouseExited

    private void ExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_ExitMouseReleased

    private void defaultJl2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultJl2MouseEntered
        // TODO add your handling code here:
        ImageIcon exitIcon = new ImageIcon (getClass().getResource("/defaultIN.png"));
        defaultJl2.setIcon(exitIcon);
    }//GEN-LAST:event_defaultJl2MouseEntered

    private void defaultJl2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultJl2MouseExited
        ImageIcon exitIcon = new ImageIcon (getClass().getResource("/defaultsimple.png"));
        defaultJl2.setIcon(exitIcon);
    }//GEN-LAST:event_defaultJl2MouseExited

    private void defaultJl2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultJl2MouseReleased
        this.setExtendedState(MenuJFrame.ICONIFIED);
    }//GEN-LAST:event_defaultJl2MouseReleased

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JLabel corLbl;
    private javax.swing.JLabel correctionLbl;
    private javax.swing.JLabel defaultJl2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel msgLbl;
    private javax.swing.JButton rejouerBtu;
    private javax.swing.JLabel scrLbl;
    // End of variables declaration//GEN-END:variables
}
