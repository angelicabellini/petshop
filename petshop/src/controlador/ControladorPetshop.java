/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPetshop;
import javax.swing.JOptionPane;
import modelo.Petshop;
import tela.manutencao.Manutencao;

/**
 *
 * @author Administrador
 */
public class ControladorPetshop {
public static void inserir(ManutencaoPetshop man){
        Petshop objeto = new Petshop();
        objeto.setAvalicao(Integer.parseInt(man.jtfAvalicao.getText()));
        objeto.setNumero(Integer.parseInt(man.jtfAvalicao.getText()));
        
        boolean resultado = DaoPetshop.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
    public static void inserir(Manutencao aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
