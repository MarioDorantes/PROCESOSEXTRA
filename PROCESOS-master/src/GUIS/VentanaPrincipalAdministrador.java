/*BRANDON TRUJILLO
**12/07/2020
*/
package GUIS;

import DataAccess.DocenteDAO;
import Dominio.Docente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaPrincipalAdministrador extends javax.swing.JFrame {
    
    public VentanaPrincipalAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Pantalla inicial Administrador");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonRegistraDirectr = new javax.swing.JButton();
        jButtonRegistrarCoordinador = new javax.swing.JButton();
        jButtonRegistrarProfesor = new javax.swing.JButton();
        jButtonAñadirCatalogo = new javax.swing.JButton();
        jButtonActualizarCatalogo = new javax.swing.JButton();
        jButtonEliminarDirector = new javax.swing.JButton();
        jButtonEliminarCoordinador = new javax.swing.JButton();
        jButtonEliminarProfesor = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Administrador");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jButtonRegistraDirectr.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRegistraDirectr.setText("Registrar Director");
        jButtonRegistraDirectr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistraDirectrActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistraDirectr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, 60));

        jButtonRegistrarCoordinador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRegistrarCoordinador.setText("<html><center"
            + ">Registar Coordinador");
        jButtonRegistrarCoordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarCoordinadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarCoordinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 60));

        jButtonRegistrarProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRegistrarProfesor.setText("Registrar Profesor");
        jButtonRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, 60));

        jButtonAñadirCatalogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAñadirCatalogo.setText("Añadir Catálogo");
        jButtonAñadirCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirCatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadirCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 200, 60));

        jButtonActualizarCatalogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonActualizarCatalogo.setText("Actualizar Catálogo");
        jButtonActualizarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarCatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonActualizarCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 210, 60));

        jButtonEliminarDirector.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonEliminarDirector.setText("Eliminar Director");
        jButtonEliminarDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarDirectorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 210, 60));

        jButtonEliminarCoordinador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonEliminarCoordinador.setText("<html><center>Eliminar Coordinador");
        jButtonEliminarCoordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCoordinadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarCoordinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 210, 60));

        jButtonEliminarProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonEliminarProfesor.setText("Eliminar Profesor");
        jButtonEliminarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 210, 60));

        jButtonCerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCerrarSesion.setText("Cerrar Sesión");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, 30));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarProfesorActionPerformed
        obtenerTodosLosProfesores();
    }//GEN-LAST:event_jButtonRegistrarProfesorActionPerformed

    private void jButtonRegistraDirectrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistraDirectrActionPerformed
        JOptionPane.showMessageDialog(this, "Sin implementación");
    }//GEN-LAST:event_jButtonRegistraDirectrActionPerformed

    private void jButtonRegistrarCoordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarCoordinadorActionPerformed
        JOptionPane.showMessageDialog(this, "Sin implementación");
    }//GEN-LAST:event_jButtonRegistrarCoordinadorActionPerformed

    private void jButtonAñadirCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirCatalogoActionPerformed
        JOptionPane.showMessageDialog(this, "Sin implementación");
    }//GEN-LAST:event_jButtonAñadirCatalogoActionPerformed

    private void jButtonActualizarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarCatalogoActionPerformed
       JOptionPane.showMessageDialog(this, "Sin implementación");
    }//GEN-LAST:event_jButtonActualizarCatalogoActionPerformed

    private void jButtonEliminarDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarDirectorActionPerformed
        JOptionPane.showMessageDialog(this, "Sin implementación");
    }//GEN-LAST:event_jButtonEliminarDirectorActionPerformed

    private void jButtonEliminarCoordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCoordinadorActionPerformed
       JOptionPane.showMessageDialog(this, "Sin implementación");
    }//GEN-LAST:event_jButtonEliminarCoordinadorActionPerformed

    private void jButtonEliminarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarProfesorActionPerformed
        JOptionPane.showMessageDialog(this, "Sin implementación");
    }//GEN-LAST:event_jButtonEliminarProfesorActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
       IniciarSesion regresarIniciarSesion = new IniciarSesion();
       regresarIniciarSesion.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    ArrayList <Docente> todosLosDocentes = new ArrayList();
        
    public void obtenerTodosLosProfesores(){
        DocenteDAO docente = new DocenteDAO();
        try {
            todosLosDocentes = docente.leerTodosLosDocentes();
            validarPrecondiciones(todosLosDocentes);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo acceder a la base de datos, intente más tarde");
            Logger.getLogger(VentanaPrincipalAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException ex2){
            JOptionPane.showMessageDialog(this, "se esta accediendo a una posicion invalida");
            Logger.getLogger(VentanaPrincipalAdministrador.class.getName()).log(Level.SEVERE, null, ex2);
        }
    }
    void validarPrecondiciones(ArrayList<Docente> todosLosDocentes){
      int numeroMaximoDeProfesores = 2;
      if(todosLosDocentes.size() < numeroMaximoDeProfesores){
        RegistrarProfesor irARegistrarProfesor = new RegistrarProfesor();
        irARegistrarProfesor.setVisible(true);
        dispose();
      }else{
         JOptionPane.showMessageDialog(this, "Ya existen dos profesores registrados, para registrar otro"
                 + "  elimine alguno");
      }
        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarCatalogo;
    private javax.swing.JButton jButtonAñadirCatalogo;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonEliminarCoordinador;
    private javax.swing.JButton jButtonEliminarDirector;
    private javax.swing.JButton jButtonEliminarProfesor;
    private javax.swing.JButton jButtonRegistraDirectr;
    private javax.swing.JButton jButtonRegistrarCoordinador;
    private javax.swing.JButton jButtonRegistrarProfesor;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
