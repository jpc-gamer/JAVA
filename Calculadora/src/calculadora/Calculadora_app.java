/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;


/**
 *
 * @author Familia
 */
public class Calculadora_app extends javax.swing.JFrame {
    /**
     * Creates new form Calculadora_app
     */
  
public Calculadora_app() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        display = new javax.swing.JTextField();
        display.setEditable(false);
        botao_limpar = new javax.swing.JButton();
        botao_resetar = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        num_7 = new javax.swing.JButton();
        num_8 = new javax.swing.JButton();
        num_9 = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        num_zero = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        num_1 = new javax.swing.JButton();
        num_2 = new javax.swing.JButton();
        num_3 = new javax.swing.JButton();
        num_6 = new javax.swing.JButton();
        adicao = new javax.swing.JButton();
        num_5 = new javax.swing.JButton();
        num_4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocation(new java.awt.Point(500, 250));

        //botao raiz bugado :)
        botao_limpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_limpar.setText("√");
        botao_limpar.setPreferredSize(new java.awt.Dimension(40, 40));
        botao_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limparActionPerformed(evt);
            }
        });

        botao_resetar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_resetar.setText("C");
        botao_resetar.setPreferredSize(new java.awt.Dimension(40, 40));
        botao_resetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_resetarActionPerformed(evt);
            }
        });

        multiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        multiplicacao.setText("x");
        multiplicacao.setPreferredSize(new java.awt.Dimension(40, 40));
        multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacaoActionPerformed(evt);
            }
        });
        

        divisao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        divisao.setText("/");
        divisao.setPreferredSize(new java.awt.Dimension(40, 40));
        divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoActionPerformed(evt);
            }
        });

        num_7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_7.setText("7");
        num_7.setPreferredSize(new java.awt.Dimension(40, 40));
        num_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_7ActionPerformed(evt);
            }
        });

        num_8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_8.setText("8");
        num_8.setPreferredSize(new java.awt.Dimension(40, 40));
        num_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_8ActionPerformed(evt);
            }
        });

        num_9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_9.setText("9");
        num_9.setPreferredSize(new java.awt.Dimension(40, 40));
        num_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_9ActionPerformed(evt);
            }
        });

        subtracao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subtracao.setText("-");
        subtracao.setPreferredSize(new java.awt.Dimension(40, 40));
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        num_zero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_zero.setText("0");
        num_zero.setPreferredSize(new java.awt.Dimension(40, 40));
        num_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_zeroActionPerformed(evt);
            }
        });

        ponto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ponto.setText(".");
        ponto.setPreferredSize(new java.awt.Dimension(40, 40));
        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultado.setText("=");
        resultado.setPreferredSize(new java.awt.Dimension(40, 40));
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        num_1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_1.setText("1");
        num_1.setPreferredSize(new java.awt.Dimension(40, 40));
        num_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_1ActionPerformed(evt);
            }
        });

        num_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_2.setText("2");
        num_2.setPreferredSize(new java.awt.Dimension(40, 40));
        num_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_2ActionPerformed(evt);
            }
        });

        num_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_3.setText("3");
        num_3.setPreferredSize(new java.awt.Dimension(40, 40));
        num_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_3ActionPerformed(evt);
            }
        });

        num_6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_6.setText("6");
        num_6.setPreferredSize(new java.awt.Dimension(40, 40));
        num_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_6ActionPerformed(evt);
            }
        });

        adicao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adicao.setText("+");
        adicao.setPreferredSize(new java.awt.Dimension(40, 40));
        adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicaoActionPerformed(evt);
            }
        });

        num_5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_5.setText("5");
        num_5.setToolTipText("");
        num_5.setPreferredSize(new java.awt.Dimension(40, 40));
        num_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_5ActionPerformed(evt);
            }
        });

        num_4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        num_4.setText("4");
        num_4.setPreferredSize(new java.awt.Dimension(40, 40));
        num_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(display)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(num_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_resetar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(adicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_resetar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(num_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(num_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(num_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num_zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void botao_resetarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String tipo_operacao = calcular.funcChamada("");
        adicao adicao = new adicao();
        subtracao subtracao = new subtracao();
        divisao divisao = new divisao();
        multiplicacao multiplicacao = new multiplicacao();
        double num_antigo;
        num_antigo = adicao.salvarNumAntigo(0);
        num_antigo = subtracao.salvarNumAntigo(0);
        num_antigo = divisao.salvarNumAntigo(0);
        num_antigo = multiplicacao.salvarNumAntigo(0); 
        
        display.setText("");
    }                                                                                                                         

    private void num_zeroActionPerformed(java.awt.event.ActionEvent evt) {                                         
        display.setText(display.getText() + "0"); 
    }                                                                                                         

    private void num_1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "1"); 
    }                                     

    private void num_2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "2"); 
    }                                     

    private void num_3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "3"); 
    }
    
    private void num_4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "4"); 
    }
    
    private void num_5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "5"); 
    }                                     

    private void num_6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "6"); 
    }

    private void num_7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "7"); 
    }                                     

    private void num_8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "8"); 

    }                                     

    private void num_9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + "9"); 
    } 

    private void pontoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        display.setText(display.getText() + ".");
    }
    
    private void botao_limparActionPerformed(java.awt.event.ActionEvent evt) {  
         double raiz = Math.sqrt(Double.parseDouble(display.getText()));
         String resultadoTxt = raiz + "";
         display.setText(resultadoTxt);
         
    }
    
    private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {  
        multiplicacao multiplicacao = new multiplicacao();
        calcular calcular = new calcular();

        double num_antigo = multiplicacao.salvarNumAntigo(Double.parseDouble(display.getText()));
        display.setText("");
        String tipo_operacao = calcular.funcChamada("multiplicacao");
    }
    
    private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {  
         divisao divisao = new divisao();
        calcular calcular = new calcular();

        double num_antigo = divisao.salvarNumAntigo(Double.parseDouble(display.getText()));
        display.setText("");
        String tipo_operacao = calcular.funcChamada("divisao");
    }

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        subtracao sub = new subtracao();
        calcular calcular = new calcular();

        double num_antigo = sub.salvarNumAntigo(Double.parseDouble(display.getText()));
        display.setText("");

        String tipo_operacao = calcular.funcChamada("subtracao");
    }                                        

    private void adicaoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        adicao soma = new adicao();
        calcular calcular = new calcular();

        double num_antigo = soma.salvarNumAntigo(Double.parseDouble(display.getText()));
        display.setText("");
        String tipo_operacao = calcular.funcChamada("adicao");
    }
    
    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        calcular calcular = new calcular();
        String tipo_operacao = calcular.valor;

        if (tipo_operacao == "adicao") {
            adicao adicao = new adicao();
            double num_antigo = adicao.num_antigo;
            double resultado = adicao.somar(num_antigo, Double.parseDouble(display.getText()));
            String resultadoTxt = resultado + "";
            display.setText(resultadoTxt);
            num_antigo = adicao.salvarNumAntigo(0);
        }else if (tipo_operacao == "subtracao") {
            subtracao subtracao = new subtracao();
            double num_antigo = subtracao.num_antigo;
            System.out.println(num_antigo);
            double resultado = subtracao.subtrair(num_antigo, Double.parseDouble(display.getText()));
            String resultadoTxt = resultado + "";
            display.setText(resultadoTxt);
            num_antigo = subtracao.salvarNumAntigo(0);
        } else if (tipo_operacao == "multiplicacao") {
            multiplicacao multiplicacao = new multiplicacao();
            double num_antigo = multiplicacao.num_antigo;
            double resultado = multiplicacao.multiplicar(num_antigo, Double.parseDouble(display.getText()));
            String resultadoTxt = resultado + "";
            display.setText(resultadoTxt);
            num_antigo = multiplicacao.salvarNumAntigo(1);
        } else if (tipo_operacao == "divisao") {
            divisao divisao = new divisao();
            double num_antigo = divisao.num_antigo;
            double resultado = divisao.dividir(num_antigo, Double.parseDouble(display.getText()));
            String resultadoTxt = resultado + "";
            display.setText(resultadoTxt);
            num_antigo = divisao.salvarNumAntigo(1);
        }
        System.out.println(tipo_operacao);
    }

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton adicao;
    private javax.swing.JButton botao_limpar;
    private javax.swing.JButton botao_resetar;
    private javax.swing.JTextField display;
    private javax.swing.JButton divisao;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton num_1;
    private javax.swing.JButton num_2;
    private javax.swing.JButton num_3;
    private javax.swing.JButton num_4;
    private javax.swing.JButton num_5;
    private javax.swing.JButton num_6;
    private javax.swing.JButton num_7;
    private javax.swing.JButton num_8;
    private javax.swing.JButton num_9;
    private javax.swing.JButton num_zero;
    private javax.swing.JButton ponto;
    private javax.swing.JButton resultado;
    private javax.swing.JButton subtracao;
    // End of variables declaration                   
}