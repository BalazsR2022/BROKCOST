/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálás Balázs Réka, Szoft II-/1/E, 2024.02.24.
 */

public class Cost {

        Double transport;
        Double shop;
        Double repair;
        Double project;

    public Cost(String transport, String shop, String repair) {

        try{
        this.transport = Double.parseDouble(transport);
        this.shop = Double.parseDouble(shop);
        this.repair = Double.parseDouble(repair);
    }

        catch (NumberFormatException e) {
        System.out.println("Hibás adatbevitel"+ e.getMessage());
        this.transport = 0.0;
        this.repair =  0.0;
        this.shop = 0.0;
}
   
    }
}
