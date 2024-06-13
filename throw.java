public class ThrowExample{
    static void checkEligibility(int age,int weight){
        if(age<12 && weight<40){
            throw new ArithmeticException("Student is not eligible");
        }
        else{
            System.out.println("Student entry is eligible");
        }
    }
    public static void main(String args[]){
        System.out.println("Registration process");
        checkEligibility(20,39);
        System.out.println("Have a nice day!!");
    }
}