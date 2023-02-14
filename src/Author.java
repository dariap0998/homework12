public class Author {
       private String fullName;

       public  Author (String fullName) {
              this.fullName = fullName;
       }

       public String getFullName() {
              return this.fullName;
       }
       @Override
       public String toString() {
              return "Автор книги - "+ getFullName();

       }
       @Override
       public boolean equals(Object other) {
              if (this.getClass() != other.getClass()) {
                     return false;
              }
              Author second = (Author) other;
              return this.fullName.equals(second.fullName);
       }
       @Override
       public int hashCode() {
              return java.util.Objects.hash(fullName);
       }
}
