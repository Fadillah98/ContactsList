package sg.edu.rp.c346.contactslist;

public class Contacts {

    private String name;
    private String countryCode;
    private String phoneNum;

    public Contacts(String name, String countryCode, String phoneNum) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
