import java.util.Objects;

public class Author {
       private final String fullName;

       public  Author (String fullName) {
              this.fullName = fullName;
       }

       public String getFullName() {
              return fullName;
       }
       @Override
       public String toString() {
              return "Автор книги - " + getFullName();
       }
       @Override
       public boolean equals(Object other) {
              if (this == other) return true;
              if (other == null || this.getClass() != other.getClass()) return false;
              Author author = (Author) other;
              return Objects.equals(fullName, author.fullName);
       }
       @Override
       public int hashCode() {
              return Objects.hash(fullName);
       }


}
