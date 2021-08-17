import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TinhThanhPho implements DiaPhuongService {
    Connector connector = null;
    Statement statement = null;
    ResultSet resultSet = null;

    @Override
    public void search(String name) {
        try {
            connector = new Connector();
            statement = connector.connection.createStatement();
            String query = "SELECT * FROM tinhthanhpho t where t.name like '%" + name + "%'";
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.print(resultSet.getString("matp") + "\t");
                System.out.println(resultSet.getString("name"));
            }

            // đóng connection
            resultSet.close();
            statement.close();
            connector.connection.close();

        } catch (SQLException e) {
            System.out.println("Không tìm thấy" + e);
            e.printStackTrace();
        }

    }

    @Override
    public void chose(String matp) {
        connector = new Connector();
        try {
            statement = connector.connection.createStatement();
            String query = "SELECT * FROM tinhthanhpho t where t.matp =" + matp;
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("Bạn đã chọn: ");
                System.out.print(resultSet.getString("matp") + "\t");
                System.out.println(resultSet.getString("name"));
                dp.setMatp(resultSet.getString("matp"));
                dp.setTinhThanhPho(resultSet.getString("name"));
            }

            resultSet.close();
            statement.close();
            connector.connection.close();
        } catch (SQLException e) {
            System.out.println("Chọn sai mã");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Bạn đã chọn địa phương: " + '\n' +
                "Tỉnh/ Thành phố: " + dp.getTinhThanhPho();
    }
}
