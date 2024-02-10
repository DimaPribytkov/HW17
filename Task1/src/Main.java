import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine wine = new Wine("Мондоро", "Вина кубани",
                "Россия", LocalDate.of(2001, 10, 12),
                "Белое сладкое");
    wine.winePeriod(LocalDate.now());
        System.out.println(wine.getTitleWine());
    }
}