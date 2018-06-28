package view.edit.input.gaad_recyclerlist;

/**
 * Created by hp on 6/28/2018.
 */

public class UserData {

    String name, phoneNumber;
    int userType;

    public String getName() {
        return name;
    }

    public UserData setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserData setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int getUserType() {
        return userType;
    }

    public UserData setUserType(int userType) {
        this.userType = userType;
        return this;
    }
}
