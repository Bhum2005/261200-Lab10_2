
public class XpayImpl implements Xpay {
    private String creditCardNo;
    private String customerName;
    private String cardExpM;
    private String cardExpY;
    private Short cardCVVNo;
    private Double Amount;
    // TODO: Add the remaining fields

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    // TODO: Implement the remaining methods
    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCardExpMonth(){
        return cardExpM;
    }

    public void setCardExpMonth(String cardExpM){
        this.cardExpM = cardExpM;
    }

    public String getCardExpYear(){
        return cardExpY;
    }

    public void setCardExpYear(String cardExpY){
        this.cardExpY = cardExpY;
    }

    public Short getCardCVVNo(){
        return cardCVVNo;
    }

    public void setCardCVVNo(Short cardCVVNo){
        this.cardCVVNo = cardCVVNo;
    }

    public Double getAmount(){
        return Amount;
    }

    public  void setAmount(Double amount){
        this.Amount = amount;
    }

}