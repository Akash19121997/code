package CloningAndClonable;

public class Address implements Cloneable {
    int id;
    Address(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                '}';
    }
}
