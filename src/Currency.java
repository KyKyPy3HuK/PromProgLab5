public class Currency {
    private double currencyCoef;
    protected Currency(double currencyCoef){
        this.currencyCoef = currencyCoef;
    }
    double getCurrencyCoef(){
        return currencyCoef;
    }
    void setCurrencyCoef(double currencyCoef){
        this.currencyCoef = currencyCoef;
    }
}
