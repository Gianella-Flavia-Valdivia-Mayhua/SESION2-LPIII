package codigo;

public class TestAgregacion {
	public static void main(String[] args) {
		Motor motor1=new Motor(1,100);
		Automovil auto1=new Automovil("VA1-234",4,"Toyota","Toyota Agya");
		auto1.setMotor(motor1);
		System.out.println("Automovil 1"+auto1);
}
}
