package citbyui.cit260.connect4.frames;

import citbyui.cit260.connect4.frames.HelpMenu;
import citbyui.cit260.connect4.frames.EnterPlayerNames2Player;
import citbyui.cit260.connect4.frames.EnterPlayerNames1Player;
import citbyui.cit260.connect4.control.MainMenuControl;
import citbyui.cit260.connect4.models.Game;
import citbyui.cit260.connect4.enums.GameType;
import citbyui.cit260.connect4.control.Connect4;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Josh
 */
public class MainFrame extends javax.swing.JFrame {
private MainMenuControl mainmenucontrol = new MainMenuControl();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpMenuItems = new javax.swing.JPanel();
        jbtnPlayer2 = new javax.swing.JButton();
        jbtnHelp = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtWelcome = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect 4");

        jpBody.setBackground(new java.awt.Color(0, 0, 0));
        jpBody.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jpTitle.setBackground(new java.awt.Color(0, 153, 153));
        jpTitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpTitle.setName(" jpTitle"); // NOI18N

        jlTitle.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Connect 4");

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlTitle.getAccessibleContext().setAccessibleName(" jlTitle");

        jpMenuItems.setBackground(new java.awt.Color(0, 153, 153));
        jpMenuItems.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpMenuItems.setForeground(new java.awt.Color(102, 255, 255));
        jpMenuItems.setToolTipText("");

        jbtnPlayer2.setBackground(new java.awt.Color(204, 204, 204));
        jbtnPlayer2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbtnPlayer2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnPlayer2.setLabel("Player 2 Game");
        jbtnPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlayer2ActionPerformed(evt);
            }
        });

        jbtnHelp.setBackground(new java.awt.Color(204, 204, 204));
        jbtnHelp.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbtnHelp.setText("Help Menu");
        jbtnHelp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHelpActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(204, 204, 204));
        jbtnExit.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnHelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbtnPlayer2)
                .addGap(34, 34, 34)
                .addComponent(jbtnHelp)
                .addGap(37, 37, 37)
                .addComponent(jbtnExit)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jtWelcome.setEditable(false);
        jtWelcome.setBackground(new java.awt.Color(0, 0, 0));
        jtWelcome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtWelcome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jtWelcome.setText("Welcome to Connect 4\n\nEach player is given either red or black tokens to play. The board consists of circular slots for these tokens; 7 columns wide and 6 rows high. The players take turns filling in the slots with their tokens; with each token placed settling into the lowest row of the column placed. The game is over when one player connects 4' tokens in an uninterrupted row. \n\nHave fun!");
        jtWelcome.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jtWelcome.setRequestFocusEnabled(false);
        jtWelcome.setSelectedTextColor(new java.awt.Color(255, 102, 51));
        jScrollPane1.setViewportView(jtWelcome);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpTitle.getAccessibleContext().setAccessibleName("jpBody");
        jpMenuItems.getAccessibleContext().setAccessibleName("jpMenuItems");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlayer2ActionPerformed
        // TODO add your handling code here:
        EnterPlayerNames2Player p2 = new EnterPlayerNames2Player();
        p2.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_jbtnPlayer2ActionPerformed

    private void jbtnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHelpActionPerformed
        HelpMenu help = new HelpMenu();
        help.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnHelpActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnHelp;
    private javax.swing.JButton jbtnPlayer2;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTextPane jtWelcome;
    // End of variables declaration//GEN-END:variables
}
