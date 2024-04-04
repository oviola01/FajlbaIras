package nezet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FormNezet extends javax.swing.JFrame {

    public FormNezet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNev = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTartalom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBeolvasott = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mnuSzoveges = new javax.swing.JMenuItem();
        mnuBinarisKiir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuTxtbol = new javax.swing.JMenuItem();
        mnuConfigbol = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fájlba írás");
        setMinimumSize(new java.awt.Dimension(323, 230));
        setPreferredSize(new java.awt.Dimension(320, 300));

        jLabel1.setText("Fájl neve");

        txtNev.setText("kimenet.txt");

        jLabel2.setText("Tartalom:");

        txtTartalom.setText("Ez kerül a fájlba...");

        jLabel3.setText("Beolvasás:");

        txtBeolvasott.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBeolvasott, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtTartalom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTartalom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtBeolvasott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("szöveges", jPanel1);

        jCheckBox1.setText("Hírlevél");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Választható Szakok --", "Szoftverfejlesztő", "Rendszergazda" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("konfig", jPanel2);

        jMenu1.setText("Program");

        jMenu2.setText("FajlbaIras");

        mnuSzoveges.setText("Szöveges");
        mnuSzoveges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSzovegesActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSzoveges);

        mnuBinarisKiir.setText("Bináris");
        mnuBinarisKiir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBinarisKiirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuBinarisKiir);

        jMenu1.add(jMenu2);

        jMenu3.setText("FájlbólOlvasás");

        mnuTxtbol.setText("Txt-ből");
        mnuTxtbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTxtbolActionPerformed(evt);
            }
        });
        jMenu3.add(mnuTxtbol);

        mnuConfigbol.setText("configból");
        mnuConfigbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfigbolActionPerformed(evt);
            }
        });
        jMenu3.add(mnuConfigbol);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSzovegesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSzovegesActionPerformed
        /* A fájl nevének ée helyének meghatározására jobb lenne
        a FileChooser
        */
        String fajlNeve = txtNev.getText();//hova
        String fajlTartalma = txtTartalom.getText();//mit
        
        String s = "";
        Path path = Paths.get(fajlNeve);
        try {
            /* A kiírás:hova, mit */    
            Files.write(path, fajlTartalma.getBytes());
            s = "A %s kiírva!".formatted(fajlNeve);
        } catch (IOException ex) {
            Logger.getLogger(FormNezet.class.getName()).log(Level.SEVERE, null, ex);
            s = "Nem sikerült a kiírás!";
        }finally{
            JOptionPane.showMessageDialog(rootPane, s);
        }
    }//GEN-LAST:event_mnuSzovegesActionPerformed

    private void mnuTxtbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTxtbolActionPerformed
        /* fájl helyének kiválasztása */
        JFileChooser jfc = new JFileChooser();
        int valasztas = jfc.showOpenDialog(rootPane);
        
        String s = "";
        /* ha ok gombbal zárja be a JFileChooser -t */
        if(valasztas == JFileChooser.APPROVE_OPTION)
        {
            //this.getClass().getResource(s);ha máshonnan nyitom meg a fájlt, ez elvileg megoldja
            String fajlNeve = jfc.getSelectedFile().getPath();//honnan
            try {
                /*                    beolvasás:       honnan */
                String fajlTartalma = Files.readString(Paths.get(fajlNeve));
                s = fajlTartalma;
            } catch (IOException ex) {
                //Logger.getLogger(FormNezet.class.getName()).log(Level.SEVERE, null, ex);
                s = "Nem sikerült a beolvasás!";
            } finally{
                txtBeolvasott.setText(s);
            }
        }
    }//GEN-LAST:event_mnuTxtbolActionPerformed

    private void mnuBinarisKiirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBinarisKiirActionPerformed
        //ha valamiért nem találja a fájlt, akkor exception generálás kell
        try {
            //ezzel el tudjuk menteni egy menüpont aktuális beállításait, pl hogy a checkbox be van-e pipálva
            FileOutputStream fajlKi=new FileOutputStream("config.bin");
            ObjectOutputStream objKi=new ObjectOutputStream(fajlKi);
            objKi.writeObject(jCheckBox1);
            objKi.writeObject(jComboBox1);
            fajlKi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FormNezet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FormNezet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_mnuBinarisKiirActionPerformed

    private void mnuConfigbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfigbolActionPerformed
        
        try {
            FileInputStream fajlBe = new FileInputStream("config.bin");
            ObjectInputStream objBe=new ObjectInputStream(fajlBe);
            //ha tudom, hogy jcheckbox van kiírva, akkor castolni kell azzá
            JCheckBox chb=(JCheckBox) objBe.readObject();
            JComboBox cmb=(JComboBox) objBe.readObject();
            chb.isSelected(); //memóriában létező objektum
            jCheckBox1.setSelected(chb.isSelected()); //program objektumának állapota felveszi az értéket
            objBe.close();
            jComboBox1.setSelectedIndex(cmb.getSelectedIndex());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FormNezet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FormNezet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormNezet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuConfigbolActionPerformed

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
            java.util.logging.Logger.getLogger(FormNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNezet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem mnuBinarisKiir;
    private javax.swing.JMenuItem mnuConfigbol;
    private javax.swing.JMenuItem mnuSzoveges;
    private javax.swing.JMenuItem mnuTxtbol;
    private javax.swing.JTextField txtBeolvasott;
    private javax.swing.JTextField txtNev;
    private javax.swing.JTextField txtTartalom;
    // End of variables declaration//GEN-END:variables
}
