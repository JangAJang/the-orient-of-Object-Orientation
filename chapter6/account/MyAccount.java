package chapter6.account;

import chapter6.profit.Profit;
import chapter6.profitRate.ProfitRate;
import chapter6.termDeposit.TermDeposit;

import java.time.LocalDateTime;
import java.util.UUID;

public class MyAccount implements Account{

    private final String id;
    private long money;
    private final TermDeposit termDeposit;
    private final ProfitRate profitRate;
    private final Profit profit;

    public MyAccount(TermDeposit termDeposit, ProfitRate profitRate, Profit profit) {
        this.id = UUID.randomUUID().toString();
        money = 0L;
        this.termDeposit = termDeposit;
        this.profitRate = profitRate;
        this.profit = profit;
    }

    public void passMonth(){
        if(profit.hasProfit()){
            money += profit.withdrawProfit();
        }
        long nextProfit = profitRate.calculateProfit(money);
        profit.inputProfit(nextProfit);
    }

    public long finishTermDeposit(){
        if(termDeposit.isFinished()){
            long total = money + profit.withdrawProfit();
            money = 0L;
            termDeposit.finishTermDeposit();
            return total;
        }
        LocalDateTime localDateTime = LocalDateTime.now();
        while(localDateTime.getDayOfMonth() < profit.getDate()){
            localDateTime = localDateTime.plusDays(1);
        }
        System.out.println("이자 금액은 " + localDateTime.toLocalDate()+"에 반환됩니다.");
        termDeposit.finishTermDeposit();
        return money;
    }

    @Override
    public void depositMoney(long money) {
        this.money += money;
    }

    @Override
    public long withdrawMoney() {
        long tmp = money;
        money = 0L;
        return tmp;
    }
}
