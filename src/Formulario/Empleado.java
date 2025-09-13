
package Formulario;

import javax.swing.JOptionPane;
import Conexion.CreateConection; //Clase Generica   
import java.sql.SQLException;

//librerias para manipular los datos

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


import javax.swing.JOptionPane;

public class Empleado extends javax.swing.JFrame {
    CreateConection conexionPostgres = new CreateConection();
    Connection con;
    
    //hola mundo

    public Empleado()throws SQLException {
        initComponents();
        con = conexionPostgres.getConection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtApellido = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblApellido = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblId.setText("Id");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblApellido.setText("Apellido");

        lblSalario.setText("Salario");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblId)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultar))
                                .addGap(43, 43, 43)
                                .addComponent(lblNombre))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(lblApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalario)
                    .addComponent(btnEliminar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getEmpleado(int id){
        try {
              // es mi sentencia
              String qry = "select id,nombre,apellido,salario from public.empleado where id = ?";
              
              PreparedStatement ps = con.prepareStatement(qry);
              ps.setInt(1,id);
              
              ResultSet rs = ps.executeQuery();
              while (rs.next()){
                  txtNombre.setText(rs.getString("nombre"));
                  txtApellido.setText(rs.getString("apellido"));
                  txtSalario.setText(rs.getString("salario"));
                  
                  
              }
              ps.close();
            }catch(SQLException e){
                e.getMessage();
            }
    }
    
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        getEmpleado(Integer.parseInt(txtId.getText()));
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    public void guardarEmpleado(){
        try {
               // Extraigo los valores que tiene en la interfaz de los JText
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String salario = txtSalario.getText();
              // espacio de trabajo que lleva la conexion para escribir sentencias sql
              Statement smt = con.createStatement();
              // es mi sentencia
              String qry = "insert into public.empleado(nombre,apellido,salario)"
                        + " values ('"+nombre+"','"+apellido+"',"+salario+")";
              int filasInsertadas = smt.executeUpdate(qry); // ejecuta la sentencia a la base de datos, la cual retorna int
              JOptionPane.showMessageDialog(null, "Total de Registros insertados "+filasInsertadas);
              smt.close();
            }catch(SQLException e){
                e.getMessage();
            }
}
    
    public void guardarEmpleadoPS(){
        try {
               // Extraigo los valores que tiene en la interfaz de los JText
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String salario = txtSalario.getText();
              
              // es mi sentencia
              String qry = "insert into public.empleado(nombre,apellido,salario)"
                        + " values (?,?,?)";
              // espacio de trabajo que lleva la conexion para escribir sentencias sql
              PreparedStatement ps = con.prepareStatement(qry);
              ps.setString(1, nombre);
              ps.setString(2, apellido);
              ps.setDouble(3, Double.parseDouble(salario));
              
              int filasInsertadas = ps.executeUpdate(); // ejecuta la sentencia a la base de datos, la cual retorna int
              JOptionPane.showMessageDialog(null, "Total de Registros insertados "+filasInsertadas);
              ps.close();
            }catch(SQLException e){
                e.getMessage();
            }
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarEmpleadoPS();    
        //guardarEmpleado();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
               // Extraigo los valores que tiene en la interfaz de los JText
              
              // es mi sentencia
              String qry = "delete from public.empleado where id = ?";
              String id = JOptionPane.showInputDialog("Ingrese id de empleado a eliminar");
              
              // espacio de trabajo que lleva la conexion para escribir sentencias sql
              PreparedStatement ps = con.prepareStatement(qry);
              ps.setInt(1,Integer.parseInt(id));
              
              int filasEliminadas = ps.executeUpdate(); // ejecuta la sentencia a la base de datos, la cual retorna int
              JOptionPane.showMessageDialog(null, "Total de Registros eliminados "+filasEliminadas);
              ps.close();
            }catch(SQLException e){
                e.getMessage();
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void actualizarEmpleado(int id){
        try {
              // es mi sentencia
              String nombre = txtNombre.getText();
              String apellido = txtApellido.getText();
              String salario = txtSalario.getText();
              
              String qry = "update nombre,apellido,salario from public.empleado where id = ?"
                      + "values (?, ?, ?)";
              PreparedStatement ps = con.prepareStatement(qry);
              ps.setString(1, nombre);
              ps.setString(2, apellido);
              ps.setDouble(3, Double.parseDouble(salario));
              
              ResultSet rs = ps.executeQuery();
              while (rs.next()){
                  txtNombre.setText(rs.getString("nombre"));
                  txtApellido.setText(rs.getString("apellido"));
                  txtSalario.setText(rs.getString("salario"));
                  
              }
              int filasActualizadas = ps.executeUpdate(); // ejecuta la sentencia a la base de datos, la cual retorna int
              JOptionPane.showMessageDialog(null, "Total de Registros actualizados "+filasActualizadas);
              ps.close();
            }catch(SQLException e){
                e.getMessage();
            }
    }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarEmpleado(Integer.parseInt(txtId.getText()));
    }//GEN-LAST:event_btnActualizarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Empleado().setVisible(true);
            } catch (SQLException ex) {
                System.getLogger(Empleado.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
