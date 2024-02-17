public class Vehicle{

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name){
        this.name = name;
        this.currentDirection = 0;
        this.currentSpeed = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Steer method called: Sterring at "+ currentDirection + " degrees.");
    }

    public void move(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("move method called: Moving at " + currentSpeed + " is direction "+ currentDirection);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection(){
        return currentDirection;
    }

    public void setCUrrentDirection(int currentDirection){
        this.currentDirection = currentDirection;
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("Vehilce is Stopped");
    }
}