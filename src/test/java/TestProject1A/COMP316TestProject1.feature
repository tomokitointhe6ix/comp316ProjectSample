Feature: Car refueling
  The driver needs to refuel in order to drive the car.

Scenario: Refueling
 Given The car tank contains 10 liters of fuel
 When The driver refueled 50 liters
 Then The tank contains 60 liters of fuel