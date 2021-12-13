public class Main {
    public static void main(String[] args) {
        MassIndexCalculator service = new MassIndexCalculator();
        double bmi = service.calculate(82, 1.77);
        System.out.println("Ваш индекс массы составляет " + bmi);
    }
}
