package com.google.tryit.ds.vmware;

public class ArmstrongNumber {

    public static void main(String[] args) {
        String givenNumber="888";
        int givenNum=Integer.parseInt(givenNumber);
        int lastDigit = givenNum%10;
        int firsttwodigit = givenNum/10;
        int seconddigit = firsttwodigit%10;
        int firstigit = firsttwodigit/10;
        int total = getTotalNumber(firstigit,seconddigit,lastdigit);
        if(givenNum == total) {
            System.out.println("GiveNumber="+givenNum+" is a ArmStrong Number");
        }
        else
        {
            System.out.println("GiveNumber="+givenNum+" is not a ArmStrong Number");
        }
    }

    private static int getTotalNumber(int firstigit, int seconddigit, int lastdigit) {
        return (firstigit*firstigit*firstigit)+(seconddigit*seconddigit*seconddigit)+(lastdigit*lastdigit*lastdigit);
    }
}
