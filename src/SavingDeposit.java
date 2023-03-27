public class SavingDeposit extends SuperDeposit implements Deposit{
    String type = SAVING_DEPOSIT;
    @Override
    public String getDepositType() {
        return this.type;
    }
}