package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
       int number_of_books = 0;
       int track = 31;
       int discount = 0;
       double price = 0.0;
       for (int i: books) {
          if (track & (1 << i)) {
             number_of_books++;
             track &= ~(1 << i)
          }
       }
       if (number_of_books > 1) {
          discount = (number_of_books - 1) * 7;
       } else if (number_of_books > 3) {
          discount = discount + 7;
       }
       price = number_of_books * discount / 100;
       price = price + (books.length - number_of_books) * 8;
       return price;
    }
}
