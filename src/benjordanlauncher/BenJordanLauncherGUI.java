/*
 * BenJordanLauncherGUI.java
 *
 * Created on Aug 9, 2012, 10:51:54 PM
 * 
 * Written by Andrew Brown
 * 
 * Version 1.3
 * 
 * A program designed to run all of the Ben Jordan games from a single launcher. 
 */
package benjordanlauncher;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class BenJordanLauncherGUI extends javax.swing.JFrame {

    BJPath bjpath = new BJPath();
    boolean isSetup = false;
    String[] path = new String[1];

    /** Creates new form BenJordanLauncherGUI */
    public BenJordanLauncherGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     * 
     * In other words, this stuff was handled by Netbeans. Mess about with it
     * at your own risk.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jCover = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCase1 = new javax.swing.JButton();
        jCase1dx = new javax.swing.JButton();
        jCase2 = new javax.swing.JButton();
        jCase2dx = new javax.swing.JButton();
        jCase3 = new javax.swing.JButton();
        jCase4 = new javax.swing.JButton();
        jCase5 = new javax.swing.JButton();
        jCase6 = new javax.swing.JButton();
        jCase7 = new javax.swing.JButton();
        jCase8 = new javax.swing.JButton();
        jToggleSetup = new javax.swing.JButton();
        jChangeDir = new javax.swing.JButton();

        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\"));
            jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowOpened(java.awt.event.WindowEvent evt) {
                    formWindowOpened(evt);
                }
            });

            jCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BJTitle.png"))); // NOI18N

            jCase1.setText("Case 1");
            jCase1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase1MouseClicked(evt);
                }
            });

            jCase1dx.setText("Case 1 Deluxe");
            jCase1dx.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase1dxMouseClicked(evt);
                }
            });

            jCase2.setText("Case 2");
            jCase2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase2MouseClicked(evt);
                }
            });

            jCase2dx.setText("Case 2 Deluxe");
            jCase2dx.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase2dxMouseClicked(evt);
                }
            });

            jCase3.setText("Case 3");
            jCase3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase3MouseClicked(evt);
                }
            });

            jCase4.setText("Case 4");
            jCase4.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase4MouseClicked(evt);
                }
            });

            jCase5.setText("Case 5");
            jCase5.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase5MouseClicked(evt);
                }
            });

            jCase6.setText("Case 6");
            jCase6.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase6MouseClicked(evt);
                }
            });

            jCase7.setText("Case 7");
            jCase7.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase7MouseClicked(evt);
                }
            });

            jCase8.setText("Case 8");
            jCase8.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jCase8MouseClicked(evt);
                }
            });

            jToggleSetup.setText("Toggle Setup");
            jToggleSetup.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jToggleSetupMouseClicked(evt);
                }
            });

            jChangeDir.setText("Change Directory");
            jChangeDir.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jChangeDirMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCase1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase1dx, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase2dx, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase4, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase5, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase6, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase7, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jCase8, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jToggleSetup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jChangeDir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jCase1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase1dx)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase2dx)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCase8)
                    .addGap(105, 105, 105)
                    .addComponent(jToggleSetup)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jChangeDir, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCover)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

/*
 * All the jCaseXMouseClicked functions work the same, but for different games.
 * They build up a path to the specific game in the String[] path, create a File object 
 * pointing to that directory, and then call the openGame function using those
 * parameters.
 */
    
private void jCase1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase1MouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 1\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ1.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase1MouseClicked

private void jCase1dxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase1dxMouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 1 Deluxe\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ1Deluxe.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase1dxMouseClicked

private void jCase2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase2MouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 2\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ2.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase2MouseClicked

private void jCase2dxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase2dxMouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 2 Deluxe\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ2Deluxe.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase2dxMouseClicked

private void jCase3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase3MouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 3\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ3.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase3MouseClicked

private void jCase4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase4MouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 4\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ4.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase4MouseClicked

private void jCase5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase5MouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 5\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ5.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase5MouseClicked

private void jCase6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase6MouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 6\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ6.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase6MouseClicked

/* 
 * So, you've changed where you keep your games. No problem! Just click the
 * "Change Directory" button, and choose the new directory where your BJ games
 * are. This shouldn't really be sandwiched between the 'open game' buttons,
 * but Netbeans doesn't allow you to change the order of auto-generated functions.
 * That said, it's still preferable to writing the GUI by hand.
 */

private void jChangeDirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChangeDirMouseClicked
    jFileChooser1.setCurrentDirectory(new File(bjpath.getDefaultPath()));
    int returnVal = jFileChooser1.showOpenDialog(this); //Open FileChooser.

    if (returnVal == JFileChooser.APPROVE_OPTION) {
        String defaultPath = jFileChooser1.getSelectedFile().getAbsolutePath();
        bjpath.setDefaultPath(defaultPath);
    }
}//GEN-LAST:event_jChangeDirMouseClicked

private void jCase7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase7MouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 7\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ7.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase7MouseClicked

private void jCase8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCase8MouseClicked
    path[0] = bjpath.getDefaultPath() + "\\Ben Jordan 8\\";
    File dir = new File(path[0]);
    if (isSetup == true) {
        path[0] += "winsetup.exe";
    } else {
        path[0] += "BJ8.exe";
    }

    openGame(path, dir);
}//GEN-LAST:event_jCase8MouseClicked

/*
 * Allows the user to access the game's setup program. It basically just toggles
 * a boolean, which is used in the 'open game' buttons.
 */

private void jToggleSetupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleSetupMouseClicked
    if (isSetup == false) {
        isSetup = true;
        jToggleSetup.setText("Toggle Games");
    } else {
        isSetup = false;
        jToggleSetup.setText("Toggle Setup");
    }
}//GEN-LAST:event_jToggleSetupMouseClicked

/*
 * When the launcher is run, it checks whether the user has set the directory
 * where the games are. If not, then it prompts them to set it now.
 */

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (!bjpath.getSetup()) {
            int returnVal = jFileChooser1.showOpenDialog(this); //Open FileChooser.

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String defaultPath = jFileChooser1.getSelectedFile().getAbsolutePath();
                bjpath.setDefaultPath(defaultPath);
            }
            bjpath.setSetup(true);
        }
    }//GEN-LAST:event_formWindowOpened
    
/* 
 * Opens the file specified by the path in the String[] path, and using the 
 * working directory specified by File workingDir. If the file cannot be 
 * opened, an error popup is displayed.
 * 
 * I'm using a String array instead of a single String due to the way the Runtime.exec
 * method works. The long and the short of it is that if I used a String, the
 * directories used cannot have white spaces in them, which is a problem.
 */
    
    private void openGame(String[] path, File workingDir) {
        try {
            Process p = Runtime.getRuntime().exec(path, null, workingDir);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Game/setup could not be opened. Are you "
                    + "in the right directory? If you're trying to access setup, is Windows"
                    + "UAC turned on?");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BenJordanLauncherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BenJordanLauncherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BenJordanLauncherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BenJordanLauncherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new BenJordanLauncherGUI().setVisible(true);
            }
        });


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCase1;
    private javax.swing.JButton jCase1dx;
    private javax.swing.JButton jCase2;
    private javax.swing.JButton jCase2dx;
    private javax.swing.JButton jCase3;
    private javax.swing.JButton jCase4;
    private javax.swing.JButton jCase5;
    private javax.swing.JButton jCase6;
    private javax.swing.JButton jCase7;
    private javax.swing.JButton jCase8;
    private javax.swing.JButton jChangeDir;
    private javax.swing.JLabel jCover;
    private static javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jToggleSetup;
    // End of variables declaration//GEN-END:variables
}
