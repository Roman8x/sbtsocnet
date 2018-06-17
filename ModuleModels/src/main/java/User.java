import java.util.List;

public class User implements Inviteable, Profileable {
    private String Surname;
    private String Firstname;
    private UserProfile userProfile;
    private List<Album> albums;

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

    public void sendInvite(User user) {

    }

    public void acceptInvite(Invite invite) {

    }

    public void refuseInvite(Invite invite) {

    }

    public void revokeInvite(User user) {

    }

    public UserProfile getProfile(User user) {
        return this.userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public void addAlbum(Album album){

    }



}
