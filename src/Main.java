import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Week we = Week.valueOf(sc.nextLine().toUpperCase());
        switch (we) {
            case MONDAY -> System.out.println(Week.MONDAY);
            case TEUSDAY -> System.out.println(Week.TEUSDAY);
            case WENDNSDAY -> System.out.println(Week.WENDNSDAY);
            case THUSDAY -> System.out.println(Week.THUSDAY);
            case FRIDAY -> System.out.println(Week.FRIDAY);
            case SATURDAY -> System.out.println(Week.SATURDAY);
            case SUNDAY -> System.out.println(Week.SUNDAY);
        }
    }
}