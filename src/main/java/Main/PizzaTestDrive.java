package Main;

import java.nio.charset.Charset;

import Fabrique.Pizzeria;
import Fabrique.PizzeriaFactory;
import Pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
    	System.setProperty("file.encoding", "UTF-8");
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creer("Strasbourg");

        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("JMB a commandé une " + pizza.getNom() + "\n");

        pizza = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println(new String("JMI a commandé une ".getBytes(), Charset.forName("UTF-8")) + pizza.getNom() + "\n");
    }
}