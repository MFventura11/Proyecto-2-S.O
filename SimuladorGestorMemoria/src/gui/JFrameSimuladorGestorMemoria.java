package gui;

import entidades.Background;
import entidades.GestorMemoria;
import entidades.Proceso;
import entidades.Tabla;
import javax.swing.JOptionPane;
import simuladorgestormemoria.main;

public class JFrameSimuladorGestorMemoria extends javax.swing.JFrame {

    // Ventana -> creador de procesos
    private static final JFrameCrearProceso CREAR_PROCESO = new JFrameCrearProceso();;
    
    // Modeladores de Tablas
    private static final Tabla TABLA_PROCESO = new Tabla();
    private static final Tabla TABLA_MEMORIA = new Tabla();
    
    // Encabezados de tablas
    private final String[] encabezado_tabla_proceso = {"Nom. Proceso","PID","Estado","Memoria (KB)"};
    private final String[] encabezado_tabla_memoria = {"Memoria (KB)","En uso (KB)","Disponible (KB)","Proceso"};

    public JFrameSimuladorGestorMemoria() {
        // Antes de inicializar los componentes se instancia un nuevo jpanel de fondo con color
        this.setContentPane(new Background());
        // Se inicializan los componentes (GUI) de la ventana  
        initComponents();
        // Se posiciona la ventana al centro del escritorio de windows
        this.setLocationRelativeTo(null);
        // Se inicializan las tablas, principalmente el encabezado y posteriormente, las filas al momento de crear cada proceso. 
        this.InicializarTabla();
    }

    /***
     * Inicializa los valores por defecto de las tablas
     */
    private void InicializarTabla() {
        // Setter del modelo de las tablas
        this.JTableProceso.setModel(TABLA_PROCESO);
        this.JTableMemoria.setModel(TABLA_MEMORIA);
        
        // Inserción de columnas
        TABLA_PROCESO.agregarColumnas(this.encabezado_tabla_proceso);
        TABLA_MEMORIA.agregarColumnas(this.encabezado_tabla_memoria);
    }
    
    /***
     * Vacía la tabla proceso para rellenarla con los valores del procesos en cola 
     */
    public void actualizarTabla_Proceso() {
        TABLA_PROCESO.limpiarTabla();
        for (Proceso proceso : main.COLA_PROCESOS) {
            TABLA_PROCESO.agregarFila(proceso.getDatos());
        }
    }
    
    /***
     * Vacía la tabla memoria para rellenarla con los valores del procesos en cola 
     * más los valores de la memoria
     */
    public void actualizarTabla_memoria() {
        TABLA_MEMORIA.limpiarTabla();
        for (Proceso p : main.COLA_PROCESOS) {
            Object[] datos = new Object[] {
                GestorMemoria.MEMORIA.getCapacidad(),
                p.getMemoria(),
                GestorMemoria.MEMORIA.getDisponible(),
                p.getNombre()
            };
            TABLA_MEMORIA.agregarFila(datos);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProceso = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableMemoria = new javax.swing.JTable();
        JButtonCrearProceso = new javax.swing.JButton();
        JButtonLimpiarTablas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador Gestor de Memoria");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Procesos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Asignación de Memoria");

        JTableProceso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableProceso.setSelectionBackground(new java.awt.Color(204, 153, 255));
        JTableProceso.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(JTableProceso);

        JTableMemoria.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableMemoria.setSelectionBackground(new java.awt.Color(204, 255, 255));
        jScrollPane2.setViewportView(JTableMemoria);

        JButtonCrearProceso.setBackground(new java.awt.Color(102, 0, 102));
        JButtonCrearProceso.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        JButtonCrearProceso.setForeground(new java.awt.Color(255, 255, 255));
        JButtonCrearProceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        JButtonCrearProceso.setText("Crear");
        JButtonCrearProceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonCrearProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCrearProcesoActionPerformed(evt);
            }
        });

        JButtonLimpiarTablas.setBackground(new java.awt.Color(51, 0, 102));
        JButtonLimpiarTablas.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        JButtonLimpiarTablas.setForeground(new java.awt.Color(255, 255, 255));
        JButtonLimpiarTablas.setText("Limpiar Tablas");
        JButtonLimpiarTablas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonLimpiarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLimpiarTablasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonCrearProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonLimpiarTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JButtonLimpiarTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonCrearProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /***
     * Permite visualizar la ventana CREAR PROCESO.
     * @param evt {Class.event}
     */
    private void JButtonCrearProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCrearProcesoActionPerformed
        CREAR_PROCESO.setVisible(true);
    }//GEN-LAST:event_JButtonCrearProcesoActionPerformed

    /***
     * Permite limpiar las tablas.
     * @param evt {Class.event
     */
    private void JButtonLimpiarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLimpiarTablasActionPerformed
        // Si, la cola de procesos es mayor a 0 y 
        // Si, el creador de procesos mediante el método ValidarColaProcesos() es igual a 0
        // Entonces, no existen procesos en espera ni asignados, es decir, todos han finalizado
        // Por ende, se puede vaciar la cola de procesos y limpiar las tablas.
        if (main.COLA_PROCESOS.size() > 0 && CREAR_PROCESO.ValidarColaProcesos() == 0) {
            TABLA_MEMORIA.limpiarTabla();
            TABLA_PROCESO.limpiarTabla();
            main.COLA_PROCESOS.clear();
            JOptionPane.showMessageDialog(this, "¡Se vaciarón las tablas!");
        } 
        // Caso contrario, no se elimina la cola de procesos, ni se vacian las tablas
        else {
            JOptionPane.showMessageDialog(this, "¡No es posible vacíar las tablas, espere a que finalice los procesos en espera y asignados!");
        }
    }//GEN-LAST:event_JButtonLimpiarTablasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCrearProceso;
    private javax.swing.JButton JButtonLimpiarTablas;
    private javax.swing.JTable JTableMemoria;
    private javax.swing.JTable JTableProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
