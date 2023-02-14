public class Book {
      private String bookName;
      private Author author;
      private int publicationDate;

      public Book(String bookName, Author author, int publicationDate) {
            this.bookName = bookName;
            this.author = author;
            this.publicationDate = publicationDate;

      }

      public String getBookName() {
            return this.bookName;
      }

      public Author getAuthor() {
            return this.author;
      }

      public int getPublicationDate() {
            return this.publicationDate;
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
            if (this.getClass() != other.getClass()) {
                  return false;
            }
            Book second = (Book) other;
            return this.bookName.equals(second.bookName);

      }

      @Override
      public int hashCode() {
            return java.util.Objects.hash(bookName);
      }
}
