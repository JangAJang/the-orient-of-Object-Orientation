package chapter6.profitRate;

public class MyProfitRate implements ProfitRate{

    private final float rate;

    public MyProfitRate(float rate) {
        this.rate = rate;
    }

    @Override
    public long calculateProfit(long money) {
        return (long)(money*rate);
    }
}
