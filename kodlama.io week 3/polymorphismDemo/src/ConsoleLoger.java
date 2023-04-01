public class ConsoleLoger extends BaseLogger {
    public void log(String message)
    {
        System.out.println("Logged to Console : " + message);
    }
}
