package permutaciones_combinaciones;

import java.awt.event.KeyEvent;

public class P_C extends javax.swing.JFrame {

    public P_C() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_R = new javax.swing.JTextField();
        btn_Permutacion = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txt_N = new javax.swing.JTextField();
        btn_Combinacion = new javax.swing.JButton();
        txt_Res = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Permutaciones y Combinaciones");
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 0, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 34)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Permutacion o Combinacion");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresa los numeros que desees...");

        txt_R.setBackground(new java.awt.Color(255, 255, 255));
        txt_R.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_R.setText("5");
        txt_R.setToolTipText("");
        txt_R.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_R.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_RKeyPressed(evt);
            }
        });

        btn_Permutacion.setBackground(new java.awt.Color(51, 51, 255));
        btn_Permutacion.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btn_Permutacion.setText("Permutación");
        btn_Permutacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Permutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PermutacionActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("X");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txt_N.setBackground(new java.awt.Color(255, 255, 255));
        txt_N.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_N.setText("8");
        txt_N.setToolTipText("");
        txt_N.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_N.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_NKeyPressed(evt);
            }
        });

        btn_Combinacion.setBackground(new java.awt.Color(255, 0, 0));
        btn_Combinacion.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btn_Combinacion.setText("Combinación");
        btn_Combinacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Combinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CombinacionActionPerformed(evt);
            }
        });

        txt_Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Res.setText("RESULTADO");

        jLabel2.setText("N: ");

        jLabel4.setText("R: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_N, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_R, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Permutacion)
                .addGap(81, 81, 81)
                .addComponent(btn_Combinacion)
                .addGap(119, 119, 119))
            .addComponent(txt_Res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_N, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_R, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Combinacion)
                    .addComponent(btn_Permutacion))
                .addGap(37, 37, 37)
                .addComponent(txt_Res, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {


        }
    }//GEN-LAST:event_txt_RKeyPressed

    private void btn_PermutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PermutacionActionPerformed
        Permutacion();
    }//GEN-LAST:event_btn_PermutacionActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        this.txt_R.setText("");
        this.txt_N.setText("");
        this.txt_Res.setText("RESULTADO = ");

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txt_NKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NKeyPressed

    private void btn_CombinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CombinacionActionPerformed
        // TODO add your handling code here:
        Combinscion();
    }//GEN-LAST:event_btn_CombinacionActionPerformed

    //==========================================================================================
    public void Permutacion(){
        
        int N = Integer.parseInt(this.txt_N.getText()), R = Integer.parseInt(this.txt_R.getText()), res=0;
        
        res = Factorial(N)/Factorial(N-R);
        
        this.txt_Res.setText("Permutacion: "+res);
    }
    
    public void Combinscion(){
        
        int N = Integer.parseInt(this.txt_N.getText()), R = Integer.parseInt(this.txt_R.getText()), res=0;
        
        res = Factorial(N) / (Factorial(N-R) * Factorial(R));
        
        this.txt_Res.setText("Combinacion: "+res);
    }
    
    public int Factorial(int num){
        int factorial=1;
        
        for(int i = num ; i>=1; i--){
            factorial = factorial * i;
            //System.out.println(i + "* ");
        }
        return factorial;
    }
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
            java.util.logging.Logger.getLogger(P_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P_C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btn_Combinacion;
    private javax.swing.JButton btn_Permutacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_N;
    private javax.swing.JTextField txt_R;
    private javax.swing.JLabel txt_Res;
    // End of variables declaration//GEN-END:variables
}
