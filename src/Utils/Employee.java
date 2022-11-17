package Utils;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String photo;

    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, String photo){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String toString(){
        return("ID: " + id + ", FIRST_NAME: " +
                firstName + ", LAST_NAME: " + lastName +
                ", PHOTO: " + photo);
    }

    public boolean isNull(){
        return false;
    }
}