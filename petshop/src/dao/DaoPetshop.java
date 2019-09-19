
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Petshop;

public class DaoPetshop {
  public static boolean inserir(Petshop objeto) {
        String sql = "INSERT INTO petshop (avalicao, numero, endereco,  nome) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
           ps.setInt(1, objeto.getAvalicao());
            ps.setInt(2, objeto.getNumero());
            ps.setString(3, objeto.getEndereco());
            ps.setString(4, objeto.getNome());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }  
   public static void main(String[] args) {
        Petshop objeto = new Petshop();
        objeto.setAvalicao(22);
        objeto.setNumero(2);
        objeto.setEndereco("Ibiruba");
        objeto.setNome("Bela");
        
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
   public static boolean alterar(Petshop objeto) {
        String sql = "UPDATE petshop SET endereco = ?,nome = ? ,avalicao = ?, numero = ? WHERE codigo= ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
           
            ps.setString(1, objeto.getEndereco());
            ps.setString(2, objeto.getNome()); 
            ps.setInt(3, objeto.getAvalicao());
            ps.setInt(4, objeto.getNumero());
            ps.setInt(4, objeto.getCodigo());
           
            
           
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

  
    public static boolean excluir(Petshop objeto) {
        String sql = "DELETE FROM petshop WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    }




}
