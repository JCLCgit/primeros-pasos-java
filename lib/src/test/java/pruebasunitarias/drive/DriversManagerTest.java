package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {

	private DriversManager driversManager=new DriversManager();
	
	@DisplayName("Pruebas en el método addPassenger")
	@Test
	void isAddPassenger() {
		Passenger passenger1=new Passenger("Charlie","19feb");
		driversManager.addPassenger(passenger1);
		assertEquals(passenger1,driversManager.getPassenger("19feb"));
	}
	private DriversManager driversManager1=new DriversManager();
	@Test
	void isAddDriver() {
		Driver driver1=new Driver("CharlieConductor","19UBER",10.12);
		driversManager1.addDriver(driver1);
		assertEquals(driver1,driversManager1.getDriver("19UBER"));
	}
}
