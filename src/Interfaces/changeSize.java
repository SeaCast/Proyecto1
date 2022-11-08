/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.JOptionPane;
import proyecto1.linkList;
import proyecto1.NodeEdge;
import proyecto1.Vertex;
import proyecto1.Graph;

/**
 *
 * @author Sebastián
 */
public class changeSize extends javax.swing.JFrame {

    /**
     * Creates new form changeSize
     */
    
    public static MainMenu w1;
    public static Graph laberinto;
    
    public changeSize(MainMenu w1, Graph laberinto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.w1 = w1;
        this.laberinto = laberinto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xRows = new javax.swing.JTextField();
        yColumns = new javax.swing.JTextField();
        Columns = new javax.swing.JLabel();
        Rows = new javax.swing.JLabel();
        windowTitle = new javax.swing.JLabel();
        goMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xRowsActionPerformed(evt);
            }
        });
        jPanel1.add(xRows, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 40, 130, -1));
        jPanel1.add(yColumns, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 70, 130, -1));

        Columns.setText("Filas:");
        jPanel1.add(Columns, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        Rows.setText("Columnas:");
        jPanel1.add(Rows, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        windowTitle.setText("Ingrese los nuevos valores");
        jPanel1.add(windowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        goMenu.setText("Aceptar");
        goMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goMenuActionPerformed(evt);
            }
        });
        jPanel1.add(goMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goMenuActionPerformed
        try{
            int rows = Integer.parseInt(xRows.getText());
            int columns = Integer.parseInt(yColumns.getText());
            laberinto.empty();
            laberinto.createLabyrinth(rows, columns);
            laberinto.randomizeEdges();
            Vertex auxVert = laberinto.getVertexs().getlFirst();
            NodeEdge auxEdge = auxVert.getpFirst();
//            auxEdge.seteTag('E');
//            NodeVertexs auxVertice = laberinto.getVertexs().getlLast();
//            NodeEdge auxArista = auxVertice.getpEdge();
//            auxArista.seteTag('S');
            w1.setVisible(true);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Se ha producido un error, por favor verifique que solo se inserten numeros enteros en los campos\n " + e);
            }

    }//GEN-LAST:event_goMenuActionPerformed

    private void xRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xRowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xRowsActionPerformed

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
            java.util.logging.Logger.getLogger(changeSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changeSize(w1, laberinto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Columns;
    private javax.swing.JLabel Rows;
    private javax.swing.JButton goMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel windowTitle;
    private javax.swing.JTextField xRows;
    private javax.swing.JTextField yColumns;
    // End of variables declaration//GEN-END:variables
}
