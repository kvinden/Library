public class Supplier implements iSupplier, iReader{
    @Override
    public void bringBook() {
        System.out.println("Supplier ordered a book");
    }

    @Override
    public void takeBook() {
        System.out.println("Supplier took a book");
    }

    @Override
    public void returnBook() {
        System.out.println("Supplier returned a book");
    }
}