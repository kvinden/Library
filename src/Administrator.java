public class Administrator extends User implements iAdministrator{
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void findBook() {
        System.out.println("Administrator found a book");
    }

    @Override
    public void overdueNotification(User administrator) {
        System.out.println("Administrator notified reader - " + getName());
    }
}