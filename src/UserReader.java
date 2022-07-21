public class UserReader implements Reader {
    private String name;

    public UserReader(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void takeBoob(Administrator administrator, Book book) { // метод читателя
        System.out.println("Читатель " + name + " взял книгу: " + book.getTitle() + ", автор: " + book.getAuthor() + " от администратора " + administrator.name());
    }

    @Override
    public void returnBook(Administrator administrator, Book book) { // метод читателя
        System.out.println("Читатель " + name + " вернул книгу: " + book.getTitle() + ", автор: " + book.getAuthor() + " администратору " + administrator.name());

    }
}
