package Ls19_Enum.HomeWork;

public enum DayOfWeek {
    MONDAY("Дуйшомбу куну жава окуйм"),
    TUESDAY("Шейшемби куну англис тилин окуйм"),
    WENESDAY("Шаршемби куну Жава окуйм"),
    THURSDAY("Бейшенби куну англис тил окуйм окуйм"),
    FRIDAY("Жума куну жава окуйм"),
    SATURDAY("Ишенби эс алам"),
    SUNDAY("Жекшемби эс алам");
    private String dayOfTheWeek;

    DayOfWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }
}
