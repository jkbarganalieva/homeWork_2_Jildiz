import java.util.Random;

public class Main {
    public static void main(String[] args) {
    recommendation(50,28);
    recommendation(37,20);
    recommendation(16,-5);
    recommendation(13,35);
    recommendation(54,-2);
    recommendation(generateRandomAge(), 10);
    recommendation(generateRandomAge(),generateRandomTemperature());

        //System.out.println(generateRandomTemperature());
    }


    public static int recommendation(int ageOfPerson, int temperatureOnTheStreet) {
        // возвращаемый метод с входящими параметрами
        if (ageOfPerson > 20 && ageOfPerson<45 && temperatureOnTheStreet>-20 &&temperatureOnTheStreet<30){
            //System.out.println("You can go for a walk");
            System.out.println(goForAWalk());
        }else if (ageOfPerson<20 && temperatureOnTheStreet>0 && temperatureOnTheStreet<28){
            System.out.println(goForAWalk());
        }

        else if (ageOfPerson>45 && temperatureOnTheStreet>-10 && temperatureOnTheStreet<25){
            System.out.println(goForAWalk());
        }
        else{
            System.out.println("stay at home");
        }

        return temperatureOnTheStreet;

    }

    public static String goForAWalk() {
        // возвращаемый метод без входящих параметров


        return "You can go look";
    }

    public static int generateRandomAge(){
        int a = (int) (Math.random()*95);
       // Random a = new Random();
        System.out.println("random number of age: "+ a);
        return a;

    }public static int generateRandomTemperature(){
        //int b = (int) (Math.random()*(200+1)) - 100;
        Random random = new Random();
        int b = random.nextInt(50)-30;
        System.out.println("random number of temperature: "+ b);
        return b;

    }

    }



