/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kekef
 */
public class PartyFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pant createPant() {
        return new PartyPant();
    }

    @Override
    public Shoe createShoe() {
        return new PartyShoe();
    }
}
