#Author: Luc Gireaud
Feature: Pizzeria

  Scenario: Ne pas avoir 2 fabriques distinctes
  Given une fabrique A
  When une fabrique B est créée
  Then fabrique A et B sont égaux
  
   Scenario: Avoir une pizza grecque de style brest
  Given une pizza grecque de style brest
  When on veut sa sauce
  Then on obtient "sauce style Brest"
  
   Scenario: Avoir une pizza grecque de style strasbourg
  Given une pizza grecque de style strasbourg
  When on veut sa sauce
  Then on obtient "sauce style Strasbourg"
  
   Scenario: Avoir une pizza poivrons de style brest
  Given une pizza poivrons de style brest
  When on veut ses garnitures
  Then on obtient 2 poivrons
  
   Scenario: Avoir une pizza poivrons de style strasbourg
  Given une pizza poivrons de style strasbourg
  When on veut ses garnitures
  Then on obtient 3 poivrons
  
  