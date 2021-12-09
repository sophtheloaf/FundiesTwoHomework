import tester.Tester;

// to represent a vehicle
interface IVehicle {

  // computes the total revenue generated by a vehicle
  double totalRevenue();

  // computes the cost to fill a vehicles fuel tank
  double fuelCost();

  // calculates profit per passenger in a vehicle
  double perPassengerProfit();

  // returns a string with a vehicles name and passenger limit
  String format();

  // returns whether two vehicles are equal (all fields the same)
  boolean sameVehicle(IVehicle that);

  // determines whether all the abstracted fields of vehicles are the same
  boolean sameAVehicle(AVehicle that);

  // determines whether this vehicle and that airplane are the same
  boolean sameAirplane(Airplane that);
  
  // determines whether this vehicle and that bus are the same
  boolean sameBus(Bus that);
  
  // determines whether this vehicle and that train are the same
  boolean sameTrain(Train that);

}

// to represent the commonalities between vehicles
abstract class AVehicle implements IVehicle {

  String name;
  int passengerCapacity;
  double fare;
  int fuelCapacity;

  AVehicle(String name, int passengerCapacity, double fare, int fuelCapacity) {
    this.name = name;
    this.passengerCapacity = passengerCapacity;
    this.fare = fare;
    this.fuelCapacity = fuelCapacity;
  }

  /* TEMPLATE:
   * Fields: 
   * this.name ... String 
   * this.passengerCapacity ... int 
   * this.fare...double 
   * this.fuelCapacity ... int
   * 
   * Methods:
   * this.totalRevenue() ... double 
   * this.fuelCost() ... double
   * this.perPassengerProfit() ... double 
   * this.format() ... String
   * this.sameVehicle(IVehicle that) ... boolean 
   * this.sameAVehicle(AVehicle that) ... boolean 
   * this.sameAirplane(Airplane that) ... boolean 
   * this.sameBus(Bus that) ... boolean 
   * this.sameTrain(Train that) ... boolean
   * 
   * Methods on Fields: 
   */

  // computes the total revenue of this Vehicle
  public double totalRevenue() {
    return this.passengerCapacity * this.fare;
  }

  // computes the cost of fully fueling this Vehicle
  public double fuelCost() {
    return this.fuelCapacity * 2.55;
  }

  // computes the per-passenger profit of this Vehicle
  public double perPassengerProfit() {
    return (this.totalRevenue() - this.fuelCost()) / this.passengerCapacity;
  }

  // produce a String that shows the name and passenger capacity of this Vehicle
  public String format() {
    return this.name + ", " + this.passengerCapacity + ".";
  }

  // are the two vehicles are equal? (all fields the same)
  public abstract boolean sameVehicle(IVehicle that);

  // determines whether this vehicle and that airplane are the same
  public boolean sameAirplane(Airplane that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(AVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return false;
  }

  // determines whether this vehicle and that bus are the same
  public boolean sameBus(Bus that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * that ... Bus
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(AVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return false;
  }

  // determines whether this vehicle and that train are the same
  public boolean sameTrain(Train that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * that ... Train
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(AVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return false;
  }

  // are all the abstracted fields of the vehicles the same?
  public boolean sameAVehicle(AVehicle that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * that ... AVehicle
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(AVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return (this.name.equals(that.name) && this.fuelCapacity == that.fuelCapacity
        && this.passengerCapacity == that.passengerCapacity && this.fare == that.fare);
  }

}

// to represent vehicles that are airplanes
class Airplane extends AVehicle {

  String code; // ICAO type designator
  boolean isWideBody; // twin-aisle aircraft

  Airplane(String name, int passengerCapacity, double fare, int fuelCapacity, String code,
      boolean isWideBody) {
    super(name, passengerCapacity, fare, fuelCapacity);
    this.code = code;
    this.isWideBody = isWideBody;
  }

  /* TEMPLATE:
   * Fields: 
   * this.name ... String 
   * this.passengerCapacity ... int 
   * this.fare... double 
   * this.fuelCapacity ... int
   * this.code ... String
   * this.isWideBody ... boolean
   * 
   * Methods:
   * this.totalRevenue() ... double 
   * this.fuelCost() ... double
   * this.perPassengerProfit() ... double 
   * this.format() ... String
   * this.sameVehicle(IVehicle that) ... boolean 
   * this.sameAVehicle(AVehicle that) ... boolean 
   * this.sameAirplane(Airplane that) ... boolean 
   * this.sameBus(Bus that) ... boolean 
   * this.sameTrain(Train that) ... boolean
   * 
   * Methods on Fields: 
   */

  // computes the cost of fully fueling this Airplane
  @Override
  public double fuelCost() {
    return 1.94 * this.fuelCapacity;
  }

  public boolean sameVehicle(IVehicle that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * that ... IVehicle
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(AVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return that.sameAirplane(this);
  }

  @Override
  public boolean sameAirplane(Airplane that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * that ... Airplane
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(AVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return (this.sameAVehicle(that) && this.code.equals(that.code)
        && this.isWideBody == that.isWideBody);
  }
}

// to represent vehicles that are trains
class Train extends AVehicle {
  int numberOfCars; // cars per train set
  int gauge; // track gauge in millimeters

  Train(String name, int passengerCapacity, double fare, int fuelCapacity, int numberOfCars,
      int gauge) {
    super(name, passengerCapacity, fare, fuelCapacity);
    this.numberOfCars = numberOfCars;
    this.gauge = gauge;
  }

  /* TEMPLATE:
   * Fields: 
   * this.name ... String 
   * this.passengerCapacity ... int 
   * this.fare... double 
   * this.fuelCapacity ... int
   * this.numberOfCars ... int
   * this.gauge ... int
   * 
   * Methods:
   * this.totalRevenue() ... double 
   * this.fuelCost() ... double
   * this.perPassengerProfit() ... double 
   * this.format() ... String
   * this.sameVehicle(IVehicle that) ... boolean 
   * this.sameAVehicle(AVehicle that) ... boolean 
   * this.sameAirplane(Airplane that) ... boolean 
   * this.sameBus(Bus that) ... boolean 
   * this.sameTrain(Train that) ... boolean
   * 
   * Methods on Fields: 
   */

  public boolean sameVehicle(IVehicle that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * that ... IVehicle
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(AVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return that.sameTrain(this);
  }

  @Override
  public boolean sameTrain(Train that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * that ... Train
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(AVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return (this.sameAVehicle(that) && this.numberOfCars == that.numberOfCars
        && this.gauge == that.gauge);
  }

}

// to represent vehicles that are buses
class Bus extends AVehicle {
  int length; // length in feet

  Bus(String name, int passengerCapacity, double fare, int fuelCapacity, int length) {
    super(name, passengerCapacity, fare, fuelCapacity);
    this.length = length;
  }

  /*
   * Fields: 
   * this.name ... String 
   * this.passengerCapacity ... int 
   * this.fare...double 
   * this.fuelCapacity ... int 
   * this.length ... int
   * 
   * Methods:
   * this.totalRevenue() ... double 
   * this.fuelCost() ... double
   * this.perPassengerProfit() ... double 
   * this.format() ... String
   * this.sameVehicle(IVehicle that) ... boolean 
   * this.sameAVehicle(AVehicle that) ... boolean 
   * this.sameAirplane(Airplane that) ... boolean 
   * this.sameBus(Bus that) ... boolean 
   * this.sameTrain(Train that) ... boolean
   * 
   * Methods on Fields:
   */

  public boolean sameBus(Bus that) {
    /*
     * TEMPLATE: 
     * Refer to class template
     * 
     * PARAMETERS: 
     * that ... Bus
     * 
     * Methods on parameters:
     * 
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(IVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     * 
     */
    return (this.sameAVehicle(that) && this.length == that.length);
  }

  public boolean sameVehicle(IVehicle that) {
    /* TEMPLATE: 
     * refer to class template
     * 
     * Parameters: 
     * that ... IVehicle
     * 
     * Methods on Parameters:
     * this.that.totalRevenue() ... double 
     * this.that.fuelCost() ... double
     * this.that.perPassengerProfit() ... double 
     * this.that.format() ... String
     * this.that.sameVehicle(IVehicle that) ... boolean 
     * this.that.sameAVehicle(AVehicle that) ... boolean 
     * this.that.sameAirplane(Airplane that) ... boolean 
     * this.that.sameBus(Bus that) ... boolean 
     * this.that.sameTrain(Train that) ... boolean
     */
    return that.sameBus(this);
  }

}

// to represent the examples and tests of vehicles
class ExamplesVehicle {
  ExamplesVehicle() {
  }

  // EXAMPLES
  IVehicle dreamliner = new Airplane("Boeing 787", 242, 835.0, 33340, "B788", false);
  IVehicle commuterRail = new Train("MPI HSP46", 500, 11.50, 2000, 6, 1435);
  IVehicle silverLine = new Bus("Neoplan AN460LF", 77, 1.70, 100, 60);

  IVehicle airbus = new Airplane("Airbus", 200, 500.0, 30000, "AB13", false);
  IVehicle greenline = new Train("Green line", 40, 1.25, 300, 3, 1435);
  IVehicle greyhound = new Bus("Greyhound", 38, 27.0, 250, 40);

  IVehicle sameAirbus = new Airplane("Airbus", 200, 500.0, 30000, "AB13", false);
  IVehicle sameGreenline = new Train("Green line", 40, 1.25, 300, 3, 1435);
  IVehicle sameGreyhound = new Bus("Greyhound", 38, 27.0, 250, 40);

  AVehicle dreamlinerA = new Airplane("Boeing 787", 242, 835.0, 33340, "B788", false);
  AVehicle airbusA = new Airplane("Airbus", 200, 500.0, 30000, "AB13", false);
  AVehicle greyhoundA = new Bus("Greyhound", 38, 27.0, 250, 40);
  AVehicle sameAirbusA = new Airplane("Airbus", 200, 500.0, 30000, "AB13", false);

  Airplane dreamlinerPlane = new Airplane("Boeing 787", 242, 835.0, 33340, "B788", false);
  Train commuterRailTrain = new Train("MPI HSP46", 500, 11.50, 2000, 6, 1435);
  Bus silverLineBus = new Bus("Neoplan AN460LF", 77, 1.70, 100, 60);

  Airplane airbusPlane = new Airplane("Airbus", 200, 500.0, 30000, "AB13", false);
  Train greenlineTrain = new Train("Green line", 40, 1.25, 300, 3, 1435);
  Bus greyhoundBus = new Bus("Greyhound", 38, 27.0, 250, 40);

  Airplane sameAirbusPlane = new Airplane("Airbus", 200, 500.0, 30000, "AB13", false);
  Train sameGreenlineTrain = new Train("Green line", 40, 1.25, 300, 3, 1435);
  Bus sameGreyhoundBus = new Bus("Greyhound", 38, 27.0, 250, 40);

  // Tests:

  boolean testTotalRevenue(Tester t) {
    return t.checkInexact(this.dreamliner.totalRevenue(), 242 * 835.0, 0.001)
        && t.checkInexact(this.commuterRail.totalRevenue(), 500 * 11.5, 0.001)
        && t.checkInexact(this.silverLine.totalRevenue(), 77 * 1.7, 0.001)
        && t.checkInexact(this.airbus.totalRevenue(), 200 * 500.0, 0.001)
        && t.checkInexact(this.greenline.totalRevenue(), 40 * 1.25, 0.001)
        && t.checkInexact(this.greyhound.totalRevenue(), 38 * 27.0, 0.001);
  }

  boolean testFuelCost(Tester t) {
    return t.checkInexact(this.dreamliner.fuelCost(), 33340 * 1.94, 0.001)
        && t.checkInexact(this.commuterRail.fuelCost(), 2000 * 2.55, 0.001)
        && t.checkInexact(this.silverLine.fuelCost(), 100 * 2.55, 0.001)
        && t.checkInexact(this.airbus.fuelCost(), 30000 * 1.94, 0.001)
        && t.checkInexact(this.greenline.fuelCost(), 300 * 2.55, 0.001)
        && t.checkInexact(this.greyhound.fuelCost(), 250 * 2.55, 0.001);
  }

  boolean testPerPassengerProfit(Tester t) {
    return t.checkInexact(this.dreamliner.perPassengerProfit(), 137390.4 / 242, 0.001) //
        && t.checkInexact(this.commuterRail.perPassengerProfit(), 650.0 / 500, 0.001)
        && t.checkInexact(this.silverLine.perPassengerProfit(), -124.1 / 77, 0.001)
        && t.checkInexact(this.airbus.perPassengerProfit(), 41800.0 / 200, 0.001)
        && t.checkInexact(this.greenline.perPassengerProfit(), -715.0 / 40, 0.001)
        && t.checkInexact(this.greyhound.perPassengerProfit(), 388.5 / 38, 0.001);
  }

  boolean testFormat(Tester t) {
    return t.checkExpect(this.dreamliner.format(), "Boeing 787, 242.")
        && t.checkExpect(this.commuterRail.format(), "MPI HSP46, 500.")
        && t.checkExpect(this.silverLine.format(), "Neoplan AN460LF, 77.")
        && t.checkExpect(this.airbus.format(), "Airbus, 200.")
        && t.checkExpect(this.greenline.format(), "Green line, 40.")
        && t.checkExpect(this.greyhound.format(), "Greyhound, 38.");
  }

  boolean testsameVehicle(Tester t) {
    return t.checkExpect(this.airbus.sameVehicle(this.sameAirbus), true)
        && t.checkExpect(this.airbus.sameVehicle(this.dreamliner), false)
        && t.checkExpect(this.greenline.sameVehicle(this.sameGreenline), true)
        && t.checkExpect(this.greenline.sameVehicle(this.commuterRail), false)
        && t.checkExpect(this.greyhound.sameVehicle(this.sameGreyhound), true)
        && t.checkExpect(this.greyhound.sameVehicle(this.silverLine), false);
  }

  boolean testSameVehicle(Tester t) {
    return t.checkExpect(this.airbus.sameVehicle(this.sameAirbus), true)
        && t.checkExpect(this.airbus.sameVehicle(this.dreamliner), false)
        && t.checkExpect(this.greenline.sameVehicle(this.sameGreenline), true)
        && t.checkExpect(this.greenline.sameVehicle(this.commuterRail), false)
        && t.checkExpect(this.greyhound.sameVehicle(this.sameGreyhound), true)
        && t.checkExpect(this.greyhound.sameVehicle(this.silverLine), false)
        && t.checkExpect(this.airbus.sameVehicle(this.greenline), false)
        && t.checkExpect(this.greenline.sameVehicle(this.greyhound), false)
        && t.checkExpect(this.greyhound.sameVehicle(this.airbus), false);
  }

  boolean testSameAirplane(Tester t) {
    return t.checkExpect(this.airbusPlane.sameAirplane(this.sameAirbusPlane), true)
        && t.checkExpect(this.airbusPlane.sameAirplane(this.dreamlinerPlane), false)
        && t.checkExpect(this.greyhound.sameAirplane(this.airbusPlane), false)
        && t.checkExpect(this.greenline.sameAirplane(this.airbusPlane), false);
  }

  boolean testSameTrain(Tester t) {
    return t.checkExpect(this.greenlineTrain.sameTrain(this.sameGreenlineTrain), true)
        && t.checkExpect(this.greenlineTrain.sameTrain(this.commuterRailTrain), false)
        && t.checkExpect(this.airbusPlane.sameTrain(this.greenlineTrain), false)
        && t.checkExpect(this.greyhound.sameTrain(this.greenlineTrain), false)
        ;
  }

  boolean testSameBus(Tester t) {
    return t.checkExpect(this.greyhoundBus.sameBus(this.sameGreyhoundBus), true)
        && t.checkExpect(this.greyhoundBus.sameBus(this.silverLineBus), false)
        && t.checkExpect(this.airbusPlane.sameBus(this.greyhoundBus), false)
        && t.checkExpect(this.greenlineTrain.sameBus(this.greyhoundBus), false);
  }

  boolean testSameAVehicle(Tester t) {
    return t.checkExpect(this.airbusA.sameAVehicle(this.sameAirbusA), true)
        && t.checkExpect(this.airbusA.sameAVehicle(this.dreamlinerA), false)
        && t.checkExpect(this.airbusA.sameAVehicle(this.greyhoundA), false);

  }
}