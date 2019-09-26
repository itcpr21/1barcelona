
import static Configurator.Connection.conUrl;
import com.mysql.jdbc.PreparedStatement;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Addproduct {
     Connect con = new Connect();  
   public int adproductframe(String Product_name, int Quantity, double price) {
   int a = 0;
     try{
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(conUrl);
     
      String sql = "insert into addproducttbl values (null,?,?,?);";
     PreparedStatement psmt = (PreparedStatement) conn.prepareStatement(sql);
     
     
     psmt.setString(1, Product_name);
     psmt.setInt(2, Quantity);
     psmt.setDouble(3,price);
     
       a = psmt.executeUpdate();
     
    System.out.println(psmt);
   
} catch (ClassNotFoundException | SQLException ex) {
     java.util.logging.Logger.getLogger(addproductframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
        return a;
   }
}
   
