import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class XaPhuongThiTran implements DiaPhuongService {
    @Override
    public void search(String name) {
        System.out.println("Tìm kiếm xã phường thị trấn: " + name);

        try {
            Connector connector = new Connector();
            Statement statement = connector.connection.createStatement();
//            String query ="SELECT * FROM xaphuongthitran t where t.name like '%" +name +"%'";
            String query = "SELECT * FROM xaphuongthitran t where (t.name like '%" + name + "%' and " + "t.maqh=" + dp.getMaqh() + ")";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.print(resultSet.getString("xaid") + "\t");
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
    public void chose(String xaId) {
        Connector connector = new Connector();
        try {
            Statement statement = connector.connection.createStatement();
            String query = "SELECT * FROM xaphuongthitran t where t.xaid =" + xaId;
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println("Bạn đã chọn: ");
                System.out.print(resultSet.getString("xaid") + "\t");
                System.out.println(resultSet.getString("name"));
                dp.setXaPhuongThiTran(resultSet.getString("name"));
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
        return "Xã/Phường/Thị/Trấn: " + dp.getXaPhuongThiTran();
    }
}
