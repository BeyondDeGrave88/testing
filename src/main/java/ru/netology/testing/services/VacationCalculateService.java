package ru.netology.testing.services;

public class VacationCalculateService {
    public int calcCount(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int threshold = 0; // количество денег на счету
        for (int i = 0; i < 12; i++) {

            if (threshold >= expenses) { // можем ли отдыхать? //20000
                count++;// увеличиваем счётчик месяцев отдыха
                threshold = threshold - expenses;
            } else {
                threshold = threshold + income;
            }
        }
        return count;
    }
}
