public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int high = (int) 1.87;
        int weight = 98;
        int index = high / weight;
        System.out.println((int)index);
    }
}