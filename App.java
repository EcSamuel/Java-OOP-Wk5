public class App {
    public static void main(String[] args) {
        testLogger(new SpacedLogger());
        testLogger(new AsteriskLogger());
    }

    private static void testLogger(Logger logger) {
        logger.log("Hello, World!");
        logger.error("This is an error message");
    }
}