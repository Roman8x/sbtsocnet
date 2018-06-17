public class Person {
    private int id;
    private String Surname;
    private String Firstname;


    public Person(String surname, String firctname) {
        Surname = surname;
        Firstname = firctname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Surname='" + Surname + '\'' +
                ", Firstname='" + Firstname + '\'' +
                '}';
    }
}
