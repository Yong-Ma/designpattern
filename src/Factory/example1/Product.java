package Factory.example1;

public abstract class Product {
    public String owner;
    public abstract void use();

    public String getOwner() {
        return owner;
    }
}
