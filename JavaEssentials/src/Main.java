public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String day = "MONDAY" ;
        int numLetters = switch(day) {
            case "MONDAY","TUESDAY","SUNDAY" -> 6;
            case "THURSDAY" -> 7;
            case "WEDNESDAY" -> 9;
            default -> 10;
        };
        System.out.println(numLetters);
    }
}