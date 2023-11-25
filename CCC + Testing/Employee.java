package CCC2;

public class Employee implements Comparable<Employee> {
    private String name;
    private int cakesCovered;
    private double amount;
    private int cakesUnsuitable;


    public Employee(String name, int cakesCovered, double amount) {
        this.name = name;
        this.amount = amount;
        this.cakesCovered = cakesCovered;
        this.cakesUnsuitable = cakesUnsuitable;

    }

    public int getCakesCovered() {
        return cakesCovered;
    }

    public double getAmount() {
        if (cakesCovered <= 50) {
            return cakesCovered * 0.10;
        } else {
            int diff = cakesCovered - 50;
            return diff * 0.15 + 5;
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
