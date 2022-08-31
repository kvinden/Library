public class Librarian extends User implements iLibrarian, iAdministrator{
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void orderBook() {
        System.out.println("Librarian ordered a book");
    }

    @Override
    public void findBook() {
        System.out.println("Librarian found a book");
    }

    @Override
    public void overdueNotification(User librarian) {
        System.out.println("Librarian notified user - " + getName());
    }
}