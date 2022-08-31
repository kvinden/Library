public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Matthew");
        reader.findBook();
        Librarian librarian = new Librarian("Peter");
        librarian.overdueNotification(librarian);
        Supplier supplier = new Supplier();
        supplier.returnBook();
        Administrator administrator = new Administrator("Paul");
        administrator.overdueNotification(administrator);
    }
}