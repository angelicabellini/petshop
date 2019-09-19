
package controlador;

import dao.DaoPetshop;
import javax.swing.JOptionPane;
import modelo.Petshop;
import tela.manutencao.Manutencao;


public class ControladorPetshop {
public static void inserir(Manutencao man){
        Petshop objeto = new Petshop();
        objeto.setAvalicao(Integer.parseInt(man.jtfAvalicao.getText()));
        objeto.setNumero(Integer.parseInt(man.jtfNumero.getText()));
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setNome(man.jtfNome.getText());
        
        boolean resultado = DaoPetshop.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
public static void alterar(Manutencao man){
        Petshop objeto = new Petshop();
       
       objeto.setAvalicao(Integer.parseInt(man.jtfAvalicao.getText()));
       objeto.setNumero(Integer.parseInt(man.jtfNumero.getText()));
        objeto.setNome(man.jtfNome.getText());
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
       
        
        boolean resultado = DaoPetshop.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(Manutencao aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
