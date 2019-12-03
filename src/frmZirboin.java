/*
 * 03/12/2019
 * Yama
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ayyam8774
 */
public class frmZirboin extends javax.swing.JFrame {

    /**
     * Creates new form frmZirboin
     */
    public frmZirboin() {
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

        lbltitle = new javax.swing.JLabel();
        lblinstruction = new javax.swing.JLabel();
        lblDtoV = new javax.swing.JLabel();
        lblCtoV = new javax.swing.JLabel();
        lblGtoV = new javax.swing.JLabel();
        lblFtoV = new javax.swing.JLabel();
        lblBtoV = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btncalculate = new javax.swing.JButton();
        lblD = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblG = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblL = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtG = new javax.swing.JTextField();
        txtF = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitle.setText(" $ Zirboin Bank $");

        lblinstruction.setText("The values for each of the other coins:");

        lblDtoV.setText("1 drobzit coin = 100,000 vrobits");

        lblCtoV.setText("1 clickwick coin = 50,000 vrobits");

        lblGtoV.setText("1 gazoontight coin = 10,000 vrobits");

        lblFtoV.setText("1 frazoint coin = 1,000 vrobits");

        lblBtoV.setText("1 blointoint coin = 500 vrobits");

        lblQuestion.setText("How much vrobits do you have?");

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        btncalculate.setText("Calculate");
        btncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateActionPerformed(evt);
            }
        });

        lblD.setText("Dropzit coins →");

        lblC.setText("Clickwick coins →");

        lblG.setText("Gazoontight coins →");

        lblF.setText("Frazonint coins →");

        lblB.setText("Blointoint coins →");

        lblL.setText("Leftover coins → ");

        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });

        txtG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblinstruction)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDtoV)
                        .addComponent(lblGtoV)
                        .addComponent(lblCtoV)
                        .addComponent(lblFtoV)
                        .addComponent(lblBtoV)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncalculate)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblG)
                            .addComponent(lblD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblL, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtC, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(txtG)
                            .addComponent(txtF)
                            .addComponent(txtB)
                            .addComponent(txtD)
                            .addComponent(txtL))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQuestion)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lblQuestion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinstruction)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncalculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDtoV)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCtoV)
                    .addComponent(lblD)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGtoV)
                    .addComponent(lblC)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFtoV)
                    .addComponent(lblG)
                    .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBtoV)
                    .addComponent(lblF)
                    .addComponent(txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblB)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblL)
                    .addComponent(txtL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void btncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateActionPerformed
        Scanner keyedInput = new Scanner (System.in);
        
        double dropzit , clickwick , gazoontight , frazoint , blointoint , leftover;
        double dropzit2 , clickwick2 , gazoontight2 , frazoint2 , blointoint2 , leftover2;
        
        double total = Double.parseDouble(txttotal.getText());
        
        // For dropzit ↓↓↓
        dropzit = (total / 100000);
        
        dropzit2 = Math.floor(dropzit);
        
        txtD.setText(String.valueOf(dropzit2));
        
        // For clickwick ↓↓↓
        clickwick = (dropzit / 50000);
        
        clickwick2 = Math.floor(clickwick);
        
        txtC.setText(String.valueOf(clickwick2));
        
        // For gazoontight ↓↓↓
        gazoontight = (clickwick / 10000);
        
        gazoontight2 = Math.floor(gazoontight);
        
        txtG.setText(String.valueOf(gazoontight2));
        
        // For frazoint ↓↓↓
        frazoint = (gazoontight / 1000);
        
        frazoint2 = Math.floor(frazoint);
        
        txtF.setText(String.valueOf(frazoint2));
        
        // For blointoint ↓↓↓
        blointoint = (frazoint / 500);
        
        blointoint2 = Math.floor(blointoint);
        
        txtB.setText(String.valueOf(blointoint2));
        
        
        
        
    }//GEN-LAST:event_btncalculateActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDActionPerformed

    private void txtGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGActionPerformed

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
            java.util.logging.Logger.getLogger(frmZirboin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmZirboin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmZirboin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmZirboin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmZirboin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalculate;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblBtoV;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblCtoV;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDtoV;
    private javax.swing.JLabel lblF;
    private javax.swing.JLabel lblFtoV;
    private javax.swing.JLabel lblG;
    private javax.swing.JLabel lblGtoV;
    private javax.swing.JLabel lblL;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblinstruction;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtF;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtL;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
