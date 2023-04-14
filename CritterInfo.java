// The CritterInfo interface defines a set of methods for querying the
// state of a critter simulation.

public interface CritterInfo {
    public Critter.Neighbour getFront();
    public Critter.Neighbour getBack();
    public Critter.Neighbour getLeft();
    public Critter.Neighbour getRight();
    public Critter.Direction getDirection();
    public boolean frontThreat();
    public boolean backThreat();
    public boolean leftThreat();
    public boolean rightThreat();
}
