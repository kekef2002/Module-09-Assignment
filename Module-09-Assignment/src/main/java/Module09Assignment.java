/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author kekef
 */
public class Module09Assignment {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create Professional Garment Set
        GarmentFactory professionalFactory = new ProfessionalFactory();
        GarmentSimulator professionalSimulator = new GarmentSimulator(professionalFactory);
        professionalSimulator.wearGarments();

        // Create Casual Garment Set
        GarmentFactory casualFactory = new CasualFactory();
        GarmentSimulator casualSimulator = new GarmentSimulator(casualFactory);
        casualSimulator.wearGarments();

        // Create Party Garment Set
        GarmentFactory partyFactory = new PartyFactory();
        GarmentSimulator partySimulator = new GarmentSimulator(partyFactory);
        partySimulator.wearGarments();
    }
}
