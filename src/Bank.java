
class Banks{
    public void Banks(){
        System.out.println("Bank is used to save money");
    }
}
class Sbi extends Banks {
    int SbiRateOfIntrest(int x){
        return x;
    }
}
class Axis extends Banks{
    int AxisRateOfIntrest (int y){
        return y;
    }
}
public class Bank{
    public static void main(String[] args) {
        Banks b = new Banks();
        Sbi s = new Sbi();
        Axis a = new Axis();

        b.Banks();
        System.out.println("The rate of intrest for SBI is : "+ s.SbiRateOfIntrest(7));
        System.out.println("The rate of intrest for Axix is : "+   a.AxisRateOfIntrest(10));
    }
}