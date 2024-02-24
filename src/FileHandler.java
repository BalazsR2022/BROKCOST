// /*
//  * Sallai András, 2024-02-19
//  * Copyright (c) 2024, Sallai András
//  * Licenc: MIT
//  * Refaktorálás Balázs Réka, Szoft II-/1/E, 2024.02.24.
//  */


import java.io.FileWriter;
import java.io.IOException;

public class FileHandler<CostProject> {

    public void costWriter(Cost cost) {
        try {
            FileWriter fw = new FileWriter("adat.txt", true);
            fw.write(cost.transport.toString());
            fw.write(":");
            fw.write(cost.business.toString());
            fw.write(":");
            fw.write(cost.repair.toString());
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Hibás adatbevitel" + e.getMessage());
        }
    }

    public void costProjectWriter(CostProject costProject) {
        System.out.println("Összköltség (project): " + costProject.toString());
    }
}
