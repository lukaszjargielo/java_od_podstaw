public class Main4 {

    public static void main(String[] args) {
        {
            boolean raining = true;
            boolean haveUmbrella = true;
            int temperature = -21;

            System.out.println("Temperature:" + temperature + " Raining:" + raining + " Umbrella close at hand:" + haveUmbrella);

            if((temperature < -20) || (temperature > 40)) {
                System.out.println("Stay at home");
            } else {
                if( ((temperature > -10)&&(temperature < 10)) && ((raining)&&(haveUmbrella)) ){
                    System.out.println("The temperature is between -10 and 10 Celcius degrees, it's rainy but you have an umbrella. You can go for a walk.");
                } else if ((temperature > 12)&&(!raining)) {
                    System.out.println("It's not raining and temperature is above 12 Celcius degrees. You can go for a walk.");
                } else {
                    System.out.println("It's complicated! You would better stay home.");
                }
            }
        }

        {
            boolean raining = true;
            boolean haveUmbrella = true;
            int temperature = 41;

            System.out.println("Temperature:" + temperature + " Raining:" + raining + " Umbrella close at hand:" + haveUmbrella);

            if((temperature < -20) || (temperature > 40)) {
                System.out.println("Stay at home");
            } else {
                if( ((temperature > -10)&&(temperature < 10)) && ((raining)&&(haveUmbrella)) ){
                    System.out.println("The temperature is between -10 and 10 Celcius degrees, it's rainy but you have an umbrella. You can go for a walk.");
                } else if ((temperature > 12)&&(!raining)) {
                    System.out.println("It's not raining and temperature is above 12 Celcius degrees. You can go for a walk.");
                } else {
                    System.out.println("It's complicated! You would better stay home.");
                }
            }
        }

        {
            boolean raining = true;
            boolean haveUmbrella = true;
            int temperature = -8;

            System.out.println("Temperature:" + temperature + " Raining:" + raining + " Umbrella close at hand:" + haveUmbrella);

            if ((temperature < -20) || (temperature > 40)) {
                System.out.println("Stay at home");
            } else {
                if (((temperature > -10) && (temperature < 10)) && ((raining) && (haveUmbrella))) {
                    System.out.println("The temperature is between -10 and 10 Celcius degrees, it's rainy but you have an umbrella. You can go for a walk.");
                } else if ((temperature > 12) && (!raining)) {
                    System.out.println("It's not raining and temperature is above 12 Celcius degrees. You can go for a walk.");
                } else {
                    System.out.println("It's complicated! You would better stay home.");
                }
            }
        }

            {
                boolean raining = true;
                boolean haveUmbrella = false;
                int temperature = -8;

                System.out.println("Temperature:" + temperature + " Raining:" + raining + " Umbrella close at hand:" + haveUmbrella);

                if((temperature < -20) || (temperature > 40)) {
                    System.out.println("Stay at home");
                } else {
                    if( ((temperature > -10)&&(temperature < 10)) && ((raining)&&(haveUmbrella)) ){
                        System.out.println("The temperature is between -10 and 10 Celcius degrees, it's rainy but you have an umbrella. You can go for a walk.");
                    } else if ((temperature > 12)&&(!raining)) {
                        System.out.println("It's not raining and temperature is above 12 Celcius degrees. You can go for a walk.");
                    } else {
                        System.out.println("It's complicated! You would better stay home.");
                    }
                }
            }

        {
            boolean raining = false;
            boolean haveUmbrella = true;
            int temperature = -8;

            System.out.println("Temperature:" + temperature + " Raining:" + raining + " Umbrella close at hand:" + haveUmbrella);

            if((temperature < -20) || (temperature > 40)) {
                System.out.println("Stay at home");
            } else {
                if( ((temperature > -10)&&(temperature < 10)) && ((raining)&&(haveUmbrella)) ){
                    System.out.println("The temperature is between -10 and 10 Celcius degrees, it's rainy but you have an umbrella. You can go for a walk.");
                } else if ((temperature > 12)&&(!raining)) {
                    System.out.println("It's not raining and temperature is above 12 Celcius degrees. You can go for a walk.");
                } else {
                    System.out.println("It's complicated! You would better stay home.");
                }
            }
        }

        {
            boolean raining = false;
            boolean haveUmbrella = true;
            int temperature = 13;

            System.out.println("Temperature:" + temperature + " Raining:" + raining + " Umbrella close at hand:" + haveUmbrella);

            if((temperature < -20) || (temperature > 40)) {
                System.out.println("Stay at home");
            } else {
                if( ((temperature > -10)&&(temperature < 10)) && ((raining)&&(haveUmbrella)) ){
                    System.out.println("The temperature is between -10 and 10 Celcius degrees, it's rainy but you have an umbrella. You can go for a walk.");
                } else if ((temperature > 12)&&(!raining)) {
                    System.out.println("It's not raining and temperature is above 12 Celcius degrees. You can go for a walk.");
                } else {
                    System.out.println("It's complicated! You would better stay home.");
                }
            }
        }
    }

}
