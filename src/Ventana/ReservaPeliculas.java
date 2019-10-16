
package Ventana;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ReservaPeliculas extends javax.swing.JFrame {
        List listA = new ArrayList();
        String selectMovie = "";
        String sala = "";
        String horario = "";
    
    public ReservaPeliculas() {
        initComponents();
        //btnVenta.setEnabled(false);
        setEnableHorarios(false);
        setInitConfiguration();
        this.setLocationRelativeTo(null);
        setListener();
    }
    
    private void setInitConfiguration() {
        buttonGroup1.add(Sala2D);
        buttonGroup1.add(Sala3D);
        buttonGroup1.add(SalaXD);
        buttonGroup2.add(horario1);
        buttonGroup2.add(horario2);
        buttonGroup2.add(horario3);
        buttonGroup2.add(horario4);
        buttonGroup2.add(horario5);
        buttonGroup3.add(PagoEfectivo);
        buttonGroup3.add(PagoTargeta);
    }
    
    private void setListener() {
        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent changEvent) {
                if (Sala2D.isSelected()) {
                    setEnableHorarios(true);
                    sala = "sala2D";
                } else if (Sala3D.isSelected()) {
                    setEnableHorarios(false, true, true, true, false);
                    sala = "sala3D";
                } else {
                    setEnableHorarios(false, false, true, true, false);
                    sala = "salaXD";
                }
            }
        };
        Sala2D.addChangeListener(changeListener);
        Sala3D.addChangeListener(changeListener);
        SalaXD.addChangeListener(changeListener);
        ChangeListener changeListenerHorario = new ChangeListener() {
            public void stateChanged(ChangeEvent changEvent) {
                horario = changEvent.getSource().toString();
            }
        };
        horario1.addChangeListener(changeListenerHorario);
        horario2.addChangeListener(changeListenerHorario);
        horario3.addChangeListener(changeListenerHorario);
        horario4.addChangeListener(changeListenerHorario);
        horario5.addChangeListener(changeListenerHorario);
        //ItemListener
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {
                int state = itemEvent.getStateChange();
                System.out.println((state == ItemEvent.SELECTED) ? "Selected" : "Deselected");
                System.out.println("Item: " + itemEvent.getItem());
                ItemSelectable is = itemEvent.getItemSelectable();
                selectMovie = "Item: " + itemEvent.getItem();
            }
        };
        cbxPelicula.addItemListener(itemListener);
    }
    
    private void setEnableHorarios(boolean enable) {
        horario1.setEnabled(enable);
        horario2.setEnabled(enable);
        horario3.setEnabled(enable);
        horario4.setEnabled(enable);
        horario5.setEnabled(enable);
    }
    
    private void setEnableHorarios(boolean enable1, boolean enable2, boolean enable3, boolean enable4, boolean enable5) {
        horario1.setEnabled(enable1);
        horario2.setEnabled(enable2);
        horario3.setEnabled(enable3);
        horario4.setEnabled(enable4);
        horario5.setEnabled(enable5);
    }
    
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Palomitas.png"));
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtClienteCC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxPelicula = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroEntradas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        horario1 = new javax.swing.JRadioButton();
        horario4 = new javax.swing.JRadioButton();
        horario3 = new javax.swing.JRadioButton();
        horario5 = new javax.swing.JRadioButton();
        horario2 = new javax.swing.JRadioButton();
        Sala2D = new javax.swing.JRadioButton();
        Sala3D = new javax.swing.JRadioButton();
        SalaXD = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        PagoEfectivo = new javax.swing.JRadioButton();
        PagoTargeta = new javax.swing.JRadioButton();
        btnVenta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CINEPOLI GRANCOLOMBIANO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 550, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CineP.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 680, 280));

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inicie su Reservacion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 270, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 140, 20));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Completo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cedula:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, 30));

        txtCliente.setBackground(new java.awt.Color(102, 0, 0));
        txtCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 260, 30));

        txtClienteCC.setBackground(new java.awt.Color(102, 0, 0));
        txtClienteCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtClienteCC.setForeground(new java.awt.Color(255, 255, 255));
        txtClienteCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCCActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 260, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Peliculas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, 30));

        cbxPelicula.setBackground(new java.awt.Color(102, 0, 0));
        cbxPelicula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxPelicula.setForeground(new java.awt.Color(255, 255, 255));
        cbxPelicula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jhon Wick 3 ", "Toy story 4", "IT (ESO) 2" }));
        cbxPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 250, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1020, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("N° de Entradas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 477, -1, 30));

        txtNumeroEntradas.setBackground(new java.awt.Color(102, 0, 0));
        txtNumeroEntradas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNumeroEntradas.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroEntradasActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Horario:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 70, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sala:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 40, 30));

        horario1.setBackground(new java.awt.Color(102, 0, 0));
        horario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        horario1.setForeground(new java.awt.Color(255, 255, 255));
        horario1.setText("11:00 am");
        horario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario1ActionPerformed(evt);
            }
        });
        getContentPane().add(horario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 110, 30));

        horario4.setBackground(new java.awt.Color(102, 0, 0));
        horario4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        horario4.setForeground(new java.awt.Color(255, 255, 255));
        horario4.setText("6:00 pm");
        horario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario4ActionPerformed(evt);
            }
        });
        getContentPane().add(horario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, 110, 30));

        horario3.setBackground(new java.awt.Color(102, 0, 0));
        horario3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        horario3.setForeground(new java.awt.Color(255, 255, 255));
        horario3.setText("3:30 pm");
        horario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario3ActionPerformed(evt);
            }
        });
        getContentPane().add(horario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 110, 30));

        horario5.setBackground(new java.awt.Color(102, 0, 0));
        horario5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        horario5.setForeground(new java.awt.Color(255, 255, 255));
        horario5.setText("9:00 pm");
        horario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario5ActionPerformed(evt);
            }
        });
        getContentPane().add(horario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 120, 30));

        horario2.setBackground(new java.awt.Color(102, 0, 0));
        horario2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        horario2.setForeground(new java.awt.Color(255, 255, 255));
        horario2.setText("1:00 pm ");
        horario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario2ActionPerformed(evt);
            }
        });
        getContentPane().add(horario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 110, 30));

        Sala2D.setBackground(new java.awt.Color(102, 0, 0));
        Sala2D.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sala2D.setForeground(new java.awt.Color(255, 255, 255));
        Sala2D.setText("Sala 2D");
        Sala2D.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sala2DStateChanged(evt);
            }
        });
        Sala2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sala2DActionPerformed(evt);
            }
        });
        getContentPane().add(Sala2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, 30));

        Sala3D.setBackground(new java.awt.Color(102, 0, 0));
        Sala3D.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sala3D.setForeground(new java.awt.Color(255, 255, 255));
        Sala3D.setText("Sala 3D");
        getContentPane().add(Sala3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, 30));

        SalaXD.setBackground(new java.awt.Color(102, 0, 0));
        SalaXD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SalaXD.setForeground(new java.awt.Color(255, 255, 255));
        SalaXD.setText("Sala xD");
        getContentPane().add(SalaXD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, 80, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 1020, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Forma de Pago");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, 110, 30));

        PagoEfectivo.setBackground(new java.awt.Color(102, 0, 0));
        PagoEfectivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PagoEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        PagoEfectivo.setText("Efectivo");
        getContentPane().add(PagoEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 760, -1, 30));

        PagoTargeta.setBackground(new java.awt.Color(102, 0, 0));
        PagoTargeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PagoTargeta.setForeground(new java.awt.Color(255, 255, 255));
        PagoTargeta.setText("Tarjeta");
        PagoTargeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoTargetaActionPerformed(evt);
            }
        });
        getContentPane().add(PagoTargeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 760, -1, 30));

        btnVenta.setBackground(new java.awt.Color(204, 0, 0));
        btnVenta.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setText("Registrar Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 790, 160, 30));

        jButton2.setText("Seleccionar asiento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, -1, -1));

        jLabel10.setText("Su asiento es:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, -1, -1));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, -1, -1));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N
        getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        IniciarSesion is = new IniciarSesion();
        
        is.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtClienteCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCCActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtNumeroEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroEntradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroEntradasActionPerformed

    private void horario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario4ActionPerformed

    private void horario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario1ActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:

        Recibo  r = new Recibo();
        r.setVisible(true);
        dispose();
        
        //Enviar datos de nombre y cc a la ventana recibo
        Recibo.txtCliente.setText(txtCliente.getText());
        Recibo.txtCedula.setText(txtClienteCC.getText());
        Recibo.txtPelicula.setText(selectMovie);
        Recibo.txtHorario.setText(horario);
        Recibo.txtSala.setText(sala);
        
        //Eviar datos de cantidad de entradas a la ventana recibo
        Recibo.txtEntrada.setText(txtNumeroEntradas.getText());
    }//GEN-LAST:event_btnVentaActionPerformed

    private void PagoTargetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoTargetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagoTargetaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        LocalTime time = LocalTime.now();
        System.out.println("Current time of the day: " + time.getHour());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPeliculaActionPerformed

    private void horario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario2ActionPerformed

    private void horario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario3ActionPerformed

    private void horario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario5ActionPerformed

    private void Sala2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sala2DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sala2DActionPerformed

    private void Sala2DStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sala2DStateChanged
        // TODO add your handling code here:
        if (Sala2D.isSelected()) {
            
        }
    }//GEN-LAST:event_Sala2DStateChanged

    
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
            java.util.logging.Logger.getLogger(ReservaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo2;
    private javax.swing.JRadioButton PagoEfectivo;
    private javax.swing.JRadioButton PagoTargeta;
    private javax.swing.JRadioButton Sala2D;
    private javax.swing.JRadioButton Sala3D;
    private javax.swing.JRadioButton SalaXD;
    private javax.swing.JButton btnVenta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cbxPelicula;
    private javax.swing.JRadioButton horario1;
    private javax.swing.JRadioButton horario2;
    private javax.swing.JRadioButton horario3;
    private javax.swing.JRadioButton horario4;
    private javax.swing.JRadioButton horario5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtClienteCC;
    private javax.swing.JTextField txtNumeroEntradas;
    // End of variables declaration//GEN-END:variables
}
