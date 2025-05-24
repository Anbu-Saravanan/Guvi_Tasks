package JDBC.MysqlTask;

import java.sql.*;

public class JDBC_ConnectivityInsertionData {
    public static void main(String[] args) {
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi",
                    "root","jeevananthan");
            PreparedStatement ppst = connection.prepareStatement("insert into employee1 (empcode,empname,empage,esalary) values (?,?,?,?)");

            //Row 1
            ppst.setInt(1,101);
            ppst.setString(2,"Jenny");
            ppst.setInt(3,25);
            ppst.setDouble(4,10000.0);
            ppst.addBatch();

            //Row 2
            ppst.setInt(1,102);
            ppst.setString(2,"Jacky");
            ppst.setInt(3,30);
            ppst.setDouble(4,20000.0);
            ppst.addBatch();

            //Row 3
            ppst.setInt(1,103);
            ppst.setString(2,"Joe");
            ppst.setInt(3,20);
            ppst.setDouble(4,40000.0);
            ppst.addBatch();

            //Row 4
            ppst.setInt(1,104);
            ppst.setString(2,"John");
            ppst.setInt(3,40);
            ppst.setDouble(4,80000.0);
            ppst.addBatch();

            //Row 5
            ppst.setInt(1,105);
            ppst.setString(2,"Shameer");
            ppst.setInt(3,25);
            ppst.setDouble(4,90000.0);
            ppst.addBatch();
            int[] status = ppst.executeBatch();
            System.out.println(status);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
