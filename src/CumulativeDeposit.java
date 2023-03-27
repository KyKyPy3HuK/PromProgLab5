public class CumulativeDeposit extends SuperDeposit implements Deposit{
    String type = CUMULATIVE_DEPOSIT;
    @Override
    public String getDepositType() {
        return this.type;
    }
    public void addSum(double sum){
        super.sum += sum;
    }
    public double takeSum(double targetSum){
        if (super.sum >= targetSum){
            super.sum -= targetSum;
            return targetSum;
        }
        return -1;
    }
}