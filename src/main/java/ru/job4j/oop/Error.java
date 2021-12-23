package ru.job4j.oop;

public class Error {
    private boolean aktiv;

    private int status;

    private String message;

    public Error(boolean aktiv, int status, String message) {
        this.aktiv = aktiv;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Актив " + aktiv);
        System.out.println("Cтатус равен " + status);
        System.out.println("Сообщение: " + message);
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error2 = new Error(true, 7, "Выпей 7 литров пива");
        error2.printInfo();
        Error error3 = new Error(true, 11, "Спи 11 часов");
        error3.printInfo();
        Error error4 = new Error(false, 1, "Иди на работу отдохнувшим");
        error4.printInfo();
    }
}
