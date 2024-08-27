public class Authorization {
    public static void checkAthorization(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (stringCorrect(login)) {
            throw new WrongLoginException("Логин указан не верно");
        }
        if (stringCorrect(password) && password.equals(confirmPassword)) {
            System.out.println("Логин и пароль указаны не верно");
        } else {
            throw new WrongPasswordException("Пароль указан не верно");
        }
    }

    private static boolean stringCorrect(String checkString) {
        if (checkString == null
                || checkString.isBlank()
                || checkString.length() > 20) {
            return false;
        }
        return checkString.matches("[a-z,A-Z-0_]*");
    }
}