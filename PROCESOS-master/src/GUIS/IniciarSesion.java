/*BRANDON TRUJILLO
**12/07/2020
*/ 
package GUIS;
public class IniciarSesion extends javax.swing.JFrame {
    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Iniciar Sesión");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIconoUsuario = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoUsuario.png"))); // NOI18N
        getContentPane().add(jLabelIconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitulo.setText("Iniciar Sesión");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jLabelCorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCorreo.setText("Correo :");
        getContentPane().add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabelContraseña.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelContraseña.setText("Contraseña :");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jTextFieldCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 220, 30));

        jTextFieldContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 220, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Iniciar Sesión");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 370, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIconoUsuario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
