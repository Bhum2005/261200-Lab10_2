public class XpayToPayDAdapter implements PayD{
    private final Xpay xpay;
    public XpayToPayDAdapter(Xpay xpay){
        this.xpay = xpay;
    }
    public long getCreditCardNo(){
        return Long.parseLong(xpay.getCreditCardNo());
    }
    public void setCreditCardNo(long creditCardNo){
        xpay.setCreditCardNo(String.valueOf(creditCardNo));
    }
    public String getCardOwnerName(){
        return xpay.getCustomerName();
    }
    public void setCardOwnerName(String cardOwnerName){
        xpay.setCustomerName(cardOwnerName);
    }
    public String getCardExpMonthYear(){
        return xpay.getCardExpMonth()+"/"+ xpay.getCardExpYear();
    }
    public void setCardExpMonthYear(String cardExpMonthYear) {
        xpay.setCardExpMonth(cardExpMonthYear.substring(0, 2));
        xpay.setCardExpYear(cardExpMonthYear.substring(3, 2));
    }
    public Integer getCVVNo() {
        Short cvv = xpay.getCardCVVNo();
        return cvv.intValue();
    }
    public void setCVVNo(Integer cVVNo){
        xpay.setCardCVVNo(cVVNo.shortValue());
    }
    public Double getTotalAmount(){
        return xpay.getAmount();
    }
    public void setTotalAmount(Double totalAmount){
        xpay.setAmount(totalAmount);
    }
}
