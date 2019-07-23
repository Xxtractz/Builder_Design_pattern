package co.builder.co.za;

public class User
{
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String address;
    private final int age;

    public User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + "\n"
                + "Age: " + this.age + "\n"
                + "Phone: " + this.phoneNumber + "\n"
                + "Address: " + this.address ;
    }

    public static class UserBuilder{
        private final String firstName;
        private final String lastName;
        private String phoneNumber;
        private String address;
        private int age;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
