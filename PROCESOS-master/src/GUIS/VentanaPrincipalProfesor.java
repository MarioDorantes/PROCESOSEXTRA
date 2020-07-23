
package GUIS;

import javax.swing.JOptionPane;

public class VentanaPrincipalProfesor extends javax.swing.JFrame {
    public VentanaPrincipalProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana principal Profesor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonRegistrarPlanCurso = new javax.swing.JButton();
        jButtonModificarPlanDeCurso = new javax.swing.JButton();
        jButtonRegistrarAvanceCurso = new javax.swing.JButton();
        jButtonSolicitarModificaciónDePlan = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitulo.setText("Profesor");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jButtonRegistrarPlanCurso.setBackground(new java.awt.Color(153, 255, 255));
        jButtonRegistrarPlanCurso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRegistrarPlanCurso.setText("<html><center>Registrar Plan de Curso");
        jButtonRegistrarPlanCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarPlanCursoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarPlanCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 200, 70));

        jButtonModificarPlanDeCurso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonModificarPlanDeCurso.setText("<html><center>Modificar Plan de Curso");
        jButtonModificarPlanDeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarPlanDeCursoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificarPlanDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 200, 70));

        jButtonRegistrarAvanceCurso.setBackground(new java.awt.Color(153, 255, 255));
        jButtonRegistrarAvanceCurso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRegistrarAvanceCurso.setText("<html><center>Registrar Avance De Curso");
        jButtonRegistrarAvanceCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarAvanceCursoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarAvanceCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 200, 70));

        jButtonSolicitarModificaciónDePlan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonSolicitarModificaciónDePlan.setText("<html><center>Solicitar Modificación Del Plan");
        jButtonSolicitarModificaciónDePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitarModificaciónDePlanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSolicitarModificaciónDePlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 200, 70));

        jButtonCerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCerrarSesion.setText("Cerrar Sesión");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, 30));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarPlanCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarPlanCursoActionPerformed
        RegistrarPlanDeCurso irARegistrarPlanDeCurso = new RegistrarPlanDeCurso();
        irARegistrarPlanDeCurso.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistrarPlanCursoActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        IniciarSesion regresarIniciarSesion = new IniciarSesion();
        regresarIniciarSesion.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonSolicitarModificaciónDePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitarModificaciónDePlanActionPerformed
        JOptionPane.showMessageDialog(this, "Sin implementación");
    }//GEN-LAST:event_jButtonSolicitarModificaciónDePlanActionPerformed

    private void jButtonModificarPlanDeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarPlanDeCursoActionPerformed
        JOptionPane.showMessageDialog(this, "Sin implementación"); 
    }//GEN-LAST:event_jButtonModificarPlanDeCursoActionPerformed

    private void jButtonRegistrarAvanceCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarAvanceCursoActionPerformed
        RegistrarAvanceDeCurso irARegistrarAvanceDeCurso = new RegistrarAvanceDeCurso();
        irARegistrarAvanceDeCurso.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonRegistrarAvanceCursoActionPerformed

 
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonModificarPlanDeCurso;
    private javax.swing.JButton jButtonRegistrarAvanceCurso;
    private javax.swing.JButton jButtonRegistrarPlanCurso;
    private javax.swing.JButton jButtonSolicitarModificaciónDePlan;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
