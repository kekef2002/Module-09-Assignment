/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kekef
 */
public class GarmentSimulator {
    private Top top;
    private Pant pant;
    private Shoe shoe;

    public GarmentSimulator(GarmentFactory factory) {
        top = factory.createTop();
        pant = factory.createPant();
        shoe = factory.createShoe();
    }

    public void wearGarments() {
        top.wear();
        pant.wear();
        shoe.wear();
    }
}
