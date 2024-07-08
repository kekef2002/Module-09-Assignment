/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kekef
 */
public class CasualFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pant createPant() {
        return new CasualPant();
    }

    @Override
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
