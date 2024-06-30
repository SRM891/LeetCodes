public class AverageSalary {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minidx = -1;
        int maxidx = -1;
        int sum = 0;
        for (int i=0; i< salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
                minidx = i;
            }
            if (salary[i] > max) {
                max = salary[i];
                maxidx=i;
            }
            sum+=salary[i];
        }
        sum-=(salary[minidx]+salary[maxidx]);
        return (double) sum/ (salary.length-2);
    }
}
