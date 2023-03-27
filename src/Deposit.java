public interface Deposit {
    String SAVING_DEPOSIT = "Сберегательный вклад";
    String CUMULATIVE_DEPOSIT = "Накопительный вклад";
    double getDepositSum();
    String getDepositType();
    double getMonthlyPercent();
    Currency getCurrency();
    int getTermInDays();
    void setTermInDays(int termInDays);
    void setMonthlyPercent(double monthlyPercent);
    void changeCurrency(Currency currency);
    double calculateAccruals();
}
