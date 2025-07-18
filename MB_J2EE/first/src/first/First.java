/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first;
import java.sql.*;

/**
 *
 * @author KSC15
 */
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class.ForName("com.mysql.cj,jdbc.Driver");
                Connection Con = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/first_db","root","");
                if(Con!=null)
                    System.Out.print("Sylless");
    }
    
}
