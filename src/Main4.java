public class Main4 {
    public static void main(String[] args) {

        {
            int points = 0;
            boolean driverLicense = true;
            int experienceYears = 12;
            boolean drunkDriving = false;
            boolean causeAccident = false;
            boolean overSpeeding = true;

            if (driverLicense) {
                points += 20;
                 if (drunkDriving || causeAccident) {
                    points += -100;
                    if (overSpeeding) {
                        points += -10;
                        if ((experienceYears >= 10) && (experienceYears <= 60)) {
                            points += 20;
                        } else if (experienceYears > 60) {
                            points += -20;
                        }
                    }
                } else if (overSpeeding) {
                     points += -10;
                     if ((experienceYears >= 10) && (experienceYears <= 60)) {
                         points += 20;
                     } else if (experienceYears > 60) {
                         points += -20;
                     }
                } else if ((experienceYears >= 10) && (experienceYears <= 60)) {
                     points += 20;
                } else if (experienceYears > 60) {
                     points += -20;
                }
            } else {
                System.out.println("You need to get a driving license!");
            }
            System.out.println("Score: " + points);
        }


    }
}
