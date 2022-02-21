

public class Main {
    public static void main(String[] args) {
        ParseArgs parseArgs = new ParseArgs(args);
        switch (parseArgs.getAlg()) {
            case "unicode": {
                Unicode unicode = new Unicode(parseArgs);
                unicode.run();
                break;
            }
            case "shift": {
                Shift shift = new Shift(parseArgs);
                shift.run();
            }
        }
    }
}
