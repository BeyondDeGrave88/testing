import ru.netology.testing.services.VacationCalculateService;


public class Main {
    public static void main(String[] args) {

        int income = 10000;
        int expenses = 3000;
        int threshold = 0;

        VacationCalculateService service = new VacationCalculateService();

        int count = service.calcCount(income, expenses);
        for(int i = 0; i <= 12; i++) {
            System.out.println("Месяц " + i + ". " + "Денег " + threshold + ". " + "Придётся работать. " + "Заработал " + "+" + income + ", " + "потратил -" + expenses);
        }

        System.out.println(count);

    }
}