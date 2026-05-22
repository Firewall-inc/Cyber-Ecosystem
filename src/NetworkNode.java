public class NetworkNode {
    String name;
    int health;
    int[] position;

    NetworkNode(){}

    public NetworkNode(String name, int health, int[] position){
        this.health = health;
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public int[] getPosition() {
        return position;
    }

    public String toString(){
        return name;
    }
}