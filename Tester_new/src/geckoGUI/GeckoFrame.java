package GeckoGUI;

/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josef Ziegler, Nick Eyring
 */
public class GeckoFrame extends javax.swing.JFrame {

    /**
     * Creates new form GeckoFrame
     */
    public GeckoFrame() {
        initComponents();
        
        this.setLocationRelativeTo(null); // display in center screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")                     
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem65 = new javax.swing.JMenuItem();
        jMenuItem66 = new javax.swing.JMenuItem();
        jMenuItem68 = new javax.swing.JMenuItem();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenuItem76 = new javax.swing.JMenuItem();
        jMenuItem70 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem12 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem11 = new javax.swing.JCheckBoxMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem10 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem42 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GeckoProperties\\Bundle_EN"); // NOI18N
        jMenu1.setText(bundle.getString("GeckoFrame.jMenu1.text")); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText(bundle.getString("GeckoFrame.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText(bundle.getString("GeckoFrame.jMenuItem2.text")); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText(bundle.getString("GeckoFrame.jMenuItem3.text")); // NOI18N
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText(bundle.getString("GeckoFrame.jMenuItem4.text")); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText(bundle.getString("GeckoFrame.jMenuItem5.text")); // NOI18N
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText(bundle.getString("GeckoFrame.jMenuItem6.text")); // NOI18N
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText(bundle.getString("GeckoFrame.jMenuItem7.text")); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("GeckoFrame.jMenu2.text")); // NOI18N
        jMenu2.add(jSeparator2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText(bundle.getString("GeckoFrame.jMenuItem8.text")); // NOI18N
        jMenu2.add(jMenuItem8);
        jMenu2.add(jSeparator3);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText(bundle.getString("GeckoFrame.jMenuItem9.text")); // NOI18N
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText(bundle.getString("GeckoFrame.jMenuItem10.text")); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText(bundle.getString("GeckoFrame.jMenuItem11.text")); // NOI18N
        jMenu2.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem12.setText(bundle.getString("GeckoFrame.jMenuItem12.text")); // NOI18N
        jMenu2.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText(bundle.getString("GeckoFrame.jMenuItem13.text")); // NOI18N
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText(bundle.getString("GeckoFrame.jMenuItem14.text")); // NOI18N
        jMenu2.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem15.setText(bundle.getString("GeckoFrame.jMenuItem15.text")); // NOI18N
        jMenu2.add(jMenuItem15);
        jMenu2.add(jSeparator1);

        jMenuItem16.setText(bundle.getString("GeckoFrame.jMenuItem16.text")); // NOI18N
        jMenu2.add(jMenuItem16);

        jMenuItem17.setText(bundle.getString("GeckoFrame.jMenuItem17.text")); // NOI18N
        jMenu2.add(jMenuItem17);

        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("GeckoFrame.jMenu3.text")); // NOI18N

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem18.setText(bundle.getString("GeckoFrame.jMenuItem18.text")); // NOI18N
        jMenu3.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem19.setText(bundle.getString("GeckoFrame.jMenuItem19.text")); // NOI18N
        jMenu3.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem20.setText(bundle.getString("GeckoFrame.jMenuItem20.text")); // NOI18N
        jMenu3.add(jMenuItem20);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem21.setText(bundle.getString("GeckoFrame.jMenuItem21.text")); // NOI18N
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuBar1.add(jMenu3);

        jMenu4.setText(bundle.getString("GeckoFrame.jMenu4.text")); // NOI18N

        jMenuItem22.setText(bundle.getString("GeckoFrame.jMenuItem22.text")); // NOI18N
        jMenu4.add(jMenuItem22);

        jMenu8.setText(bundle.getString("GeckoFrame.jMenu8.text")); // NOI18N

        jMenuItem54.setText(bundle.getString("GeckoFrame.jMenuItem54.text")); // NOI18N
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem54);

        jMenuItem56.setText(bundle.getString("GeckoFrame.jMenuItem56.text")); // NOI18N
        jMenu8.add(jMenuItem56);

        jMenuItem58.setText(bundle.getString("GeckoFrame.jMenuItem58.text")); // NOI18N
        jMenu8.add(jMenuItem58);

        jMenuItem59.setText(bundle.getString("GeckoFrame.jMenuItem59.text")); // NOI18N
        jMenuItem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem59ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem59);

        jMenuItem61.setText(bundle.getString("GeckoFrame.jMenuItem61.text")); // NOI18N
        jMenuItem61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem61ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem61);

        jMenu4.add(jMenu8);

        jMenu9.setText(bundle.getString("GeckoFrame.jMenu9.text")); // NOI18N

        jMenuItem64.setText(bundle.getString("GeckoFrame.jMenuItem64.text")); // NOI18N
        jMenu9.add(jMenuItem64);

        jMenuItem65.setText(bundle.getString("GeckoFrame.jMenuItem65.text")); // NOI18N
        jMenuItem65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem65ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem65);

        jMenuItem66.setText(bundle.getString("GeckoFrame.jMenuItem66.text")); // NOI18N
        jMenuItem66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem66ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem66);

        jMenuItem68.setText(bundle.getString("GeckoFrame.jMenuItem68.text")); // NOI18N
        jMenu9.add(jMenuItem68);

        jMenuItem69.setText(bundle.getString("GeckoFrame.jMenuItem69.text")); // NOI18N
        jMenu9.add(jMenuItem69);

        jMenuItem76.setText(bundle.getString("GeckoFrame.jMenuItem76.text")); // NOI18N
        jMenuItem76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem76ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem76);

        jMenuItem70.setText(bundle.getString("GeckoFrame.jMenuItem70.text")); // NOI18N
        jMenu9.add(jMenuItem70);

        jMenu4.add(jMenu9);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem2.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem2);
        jMenu4.add(jSeparator11);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem4.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem3.text")); // NOI18N
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem12.setSelected(true);
        jCheckBoxMenuItem12.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem12.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem12);

        jCheckBoxMenuItem11.setSelected(true);
        jCheckBoxMenuItem11.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem11.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem11);
        jMenu4.add(jSeparator10);

        jCheckBoxMenuItem10.setSelected(true);
        jCheckBoxMenuItem10.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem10.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem10);

        jCheckBoxMenuItem9.setSelected(true);
        jCheckBoxMenuItem9.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem9.text")); // NOI18N
        jCheckBoxMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem9);

        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem8.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem8);
        jMenu4.add(jSeparator9);

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem7.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem7);

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem6.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem6);

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem5.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText(bundle.getString("GeckoFrame.jCheckBoxMenuItem1.text")); // NOI18N
        jMenu4.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu5.setText(bundle.getString("GeckoFrame.jMenu5.text")); // NOI18N

        jMenuItem39.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem39.setText(bundle.getString("GeckoFrame.jMenuItem39.text")); // NOI18N
        jMenu5.add(jMenuItem39);

        jMenuItem40.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem40.setText(bundle.getString("GeckoFrame.jMenuItem40.text")); // NOI18N
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem40);

        jMenuItem41.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem41.setText(bundle.getString("GeckoFrame.jMenuItem41.text")); // NOI18N
        jMenu5.add(jMenuItem41);
        jMenu5.add(jSeparator7);

        jMenuItem42.setText(bundle.getString("GeckoFrame.jMenuItem42.text")); // NOI18N
        jMenu5.add(jMenuItem42);
        jMenu5.add(jSeparator8);

        jMenuItem43.setText(bundle.getString("GeckoFrame.jMenuItem43.text")); // NOI18N
        jMenu5.add(jMenuItem43);

        jMenuItem44.setText(bundle.getString("GeckoFrame.jMenuItem44.text")); // NOI18N
        jMenu5.add(jMenuItem44);

        jMenuBar1.add(jMenu5);

        jMenu6.setText(bundle.getString("GeckoFrame.jMenu6.text")); // NOI18N

        jMenuItem45.setText(bundle.getString("GeckoFrame.jMenuItem45.text")); // NOI18N
        jMenu6.add(jMenuItem45);

        jMenuItem46.setText(bundle.getString("GeckoFrame.jMenuItem46.text")); // NOI18N
        jMenu6.add(jMenuItem46);

        jMenuItem47.setText(bundle.getString("GeckoFrame.jMenuItem47.text")); // NOI18N
        jMenu6.add(jMenuItem47);

        jMenuItem48.setText(bundle.getString("GeckoFrame.jMenuItem48.text")); // NOI18N
        jMenu6.add(jMenuItem48);

        jMenuBar1.add(jMenu6);

        jMenu7.setText(bundle.getString("GeckoFrame.jMenu7.text")); // NOI18N

        jMenuItem49.setText(bundle.getString("GeckoFrame.jMenuItem49.text")); // NOI18N
        jMenu7.add(jMenuItem49);

        jMenuItem50.setText(bundle.getString("GeckoFrame.jMenuItem50.text")); // NOI18N
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem50);

        jMenuItem51.setText(bundle.getString("GeckoFrame.jMenuItem51.text")); // NOI18N
        jMenu7.add(jMenuItem51);

        jMenuItem52.setText(bundle.getString("GeckoFrame.jMenuItem52.text")); // NOI18N
        jMenu7.add(jMenuItem52);

        jMenuItem53.setText(bundle.getString("GeckoFrame.jMenuItem53.text")); // NOI18N
        jMenu7.add(jMenuItem53);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 483, Short.MAX_VALUE)
        );

        pack();
    }                       

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jCheckBoxMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jMenuItem76ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem61ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem59ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem65ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem66ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
    }                                          

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
            java.util.logging.Logger.getLogger(GeckoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeckoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeckoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeckoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeckoFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem10;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem11;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem12;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem70;
    private javax.swing.JMenuItem jMenuItem76;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration                   
}
