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

    protected DefaultPerson(Builder builder) {

        this(builder.getFirstName(), builder.getFirstName());
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastname() {
        return this.lastname;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //inner Class
    class Builder extends DefaultPerson{
        public Builder(String firstName, String lastname) {
            super(firstName, lastname);
        }

        public Builder phone(String phone){
            this.phoneNumber = phone;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new DefaultPerson(this);
        }
    }
}
