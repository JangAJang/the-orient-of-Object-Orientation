package chapter6.termDeposit;

import java.time.LocalDateTime;

public class MyTermDeposit implements TermDeposit{

    private boolean expired;
    private LocalDateTime localDateTime;

    public MyTermDeposit(boolean expired, LocalDateTime localDateTime) {
        this.expired = expired;
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean isExpired() {
        return expired;
    }

    @Override
    public void finishTermDeposit() {
        expired = true;
        localDateTime = LocalDateTime.now();
    }

    @Override
    public boolean isFinished() {
        return localDateTime.isBefore(LocalDateTime.now()) ||
                localDateTime.isEqual(LocalDateTime.now());
    }
}
