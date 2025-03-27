package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Order implements IApp {
    @Override
    public void inputData(Scanner scanner) {
        this.id = count++;
        System.out.println("ID khách hàng: ");
        System.out.println("Ngày giao hàng: ");
//        this.orderDate = ;
        System.out.println("");
    }

    private static int count = 0;
    private int id;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private boolean status;

    public Order(int id, Customer customer, LocalDate orderDate, double totalAmount, boolean status) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Khách hàng: " + customer + ", Ngày giao hàng: " + orderDate + ", Tổng tiền: " + totalAmount + ", Status: " + status;
    }
}
