public class AboveAverage {
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in);
        int k = scan.getInt();
        for (int i = 0; i < k; i++) {
            int n = scan.getInt();
            double[] grades = new double[n];
            double sum = 0;
            for (int j = 0; j < n; j++) {
                double grade = scan.getInt();
                grades[j] = grade;
                sum += grade;
            }
            double avg = sum/n;
            double count = 0;
            for (int j = 0; j < n; j++) {
                if (grades[j]>avg) {
                    count++;
                }
            }
            double res = count/n*100;
            System.out.printf("%.3f%%\n", res);
        }
    }
}