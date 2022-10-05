import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(recommendation(50,28));
        System.out.println(recommendation(37,20));
        System.out.println(recommendation(16,-5));
        System.out.println(recommendation(13,35));
        System.out.println(recommendation(54,-2));
        System.out.println(recommendation(generateRandomAge(), 10));
        System.out.println(recommendation(generateRandomAge(),generateRandomTemperature()));


    }


    public static String recommendation(int ageOfPerson, int temperatureOnTheStreet) {
        // возвращаемый метод с входящими параметрами
        if (ageOfPerson > 20 && ageOfPerson<45 && temperatureOnTheStreet>-20 &&temperatureOnTheStreet<30)
            //System.out.println("You can go for a walk");
            //System.out.println(goForAWalk());
            return goForAWalk();
            //return "You can go look";
        else if (ageOfPerson<20 && temperatureOnTheStreet>0 && temperatureOnTheStreet<28)
            //System.out.println(goForAWalk());
            return goForAWalk();
            //return "you can go look";
        else if (ageOfPerson>45 && temperatureOnTheStreet>-10 && temperatureOnTheStreet<25)
            //System.out.println(goForAWalk());
            return goForAWalk();
            //return "you can go look";

        else
            //System.out.println("stay at home");
            return "stay at home";
        }

        //return temperatureOnTheStreet;



    public static String goForAWalk() {
        // возвращаемый метод без входящих параметров


        return "You can go look";
    }

    public static int generateRandomAge(){
        int a = (int) (Math.random()*95);
       // Random a = new Random();
        System.out.println("random number of age: "+ a);
        return a;

    }

    public static int generateRandomTemperature(){
        //int b = (int) (Math.random()*(200+1)) - 100;
        Random random = new Random();
        int b = random.nextInt(50)-30;
        System.out.println("random number of temperature: "+ b);
        return b;

    }

}



