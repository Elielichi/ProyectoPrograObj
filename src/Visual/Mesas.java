/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import Controlador.ControladorElecciones;
import Controlador.ControladorMesas;
import Controlador.ControladorMiembros;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoprograobj.Eleccion;
import proyectoprograobj.MesaElectoral;
import proyectoprograobj.MiembroMesa;

/**
 *
 * @author Usuario
 */

public class Mesas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Mesas.class.getName());

    /**
     * Creates new form Mesas
     */
    private ControladorMesas controlador;
    private ControladorMiembros controladorMiembro;
    private ControladorElecciones controladorEleccion;
    private DefaultComboBoxModel<String> modeloComboPresidentes;
    private DefaultComboBoxModel<String> modeloComboSecretarios;
    private DefaultComboBoxModel<String> modeloComboVocales;
    private DefaultComboBoxModel<String> modeloComboElecciones;
    public Mesas() {
        initComponents();
        controladorMiembro = new ControladorMiembros();
        controlador = new ControladorMesas();
        controladorEleccion = new ControladorElecciones();
        llenarComboPresidentes();
        llenarComboSecretarios();
        llenarComboVocales();
        llenarComboElecciones();
        inicializarTabla();
    }
    
    public Mesas(ControladorMesas controlador) {
        initComponents();
        this.controlador = controlador;
        llenarComboPresidentes();
        llenarComboSecretarios();
        llenarComboVocales();
        llenarComboElecciones();
        inicializarTabla();
    }
    
    public Mesas(ControladorMesas controlador, ControladorMiembros controladorMiembro, ControladorElecciones controladorEleccion){
        initComponents();
        this.controlador = controlador;
        this.controladorMiembro = controladorMiembro;
        this.controladorEleccion = controladorEleccion;
        llenarComboPresidentes();
        llenarComboSecretarios();
        llenarComboVocales();
        llenarComboElecciones();
        inicializarTabla();
    }
    
    public void limpiar(){
        this.txtId.setText("");        
        this.cbxPresidente.setSelectedIndex(0);
        this.cbxSecretario.setSelectedIndex(0);
        this.cbxVocal.setSelectedIndex(0);
        this.cbxEleccion.setSelectedIndex(0);
    }
    
    private void llenarComboPresidentes(){
        modeloComboPresidentes = new DefaultComboBoxModel<>();
        this.cbxPresidente.setModel(modeloComboPresidentes);
        LinkedList<MiembroMesa> lista = controladorMiembro.getListaMiembros();
        for (MiembroMesa miembro : lista) {
            if (miembro.getRol().equals("Presidente")) {
                modeloComboPresidentes.addElement(miembro.getNombre());
            }
        }
    }
    
    private void llenarComboSecretarios(){
        modeloComboSecretarios = new DefaultComboBoxModel<>();
        this.cbxSecretario.setModel(modeloComboSecretarios);
        LinkedList<MiembroMesa> lista = controladorMiembro.getListaMiembros();
        for (MiembroMesa miembro : lista) {
            if (miembro.getRol().equals("Secretario")) {
                modeloComboSecretarios.addElement(miembro.getNombre());
            }
        }
    }
    
    private void llenarComboVocales(){
        modeloComboVocales = new DefaultComboBoxModel<>();
        this.cbxVocal.setModel(modeloComboVocales);
        LinkedList<MiembroMesa> lista = controladorMiembro.getListaMiembros();
        for (MiembroMesa miembro : lista) {
            if (miembro.getRol().equals("Vocal")) {
                modeloComboVocales.addElement(miembro.getNombre());
            }
        }
    }
    
    private void llenarComboElecciones(){
        modeloComboElecciones = new DefaultComboBoxModel<>();
        this.cbxEleccion.setModel(modeloComboElecciones);
        LinkedList<Eleccion> lista = controladorEleccion.getListaElecciones();
        for (Eleccion eleccion : lista) {
            modeloComboElecciones.addElement(eleccion.getNombre());
        }
    }
    
    DefaultTableModel modeloTabla;
    public void inicializarTabla(){
        modeloTabla = new DefaultTableModel();
        this.tblMesas.setModel(modeloTabla);
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Presidente");
        modeloTabla.addColumn("Secretario");
        modeloTabla.addColumn("Vocal");
        modeloTabla.addColumn("Eleccion");
    }
    
    private boolean validarDatos(){
        if(this.txtId.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    private void mostrarMesasTabla(){
        inicializarTabla();
        LinkedList<MesaElectoral> listaCandidatos = this.controlador.getListaMesas();
        for(MesaElectoral mesa: listaCandidatos){
            String [] fila = new String[5];
            fila[0] = mesa.getIdMesa();
            fila[1] = mesa.getPresidente().getNombre();
            fila[2] = mesa.getSecretario().getNombre();
            fila[3] = mesa.getVocal().getNombre();
            fila[4] = mesa.getEleccion().getNombre();
            
            this.modeloTabla.addRow(fila);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxPresidente = new javax.swing.JComboBox<>();
        cbxSecretario = new javax.swing.JComboBox<>();
        cbxVocal = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxEleccion = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMesas = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de mesa electoral");

        jLabel2.setText("idMesa:");

        jLabel3.setText("Presidente:");

        jLabel4.setText("Secretario:");

        jLabel5.setText("Vocal:");

        cbxPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPresidenteActionPerformed(evt);
            }
        });

        jLabel6.setText("Eleccion:");

        cbxEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEleccionActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMesas);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxSecretario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxVocal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxEleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(35, 35, 35)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxPresidente, 0, 98, Short.MAX_VALUE)
                                    .addComponent(txtId))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbxPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPresidenteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(validarDatos()){
            String id = this.txtId.getText();
            String presidente = this.cbxPresidente.getSelectedItem().toString();
            String secretario = this.cbxSecretario.getSelectedItem().toString();
            String vocal = this.cbxVocal.getSelectedItem().toString();
            String eleccion = this.cbxEleccion.getSelectedItem().toString();
            MiembroMesa miembro1 = controladorMiembro.buscarMiembroPorNombre(presidente);
            MiembroMesa miembro2 = controladorMiembro.buscarMiembroPorNombre(secretario);
            MiembroMesa miembro3 = controladorMiembro.buscarMiembroPorNombre(vocal);
            Eleccion eleccion1 = controladorEleccion.buscarEleccionPorNombre(eleccion);
            
            MesaElectoral mesa = new MesaElectoral(id,miembro1,miembro2,miembro3,eleccion1);
            boolean resultado = this.controlador.agregarMesa(mesa);
            if(resultado){
                JOptionPane.showMessageDialog(this, "Se registro correctamente la informacion", "", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error en el proceso de registro.", "", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar todos los valores.", "", JOptionPane.ERROR_MESSAGE);
        }
        this.limpiar();  
        this.mostrarMesasTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String idMesa = this.txtId.getText();
        if(idMesa.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar el ID de la mesa para eliminarla.", "", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean resultado = this.controlador.eliminarMesa(idMesa);
            if(resultado){
                JOptionPane.showMessageDialog(this, "Se elimino correctamente la informacion", "", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Hubo un error en el proceso de eliminacion.", "", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.limpiar();
        this.mostrarMesasTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cbxEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEleccionActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Mesas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxEleccion;
    private javax.swing.JComboBox<String> cbxPresidente;
    private javax.swing.JComboBox<String> cbxSecretario;
    private javax.swing.JComboBox<String> cbxVocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMesas;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
