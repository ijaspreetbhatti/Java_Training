import java.util.ArrayList;

/**
 * Item
 */

abstract public class Item {

    private int identificationNumber, numberOfCopies;
    private String title;

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item [identificationNumber=" + identificationNumber + ", numberOfCopies=" + numberOfCopies + ", title="
                + title + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + identificationNumber;
        result = prime * result + numberOfCopies;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (identificationNumber != other.identificationNumber)
            return false;
        if (numberOfCopies != other.numberOfCopies)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    void checkIn(Item item, ArrayList itemList){

    }

    void checkOut(){

    }

    void addItem(Item item, ArrayList itemList){
        itemList.add(item);
    }

    void print(){
        System.out.println("IdentificationNumber=" + this.identificationNumber + ", NumberOfCopies=" + this.numberOfCopies + ", Title=" + this.title);
    }
}