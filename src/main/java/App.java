import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Controller controller1 = new Controller(new TinhThanhPho());
        /**
         * Tìm kiếm tỉnh / thành phố
         */
        System.out.println("Nhập tên tỉnh/ thành phố muốn tìm (Không nhập gì là tìm tất cả): ");
        String tinh = input.nextLine();

        controller1.search(tinh);


        System.out.println("Vui lòng chọn mã tỉnh/thành phố tương ứng bạn muốn tìm");
        String matp = input.nextLine();
        controller1.chose(matp);

        Controller controller2 = new Controller(new QuanHuyen());
        /**
         * Tìm kiếm quận huyện
         */
        System.out.println("Nhập tên quận huyện muốn tìm (Không nhập gì là tìm tất cả): ");
        String quan = input.nextLine();
        controller2.search(quan);


        System.out.println("Vui lòng chọn mã quận huyện tương ứng bạn muốn tìm");

        String maqh = input.nextLine();
        controller2.chose(maqh);

        /**
         * Tìm kiếm xã phường thị trấn
         */
        Controller controller3 = new Controller(new XaPhuongThiTran());
        System.out.println("Nhập tên xã phường thị trấn muốn tìm (Không nhập gì là tìm tất cả): ");
        String xaphuong = input.nextLine();
        controller3.search(xaphuong);


        System.out.println("Vui lòng chọn mã xa phường thị trấn tương ứng bạn muốn tìm");
        String maxq = input.nextLine();
        controller3.chose(maxq);
        System.out.println(controller1.toString());
        System.out.println(controller2.toString());
        System.out.println(controller3.toString());


    }
}
