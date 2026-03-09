public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission (String name,String address,String phone,String socSecNum, double hourPayRate, double commissionRate){
    super (name,address, phone, socSecNum, hourPayRate);
    this.commissionRate = commissionRate;
    }

    public void addSales (double moreSales ){
        totalSales += moreSales;

    }

    @Override
    public double pay (){
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += "\n Total Sales: " + totalSales;
        return result;

    }
}

