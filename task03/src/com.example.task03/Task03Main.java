package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] days = { "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье" };
        return weekDaysNumber <= 7 ? days[weekDaysNumber - 1] : "такого дня недели не существует";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}