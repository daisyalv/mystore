public class Item{
    public String name;
    public int citem;

    public Item(int x, String y){


        this.citem = x;
        this.name= y;

    }
    void display(){
        System.out.println(" This is the item cod e" +citem);
        System.out.println(" This is the item's name " +name);
    }
}