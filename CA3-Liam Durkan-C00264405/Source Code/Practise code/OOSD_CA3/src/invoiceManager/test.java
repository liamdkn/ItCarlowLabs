package invoiceManager;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
public class test 
{

}  
 public void table_method() {
  try 
  {
      String url = "jdbc:mysql://localhost:3306/InvoiceManagement";
      String user = "root";
      String password = "password";
    
      Connection con = DriverManager.getConnection(url, user, password);
    
      String query = "SELECT * FROM customer";
    
      Statement stm = con.createStatement();
      ResultSet res = stm.executeQuery(query);
    
      String columns[] = { "firstName", "lastName", "phone","email", "street","county","postcode" };
      String data[][] = new String[45][7];
    
      int i = 0;
      while (res.next()) {
        String fname = res.getString("firstName");
        String lname = res.getString("lastName");
        String phone = res.getString("phone");
        String email = res.getString("email");
        String street = res.getString("street");
        String county = res.getString("county");
        String postcode = res.getString("postcode");
        data[i][0] = fname;
        data[i][1] = lname;
        data[i][2] = phone;
        data[i][3] = email;
        data[i][4] = street;
        data[i][5] = county;
        data[i][6] = postcode;
        
        i++;
      }
    
      DefaultTableModel model = new DefaultTableModel(data, columns);
      JTable table = new JTable(model);
      table.setShowGrid(true);
      table.setShowVerticalLines(true);
      JScrollPane pane = new JScrollPane(table);
      JFrame f = new JFrame("Populate JTable from Database");
      JPanel panel = new JPanel();
      panel.add(pane);
      f.add(panel);
      f.setSize(500, 250);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
      table.getTableHeader().setBackground(Color.WHITE);
    
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }

}