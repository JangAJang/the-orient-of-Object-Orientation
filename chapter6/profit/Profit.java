package chapter6.profit;

public interface Profit {

    void inputProfit(long profit);
    long withdrawProfit();
    boolean isTimeToWithdraw();
    boolean hasProfit();
    long getProfit();
    int getDate();
}
