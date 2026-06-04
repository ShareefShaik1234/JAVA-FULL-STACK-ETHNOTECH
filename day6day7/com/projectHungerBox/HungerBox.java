package day6day7.com.projectHungerBox;

import java.util.ArrayList;

interface Orderable{
    double getPrice();
    String getDescription();
    void prepare();
}

interface Discount{
    double applyDiscount(double discount);
}

abstract class MenuItems implements Orderable, Discount {

    private final String name;
    private double price;
    static int totalNumberOfOrders = 0;
    private String categories;

    public MenuItems(String name, double price, String categories) {
        this.name = name;
        this.price = price;
        this.categories = categories;
        totalNumberOfOrders++;
    }

    public String getName() {
        return name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }

    @Override
    public String getDescription() {
        return "Item name: " + getName() + " Price: $" + getPrice();
    }

    @Override
    abstract public void prepare();

    @Override
    public double applyDiscount(double discount) {

        return price-(price * discount/100);
    }

    public static int getTotalNumberOfOrders()
    {

        return totalNumberOfOrders;
    }
}
class VegItems extends MenuItems
{
    private boolean isJain;
    public VegItems(String name, double price, String categories)
    {
        super(name, price, "Veg");
        isJain = false;
    }
    public VegItems(String name, double price, boolean isJain)
    {
        super(name, price, "Veg");
        isJain = isJain;
    }
    @Override
    public void prepare()
    {
        System.out.println("Your Order of "+ getName()+ " of price "+getPrice()+" is been prepared");
        // setTotalNumberOfOrders(getTotalNumberOfOrders()+ 1);

    }
}
class NonVegItems extends MenuItems
{
    private String meatType;
    public NonVegItems(String name, double price, String categories, String meatType){
        super(name, price, categories);
        this.meatType = meatType;
    }
    @Override
    public void prepare() {
        System.out.println("Your order of " + getName()+ " of price "+getPrice()+" is been prepared");
        totalNumberOfOrders++;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + this.meatType;
    }

}
class Orders
{
    private final int orderId;
    private static int orderCount = 0;
    private final String customername;
    ArrayList<MenuItems> list;
    private String status;
    Orders(String customername)
    {
        this.customername = customername;
        this.list=new ArrayList<>();
        this.status="Order placed";
        this.orderId=++orderCount;
    }
    public void addItems(MenuItems item)
    {
        list.add(item);
        System.out.println("The Items Ordered is"+ item.getName()+"The price is"+item.getPrice());
    }

    public void prepareOrder(){
        this.status="Preparing Order";
        for(MenuItems item:list){
            item.prepare();
        }
        this.status="Ready";
    }
    double calculatePrice()
    {
        double price=0;
        for(MenuItems item:list){
            price+=item.getPrice();
        }
        return price;
    }
    void generateBill(double discountPercent){
        double subtotal=calculatePrice();
        double discounted=subtotal-(subtotal*discountPercent/100);
        double tax=discounted*0.05;
        double total=discounted+tax;


        System.out.println("  ┌────────────────────────────────────┐");
        System.out.println("  │         HungerBox — Bill           │");
        System.out.println("  ├────────────────────────────────────┤");
        System.out.println("  │  Order ID  : #" + orderId);
        System.out.println("  │  Customer  : " + customername);
        System.out.println("  │  Status    : " + status);
        System.out.println("  ├────────────────────────────────────┤");
        for (MenuItems item : list) {
            System.out.printf("  │  %-22s ₹%6.2f%n", item.getName(), item.getPrice());
        }
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  Subtotal              ₹%8.2f%n", subtotal);
        if (discountPercent > 0)
            System.out.printf("  │  Discount (%d%%)         -₹%7.2f%n", (int)discountPercent, subtotal - discounted);
        System.out.printf("  │  GST (5%%)              ₹%8.2f%n", tax);
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  TOTAL                 ₹%8.2f%n", total);
        System.out.println("  └────────────────────────────────────┘");
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomername() {
        return customername;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
class Restaurant {
    private String name;
    ArrayList<MenuItems> menu;
    ArrayList<Orders> o;


    Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.o = new ArrayList<>();

    }


    void addMenu(MenuItems item) {
        menu.add(item);
    }

    void showMenu()
    {
        for (int i = 0; i < menu.size() ; i++)
        {
            System.out.println((i+1) +" : "+menu.get(i).getDescription());

        }
    }
    Orders placeOrder(String name)
    {
        Orders order1 = new Orders(name);
        o.add(order1);
        return order1;
    }
     MenuItems getItem(int index)
     {
        return menu.get(index);
    }


    void showOrder(){
       for(Orders order:o){
           System.out.println("The order of "+order.getCustomername()+"  "+ order.getStatus()+menu.get(order.getOrderId()).getDescription());
       }
    }
}

public class HungerBox
{
    public static void main(String[] args)
    {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("  ║       Welcome to HungerBox 🍕     ║");
        System.out.println("  ╚═══════════════════════════════════╝");
    Restaurant res = new Restaurant("Spicy garden");
    res.addMenu(new VegItems("Paneer Butter masala",300,"veg"));
    res.addMenu(new VegItems("Soya Butter masala",200,"veg"));
        res.addMenu(new VegItems("Tofu Butter masala",250,"veg"));
        res.addMenu(new VegItems("Peanuts Butter masala",150,"veg"));
        res.addMenu(new VegItems("Soya Butter masala",200,"veg"));
        res.addMenu(new VegItems("Panner Butter masala",200,true));
        res.addMenu(new NonVegItems("Chicken Butter Masala",300,"Non veg"," Chicken "));
        res.showMenu();
        Orders ord=res.placeOrder("shaik SS ");
        ord.addItems(res.getItem(0));
        ord.addItems(res.getItem(1));
        ord.addItems(res.getItem(2));
        ord.addItems(res.getItem(5));
        res.showOrder();
        ord.prepareOrder();
        ord.generateBill(10);

    }
}