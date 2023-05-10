package chapter6.termDeposit;

public interface TermDeposit {

    boolean isExpired();
    void finishTermDeposit();
    boolean isFinished();
}
