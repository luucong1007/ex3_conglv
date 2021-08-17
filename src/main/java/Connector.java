import java.sql.*;

public class Connector {
    String url = "jdbc:mysql://localhost:3306/dia_phuong";
    String user = "root";
    String password = "123456789";
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Không thể kết nối với database");
        }
    }

//    String url = "jdbc:mysql://localhost:3306/dia_phuong";
//    String user = "root";
//    String password = "123456789";
//        try {
//        Connection connection = DriverManager.getConnection(url,user,password);
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from tinhthanhpho");
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString("name"));
//        }
//        connection.close();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
}
