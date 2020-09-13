public class BmiService {
    public int calculate(int height, int averageValue) {
        int weight = height - averageValue;
        return weight;
    }
}