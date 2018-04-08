/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.gui;

import br.edu.ufersa.controlConsult.model.HorarioAtendimento;
import br.edu.ufersa.controlConsult.model.Medico;
import br.edu.ufersa.controlConsult.model.Pessoa;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author cassiano
 */
public class ConfirmarDataDaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmarDataDaConsulta
     */
    
    private Pessoa medico;
    private Pessoa paciente;
    
    public ConfirmarDataDaConsulta(){
        initComponents();
    }
    
    public ConfirmarDataDaConsulta(Pessoa paciente, Pessoa medico){
        this.paciente = paciente;
        this.medico = medico;
        initComponents();
        if(medico.getMedico().getListaHorario().isEmpty()){
            JOptionPane.showMessageDialog(null, "O médico não possui horários de atendimento cadastrado");
        }
        int tamanho = medico.getMedico().getListaHorario().size();
        DefaultListModel model = new DefaultListModel();
        for(int cont = 0; cont < tamanho; cont++){
            String elemento = "Dia da semana: " + medico.getMedico().getListaHorario().get(cont).getDiaSemana() + 
                    "; Horario de início: " + String.valueOf(medico.getMedico().getListaHorario().get(cont).getInicio())+
                    ".";
            model.add(cont, elemento);
        }
        listaDeHorarios.setModel(model);
        nomeDoMedico.setEditable(false);
        especialidadeDoMedico.setEditable(false);
        nomeDoMedico.setText(medico.getNome());
        especialidadeDoMedico.setText(medico.getMedico().getEspecialidade().getNome());
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nomeDoMedico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        especialidadeDoMedico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeHorarios = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        marcar = new javax.swing.JButton();
        Data = new com.toedter.calendar.JDateChooser();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmação de Data da Consulta");

        nomeDoMedico.setEditable(false);
        nomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDoMedicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Médico:");

        jLabel2.setText("Especialidade:");

        especialidadeDoMedico.setEditable(false);
        especialidadeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadeDoMedicoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaDeHorarios);

        jLabel3.setText("Data:");

        marcar.setText("Marcar");
        marcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarActionPerformed(evt);
            }
        });

        Data.setMinimumSize(new java.awt.Dimension(120, 20));
        Data.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marcar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(especialidadeDoMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(nomeDoMedico))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeDoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(especialidadeDoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(marcar)
                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcarActionPerformed
        // TODO add your handling code here:
        if(Data.getDate()==null){
            JOptionPane.showMessageDialog(this, "Informe um data válida para marcar a consulta");
        }else{
            if(listaDeHorarios.isSelectionEmpty()){
                JOptionPane.showMessageDialog(this, "Selecione algum dos horários");
            }else{
                
               int posicao = listaDeHorarios.getSelectedIndex();
               Date agendada = Data.getDate();
               String diaSemanaListado = medico.getMedico().getListaHorario().get(posicao).getDiaSemana().getNome();
               Calendar cal = Calendar.getInstance();
               cal.setTime(agendada);
               String diaDaSemana = diaSemana(cal.get(Calendar.DAY_OF_WEEK));
               if(diaDaSemana.equals(diaSemanaListado)){
                   System.out.println("certo");
                   
               }
               else{
                  JOptionPane.showMessageDialog(this, "A data informada não corresponde a um dia da semana do horário selecionado");
               }
            }
        }
        
        
    }//GEN-LAST:event_marcarActionPerformed

    private void nomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDoMedicoActionPerformed

    private void especialidadeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadeDoMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmarDataDaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarDataDaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarDataDaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarDataDaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmarDataDaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Data;
    private javax.swing.JTextField especialidadeDoMedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaDeHorarios;
    private javax.swing.JButton marcar;
    private javax.swing.JTextField nomeDoMedico;
    // End of variables declaration//GEN-END:variables

    
    public String diaSemana(int n) {
        String retorno = null;
        if (n == Calendar.SATURDAY) {
            retorno = "Sábado";
        }
        if (n == Calendar.MONDAY) {
            retorno = "Segunda-feira";
        }
        if (n == Calendar.TUESDAY) {
            retorno = "Terça-feira";
        }
        if (n == Calendar.WEDNESDAY) {
            retorno = "Quarta-feira";
        }
        if (n == Calendar.THURSDAY) {
            retorno = "Quinta-feira";
        }
        if (n == Calendar.FRIDAY) {
            retorno = "Sexta-feira";
        }
        if (n == Calendar.SUNDAY) {
            retorno = "Domingo";
        }
        return retorno;
    }

    private void confimar(HorarioAtendimento horario, Date agendada) {
        int numeroConsultas = 3;//O número de consultas que o médico tem marcadas naquele horário
        if(numeroConsultas < calcula(horario)){
            String mensagem;
            mensagem = ""+ (numeroConsultas +1) + "-esima pessoa na fila";
            /*
            ConsultaValida tela = new ConsultaValida(horario.getInicio(),horario.getFim(),medico,agendada,mensagem);
            tela.setVisible(true);
            tela.setLocationRelativeTo(null);
            this.dispose();*/
        }
        else{
            String erro = "Horário lotado";
            /*
            ConsultaInvalida tela = new ConsultaInvalida(medico,erro);
            tela.setVisible(true);
            tela.setLocationRelativeTo(null);
            this.dispose();*/
        }
    }

    private int calcula(HorarioAtendimento horario) {
        return ((horario.getInicio().getHours()) - (horario.getFim().getHours())) * 6;
    }
    
}
