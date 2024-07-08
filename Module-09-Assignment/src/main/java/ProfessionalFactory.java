/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kekef
 */
public class ProfessionalFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pant createPant() {
        return new ProfessionalPant();
    }

    @Override
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}
