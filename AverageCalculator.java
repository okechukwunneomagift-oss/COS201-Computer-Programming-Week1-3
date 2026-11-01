public class AverageCalculator {
    public static void main(String[] args) {

        double score1 = 70;
        double score2 = 80;
        double score3 = 90;

        double total = score1 + score2 + score3;
        double average = total / 3;

        System.out.println("First score: " + score1);
        System.out.println("Second score: " + score2);
        System.out.println("Third score: " + score3);
        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);
    }
}