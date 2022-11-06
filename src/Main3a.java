public class Main3a {
    public static void main(String[] args) {


        {
        boolean raining = false;
        boolean haveUmbrella = false;
        int temperature = 20;

        System.out.println("Temperature:" + temperature + " raining:" + raining + " umbrella close at hand:" + haveUmbrella);

        if((temperature > -20)&&(temperature < 40)) {
            if ((temperature > -10) && (temperature < 10)) {
                if(raining) {
                    if(haveUmbrella) {
                        System.out.println("Temperature is between -10 and 10 Celcius degrees. It's rainy, but you have an umbrella. You can go for a walk, stupid!");
                    } else {
                        System.out.println("Temperature is between -10 and 10 Celcius degrees. It's rainy, but you don't have an umbrella. You can't go for a walk, stupid!");
                    }
                } else {
                    System.out.println("Temperature is between -10 and 10 Celcius degrees. It's not rainy, so you don't have to worry about an umbrella. You can go for a walk, stupid!");
                }
            } else if (temperature >= 10) {
                System.out.println("Temperature is above 10 Celcius degrees. It' rainy, but you have an umbrella. You can go for a walk, stupid!");


//                    && ((raining) && (haveUmbrella)) ) {

            }
        } else {
            System.out.println("There is apocalypse outside. Stay at atomic shelter!");

            }
        }
    }
}
