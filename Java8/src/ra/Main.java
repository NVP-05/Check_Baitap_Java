package ra;

import ra.entity.Product;
import ra.util.ProductFilter;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("********** MENU **********");
            System.out.println("1. Danh sách sản phẩm.");
            System.out.println("2. Thêm mới sản phẩm.");
            System.out.println("3. Cập nhật sản phẩm.");
            System.out.println("4. Xóa sản phẩm theo ID.");
            System.out.println("5. Tìm sản phẩm theo tên.");
            System.out.println("6. Lọc sản phẩm theo điều kiện.");
            System.out.println("7. Sắp xếp sản phẩm theo giá.");
            System.out.println("8. Thoát.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    filterProducts();
                    break;
                case 7:
                    sortProducts();
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Vui lòng chọn từ 1-8.");
            }
        }
    }

    private static void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            productList.forEach(Product::displayData);
        }
    }

    private static void addProduct() {
        Product product = new Product();
        product.inputData(scanner);
        productList.add(product);
        System.out.println("Thêm sản phẩm thành công.");
    }

    private static void updateProduct() {
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        Optional<Product> productOpt = productList.stream()
                .filter(p -> p.getProductId() == id)
                .findFirst();
        productOpt.ifPresentOrElse(product -> {
            product.inputData(scanner);
            System.out.println("Cập nhật sản phẩm thành công.");
        }, () -> System.out.println("Không tìm thấy sản phẩm."));
    }

    private static void deleteProduct() {
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (productList.removeIf(product -> product.getProductId() == id)) {
            System.out.println("Xóa sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    private static void searchProductByName() {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        List<Product> foundProducts = productList.stream()
                .filter(product -> product.getProductName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        if (foundProducts.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm.");
        } else {
            foundProducts.forEach(Product::displayData);
        }
    }

    private static void filterProducts() {
        System.out.print("Nhập giá X để lọc sản phẩm có giá lớn hơn X: ");
        float x = Float.parseFloat(scanner.nextLine());
        ProductFilter filterByPrice = product -> product.getPrice() > x;
        productList.stream().filter(filterByPrice::filter).forEach(Product::displayData);
    }

    private static void sortProducts() {
        System.out.println("1. Sắp xếp tăng dần\n2. Sắp xếp giảm dần");
        int choice = Integer.parseInt(scanner.nextLine());
        Comparator<Product> comparator = Comparator.comparing(Product::getPrice);
        if (choice == 2) comparator = comparator.reversed();
        productList.stream().sorted(comparator).forEach(Product::displayData);
    }
}
