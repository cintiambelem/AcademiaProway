package models;

public abstract class Base {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base b1 = (Base) obj;
            if (this.id == b1.id) {
                return true;
            }
        }
        return false;
    }

}
