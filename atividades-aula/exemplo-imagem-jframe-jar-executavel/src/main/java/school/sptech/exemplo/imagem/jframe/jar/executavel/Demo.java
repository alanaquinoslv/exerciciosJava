package school.sptech.exemplo.imagem.jframe.jar.executavel;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;

public class Demo extends javax.swing.JFrame {

  Looca looca;

  public Demo() {
    initComponents();
    this.setResizable(false);
    this.looca = new Looca();
    this.setUpOs();
  }

  private void setUpOs() {
    Sistema sistema = looca.getSistema();
    lblSistemaOperacionalValue.setText(String.format("▶ %s", sistema.getSistemaOperacional()));
    lblFabricanteValue.setText(String.format("▶ %s", sistema.getFabricante()));
    lblArquiteturaValue.setText(String.format("▶ %d bits", sistema.getArquitetura()));
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lblSptechLogo = new javax.swing.JLabel();
    lblSistemaOperacional = new javax.swing.JLabel();
    lblSistemaOperacionalValue = new javax.swing.JLabel();
    lblFabricanteValue = new javax.swing.JLabel();
    lblFabricante = new javax.swing.JLabel();
    lblArquitetura = new javax.swing.JLabel();
    lblArquiteturaValue = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(102, 102, 102));

    jPanel1.setBackground(new java.awt.Color(31, 42, 68));

    lblSptechLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sptech_logo.png"))); // NOI18N

    lblSistemaOperacional.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
    lblSistemaOperacional.setForeground(new java.awt.Color(255, 255, 255));
    lblSistemaOperacional.setText("Sistema Operacional");

    lblSistemaOperacionalValue.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
    lblSistemaOperacionalValue.setForeground(new java.awt.Color(255, 255, 255));
    lblSistemaOperacionalValue.setText("--");

    lblFabricanteValue.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
    lblFabricanteValue.setForeground(new java.awt.Color(255, 255, 255));
    lblFabricanteValue.setText("--");

    lblFabricante.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
    lblFabricante.setForeground(new java.awt.Color(255, 255, 255));
    lblFabricante.setText("Fabricante:");

    lblArquitetura.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
    lblArquitetura.setForeground(new java.awt.Color(255, 255, 255));
    lblArquitetura.setText("Arquitetura:");

    lblArquiteturaValue.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
    lblArquiteturaValue.setForeground(new java.awt.Color(255, 255, 255));
    lblArquiteturaValue.setText("--");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(12, 12, 12)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblFabricanteValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(lblSistemaOperacionalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(lblArquiteturaValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblArquitetura, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(lblSptechLogo)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(lblSptechLogo))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(169, 169, 169)
            .addComponent(lblSistemaOperacional)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblSistemaOperacionalValue)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFabricante)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFabricanteValue)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblArquitetura)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblArquiteturaValue)))
        .addContainerGap(15, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Demo().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblArquitetura;
  private javax.swing.JLabel lblArquiteturaValue;
  private javax.swing.JLabel lblFabricante;
  private javax.swing.JLabel lblFabricanteValue;
  private javax.swing.JLabel lblSistemaOperacional;
  private javax.swing.JLabel lblSistemaOperacionalValue;
  private javax.swing.JLabel lblSptechLogo;
  // End of variables declaration//GEN-END:variables
}
