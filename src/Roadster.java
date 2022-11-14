public class Roadster {
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;
    boolean crazyMode;

    public Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public Roadster(float topSpeed, float acceleration,
                    float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
        crazyMode = true;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public float getTopSpeed(boolean crazyMode) {
        if(crazyMode) {
            if(crazyTopSpeed != 0) {
                return crazyTopSpeed;
            } else {
                return topSpeed ;
            }
        }else {
            return topSpeed;
        }
    }

    public float getAcceleration(boolean crazyMode) {
        if(crazyMode) {
            if (crazyAcceleration != 0) {
                return crazyAcceleration;
            } else {
                return acceleration;
            }
        } else {
            return acceleration;
        }
    }
}
