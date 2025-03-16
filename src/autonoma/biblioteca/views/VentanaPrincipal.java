/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.biblioteca.views;

import autonoma.biblioteca.models.Biblioteca;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author vanes
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Biblioteca biblioteca;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Biblioteca biblioteca) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/biblioteca/images/bibliotecaLibro.png")).getImage());
        }catch(Exception e){

        }
        this.biblioteca = biblioteca;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBiblioteca = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarLibro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminarLibro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnActualizarLibro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnMostrarLibros = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnMostrarLibrosAlfa = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnBuscarLibro = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(680, 470));
        setResizable(false);
        setSize(new java.awt.Dimension(680, 470));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lblBiblioteca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBiblioteca.setForeground(new java.awt.Color(0, 0, 0));
        lblBiblioteca.setText("Biblioteca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBiblioteca)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lblBiblioteca)
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/biblioteca/images/añadirLibro.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Agregar libro");

        javax.swing.GroupLayout btnAgregarLibroLayout = new javax.swing.GroupLayout(btnAgregarLibro);
        btnAgregarLibro.setLayout(btnAgregarLibroLayout);
        btnAgregarLibroLayout.setHorizontalGroup(
            btnAgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLibroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(btnAgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAgregarLibroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnAgregarLibroLayout.setVerticalGroup(
            btnAgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLibroLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnEliminarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/biblioteca/images/eliminarLibro.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Eliminar libro");

        javax.swing.GroupLayout btnEliminarLibroLayout = new javax.swing.GroupLayout(btnEliminarLibro);
        btnEliminarLibro.setLayout(btnEliminarLibroLayout);
        btnEliminarLibroLayout.setHorizontalGroup(
            btnEliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLibroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(btnEliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnEliminarLibroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnEliminarLibroLayout.setVerticalGroup(
            btnEliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLibroLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnActualizarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/biblioteca/images/actualizarLibro.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Actualizar libro");

        javax.swing.GroupLayout btnActualizarLibroLayout = new javax.swing.GroupLayout(btnActualizarLibro);
        btnActualizarLibro.setLayout(btnActualizarLibroLayout);
        btnActualizarLibroLayout.setHorizontalGroup(
            btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnActualizarLibroLayout.setVerticalGroup(
            btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnMostrarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/biblioteca/images/mostrarLibros.png"))); // NOI18N

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Mostrar libros");

        javax.swing.GroupLayout btnMostrarLibrosLayout = new javax.swing.GroupLayout(btnMostrarLibros);
        btnMostrarLibros.setLayout(btnMostrarLibrosLayout);
        btnMostrarLibrosLayout.setHorizontalGroup(
            btnMostrarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLibrosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(btnMostrarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnMostrarLibrosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12))
                    .addComponent(jLabel11))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnMostrarLibrosLayout.setVerticalGroup(
            btnMostrarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLibrosLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        btnMostrarLibrosAlfa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosAlfaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosAlfaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosAlfaMouseExited(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/biblioteca/images/mostrarLibrosAlfa.png"))); // NOI18N

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Libros Alfabeticamente");

        javax.swing.GroupLayout btnMostrarLibrosAlfaLayout = new javax.swing.GroupLayout(btnMostrarLibrosAlfa);
        btnMostrarLibrosAlfa.setLayout(btnMostrarLibrosAlfaLayout);
        btnMostrarLibrosAlfaLayout.setHorizontalGroup(
            btnMostrarLibrosAlfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLibrosAlfaLayout.createSequentialGroup()
                .addGroup(btnMostrarLibrosAlfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnMostrarLibrosAlfaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel13))
                    .addGroup(btnMostrarLibrosAlfaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel14)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btnMostrarLibrosAlfaLayout.setVerticalGroup(
            btnMostrarLibrosAlfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLibrosAlfaLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnBuscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseExited(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/biblioteca/images/buscarLibro.png"))); // NOI18N

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Buscar libro");

        javax.swing.GroupLayout btnBuscarLibroLayout = new javax.swing.GroupLayout(btnBuscarLibro);
        btnBuscarLibro.setLayout(btnBuscarLibroLayout);
        btnBuscarLibroLayout.setHorizontalGroup(
            btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLibroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBuscarLibroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16))
                    .addComponent(jLabel15))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnBuscarLibroLayout.setVerticalGroup(
            btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLibroLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnMostrarLibrosAlfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarLibrosAlfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseClicked
        AgregarLibro ventanaAgregarLibro = new AgregarLibro(this, true, this.biblioteca, this);
        ventanaAgregarLibro.setVisible(true);        
    }//GEN-LAST:event_btnAgregarLibroMouseClicked

    private void btnAgregarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseExited
        mouseExited(btnAgregarLibro);
    }//GEN-LAST:event_btnAgregarLibroMouseExited

    private void btnAgregarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseEntered
        mouseEntered(btnAgregarLibro);

    }//GEN-LAST:event_btnAgregarLibroMouseEntered

    
    private void btnEliminarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseClicked
        EliminarLibro ventanaEliminarLibro = new EliminarLibro(this, true, this.biblioteca, this);
        ventanaEliminarLibro.setVisible(true);  
    }//GEN-LAST:event_btnEliminarLibroMouseClicked

    private void btnEliminarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseEntered
        mouseEntered(btnEliminarLibro);
    }//GEN-LAST:event_btnEliminarLibroMouseEntered

    private void btnEliminarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseExited
        mouseExited(btnEliminarLibro);
    }//GEN-LAST:event_btnEliminarLibroMouseExited

    
    private void btnActualizarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseClicked
        ActualizarLibro ventanaActualizarLibro = new ActualizarLibro(this, true, this.biblioteca, this);
        ventanaActualizarLibro.setVisible(true);
    }//GEN-LAST:event_btnActualizarLibroMouseClicked

    private void btnActualizarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseEntered
        mouseEntered(btnActualizarLibro);
    }//GEN-LAST:event_btnActualizarLibroMouseEntered

    private void btnActualizarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseExited
        mouseExited(btnActualizarLibro);
    }//GEN-LAST:event_btnActualizarLibroMouseExited

    
    private void btnMostrarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseClicked
        MostrarLibros ventanaMostrarLibros = new MostrarLibros(this, true, this.biblioteca, this);
        ventanaMostrarLibros.setVisible(true);
    }//GEN-LAST:event_btnMostrarLibrosMouseClicked

    private void btnMostrarLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseEntered
        mouseEntered(btnMostrarLibros);
    }//GEN-LAST:event_btnMostrarLibrosMouseEntered

    private void btnMostrarLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseExited
        mouseExited(btnMostrarLibros);
    }//GEN-LAST:event_btnMostrarLibrosMouseExited

    
    private void btnMostrarLibrosAlfaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosAlfaMouseClicked
        MostrarLibrosAlfa ventanaMostrarLibrosAlfa = new MostrarLibrosAlfa(this, true, this.biblioteca, this);
        ventanaMostrarLibrosAlfa.setVisible(true);
    }//GEN-LAST:event_btnMostrarLibrosAlfaMouseClicked

    private void btnMostrarLibrosAlfaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosAlfaMouseEntered
        mouseEntered(btnMostrarLibrosAlfa);
    }//GEN-LAST:event_btnMostrarLibrosAlfaMouseEntered

    private void btnMostrarLibrosAlfaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosAlfaMouseExited
        mouseExited(btnMostrarLibrosAlfa);
    }//GEN-LAST:event_btnMostrarLibrosAlfaMouseExited

    private void btnBuscarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseClicked
        BuscarLibro ventanaBuscarLibro = new BuscarLibro(this, true, this.biblioteca, this);
        ventanaBuscarLibro.setVisible(true);
    }//GEN-LAST:event_btnBuscarLibroMouseClicked

    private void btnBuscarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseEntered
        mouseEntered(btnBuscarLibro);
    }//GEN-LAST:event_btnBuscarLibroMouseEntered

    private void btnBuscarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseExited
        mouseExited(btnBuscarLibro);
    }//GEN-LAST:event_btnBuscarLibroMouseExited
    
    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(246,241,240));
    }
    
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color(255,255,255));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnActualizarLibro;
    private javax.swing.JPanel btnAgregarLibro;
    private javax.swing.JPanel btnAgregarLibro1;
    private javax.swing.JPanel btnBuscarLibro;
    private javax.swing.JPanel btnEliminarLibro;
    private javax.swing.JPanel btnMostrarLibros;
    private javax.swing.JPanel btnMostrarLibrosAlfa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBiblioteca;
    // End of variables declaration//GEN-END:variables
}
