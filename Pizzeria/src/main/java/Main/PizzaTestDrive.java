package Main;

import Fabrique.Pizzeria;
import Fabrique.PizzeriaFactory;
import Pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creer("Strasbourg");

        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("JMB a commandé une " + pizza.getNom() + "\n");

        pizza = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println("JMI a commandé une " + pizza.getNom() + "\n");
   
        
        
        /**
         * Préparation de Pizza sauce style brest et fromage
Étalage de la pâte...
Ajout de la sauce...
Ajout des garnitures:
 Parmigiano reggiano râpé
Cuisson 25 minutes à 180°
Découpage en parts triangulaires
Emballage dans une boîte officielle
JMB a commandé une Pizza sauce style brest et fromage

Préparation de Pizza pâte style Strasbourg et fromage
Étalage de la pâte...
Ajout de la sauce...
Ajout des garnitures:
 Mozzarella en lamelles
Cuisson 25 minutes à 180°
Découpage en parts carrées
Emballage dans une boîte officielle
JMI a commandé une Pizza pâte style Strasbourg et fromage
         */
    }
}