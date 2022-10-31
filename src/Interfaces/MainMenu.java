/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import proyecto1.linkList;
import proyecto1.NodeEdge;
import proyecto1.NodeVertexs;
import proyecto1.Graph;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import proyecto1.Queue;
/**
 *
 * @author Sebastián
 */
public class MainMenu extends javax.swing.JFrame {
    Graph laberinto = new Graph();

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        newLabyrinth = new javax.swing.JButton();
        columnsTitle = new javax.swing.JLabel();
        rowsTitle = new javax.swing.JLabel();
        columns = new javax.swing.JLabel();
        rows = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mazeDisplay = new javax.swing.JPanel();
        solveWallFollower = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        timeTitle = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        solveTitle = new javax.swing.JLabel();
        solveBreadthFirst = new javax.swing.JButton();
        solveDepthFirst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newLabyrinth.setText("Nuevo Laberinto");
        newLabyrinth.setPreferredSize(new java.awt.Dimension(116, 22));
        newLabyrinth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLabyrinthActionPerformed(evt);
            }
        });
        jPanel1.add(newLabyrinth, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 40, 170, -1));

        columnsTitle.setText("Columnas:");
        jPanel1.add(columnsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        rowsTitle.setText("Filas:");
        jPanel1.add(rowsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        columns.setText("y");
        jPanel1.add(columns, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        rows.setText("x");
        jPanel1.add(rows, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        mazeDisplay.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(mazeDisplay);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 210));

        solveWallFollower.setText("Wall Follower");
        solveWallFollower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveWallFollowerActionPerformed(evt);
            }
        });
        jPanel1.add(solveWallFollower, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 350, -1));

        exit.setText("Terminar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        timeTitle.setText("Tiempo de solucion:");
        jPanel1.add(timeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        time.setText("time");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        solveTitle.setText("Metodos de solucion");
        jPanel1.add(solveTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        solveBreadthFirst.setText("Breadth First Search");
        solveBreadthFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveBreadthFirstActionPerformed(evt);
            }
        });
        jPanel1.add(solveBreadthFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 350, -1));

        solveDepthFirst.setText("Depth First Search");
        solveDepthFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveDepthFirstActionPerformed(evt);
            }
        });
        jPanel1.add(solveDepthFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 350, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showLabyrinth(){
        if(!laberinto.isEmpty()){
            mazeDisplay.setLayout(new GridLayout(0, laberinto.getColumns()));
            mazeDisplay.removeAll();
            linkList auxList = laberinto.getVertexs();
            NodeVertexs auxVert = auxList.getlFirst();
            for(int i = 0; i < laberinto.getRows(); i++){
                for(int j = 0; j < laberinto.getColumns(); j++){
                    NodeEdge auxEdge = laberinto.searchEdge((char) auxVert.getData(), (char) (j + 65));
                    JLabel mazeSpace = new JLabel();
                    mazeSpace.setHorizontalAlignment(JLabel.CENTER);
                    mazeSpace.setPreferredSize(new Dimension(40, 40));
                    if(auxEdge != null){
                        char tag = auxEdge.geteTag();
                        auxEdge = auxEdge.getpEdge();
                        switch(tag) {
                            case 'V':
                                mazeSpace.setBackground(Color.blue);
                                break;
                            case 'E':
                                mazeSpace.setBackground(Color.green);
                                break;
                            case 'S':
                                mazeSpace.setBackground(Color.red);
                                break;
                            default:
                                mazeSpace.setBackground(Color.white);
                                break;
                            }
                    }else{
                            mazeSpace.setBackground(Color.black);
                        }
                    mazeSpace.setOpaque(true);
                    mazeSpace.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
                    mazeDisplay.add(mazeSpace);
                    }
                
                auxVert = auxVert.getpNext();
                }
            }
    } 
    
    public boolean breadthFS(NodeEdge entrance){
        Queue edgeQueue = new Queue();
        NodeVertexs auxVert = laberinto.getVertexs().searchVertex((char) entrance.getData());
        NodeEdge auxEdge = auxVert.getpEdge();
        boolean foundExit = false;
        for(int i = 0; i < (auxVert.getAdjAmount() - 1); i++){
            edgeQueue.enqueue(auxEdge);
            auxEdge = auxEdge.getpEdge();
        }
         
        while(!edgeQueue.isEmpty()){
            auxEdge = edgeQueue.dequeue();
            auxEdge = laberinto.searchEdge(auxEdge.geteOrigin(), (char) auxEdge.getData());
            if(auxEdge.geteTag() == 'S'){
                foundExit = true;
                showLabyrinth();
                return foundExit;
            }else if(auxEdge.geteTag() == 'V' || auxEdge.geteTag() == 'E'){
                continue;
            }else{
                auxEdge.seteTag('V');
                auxVert = laberinto.getVertexs().searchVertex((char) auxEdge.getData());
                auxEdge = auxVert.getpEdge();
                for(int i = 0; i < auxVert.getAdjAmount(); i++){
                    edgeQueue.enqueue(auxEdge);
                    auxEdge = auxEdge.getpEdge();}
            }
        }
        showLabyrinth();
        return foundExit;}
    
    
    private void newLabyrinthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLabyrinthActionPerformed
        changeSize newLabyrinth = new changeSize(this, laberinto);
        this.setVisible(false);
    }//GEN-LAST:event_newLabyrinthActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.out.println(laberinto.printGraph());
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void solveWallFollowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveWallFollowerActionPerformed
        if(!laberinto.isEmpty()){
            chooseMethod solveLabyrinth = new chooseMethod(this, laberinto);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Se debe crear un laberinto antes de solucionarlo");
        }
    }//GEN-LAST:event_solveWallFollowerActionPerformed

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange
    /*nada*/
    }//GEN-LAST:event_jPanel1PropertyChange

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
    /*nada igual*/
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        rows.setText(Integer.toString(laberinto.getRows()));
        columns.setText(Integer.toString(laberinto.getColumns()));
        showLabyrinth();
    }//GEN-LAST:event_formComponentShown

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
    /*probando*/
    }//GEN-LAST:event_formComponentHidden

    private void solveBreadthFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveBreadthFirstActionPerformed
        if(!laberinto.isEmpty()){
            NodeVertexs auxVert = laberinto.getVertexs().getlFirst();
            NodeEdge auxEdge = auxVert.getpEdge();
            auxEdge.seteTag('E');
            NodeVertexs auxVertice = laberinto.getVertexs().getlLast();
            NodeEdge auxArista = auxVertice.getpEdge();
            auxArista.seteTag('S');
            showLabyrinth();
            boolean foundExit = breadthFS(auxEdge);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Se debe crear un laberinto antes de solucionarlo");
        }
    }//GEN-LAST:event_solveBreadthFirstActionPerformed

    private void solveDepthFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveDepthFirstActionPerformed
        if(!laberinto.isEmpty()){
            NodeVertexs auxVert = laberinto.getVertexs().getlFirst();
            NodeEdge auxEdge = auxVert.getpEdge();
            auxEdge.seteTag('E');
            NodeVertexs auxVertice = laberinto.getVertexs().getlLast();
            NodeEdge auxArista = auxVertice.getpEdge();
            auxArista.seteTag('S');
            showLabyrinth();
        }
    }//GEN-LAST:event_solveDepthFirstActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel columns;
    private javax.swing.JLabel columnsTitle;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mazeDisplay;
    private javax.swing.JButton newLabyrinth;
    private javax.swing.JLabel rows;
    private javax.swing.JLabel rowsTitle;
    private javax.swing.JButton solveBreadthFirst;
    private javax.swing.JButton solveDepthFirst;
    private javax.swing.JLabel solveTitle;
    private javax.swing.JButton solveWallFollower;
    private javax.swing.JLabel time;
    private javax.swing.JLabel timeTitle;
    // End of variables declaration//GEN-END:variables
}
