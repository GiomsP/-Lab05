package guia.pkg5;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Interfaz extends javax.swing.JFrame {

    private ArrayList Lista_nombres = new ArrayList();
    ArrayList Lista_notas = new ArrayList();
    DefaultTableModel modeloT1 = new DefaultTableModel(); 
    DefaultTableModel modeloT2 = new DefaultTableModel(); 
    Integer aprobados;
    Integer reprobados;
    public Interfaz() {
    
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HISTORICO = new javax.swing.JFrame();
        jTextField2 = new javax.swing.JTextField();
        Historico_Error = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jOptionPane2 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TexCantidad = new javax.swing.JTextField();
        TexNotas = new javax.swing.JTextField();
        Boton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Boton_historico = new javax.swing.JButton();
        Ingreso_historico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EspacioGraficos = new javax.swing.JLabel();

        jTextField2.setText("HOLIWIS");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HISTORICOLayout = new javax.swing.GroupLayout(HISTORICO.getContentPane());
        HISTORICO.getContentPane().setLayout(HISTORICOLayout);
        HISTORICOLayout.setHorizontalGroup(
            HISTORICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISTORICOLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        HISTORICOLayout.setVerticalGroup(
            HISTORICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HISTORICOLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("El nombre ingresado no se encuentra registrado...");

        javax.swing.GroupLayout Historico_ErrorLayout = new javax.swing.GroupLayout(Historico_Error.getContentPane());
        Historico_Error.getContentPane().setLayout(Historico_ErrorLayout);
        Historico_ErrorLayout.setHorizontalGroup(
            Historico_ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        Historico_ErrorLayout.setVerticalGroup(
            Historico_ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(modeloT1);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(modeloT2);
        jScrollPane2.setViewportView(jTable2);

        TexCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexCantidadActionPerformed(evt);
            }
        });

        Boton1.setText("Crear Tabla");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular Finales");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Boton_historico.setText("Historico");
        Boton_historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_historicoActionPerformed(evt);
            }
        });

        Ingreso_historico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ingreso_historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingreso_historicoActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de estudiantes");

        jLabel3.setText("  Cantidad de notas por estudiantes ");

        jLabel4.setText("Nombre Estudiante");

        EspacioGraficos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(139, 139, 139)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TexNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TexCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(140, 140, 140)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel4)
                                    .addGap(65, 65, 65)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Boton_historico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ingreso_historico, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGap(58, 58, 58)
                .addComponent(EspacioGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_historico)
                            .addComponent(Ingreso_historico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EspacioGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        int a= Integer.parseInt(TexCantidad.getText());
        int b= Integer.parseInt(TexNotas.getText());
        modeloT1.setColumnCount(1+b);//numero de columnas
        modeloT1.setRowCount(a);
        ArrayList<Object> colum_notas = new ArrayList<>();
        colum_notas.add("Nombre");
        for (int i = 0; i < b; i++) {
            colum_notas.add("Nota " + (i + 1));
        }
        Object[] Obj_colum_notas = colum_notas.toArray();
        modeloT1.setColumnIdentifiers(Obj_colum_notas);
    }//GEN-LAST:event_Boton1ActionPerformed

    private void TexCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexCantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        aprobados = 0;
        reprobados = 0;
        
        int a= Integer.parseInt(TexCantidad.getText());
        int b= Integer.parseInt(TexNotas.getText());
        modeloT2.setColumnCount(3);//numero de columnas
        modeloT2.setRowCount(a);
        modeloT2.setColumnIdentifiers(new Object[]{"Nombre", "Definitiva","Resultado"});
//        ArrayList Lista_nombres = new ArrayList();
        
        for (int i = 0; i < a; i++) {
            float sum_not =0;
            Lista_nombres.add(modeloT1.getValueAt(i,0));
            for (int j = 0; j < b; j++) {
                Lista_notas.add(modeloT1.getValueAt(i, j + 1));
                float nota = Float.parseFloat(modeloT1.getValueAt(i, j + 1).toString());
                sum_not += nota;
            }
            float promedio =sum_not /b;
            if (promedio<3) {
                modeloT2.setValueAt("Reprobo", i, 2);
                reprobados++;
            }else{
                modeloT2.setValueAt("Aprobo", i, 2);
                aprobados++;
            }
            modeloT2.setValueAt(promedio, i, 1);
        }
        for (int i = 0; i < a; i++) {
            modeloT2.setValueAt(Lista_nombres.get(i), i, 0);
        }
        System.out.println(Lista_nombres);
        System.out.println(Lista_notas);
        
        DefaultPieDataset GraficoNotas = new DefaultPieDataset();
        GraficoNotas.setValue("Aprobo", new Integer(aprobados));
        GraficoNotas.setValue("Reprobo", new Integer(reprobados));
        float PorcentajeAprobados = (aprobados*100)/(aprobados + reprobados);
        float PorcentajeReprobados = (reprobados*100)/(aprobados + reprobados);
        
        JFreeChart PieData = ChartFactory.createPieChart(
                "Aprobo: " + PorcentajeAprobados + "% Reprobo: " + PorcentajeReprobados + "%",
                GraficoNotas,
                true,
                true,
                false
        );
        System.out.println(EspacioGraficos.getWidth());
        System.out.println(EspacioGraficos.getHeight());
        
        try {
            ChartUtilities.saveChartAsJPEG(new File("PieGraphic.jpg"), PieData, EspacioGraficos.getWidth(), 
                    EspacioGraficos.getHeight());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al crear de la taza de mortalidad");
        }
        
        ImageIcon imagen = new ImageIcon("PieGraphic.jpg");
        /*imagen.getImage().getScaledInstance(
            EspacioGraficos.getWidth(),
            EspacioGraficos.getHeight(),
            Image.SCALE_DEFAULT
        );
        */
        imagen.getImage().flush();
        EspacioGraficos.setIcon(imagen);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Boton_historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_historicoActionPerformed
        String Com_histo = Ingreso_historico.getText();
        boolean encontrado = false;
        int a = -1;
        int b = -1;
        //Encontrar el estudiante
        for(Object elemento : Lista_nombres){
            a++;
            b++;
            if(elemento.equals(Com_histo)){
                encontrado= true;
                break;
            }
        }
        //Condicional para que maneja los casos de que el estudiante exista o no
        if (encontrado) {
            XYSeries Historico = new XYSeries("Grafico del estudiante");
            
            float NotaAux;
            
            for(int k = 0; k < Integer.parseInt(TexNotas.getText()); k++){
                Lista_notas.add(modeloT1.getValueAt(a, k + 1));
                NotaAux = Float.parseFloat(modeloT1.getValueAt(a, k + 1).toString());
                Historico.add(k + 1, NotaAux);
            }
            
            //Generar el grafico
            XYSeriesCollection SerieDatos = new XYSeriesCollection();
            SerieDatos.addSeries(Historico);
            
            JFreeChart HistoricoEstu = ChartFactory.createXYLineChart(
                (Lista_nombres.get(b)).toString(),
                "Numero de notas",
                "Nota",
                SerieDatos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
                
            );
            
            try {
            ChartUtilities.saveChartAsJPEG(new File("SerieGraphic.jpg"), HistoricoEstu, EspacioGraficos.getWidth(), 
                    EspacioGraficos.getHeight());
            } catch (Exception e) {
            System.out.println("Ha ocurrido un error al crear la imagen del historico del estudiante");
            }
        
            ImageIcon imagen2 = new ImageIcon("SerieGraphic.jpg");
            imagen2.getImage().flush();
            EspacioGraficos.setIcon(imagen2);
            //HISTORICO.setVisible(true);
            
        } else {
            //Historico_Error.setVisible(true);
            JOptionPane.showMessageDialog(null, "Estudiante no se encuentra en la base de datos o no hay existencia de él en la base de datos.", 
            "Historico del estudiante", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_Boton_historicoActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Ingreso_historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingreso_historicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingreso_historicoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton_historico;
    private javax.swing.JLabel EspacioGraficos;
    private javax.swing.JFrame HISTORICO;
    private javax.swing.JDialog Historico_Error;
    private javax.swing.JTextField Ingreso_historico;
    private javax.swing.JTextField TexCantidad;
    private javax.swing.JTextField TexNotas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}