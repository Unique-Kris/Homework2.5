public class Main {
    public static void main(String[] args) {
        try {
            Authorization.checkAthorization("admin", "admin", "admin");
        } catch (WrongLoginException e) {
            System.out.println("Логин указан не верно");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль указан не верно");
        } finally {
            System.out.println("Работа блока завершена");
        }
    }
}