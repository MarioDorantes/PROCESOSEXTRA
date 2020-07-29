/*MARIO DORANTES
**13/07/2020
*/

package GUIS;

import DataAccess.CursoDAO;
import DataAccess.PlanDeCursoDAO;
import Dominio.Curso;
import Dominio.PlanDeCurso;
import LogicaDeNegocio.ValidacionesCurso;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegistrarPlanDeCurso extends javax.swing.JFrame {

    String curso1; 
    PlanDeCurso planDeCurso;
    PlanDeCursoDAO planDeCursoDAO;
    
    public RegistrarPlanDeCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Plan de Curso");
        try {
            leerCursos();
        } catch (SQLException | ClassNotFoundException sqlException) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a la base de datos en este momento. Intente más tarde.");
            sqlException.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNombreDeActividades = new javax.swing.JTextArea();
        jButtonCancelar = new javax.swing.JButton();
        jButtonRegistrarPlan = new javax.swing.JButton();
        jScrollPaneFechasParaTemas = new javax.swing.JScrollPane();
        jTextAreaFechaTemas = new javax.swing.JTextArea();
        jLabelFechaTemas = new javax.swing.JLabel();
        jLabelNombreDeActividades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTemas = new javax.swing.JTextArea();
        jLabelFechaFin = new javax.swing.JLabel();
        jLabelSeccionesRegistroPlanDeCurso = new javax.swing.JLabel();
        jLabelTemas = new javax.swing.JLabel();
        jTextFieldFechaFin = new javax.swing.JTextField();
        jLabelFechaInicio = new javax.swing.JLabel();
        jTextFieldFechaInicio = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaNombreDeActividades.setColumns(20);
        jTextAreaNombreDeActividades.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNombreDeActividades);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 320, 130));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 130, 40));

        jButtonRegistrarPlan.setBackground(new java.awt.Color(153, 255, 153));
        jButtonRegistrarPlan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrarPlan.setText("Registrar Plan");
        jButtonRegistrarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarPlanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 40));

        jTextAreaFechaTemas.setColumns(20);
        jTextAreaFechaTemas.setRows(5);
        jScrollPaneFechasParaTemas.setViewportView(jTextAreaFechaTemas);

        getContentPane().add(jScrollPaneFechasParaTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 240, 120));

        jLabelFechaTemas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFechaTemas.setText("Fechas para temas: ");
        getContentPane().add(jLabelFechaTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabelNombreDeActividades.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombreDeActividades.setText("Nombre de actividades: ");
        getContentPane().add(jLabelNombreDeActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jTextAreaTemas.setColumns(20);
        jTextAreaTemas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTemas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 320, 120));

        jLabelFechaFin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFechaFin.setText("Fecha Fin:");
        getContentPane().add(jLabelFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabelSeccionesRegistroPlanDeCurso.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSeccionesRegistroPlanDeCurso.setText(" Registro Plan de Curso");
        getContentPane().add(jLabelSeccionesRegistroPlanDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabelTemas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTemas.setText("Temas del curso: ");
        getContentPane().add(jLabelTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));
        getContentPane().add(jTextFieldFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, 30));

        jLabelFechaInicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFechaInicio.setText("Fecha Inicio:");
        getContentPane().add(jLabelFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        getContentPane().add(jTextFieldFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        int opcionSeleccionada = JOptionPane.showOptionDialog(this,"¿Seguro desea cancelar?", "Cancelar",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, botonesCancelar, botonesCancelar[0] );

        if (opcionSeleccionada == 0) {
            regresarPrincipalProfesor();
        }

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonRegistrarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarPlanActionPerformed
        validarCampos();
        planDeCursoDAO = new PlanDeCursoDAO();
        try {
            planDeCursoDAO.guardarPlanDeCurso(planDeCurso);
        } catch (SQLException | ClassNotFoundException sqlException) {
            JOptionPane.showMessageDialog(this, "No es posible acceder a la base de datos en este momento.");
            Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(Level.SEVERE, null, sqlException);
        } 
        JOptionPane.showMessageDialog(this, "¡Se registró el Plan de Curso correctamente!");
        regresarPrincipalProfesor();
    }//GEN-LAST:event_jButtonRegistrarPlanActionPerformed
    
    String [] botonesCancelar = {"Si", "No"};
        
    void regresarPrincipalProfesor(){
        VentanaPrincipalProfesor regresarAProfesor = new VentanaPrincipalProfesor();
        regresarAProfesor.setVisible(true);
        dispose();
    }
    
    void leerCursos() throws SQLException, ClassNotFoundException {
       
        int i = 0;
        CursoDAO cursoDAO = new CursoDAO();
        String[] stringNombreDeCursos = null;
        ArrayList<Curso> todosLosCursos = cursoDAO.leerTodosLosCursos();
        List<String> nombreDeCursos = new ArrayList<>();
        while (i < todosLosCursos.size()) {
           nombreDeCursos.add(todosLosCursos.get(i).getNombre());
           i++;
        }
        stringNombreDeCursos = nombreDeCursos.toArray(new String[nombreDeCursos.size()]);
        JComboBox jComboBoxListaDeCursos = new JComboBox(stringNombreDeCursos);
        jComboBoxListaDeCursos.setEditable(true);
        JOptionPane.showMessageDialog(null, jComboBoxListaDeCursos, "Registrar Plan de Curso", JOptionPane.QUESTION_MESSAGE);
        curso1 = (String) jComboBoxListaDeCursos.getSelectedItem();
        
    }
    
    void llenarPlanDeCurso() {
       
       String fechaInicio = jTextFieldFechaInicio.getText();
       String fechaFin = jTextFieldFechaFin.getText();
       String temas = jTextAreaTemas.getText();
       String fechaTemas = jTextAreaFechaTemas.getText();
       String nombreActividades = jTextAreaNombreDeActividades.getText();
       planDeCurso = new PlanDeCurso(curso1, fechaInicio, fechaFin, temas, fechaTemas, nombreActividades);
    }
    
    String fechaInicio = "";
    String fechaFin = "";
    
    void validarCampos(){
        if(jTextFieldFechaInicio.getText(). isEmpty() || jTextFieldFechaFin.getText() . isEmpty() 
                || jTextAreaTemas.getText() .isEmpty() || jTextAreaFechaTemas.getText() . isEmpty() 
                    || jTextAreaNombreDeActividades.getText() .isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Favor de no dejar campos vacíos");
            
        } else {
            fechaInicio = jTextFieldFechaInicio.getText();
            fechaFin = jTextFieldFechaFin.getText();
            
            ValidacionesCurso validacionCurso = new ValidacionesCurso();
            
            if((validacionCurso.validarFecha(fechaInicio) && (validacionCurso.validarFecha(fechaFin)))){
                llenarPlanDeCurso();
            } else if (!validacionCurso.validarFecha(fechaInicio)){
                JOptionPane.showMessageDialog(this, "Verificar la fecha de inicio");
            } else if (!validacionCurso.validarFecha(fechaFin)) {
                JOptionPane.showMessageDialog(this, "Verificar la fecha de fin");
            }
            
        }
    }
   
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPlanDeCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrarPlan;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelFechaFin;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelFechaTemas;
    private javax.swing.JLabel jLabelNombreDeActividades;
    private javax.swing.JLabel jLabelSeccionesRegistroPlanDeCurso;
    private javax.swing.JLabel jLabelTemas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneFechasParaTemas;
    private javax.swing.JTextArea jTextAreaFechaTemas;
    private javax.swing.JTextArea jTextAreaNombreDeActividades;
    private javax.swing.JTextArea jTextAreaTemas;
    private javax.swing.JTextField jTextFieldFechaFin;
    private javax.swing.JTextField jTextFieldFechaInicio;
    // End of variables declaration//GEN-END:variables
}
