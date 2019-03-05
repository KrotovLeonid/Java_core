package Lesson2;

public enum WeekDays {
    MONDAY(5, false),
    TUESDAY(4, false),
    WEDNESDAY(3, false),
    THURSDAY(2, false),
    FRIDAY(1, false),
    SATURDAY(0, true),
    SUNDAY(0, true);

    int workingHours = 8;
    boolean dayOff;
    int daysToWeekand;


    WeekDays(int daysToWeekand, boolean dayOff){
        this.dayOff = dayOff;
        this.daysToWeekand = daysToWeekand;
    }
    public void workingTime(){
        if(dayOff == true){
            System.out.println("Выходной день");
        }else {
            System.out.println("Осталось рабочих часов: " + daysToWeekand*workingHours);
        }
    }
}
