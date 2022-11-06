public class Main4 {
    public static void main(String[] args) {

        {
            int points = 0;
            boolean driverLicense = true;
            int experienceYears = 12;
            boolean drunkDriving = false;
            boolean causeAccident = false;
            boolean overSpeeding = true;

            System.out.println("\ndriverLicense: " + driverLicense + "\nexperienceYears: " +
                    experienceYears + "\ndrunkDriving: " + drunkDriving + "\ncauseAccident: " +
                    causeAccident + "\noverSpeeding: " + overSpeeding);

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
            System.out.println("\nScore: " + points);
        }

        {
            int points = 0;
            boolean driverLicense = false;
            int experienceYears = 0;
            boolean drunkDriving = false;
            boolean causeAccident = false;
            boolean overSpeeding = true;

            System.out.println("\ndriverLicense: " + driverLicense + "\nexperienceYears: " +
                    experienceYears + "\ndrunkDriving: " + drunkDriving + "\ncauseAccident: " +
                    causeAccident + "\noverSpeeding: " + overSpeeding);


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
            System.out.println("\nScore: " + points);
        }

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
            System.out.println("\nScore: " + points);
        }


    }
}
