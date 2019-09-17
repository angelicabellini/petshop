/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
}
