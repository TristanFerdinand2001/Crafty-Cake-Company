package CCC2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class CakeTeam {
    private ArrayList<Employee> team = new ArrayList<>();
    private double cakesCovered;
    private int cakesUnsuitable;

    public CakeTeam() {
    }

    public void addMember(Employee ccc) {
        team.add(ccc);
    }

    public double getTotalRaised() {
        double totalRaised = 0;
        for (Employee employee : team) {
            totalRaised += employee.getAmount();
        }
        return totalRaised;
    }

    public String getTeamDetails() {
        StringBuilder sb = new StringBuilder();
        for (Employee ccc : team) {
            sb.append(String.format("%-10s | %7s| %-10s", ccc.getName(), ccc.getCakesCovered(), getMoney(ccc.getAmount())));

            sb.append("\n");
        }
        return sb.toString();
    }

    public String getMoney(double amount) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        return nf.format(amount);
    }

    public void sortTeam(CakeTeam ccc) {
        Collections.sort(team);
    }

    public int getTotalCakes() {
        int totalCakes = 0;
        for (Employee employee : team) {
            totalCakes += (employee.getCakesCovered());
        }
        return totalCakes;
    }
}




