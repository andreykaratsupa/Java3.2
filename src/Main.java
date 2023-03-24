public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8; // м
        double weight = 70; // кг
        double index = service.calculate(height, weight); // должно получиться 21
        System.out.println("Индекс массы тела = " + (int) index);
    }
}