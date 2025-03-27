package presentation;

import java.util.Scanner;

import static business.CustomerBusiness.addCustomer;

public class ShopManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*****************SHOP MENU****************");
            System.out.println("1. Quản lý khách hàng.");
            System.out.println("2. Quản lý đơn hàng.");
            System.out.println("3. Thoát.");
            System.out.println("Lựa chọn của bạn là: ");
            int shopChoie = scanner.nextInt();
            scanner.nextLine();
            switch (shopChoie) {
                case 1:
                    displayCustomerMenu(scanner);
                    break;
                case 2:
                    displayOrderMenu(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1-3.");
            }
        } while (true);
    }

    public static void displayCustomerMenu(Scanner scanner) {
        do {
            System.out.println("*****************CUSTOMER MENU****************");
            System.out.println("1. Danh sách khách hàng.");
            System.out.println("2. Thêm mới khách hàng.");
            System.out.println("3. Thoát.");
            System.out.println("Lựa chọn của bạn là: ");
            int customerChoie = scanner.nextInt();
            scanner.nextLine();
            switch (customerChoie) {
                case 1:
                    System.out.println("Danh sách khách hàng:");
                    break;
                case 2:
                    addCustomer(scanner);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Vui lòng chọn từ 1-3.");
            }

        } while (true);
    }

    public static void displayOrderMenu(Scanner scanner) {
        do {
            System.out.println("*****************ORDER MENU****************");
            System.out.println("1. Danh sách đơn hàng.");
            System.out.println("2. Thêm mới đơn hàng.");
            System.out.println("3. Cập nhật trạng thái đơn hàng.");
            System.out.println("4. Danh sách đơn hàng quá hạn.");
            System.out.println("5. Thống kê số lượng đơn hàng đã giao (Trạng thái true).");
            System.out.println("6. Tính tổng doanh thu các đơn hàng đã giao.");
            System.out.println("7. Thoát.");
            System.out.println("Lựa chọn của bạn là: ");
            int orderChoie = scanner.nextInt();
            scanner.nextLine();
            switch (orderChoie) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Vui lòng chọn từ 1-7.");
            }
        } while (true);
    }
}
