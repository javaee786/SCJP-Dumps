 class Plant {
 private String name;
public Plant(String name) { this.name = name; }
 public Plant() { this("fern"); }
 public String getName() { return name; }
 }

public class Tree extends Plant {
public void growFruit() { }
public void dropLeaves() { }
}
