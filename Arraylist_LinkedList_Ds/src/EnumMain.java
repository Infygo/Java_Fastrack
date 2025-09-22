import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EnumMain {
    public static void main(String[] args) {
        var weekDay = DayOfTheWeek.MON;

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.println(weekDay + "Cardinal value is :" + weekDay.ordinal());
        }

    }

    public static DayOfTheWeek getRandomDay() {
        int rand = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[rand];
    }
}
