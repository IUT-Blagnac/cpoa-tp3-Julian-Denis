#Author: Luc Gireaud
Feature: Pizzeria

  Scenario: Ne pas avoir 2 fabriques distinctes
  Given une fabrique A
  When une fabrique B est créée
  Then fabrique A et B sont égaux
  