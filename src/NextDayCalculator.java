public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        if (day == 28 || day == 29 || day == 30 || day == 31) {
            switch (month) {
                case 2 -> {
                    if (isDivisibleBy4) {
                        if (isDivisibleBy100) {
                            if (isDivisibleBy400) {
                                day = 1;
                                month++;
                            }
                        } else {
                            day = 1;
                            month++;
                        }
                    } else {
                        day = 1;
                        month++;
                    }
                }
                case 1, 3, 5, 7, 8, 10 -> {
                    day = 1;
                    month++;
                }
                case 4, 6, 9, 11 -> {
                    day = 1;
                    month++;
                }
                case 12 -> {
                    day = 1;
                    month = 1;
                    year++;
                }
            }
        } else {
            day++;
        }
        return "" + day + "/" + month + "/" + year;
    }
}
