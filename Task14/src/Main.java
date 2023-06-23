public class Main {
    public static void main(String[] args) {
        Book bookdata=new Book();
        bookdata.setAuthor("manoj mandava");
        bookdata.setIsbn(123456789);
        bookdata.setPrice(400.99);
        bookdata.setTitle("Na savu nen sastha neek enduku");
        System.out.println("Author name"+bookdata.getAuthor());
        System.out.println("Book Name:"+bookdata.getTitle());
        System.out.println("Price"+bookdata.getPrice()+"$");
        System.out.println("Isbn:"+bookdata.getIsbn());

    }
}
