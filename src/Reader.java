public class Reader extends User implements iReader, iAdministrator {
    public Reader(String name) {
        super(name);
    }

    @Override
    public void takeBook() {
        System.out.println("Reader took a book");
    }

    @Override
    public void returnBook() {
        System.out.println("Reader returned a book");
    }

    @Override
    public void findBook() {
        System.out.println("Reader found a book");
    }

    @Override
    public void overdueNotification(User user) {
    }
}