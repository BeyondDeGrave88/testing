import ru.netology.testing.services.VacationCalculateService;


public class Main {
    public static void main(String[] args) {

        int income = 100000;
        int expenses = 60000;

        VacationCalculateService service = new VacationCalculateService();

        int count = service.calcCount(income, expenses);
        int threshold = 0;
        for (int month = 1; month <= 12; month++) {
            System.out.println("Месяц " + month + ". " + "Денег " + threshold + ". " + "Придётся работать. " + "Заработал " + "+" + income + ", " + "потратил -" + expenses);
        }
        System.out.println(count);
    }
}