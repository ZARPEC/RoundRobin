package com.mycompany.roundrobin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ingri
 */
public class interfaz extends javax.swing.JFrame {

    DefaultTableModel modelo;
    static int[] Grafaga;
    int pos = 0;
    static String[] proN;
    static int tamqu;
    static String[] proceso;

    /**
     * Creates new form NewJFrame
     */
    public interfaz() {
        this.Grafaga = new int[10];
        this.proN = new String[10];
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        this.setTitle("ROUND ROBIN");
    }
    so so = new so();

    private JPanel crearpanelito() {
        JPanel panelito = new JPanel(new BorderLayout());
        panelito.setBorder(new TitledBorder(""));
        panelito.add(new JLabel("Proceso"), BorderLayout.PAGE_START);
        panelito.setVisible(true);
        System.out.println("panelito agregado");
        return panelito;
    }

    public boolean Actiniciar() {
        int tamqu;
        boolean respuesta = false;
        if (!quantumtex.getText().equals("")) {
            tamqu = Integer.parseInt(quantumtex.getText().trim());
            if (tamqu != 0 && tabla.getRowCount() >= 1) {
                respuesta = true;
            }
        }
        return respuesta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        quantumtex = new javax.swing.JTextField();
        botquantum = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rafagatex = new javax.swing.JTextField();
        botrafaga = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botiniciar = new javax.swing.JButton();
        contenedorgantt = new javax.swing.JPanel();
        contenedorpanelito = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Quantum");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

        quantumtex.setBackground(new java.awt.Color(255, 255, 255));
        quantumtex.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        quantumtex.setForeground(new java.awt.Color(51, 51, 51));
        quantumtex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantumtexActionPerformed(evt);
            }
        });
        quantumtex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantumtexKeyTyped(evt);
            }
        });
        jPanel2.add(quantumtex, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, 40));

        botquantum.setBackground(new java.awt.Color(153, 255, 204));
        botquantum.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        botquantum.setText("Aceptar");
        botquantum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botquantumMouseReleased(evt);
            }
        });
        botquantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botquantumActionPerformed(evt);
            }
        });
        jPanel2.add(botquantum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 150, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel3.setText("🕒");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 50));

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rafaga");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 80));

        rafagatex.setBackground(new java.awt.Color(255, 255, 255));
        rafagatex.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        rafagatex.setForeground(new java.awt.Color(0, 0, 0));
        rafagatex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rafagatexActionPerformed(evt);
            }
        });
        rafagatex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rafagatexKeyTyped(evt);
            }
        });
        jPanel2.add(rafagatex, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 40));

        botrafaga.setBackground(new java.awt.Color(0, 255, 0));
        botrafaga.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botrafaga.setForeground(new java.awt.Color(0, 0, 0));
        botrafaga.setText("✔️");
        botrafaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botrafagaMouseReleased(evt);
            }
        });
        botrafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botrafagaActionPerformed(evt);
            }
        });
        botrafaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                botrafagaKeyTyped(evt);
            }
        });
        jPanel2.add(botrafaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("---------------------------------------");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("---------------------------------------");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 255, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBackground(new java.awt.Color(255, 153, 255));
        tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 204)));
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Rafaga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(255, 255, 102));
        tabla.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabla.setSelectionForeground(new java.awt.Color(153, 102, 255));
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 180));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 290, 200));

        botiniciar.setBackground(new java.awt.Color(255, 51, 255));
        botiniciar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botiniciar.setForeground(new java.awt.Color(0, 0, 0));
        botiniciar.setText("Iniciar");
        botiniciar.setEnabled(false);
        botiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botiniciarMouseReleased(evt);
            }
        });
        botiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botiniciarActionPerformed(evt);
            }
        });
        jPanel2.add(botiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 150, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 314, 512));

        contenedorgantt.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout contenedorganttLayout = new javax.swing.GroupLayout(contenedorgantt);
        contenedorgantt.setLayout(contenedorganttLayout);
        contenedorganttLayout.setHorizontalGroup(
            contenedorganttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorganttLayout.setVerticalGroup(
            contenedorganttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        jPanel1.add(contenedorgantt, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 262, 638, -1));

        contenedorpanelito.setBackground(new java.awt.Color(153, 255, 255));
        contenedorpanelito.setForeground(new java.awt.Color(204, 255, 255));
        contenedorpanelito.setPreferredSize(new java.awt.Dimension(190, 250));

        javax.swing.GroupLayout contenedorpanelitoLayout = new javax.swing.GroupLayout(contenedorpanelito);
        contenedorpanelito.setLayout(contenedorpanelitoLayout);
        contenedorpanelitoLayout.setHorizontalGroup(
            contenedorpanelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        contenedorpanelitoLayout.setVerticalGroup(
            contenedorpanelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel1.add(contenedorpanelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 6, -1, -1));

        jLabel6.setFont(new java.awt.Font("Informal Roman", 1, 100)); // NOI18N
        jLabel6.setText("Round");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 270, 110));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 48)); // NOI18N
        jLabel7.setText("Rob✏️n");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 171, 55));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel8.setText("⭐");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 67, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quantumtexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantumtexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantumtexActionPerformed

    private void rafagatexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rafagatexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rafagatexActionPerformed

    private void botquantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botquantumActionPerformed

        boolean respuesta = false;
        JFrame ventanita = new JFrame();
        if (!quantumtex.getText().equals("")) {
            tamqu = Integer.parseInt(quantumtex.getText().trim());
            respuesta = so.quantum(tamqu);
            if (respuesta) {
                quantumtex.setEnabled(false);
                botquantum.setEnabled(false);
            } else {

                JOptionPane.showMessageDialog(ventanita, "Ingrese un valor entre 10 y 100");
                quantumtex.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(ventanita, "Ingrese un valor");
        }
    }//GEN-LAST:event_botquantumActionPerformed

    private void botrafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botrafagaActionPerformed
        color panelito = new color();
        int rafaga;
        String ProceText;
        JFrame ventanita = new JFrame();
        if (!rafagatex.getText().equals("")) {
            rafaga = Integer.parseInt(rafagatex.getText().trim());
            Object datos[] = new Object[2];
            datos[1] = Grafaga[pos] = rafaga;
            datos[0] = proN[pos] = so.agregarproceso();
            ProceText = proN[pos];
            modelo.addRow(datos);
            pos++;
            rafagatex.setText("");
            rafagatex.requestFocus();
        } else {
            JOptionPane.showMessageDialog(ventanita, "Ingrese un valor");
        }
    }//GEN-LAST:event_botrafagaActionPerformed

    private void quantumtexKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantumtexKeyTyped
        int tecla = evt.getKeyChar();
        boolean num = tecla >= 48 && tecla <= 57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_quantumtexKeyTyped

    private void botrafagaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botrafagaKeyTyped

    }//GEN-LAST:event_botrafagaKeyTyped

    private void rafagatexKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rafagatexKeyTyped
        int tecla = evt.getKeyChar();
        boolean num = tecla >= 48 && tecla <= 57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_rafagatexKeyTyped

    private void botiniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botiniciarMouseReleased

    }//GEN-LAST:event_botiniciarMouseReleased

    private void botrafagaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botrafagaMouseReleased
        if (Actiniciar()) {
            botiniciar.setEnabled(true);
        }
    }//GEN-LAST:event_botrafagaMouseReleased

    private void botquantumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botquantumMouseReleased
        if (Actiniciar()) {
            botiniciar.setEnabled(true);
        }
    }//GEN-LAST:event_botquantumMouseReleased

    private void botiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botiniciarActionPerformed
        gantt diagrama = new gantt();
        color panelito = new color();
        proceso = new String[tabla.getRowCount()];
        diagrama.setSize(570, 200);
        diagrama.setLocation(20, 30);
        contenedorgantt.removeAll();
        contenedorgantt.add(diagrama, BorderLayout.CENTER);
        contenedorgantt.revalidate();
        contenedorgantt.repaint();
        botrafaga.setEnabled(false);

        panelito.setSize(180, 240);
        panelito.setLocation(5, 5);
        contenedorpanelito.removeAll();
        contenedorpanelito.add(panelito, BorderLayout.EAST);
        contenedorpanelito.revalidate();
        contenedorpanelito.repaint();

        for (int i = 0; i < proceso.length; i++) {
            proceso[i] = proN[i];
            System.out.println(proceso[i]);
        }

        JList list = new JList(proceso);
        list.setPreferredSize(new Dimension(180, 240));
        list.setFixedCellHeight(20);
        list.setBackground(Color.yellow);
        list.setCellRenderer(new lista());
        panelito.PanelLista.add(list);
        panelito.PanelLista.setSize(180, 240);
        panelito.PanelLista.setLocation(0, 0);
        panelito.PanelLista.setVisible(true);
        panelito.PanelLista.revalidate();
        panelito.PanelLista.repaint();
        botiniciar.setEnabled(false);

    }//GEN-LAST:event_botiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botiniciar;
    private javax.swing.JButton botquantum;
    private javax.swing.JButton botrafaga;
    private javax.swing.JPanel contenedorgantt;
    private javax.swing.JPanel contenedorpanelito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantumtex;
    private javax.swing.JTextField rafagatex;
    public static javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
