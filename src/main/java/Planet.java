public class Planet {
    String name;
    int size;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public String explode(){
        System.out.println("boomalope" + name + "has exploded.");
    }
}