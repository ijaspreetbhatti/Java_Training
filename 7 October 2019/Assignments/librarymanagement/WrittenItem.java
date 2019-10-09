/**
 * WrittenItem
 */
public abstract class WrittenItem extends Item {

    private String Author;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((Author == null) ? 0 : Author.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        WrittenItem other = (WrittenItem) obj;
        if (Author == null) {
            if (other.Author != null)
                return false;
        } else if (!Author.equals(other.Author))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "WrittenItem [Author=" + Author + "]";
    }
}