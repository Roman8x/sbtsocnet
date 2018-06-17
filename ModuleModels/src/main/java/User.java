public class User {
    private String Surname;
    private String Firstname;

    public User(String surname, String firstname) {
        Surname = surname;
        Firstname = firstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "Surname='" + Surname + '\'' +
                ", Firstname='" + Firstname + '\'' +
                '}';
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
}
