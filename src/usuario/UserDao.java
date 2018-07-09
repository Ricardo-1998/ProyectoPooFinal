/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karina Mina <https://github.com/karinamina3>
 */
public class UserDao {

    private static final String SQL_INSERT = "INSERT INTO user (user, password, level, gold) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE user SET level = ?, gold = ? WHERE id_user = ?";
    private static final String SQL_DELETE = "DELETE FROM user WHERE id_user = ?";
    private static final String SQL_READ = "SELECT * FROM user WHERE user = ?";    

    public static final Conexion con = Conexion.conectar();

    public boolean insert(User user) {
        PreparedStatement ps;
        try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1, user.getUser());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getLevel());
            ps.setInt(4, user.getGold());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        return false;
    }

    public boolean update(User user) {
        PreparedStatement ps;
        try {
            ps = con.getCnx().prepareStatement(SQL_UPDATE);
            ps.setInt(1, user.getLevel());
            ps.setInt(2, user.getGold());
            ps.setInt(3, user.getId());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        return false;
    }

    public boolean delete(User user) {
        PreparedStatement ps;
        try {
            ps = con.getCnx().prepareStatement(SQL_DELETE);
            ps.setInt(1, user.getId());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        return false;
    }
    
    public User read(String usuario){
        User user = null;        
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = con.getCnx().prepareStatement(SQL_READ);
            ps.setString(1, usuario);
            
            rs = ps.executeQuery();
            
            while (rs.next()){
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }        
        return user;
    }
        
}
