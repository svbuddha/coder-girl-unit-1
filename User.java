public class User {

    private String avatarUrl;
    private String userName;
    private String firstName;
    private String lastName;
    private String emailId;

    public User(String avatarUrl, String userName, String firstName, String lastName, String emailId) {
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void print() {
        System.out.println( "User avatarUrl = " + getAvatarUrl() + "\n" + "userName = " + getUserName() + "\n" +
        "firstName = " + getFirstName() + "\n" + "lastName = " + getLastName() + "\n" +"emailId = " + getEmailId() + "\n");
    }
}