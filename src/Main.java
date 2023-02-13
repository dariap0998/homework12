public class Main {

    public static void main(String[] args) {
        Author bulgakov = new Author("Mikhail Bulgakov");
        Book masterAndMargarita = new Book ("Master and Margarita", new Author(bulgakov.getFullName()), 1940);
        Author gogol = new Author("Nikolai Gogol");
        Book deadSouls = new Book("Dead Souls", new Author(gogol.getFullName()), 1842);

        System.out.println("Название книги - " + masterAndMargarita.getBookName() + " Автор - " + bulgakov.getFullName() + " Дата публикации - "  + masterAndMargarita.getPublicationDate());
        System.out.println("Название книги - " + deadSouls.getBookName() + " Автор - " + gogol.getFullName() + " Год издания - " + deadSouls.getPublicationDate());

        masterAndMargarita.setPublicationDate(1941);
        System.out.println(masterAndMargarita.getPublicationDate());

    }
}