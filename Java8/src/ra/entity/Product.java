package ra.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Product implements IProduct {
    private static int idCounter = 1;
    private int productId;
    private String productName;
    private float price;
    private String category;
    private LocalDate createdDate;

    public Product() {
        this.productId = idCounter++;
        this.createdDate = LocalDate.now();
    }

    // Getters và Setters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm (30-100 ký tự): ");
        while (true) {
            this.productName = scanner.nextLine().trim();
            if (this.productName.length() >= 30 && this.productName.length() <= 100) {
                break;
            }
            System.out.print("Tên sản phẩm không hợp lệ! Vui lòng nhập lại: ");
        }

        System.out.print("Nhập giá sản phẩm (lớn hơn 0): ");
        while (true) {
            try {
                this.price = Float.parseFloat(scanner.nextLine());
                if (this.price > 0) {
                    break;
                }
                System.out.print("Giá phải lớn hơn 0! Nhập lại: ");
            } catch (NumberFormatException e) {
                System.out.print("Vui lòng nhập số hợp lệ! Nhập lại: ");
            }
        }

        System.out.print("Nhập danh mục sản phẩm: ");
        this.category = scanner.nextLine().trim();
    }

    @Override
    public void displayData() {
        System.out.println("ID: " + productId + " | Tên: " + productName + " | Giá: " + price +
                " | Danh mục: " + category + " | Ngày tạo: " + createdDate);
    }
}

