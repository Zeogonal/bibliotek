public class User implements Supplier, Librarian {//Пользователи
    private final String name;
    public User(String name) {
        this.name = name;
    }
    @Override
    public String name() {
        return name;
    }
    @Override // метод поставщика
    public void bringsBook(Administrator administrator, Book book) {
        System.out.println("Поставщик " + name + " принес кнугу " + book.getTitle() + ", автор: " + book.getAuthor() +
                " и передал администратору " + administrator.name());
    }
    @Override // Метод библеотекаря
    public void orderBook(Supplier supplier, Book book) {
        System.out.println("Библеотекарь " + name + " заказывает книгу " + book.getTitle() + ", автор: " + book.getAuthor() +
                " от поставщика " + supplier.name());
    }
}
