public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double cost, double l, double w, double h, double weight) {
        super(l, w, h, weight);
        this.cost = cost;
    }

    public BoxPrice(double cost, double side, double weight) {
        super(side, weight);
        this.cost = cost;
    }
}