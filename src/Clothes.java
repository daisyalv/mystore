public class Clothes extends Item {
    private String brands;
    private int citem;

    private double units;
    private double tax;
    private int discount;
    private double price;
    private double savings;
    private double sub;
    private double fine;
    private double up;

    final double TP = 8.5;

    public Clothes (int x, String y, int a, double b, double c, String d) {
        super(x, y);
        citem = x;
        name = y;
        price = b;
        units = c;
        discount = a;
        up = price / units;
        brands= d;
    }

    public double calculateTotalPrice() {

        fine = price + tax - discount;
        return fine;
    }

    public void calculateTax() {
        tax = TP + price;
    }

    public void calculateDiscounts() {
        savings = discount;
        sub = price - discount;
    }

    public void displayClothes() {

        System.out.println("This is the item's codec" + citem);
        System.out.println("This is the brandc" + brands);
        System.out.println("This is thr unit's pricec" + up);
        System.out.println("This is the unit " + units);
        System.out.println("This is your subtotal " + sub);
        System.out.println("This is your savings " + savings);
        System.out.println("This is your total tax " + tax);
        System.out.println("This is your final price " + fine + "\n");

    }
}


