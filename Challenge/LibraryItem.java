package in.Challenge;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public void checkOut(){
        System.out.println("Checkout");
    }
    public void returnItem(){
        System.out.println("Return the item");
    }
}
