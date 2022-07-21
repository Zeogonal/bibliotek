public class Admin implements Administrator {
    private String name;
    public Admin(String name) {
        this.name = name;
    }
    @Override
    public String name() {
        return name;
    }
    @Override
    public void findBook(Reader reader, Book book) {
        System.out.println("Администратор " + name + " находит для " + reader.name() + " книгу " + book.getTitle() + ", автор: " + book.getAuthor());
    }
    @Override
    public void giveBook(Reader reader, Book book) {
        System.out.println("Администратор " + name + " забрал у " + reader.name() + " книгу " + book.getTitle() + ", автор: " + book.getAuthor());
    }
    @Override
    public void overdueNotification(Reader reader, Book book) {
        System.out.println("Администратор " + name + " уведомляет " + reader.name() + " о просрочке книги " + book.getTitle());
    }
}
