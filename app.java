
    import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateString = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthdate = LocalDate.parse(birthdateString, formatter);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthdate, today);
        System.out.println("Your age is: " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days.");
    }
}



    

