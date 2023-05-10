package chapter6.profit;

import java.time.LocalDateTime;

public class MyProfit implements Profit{

    private long price;
    private final int date;

    public MyProfit(long price, int date) {
        this.price = price;
        this.date = date;
    }

    @Override
    public boolean hasProfit() {
        return price > 0;
    }

    @Override
    public void inputProfit(long profit) {
        this.price = profit;
    }

    @Override
    public long withdrawProfit() {
        long price = this.price;
        this.price = 0L;
        return price;
    }

    @Override
    public long getProfit() {
        return price;
    }

    @Override
    public int getDate() {
        return date;
    }

    @Override
    public boolean isTimeToWithdraw() {
        return LocalDateTime.now().getDayOfMonth() == date;
    }
}
