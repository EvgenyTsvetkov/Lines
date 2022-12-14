public class StatService {

       public long sum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long average(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum / 12;
    }

    public int belowAverage(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for(long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }
}
