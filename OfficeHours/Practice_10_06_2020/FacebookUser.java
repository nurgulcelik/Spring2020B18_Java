package OfficeHours.Practice_10_06_2020;
/*
Facebook User:
(*) Create a class for a facebook user which inherits the Social Media class and
additional instance variables: username, password, full name, age, and number of friends
(*) Encapsulate all the variables.
(*) Create a constructor which will create a facebook user by taking username and password.
    - If the password contains the username then it is not a valid password and should not be saved.
    In this case Print “Password contained username.
    Default password created: ‘password’” and set the password for the user to the default value.
    - Create and assign the the user's person url by taking 'facebook.com/' and adding their username
    - Set the account length to 0
    - Set the platform for "Facebook" using static block
(*) Overload the constructor to accept username, password, and the user’s name.
    - If the name entered has any characters that are not letters from the alphabet, then the name is invalid.
     In this case print “invalid name” and assign the name value to be ‘no name’
(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
    - Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ).
     If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
 */
public class FacebookUser extends SocialMedia{
    private String username;
    private String password;
    private String fullName;
    private int age; private int numberOfFriends;
    static{
        platform="Facebook";
    }

    public FacebookUser(String username, String password) {
        setUsername(username);
        setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains(username)) {
            System.out.println("Invalid password, username is in password");
            password = "password";
        }
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    @Override
    public boolean directMessage(String username, String message) {
        return false;
    }

    @Override
    public boolean createPost(String body) {
        return false;
    }

    @Override
    public void notification(int time) {

    }
}
