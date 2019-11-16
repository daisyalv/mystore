public class Grocery extends Item {
    private String name;
    private int citem;

    private double units;
    private double tax;
    private int discount;
    private double price;
    private double savings;
    private double sub;
    private double tax2;
    private double up;
    private double fine2;


    public Grocery (int x, String y, int a, double b, double c) {
        super(x, y);
        citem = x;
        name = y;
        price = b;
        units = c;
        discount = a;
        up = price / units;
    }

    public double calculateTotalPrice() {

        fine2 = sub + tax2;
        return fine2;
    }

    public void calculateTax() {
        tax2 = sub * 0.000825;
    }

    public void calculateDiscounts() {
        savings = (discount/100) * price;
        sub = (price * (discount/100) - price);
    }

    public void displayGrocery() {

        System.out.println("This is the item's code " + citem);
        System.out.println("This is the name " +name);
        System.out.println("This is thr unit's price " + up);
        System.out.println("This is the unit " + units);
        System.out.println("This is your subtotal " + sub);
        System.out.println("This is your savings " + savings);
        System.out.println("This is your total tax " + tax2);
        System.out.println("This is your final price " + fine2 + "\n");

    }
}