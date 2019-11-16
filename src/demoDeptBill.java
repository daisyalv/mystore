public class demoDeptBill {

    public static void main(String [] args){

        Grocery a1 = new Grocery (9, "Milk",0,1, 2);
        Grocery a2 = new Grocery (3, "Banana",7,.5, 1);

        Clothes b1 = new Clothes (1, "Skirt",1,29, 2 ,"Arie");
        Clothes b2 = new Clothes (45, "Dress",1,45, 3,"Areo");

        a1.calculateDiscounts();
        a1.calculateTax();
        a1.calculateTotalPrice();

        a2.calculateDiscounts();
        a2.calculateTax();
        a2.calculateTotalPrice();

        b2.calculateDiscounts();
        b2.calculateTax();
        b2.calculateTotalPrice();

        b1.calculateDiscounts();
        b1.calculateTax();
        b1.calculateTotalPrice();

        a1.displayGrocery();
        a2.displayGrocery();

        b1.displayClothes();
        b2.displayClothes();

        System.out.println( " The total ammount for transaction is" +a1.calculateTotalPrice()  +a2.calculateTotalPrice() +b1.calculateTotalPrice() +b2.calculateTotalPrice());


    }
}
