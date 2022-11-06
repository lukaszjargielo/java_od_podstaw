public class Main4a {
    public static void main(String[] args) {

        {
            int points = 0;
            boolean driverLicense = true;
            int experienceYears = 61;
            boolean drunkDriving = true;
            boolean causeAccident = true;
            boolean overSpeeding = true;

            System.out.println("\ndriverLicense: " + driverLicense + "\nexperienceYears: " +
                    experienceYears + "\ndrunkDriving: " + drunkDriving + "\ncauseAccident: " +
                    causeAccident + "\noverSpeeding: " + overSpeeding);

            if(driverLicense) {
                points += 20;
            }
            if (drunkDriving) {
                points += -100;
            }
            if (causeAccident) {
                points += -100;
            }
            if (overSpeeding) {
                points += -10;
            }
            if (experienceYears >= 10 && experienceYears <= 60) {
                points += 20;
            } else if (experienceYears > 60) {
                points += -20;
            }

            System.out.println("\nScore: " + points);

        }

        {
            int points = 0;
            boolean driverLicense = false;
            int experienceYears = 0;
            boolean drunkDriving = false;
            boolean causeAccident = false;
            boolean overSpeeding = false;

            System.out.println("\ndriverLicense: " + driverLicense + "\nexperienceYears: " +
                    experienceYears + "\ndrunkDriving: " + drunkDriving + "\ncauseAccident: " +
                    causeAccident + "\noverSpeeding: " + overSpeeding);

            if(driverLicense) {
                points += 20;
            }
            if (drunkDriving) {
                points += -100;
            }
            if (causeAccident) {
                points += -100;
            }
            if (overSpeeding) {
                points += -10;
            }
            if (experienceYears >= 10 && experienceYears <= 60) {
                points += 20;
            } else if (experienceYears > 60) {
                points += -20;
            }

            System.out.println("\nScore: " + points);

        }
    }
}
