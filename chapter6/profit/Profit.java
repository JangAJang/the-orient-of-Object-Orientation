package chapter6.account.profit;

public interface Profit {

    void inputProfit(long profit);
    long withdrawProfit(long profit);
    boolean isTimeToWithdraw();
}
