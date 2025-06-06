/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vars;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author chatman
 */
public class Home extends javax.swing.JFrame {

    String permisos;
    
    public Home(String permisos) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setExtendedState(Jpanel.MAXIMIZED_BOTH);
        sidebar_mini.setVisible(false);
        this.permisos = permisos;
        if (permisos.equals("Empleado")){
            Bempleados1.setVisible(false);
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

        bg = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Bventa1 = new javax.swing.JButton();
        Binventario1 = new javax.swing.JButton();
        Bcaja1 = new javax.swing.JButton();
        Bempleados1 = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        Btransferir1 = new javax.swing.JButton();
        sidebar_mini = new javax.swing.JPanel();
        Bventa = new javax.swing.JButton();
        Binventario = new javax.swing.JButton();
        Bcaja = new javax.swing.JButton();
        Bempleados = new javax.swing.JButton();
        menu2 = new javax.swing.JButton();
        Btransferir2 = new javax.swing.JButton();
        panel_general = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        sidebar.setBackground(new java.awt.Color(9, 67, 105));
        sidebar.setPreferredSize(new java.awt.Dimension(230, 485));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CMG");

        Bventa1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bventa1.setForeground(new java.awt.Color(255, 255, 255));
        Bventa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito.png"))); // NOI18N
        Bventa1.setText("      Venta");
        Bventa1.setBorder(null);
        Bventa1.setBorderPainted(false);
        Bventa1.setContentAreaFilled(false);
        Bventa1.setFocusPainted(false);
        Bventa1.setPreferredSize(new java.awt.Dimension(230, 35));
        Bventa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bventa1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bventa1MouseExited(evt);
            }
        });
        Bventa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bventa1ActionPerformed(evt);
            }
        });

        Binventario1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Binventario1.setForeground(new java.awt.Color(255, 255, 255));
        Binventario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        Binventario1.setText("Inventario");
        Binventario1.setBorderPainted(false);
        Binventario1.setContentAreaFilled(false);
        Binventario1.setFocusPainted(false);
        Binventario1.setPreferredSize(new java.awt.Dimension(219, 35));
        Binventario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Binventario1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Binventario1MouseExited(evt);
            }
        });
        Binventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Binventario1ActionPerformed(evt);
            }
        });

        Bcaja1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bcaja1.setForeground(new java.awt.Color(255, 255, 255));
        Bcaja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registradora.png"))); // NOI18N
        Bcaja1.setText("           Caja");
        Bcaja1.setBorderPainted(false);
        Bcaja1.setContentAreaFilled(false);
        Bcaja1.setFocusPainted(false);
        Bcaja1.setPreferredSize(new java.awt.Dimension(219, 35));
        Bcaja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bcaja1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bcaja1MouseExited(evt);
            }
        });
        Bcaja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcaja1ActionPerformed(evt);
            }
        });

        Bempleados1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bempleados1.setForeground(new java.awt.Color(255, 255, 255));
        Bempleados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empleados.png"))); // NOI18N
        Bempleados1.setText("Usuarios");
        Bempleados1.setBorderPainted(false);
        Bempleados1.setContentAreaFilled(false);
        Bempleados1.setFocusPainted(false);
        Bempleados1.setPreferredSize(new java.awt.Dimension(219, 35));
        Bempleados1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bempleados1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bempleados1MouseExited(evt);
            }
        });
        Bempleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bempleados1ActionPerformed(evt);
            }
        });

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setFocusPainted(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        Btransferir1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btransferir1.setForeground(new java.awt.Color(255, 255, 255));
        Btransferir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        Btransferir1.setText("Salir");
        Btransferir1.setBorderPainted(false);
        Btransferir1.setContentAreaFilled(false);
        Btransferir1.setFocusPainted(false);
        Btransferir1.setPreferredSize(new java.awt.Dimension(219, 35));
        Btransferir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btransferir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btransferir1MouseExited(evt);
            }
        });
        Btransferir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btransferir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addComponent(Btransferir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Bcaja1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bempleados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bventa1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Binventario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(Bventa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Binventario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bcaja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bempleados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(Btransferir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidebar_mini.setBackground(new java.awt.Color(9, 67, 105));
        sidebar_mini.setPreferredSize(new java.awt.Dimension(230, 485));

        Bventa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito.png"))); // NOI18N
        Bventa.setBorder(null);
        Bventa.setBorderPainted(false);
        Bventa.setContentAreaFilled(false);
        Bventa.setFocusPainted(false);
        Bventa.setPreferredSize(new java.awt.Dimension(65, 35));
        Bventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BventaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BventaMouseExited(evt);
            }
        });
        Bventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BventaActionPerformed(evt);
            }
        });

        Binventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Binventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        Binventario.setBorderPainted(false);
        Binventario.setContentAreaFilled(false);
        Binventario.setFocusPainted(false);
        Binventario.setPreferredSize(new java.awt.Dimension(65, 35));
        Binventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BinventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BinventarioMouseExited(evt);
            }
        });
        Binventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinventarioActionPerformed(evt);
            }
        });

        Bcaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bcaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registradora.png"))); // NOI18N
        Bcaja.setBorderPainted(false);
        Bcaja.setContentAreaFilled(false);
        Bcaja.setFocusPainted(false);
        Bcaja.setPreferredSize(new java.awt.Dimension(65, 35));
        Bcaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BcajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BcajaMouseExited(evt);
            }
        });
        Bcaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcajaActionPerformed(evt);
            }
        });

        Bempleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empleados.png"))); // NOI18N
        Bempleados.setBorderPainted(false);
        Bempleados.setContentAreaFilled(false);
        Bempleados.setFocusPainted(false);
        Bempleados.setPreferredSize(new java.awt.Dimension(65, 35));
        Bempleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BempleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BempleadosMouseExited(evt);
            }
        });
        Bempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BempleadosActionPerformed(evt);
            }
        });

        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        menu2.setBorderPainted(false);
        menu2.setContentAreaFilled(false);
        menu2.setFocusPainted(false);
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        Btransferir2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btransferir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        Btransferir2.setBorderPainted(false);
        Btransferir2.setContentAreaFilled(false);
        Btransferir2.setFocusPainted(false);
        Btransferir2.setPreferredSize(new java.awt.Dimension(65, 35));
        Btransferir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btransferir2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btransferir2MouseExited(evt);
            }
        });
        Btransferir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btransferir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebar_miniLayout = new javax.swing.GroupLayout(sidebar_mini);
        sidebar_mini.setLayout(sidebar_miniLayout);
        sidebar_miniLayout.setHorizontalGroup(
            sidebar_miniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar_miniLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidebar_miniLayout.createSequentialGroup()
                .addGroup(sidebar_miniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btransferir2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidebar_miniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bcaja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Binventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bventa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidebar_miniLayout.setVerticalGroup(
            sidebar_miniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar_miniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu2)
                .addGap(78, 78, 78)
                .addComponent(Bventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Binventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bcaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bempleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btransferir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_general.setBackground(new java.awt.Color(255, 255, 255));
        panel_general.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidebar_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_general, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
            .addComponent(sidebar_mini, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
            .addComponent(panel_general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BempleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BempleadosMouseExited
        Bempleados.setBorderPainted(false);
    }//GEN-LAST:event_BempleadosMouseExited

    private void BempleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BempleadosMouseEntered
        Bempleados.setBorderPainted(true);
        Bempleados.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_BempleadosMouseEntered

    private void BcajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BcajaMouseExited
        Bcaja.setBorderPainted(false);
    }//GEN-LAST:event_BcajaMouseExited

    private void BcajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BcajaMouseEntered
        Bcaja.setBorderPainted(true);
        Bcaja.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_BcajaMouseEntered

    private void BinventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BinventarioMouseExited
        Binventario.setBorderPainted(false);
    }//GEN-LAST:event_BinventarioMouseExited

    private void BinventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BinventarioMouseEntered
        Binventario.setBorderPainted(true);
        Binventario.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_BinventarioMouseEntered

    private void BventaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BventaMouseExited
        Bventa.setBorderPainted(false);
    }//GEN-LAST:event_BventaMouseExited

    private void BventaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BventaMouseEntered
        Bventa.setBorderPainted(true);
        Bventa.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_BventaMouseEntered

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        sidebar_mini.setVisible(false);
        sidebar.setVisible(true);
        if (permisos.equals("Empleado")){
            Bempleados1.setVisible(false);
        }
    }//GEN-LAST:event_menu2ActionPerformed

    private void Bventa1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bventa1MouseEntered
        Bventa1.setBorderPainted(true);
        Bventa1.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_Bventa1MouseEntered

    private void Bventa1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bventa1MouseExited
        Bventa1.setBorderPainted(false);
    }//GEN-LAST:event_Bventa1MouseExited

    private void Binventario1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Binventario1MouseEntered
        Binventario1.setBorderPainted(true);
        Binventario1.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_Binventario1MouseEntered

    private void Binventario1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Binventario1MouseExited
        Binventario1.setBorderPainted(false);
    }//GEN-LAST:event_Binventario1MouseExited

    private void Bcaja1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bcaja1MouseEntered
        Bcaja1.setBorderPainted(true);
        Bcaja1.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_Bcaja1MouseEntered

    private void Bcaja1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bcaja1MouseExited
        Bcaja1.setBorderPainted(false);
    }//GEN-LAST:event_Bcaja1MouseExited

    private void Bempleados1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bempleados1MouseEntered
        Bempleados1.setBorderPainted(true);
        Bempleados1.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_Bempleados1MouseEntered

    private void Bempleados1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bempleados1MouseExited
        Bempleados1.setBorderPainted(false);
    }//GEN-LAST:event_Bempleados1MouseExited

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        sidebar.setVisible(false);
        sidebar_mini.setVisible(true);
        if (permisos.equals("Empleado")){
            Bempleados.setVisible(false);
        }
    }//GEN-LAST:event_menuActionPerformed

    private void Bventa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bventa1ActionPerformed
        Vender vn = new Vender(panel_general);
        vn.setSize(807,511);
        vn.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(vn,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
    }//GEN-LAST:event_Bventa1ActionPerformed

    private void BventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BventaActionPerformed
        Vender vn = new Vender(panel_general);
        vn.setSize(807,511);
        vn.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(vn,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
    }//GEN-LAST:event_BventaActionPerformed

    private void Btransferir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btransferir2MouseEntered
        Btransferir2.setBorderPainted(true);
        Btransferir2.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_Btransferir2MouseEntered

    private void Btransferir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btransferir2MouseExited
        Btransferir2.setBorderPainted(false);
    }//GEN-LAST:event_Btransferir2MouseExited

    private void Binventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Binventario1ActionPerformed
        Inventario inv = new Inventario(panel_general,permisos);
        inv.setSize(807,511);
        inv.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(inv,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
    }//GEN-LAST:event_Binventario1ActionPerformed

    private void BinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinventarioActionPerformed
        Inventario inv = new Inventario(panel_general,permisos);
        inv.setSize(807,511);
        inv.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(inv,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
    }//GEN-LAST:event_BinventarioActionPerformed

    private void Btransferir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btransferir1MouseExited
        Btransferir1.setBorderPainted(false);
    }//GEN-LAST:event_Btransferir1MouseExited

    private void Btransferir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btransferir1MouseEntered
        Btransferir1.setBorderPainted(true);
        Btransferir1.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_Btransferir1MouseEntered

    private void Btransferir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btransferir1ActionPerformed
        dispose();
    }//GEN-LAST:event_Btransferir1ActionPerformed

    private void Btransferir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btransferir2ActionPerformed
        dispose();
    }//GEN-LAST:event_Btransferir2ActionPerformed

    private void Bcaja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcaja1ActionPerformed
        Caja cj = new Caja(panel_general,permisos);
        cj.setSize(807,511);
        cj.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(cj,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
    }//GEN-LAST:event_Bcaja1ActionPerformed

    private void BcajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcajaActionPerformed
        Caja cj = new Caja(panel_general,permisos);
        cj.setSize(807,511);
        cj.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(cj,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
    }//GEN-LAST:event_BcajaActionPerformed

    private void Bempleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bempleados1ActionPerformed
        Empleados empl = new Empleados(panel_general);
        empl.setSize(807,511);
        empl.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(empl,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
    }//GEN-LAST:event_Bempleados1ActionPerformed

    private void BempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BempleadosActionPerformed
        Empleados empl = new Empleados(panel_general);
        empl.setSize(807,511);
        empl.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(empl,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
    }//GEN-LAST:event_BempleadosActionPerformed
    
    public JPanel getPanel_general(){
        return panel_general;
    }
    
    public static void main(String args[]) {
        if (args.length > 0) {
                String permisos = args[0];
                java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Home(permisos).setVisible(true);
            }
        });
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcaja;
    private javax.swing.JButton Bcaja1;
    private javax.swing.JButton Bempleados;
    private javax.swing.JButton Bempleados1;
    private javax.swing.JButton Binventario;
    private javax.swing.JButton Binventario1;
    private javax.swing.JButton Btransferir1;
    private javax.swing.JButton Btransferir2;
    private javax.swing.JButton Bventa;
    private javax.swing.JButton Bventa1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton menu;
    private javax.swing.JButton menu2;
    private javax.swing.JPanel panel_general;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel sidebar_mini;
    // End of variables declaration//GEN-END:variables
}
