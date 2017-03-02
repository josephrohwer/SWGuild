public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

	//Sets the value of cars to 100        
	cars = 100;
	//Sets the value of space_in_a_car to 4        
	space_in_a_car = 4;
	//Sets the value of drivers to 30        
	drivers = 30;
	//Sets the value of passengers to 90        
	passengers = 90;
	//Sets the value of cars_not_driven to cars - drivers (70)        
	cars_not_driven = cars - drivers;
	//Sets the value of cars_driven to drivers (30)        
	cars_driven = drivers;
	//Sets the value of carpool_capacity to cars_driven * space_in_a_car (120)        
	carpool_capacity = cars_driven * space_in_a_car;
	//Sets the value of average_passengers_per_car to passengers / cars_driven (3)        
	average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
