package ru.netology.testing.services;

public class VacationCalculateService {
    public int calcCount(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int treshold = 0;// количество денег на счету
        for (int month = 1; month < 12; month++) {

            if (treshold >= 150000) { // можем ли отдыхать? //20000
                count++;// увеличиваем счётчик месяцев отдыха
                treshold = treshold - expenses;
                treshold = treshold / 3;
            } else {
                treshold = treshold + income - expenses;
            }
        }
        return count;
    }
}
