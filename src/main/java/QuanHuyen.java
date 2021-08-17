import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuanHuyen implements DiaPhuongService {
    Connector connector = null;
    Statement statement = null;
    ResultSet resultSet = null;


    @Override
    public void search(String name) {
        System.out.println("Tìm kiếm Quận/Huyện: " + name);

        try {
            connector = new Connector();
            statement = connector.connection.createStatement();
            String query = "SELECT * FROM quanhuyen t where (t.name like '%" + name + "%' and " + "t.matp=" + dp.getMatp() + ")";
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.print(resultSet.getString("maqh") + "\t");
                System.out.println(resultSet.getString("name"));
            }
            resultSet.close();
            statement.close();
            connector.connection.close();

        } catch (SQLException e) {
            System.out.println("Không tìm thấy");
            e.printStackTrace();
        }
    }


    @Override
    public void chose(String maqh) {
        connector = new Connector();
        try {
            statement = connector.connection.createStatement();
            String query = "SELECT * FROM quanhuyen t where t.maqh =" + maqh;
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("Bạn đã chọn: ");
                System.out.print(resultSet.getString("maqh") + "\t");
                System.out.println(resultSet.getString("name"));
                dp.setMaqh(resultSet.getString("maqh"));
                dp.setQuanHuyen(resultSet.getString("name"));
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
        return "Quận Huyện: " + dp.getQuanHuyen();
    }

}
