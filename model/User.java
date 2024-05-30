package model;

public abstract class User {
    private String secondName;
    private String firstName;
    private String lastName;
    private String birthDate;

    public User(String secondName, String firstName, String lastName, String birthDate) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User [secondName=" + secondName + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
                + birthDate + "]";
    }

}