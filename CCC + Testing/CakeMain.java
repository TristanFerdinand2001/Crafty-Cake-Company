package CCC2;

public class CakeMain extends Employee {
    public CakeMain(String name, int cakesCovered, double amount) {
        super(name, cakesCovered, amount);
    }

    public static void main(String[] args) {
        CakeTeam ccc = new CakeTeam();
        ///Employee Objects with attributes
        Employee bob = new Employee("Bob",100,0.10);
        Employee andrew = new Employee("Andrew",162,0.10);
        Employee hasfa = new Employee("hasfa",34,0.10);
        Employee ayuub = new Employee("Ayub",193,0.10);
        Employee amaan = new Employee("Amann",309,0.10);
        Employee gary = new Employee("Gary",49,0.10);
        Employee diane = new Employee("Diane",217,0.10);
        Employee rabia = new Employee("QC Rabia",385,0.10);

        ///Employee Array
        ccc.addMember(new Employee("Bob", 100,0.10));
        ccc.addMember(new Employee("Andrew", 162,0.10));
        ccc.addMember(new Employee("Hasfa", 34,0.10));
        ccc.addMember(new Employee("Ayuub", 193,0.10));
        ccc.addMember(new Employee("Amaan", 309,0.10));
        ccc.addMember(new Employee("Gary", 49,0.10));
        ccc.addMember(new Employee("Diane", 217,0.10));
        ccc.addMember(new QualityController("QC Rabia",385,0.10));

        //Sorting Team
        ccc.sortTeam(ccc);

        //Printing out the results
        System.out.println("Employee      Cakes   Wages");
        System.out.println("----------------------------");
        System.out.println(ccc.getTeamDetails());
        System.out.println("Total cakes covered:");
        System.out.println(ccc.getTotalCakes());
        System.out.println("Total money to be paid:");
        System.out.println(ccc.getMoney(ccc.getTotalRaised()));
    }
}


