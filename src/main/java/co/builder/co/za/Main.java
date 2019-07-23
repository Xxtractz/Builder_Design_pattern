package co.builder.co.za;

public class Main {

    public static void main(String[] args) {
        User Musa = new User.UserBuilder("Musa", "Baloyi")
                .age(21)
                .address("")
                .phoneNumber("")
                .build();
    }
}
