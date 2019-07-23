package person;

public class DefaultPerson implements Person {

    //Require Params
    private final String firstName;
    private final String lastname;

    //Optional Params
    protected String phoneNumber;
    protected int age;
    protected String address;

    public DefaultPerson(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public DefaultPerson(String phoneNumber, int age, String address) {
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
