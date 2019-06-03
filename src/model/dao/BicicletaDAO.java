/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Bicicleta;



/**
 *
 * @author pi
 */
public class BicicletaDAO {
    
    
    public void create(Bicicleta bicicleta){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO bicicleta (bicicleta) VALUES(?)");
            
            stmt.setInt(2, bicicleta.getBicicleta());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, " salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " +ex);
            
        }finally{
        
        ConnectionFactory.closeConnection(con, stmt);
        
        
    }
    
    
    
    }
    /**
     *
     * @return
     */
    public List<Bicicleta> read() {
      Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Bicicleta> bicicletas = new ArrayList<>();
        
    
        try{
        
            
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM bicicleta");
        
            rs = stmt.executeQuery();
                
                while(rs.next()) {
                    Bicicleta bicicleta = new Bicicleta();
                    bicicleta.setBicicleta(rs.getInt("bicicleta"));
                    bicicletas.add(bicicleta);
                }
                
        
       } catch (SQLException ex) {
            Logger.getLogger(BicicletaDAO.class.getName()).log(Level.SEVERE, null, ex);
       
       
       }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return bicicletas;

    }
}
   
