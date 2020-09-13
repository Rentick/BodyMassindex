public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = service.calculate(190,110);
        System.out.println(weight);
    }
}