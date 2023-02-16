import java.util.Objects;

public class Book {
      private final String bookName;
      private final Author author;
      private int publicationDate;

      public Book(String bookName, Author author, int publicationDate) {
            this.bookName = bookName;
            this.author = author;
            this.publicationDate = publicationDate;

      }

      public String getBookName() {
            return bookName;
      }

      public Author getAuthor() {
            return author;
      }

      public int getPublicationDate() {
            return publicationDate;
      }

      public void setPublicationDate(int publicationDate) {
            this.publicationDate = publicationDate;
      }
      @Override
      public String toString() {
            return "Название книги - " + getBookName() + " Год издания - " + getPublicationDate();
      }

      @Override
      public boolean equals(Object other) {
            if (this == other) return true;
            if (other == null || this.getClass() != other.getClass()) return false;
            Book book = (Book) other;
            return publicationDate == book.publicationDate && Objects.equals(book, book.bookName) && Objects.equals(author, book.author);

      }
      @Override
      public int hashCode() {
            return Objects.hash(bookName, author, publicationDate);
      }


}
