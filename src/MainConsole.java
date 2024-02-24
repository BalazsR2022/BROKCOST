/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálás Balázs Réka, Szoft II-/1/E, 2024.02.24.
 */

import java.util.Scanner;

public class MainConsole {

    private static final String LINE = "──────────────────────────────────────────";
    private static final String HEADER = "╔═════════════════════════════════════════╗";
    private static final String FOOTER = "╚═════════════════════════════════════════╝";
    
    private double costProject;

    public MainConsole() {
        printHeader("Projekt költsége");
        readCost();
        printFooter();
    }

    private void printHeader(String title) {
        System.out.println(HEADER);
        System.out.printf("║%17s%25s\n", title, "║");
        System.out.println(FOOTER);
    }

    private void readCost() {
        String costTransport = readInput("Szállítási költség: ");
        String costShop = readInput("Üzleti költség: ");
        String costRepair = readInput("Javítási költség: ");

        double transportValue = parseCost(costTransport);
        double shopValue = parseCost(costShop);
        double repairValue = parseCost(costRepair);
        costProject = calculateProjectCost(transportValue, shopValue, repairValue);

        printProjectCost();
        writeCostToFile(costTransport, costShop, costRepair);
    }

    private String readInput(String prompt) {
        System.out.println(LINE);
        System.out.print(prompt);
        return new Scanner(System.in).nextLine();
    }

    private double parseCost(String cost) {
        return Double.parseDouble(cost);
    }

    private double calculateProjectCost(double transport, double shop, double repair) {
        return transport + shop + repair;
    }

    private void printProjectCost() {
        System.out.println(LINE);
        System.out.println("Projekt költség: " + costProject);
    }

    private void writeCostToFile(String costTransport, String costShop, String costRepair) {
        Cost cost = new Cost(costTransport, costShop, costRepair);
        FileHandler fileHandler = new FileHandler();
        fileHandler.costWriter(cost);
    }

    private void printFooter() {
        System.out.println(LINE);
    }
}

