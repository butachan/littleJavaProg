import java.time.LocalDate;
import java.time.Period;
public class Age {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1994, 8, 17);
        int years = Period.between(birthday, today).getYears();
        int ageinMonths= years * 12 + Period.between(birthday, today).getMonths();

        System.out.println(ageinMonths);
        System.out.println(years);
    }
}
