package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
    @Override
    public void inputData(Scanner scanner) {
        this.id = count++;
        System.out.println("Tên: ");
        this.name = scanner.nextLine();
        System.out.println("Email: ");
        this.email = Optional.of(scanner.nextLine());
    }

    private static int count = 0;
    private int id;
    private String name;
    private Optional<String> email;

    public Customer(int id, String name, Optional<String> email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tên: '" + name + ", Email: " + email;
    }
}
