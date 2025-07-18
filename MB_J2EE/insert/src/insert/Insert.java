/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insert;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author KSC15
 */
public class Insert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value for id: ");
        int a=Scanner.nextInt();
        String b=Scanner.nextString();
        Class.forName("com.mysq.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
        String query="insert into student (ID,NAME)value(?,?)";
        prepareStatement pst=con.prepareStatement(query);
        pst.setInt(1,a);
        pst.setString(1,b);
        pst.executedUpdate();
        
        // TODO code application logic here
    }
    
}
