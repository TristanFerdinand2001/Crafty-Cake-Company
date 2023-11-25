package CCC2;
import java.util.ArrayList;

public class QualityController extends Employee {
    public QualityController(String name, int cakesCovered, double amount) {
        super(name, cakesCovered, amount);
    }

    private String name = "Rabia";
    private ArrayList<QualityController> qcs = new ArrayList<>();

    private int cakesCovered = 385;

    private int cakesUnsuitable;

    private double amount;

    private int cakesInspected = cakesCovered + cakesUnsuitable;


    public QualityController(String name, double amount, int cakesCovered, int cakesUnsuitable, int cakesInspected) {
        super(name, cakesCovered, amount);
        this.name = name;
        this.cakesCovered = cakesCovered;
        this.cakesUnsuitable = cakesUnsuitable;
        this.amount = amount;
        this.cakesInspected = cakesInspected;
    }

    public double getAmount() {
        if (cakesCovered <= 50) {
            return cakesCovered * 0.10;
        } else {
            int diff = cakesCovered - 50;
            return diff * 0.15 + 0.018 + 5 - 0.02;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", " + cakesCovered +
                ", " + amount;
    }

    @Override
    public int compareTo(Employee ccc) {
        if (ccc.getAmount() > this.getAmount()) {
            return 1;
        } else if (ccc.getAmount() < this.getAmount()) {
            return -1;
        } else {
            return 0;
        }
    }

    public int addCakes(int cakesSuitable) {
        //checks value is greater than zero
        if (cakesSuitable > 0) {
            this.cakesCovered += cakesSuitable;
        } else {
            //do an error message
            System.out.println("The cakes added must be above zero");
        }
        return cakesSuitable;
    }

    public int removeCakes() {
        //checks value is greater than zero.
        if (cakesUnsuitable > 0) {
            this.cakesCovered -= cakesUnsuitable * 2;
        } else {
            System.out.println("The cakes removed must be greater than zero");
        }
        return 0;
    }
}










