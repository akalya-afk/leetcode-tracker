// Last updated: 13/07/2026, 09:57:18
1import java.time.LocalDate;
2
3class Solution {
4    public String dayOfTheWeek(int day, int month, int year) {
5
6        LocalDate date = LocalDate.of(year, month, day);
7
8        return date.getDayOfWeek().toString().substring(0,1) +
9               date.getDayOfWeek().toString().substring(1).toLowerCase();
10    }
11}