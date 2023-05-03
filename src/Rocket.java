class Rockets {
    public void rocketFunction() {
        System.out.println("Rockets use fuel to move up");
    }
}
class Spacex extends Rockets{
         public void rocketFunction(){
        System.out.println("These rockets are reusable");
         }
         public void falcon9(){
            System.out.println("It is reusable rocket");
        }
        public void falcon9(int price){
            System.out.println("it cost around 70M");
        }
}
    class Isro extends Rockets{
    public void rocketFunction(){
        System.out.println("These are not reusable");
    }
        public void gslv(){
            System.out.println("It is not a reusable rocket");
        }
        public void gslv(int price){
            System.out.println("It cost around 50M");
        }
    }

public class Rocket {
    public static void main(String[] args) {
        Rockets r = new Rockets();
        Rockets s = new Spacex();
        Rockets i = new Isro();
        Rocket rr = new Rocket();

        r.rocketFunction();
        s.rocketFunction();
        i.rocketFunction();

    }
}
