
public static void main(String[] args) {
    Xpay xpay = new XpayImpl(); // สร้างตัวแปร class Xpay ชื่อ xpay
    xpay.setCreditCardNo("4789565874102365");
    xpay.setCustomerName("Somchai Jaidee");
    xpay.setCardExpMonth("09");
    xpay.setCardExpYear("25");
    xpay.setCardCVVNo((short) 235);
    xpay.setAmount(2565.23);

    PayD payD = new XpayToPayDAdapter(xpay); //สร้างตัวแปร payD ใน class PayD ซึ่งเป็น class XpayToPayDAdapter เพื่อใส่ ตัวแปร xpay ในการเรียกดูข้อมูลของ xpay ผ่านฟังก์ชั่นของ PayD

    // Print values from the adapted PayD interface
    System.out.println("Credit Card Number: " + payD.getCreditCardNo());
    System.out.println("Card Owner Name: " + payD.getCardOwnerName());
    System.out.println("Card Expiry Date: " + payD.getCardExpMonthYear());
    System.out.println("CVV: " + payD.getCVVNo());
    System.out.println("Total Amount: " + payD.getTotalAmount());
}