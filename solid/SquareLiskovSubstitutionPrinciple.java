package solid;

public class SquareLiskovSubstitutionPrinciple implements ShapeLiskovSubstitutionPrinciple {

    private int side;

    public SquareLiskovSubstitutionPrinciple(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
       this.side = side;
    }

    @Override
    public int computeArea() {
        return side * side;
    }
}
