package presentation;

import business.CustomerBusiness;
import business.OrderBusiness;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entity.Customer;
import entity.Order;

public class ShopManagement {
    public static final List<Customer> listCustomers = new ArrayList<>();
    public static final List<Order> listOrders = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerBusiness customerBusiness = new CustomerBusiness();
        OrderBusiness orderBusiness = new OrderBusiness();

        while (true) {
            System.out.println("1. Quản lý khách hàng\n2. Quản lý đơn hàng\n3. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Danh sách khách hàng\n2. Thêm mới khách hàng\n3. Thoát");
                    int cChoice = Integer.parseInt(scanner.nextLine());
                    if (cChoice == 1) customerBusiness.displayCustomers();
                    else if (cChoice == 2) customerBusiness.addCustomer(scanner);
                    break;
                case 2:
                    System.out.println("1. Danh sách đơn hàng\n2. Thêm mới đơn hàng\n3. Cập nhật trạng thái\n4. Danh sách đơn hàng quá hạn\n5. Thống kê đơn đã giao\n6. Tổng doanh thu\n7. Thoát");
                    int oChoice = Integer.parseInt(scanner.nextLine());
                    if (oChoice == 1) orderBusiness.displayOrders();
                    else if (oChoice == 2) orderBusiness.addOrder(scanner);
                    else if (oChoice == 3) orderBusiness.updateOrderStatus(scanner);
                    else if (oChoice == 4) System.out.println(orderBusiness.getOrderOverdue());
                    else if (oChoice == 5) System.out.println(orderBusiness.getOrderDelivered());
                    else if (oChoice == 6) System.out.println("Tổng doanh thu: " + orderBusiness.getTotalRevenue());
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
