package temperocerto.sistema_tc;

public class Client {
    String name;
    int phone;
    float balance;
    Order order;

    public void addClient(String name, int phone, float balance, Order order){
        this.name = name;
        this.phone = phone;
        this.balance = balance;
        this.order = order;
    }
}