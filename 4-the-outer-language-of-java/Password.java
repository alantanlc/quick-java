public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean matches(String attempt) {
        return attempt.equals(password); // always use equals to compare strings instead of ==
    }

    boolean reset(String oldPassword, String newPassword) {
        if (matches(oldPassword)) {
            password = newPassword;
        }
        return password.equals(newPassword);
    }
}

