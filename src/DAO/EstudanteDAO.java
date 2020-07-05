/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Estudante;

/**
 * @author JChirindza
 */

/***
 * Classe com metodos de acesso a dados do Estudade CRUD
 */
public class EstudanteDAO {
    private Connection conexao;
    
    public EstudanteDAO(){
        try {
            this.conexao = BDconexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EstudanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserir(Estudante estudante){
        String sql = "INSERT INTO estudante(cartao,apelido,nome) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, estudante.getCartao());
            ps.setString(2, estudante.getApelido());
            ps.setString(3, estudante.getNome());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizar(Estudante estudante) {
        try {
            String sql = "UPDATE estudante SET nome = ?, apelido = ? WHERE cartao = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, estudante.getNome());
            ps.setString(2, estudante.getApelido());
            ps.setInt(3, estudante.getCartao());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void apagar (Estudante e){
        String sql = "DELETE FROM estudante WHERE cartao = ?";
        try{ 
         PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, e.getCartao());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Estudante> todos(){
        try {
            String sql = "SELECT * FROM estudante";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Estudante> lista = new ArrayList<>();
            while(rs.next()){
                Estudante e = new Estudante();
                e.setApelido(rs.getString("apelido"));
                e.setCartao(rs.getInt("cartao"));
                e.setNome(rs.getString("nome"));
                lista.add(e);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
}
