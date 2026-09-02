// Last updated: 02/09/2026, 09:41:01
import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        return date.getDayOfWeek().toString().substring(0,1) +
               date.getDayOfWeek().toString().substring(1).toLowerCase();
    }
}