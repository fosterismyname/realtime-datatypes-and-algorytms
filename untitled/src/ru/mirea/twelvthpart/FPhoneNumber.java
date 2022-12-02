package ru.mirea.twelvthpart;

public class FPhoneNumber {
    private String code, city, triplet, quadruple;

    public FPhoneNumber(String phone){
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        triplet = phone.substring(phone.length()-7, phone.length()-4);
        quadruple = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return code + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String[] args) {
        System.out.println(new FPhoneNumber("89505299597"));
    }
}