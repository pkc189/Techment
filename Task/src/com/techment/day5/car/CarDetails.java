package com.techment.day5.car;

class Car{
	String name;
	String model;
	Engine engine;
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
	
	
	void displayEngineInfo() {
		
		System.out.println("name "+name);
		System.out.println("model "+model);
		System.out.println("engineID "+engine.engineId);
		System.out.println("engine type "+engine.engineType);
	}
	
	
	
}

class Engine{
	int engineId;
	String engineType;
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
	
}


public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Engine eng = new Engine(123,"Inline Engine");
		Car Audi = new Car("Audi","2021",eng);
		 Audi.displayEngineInfo();
		
		
	}

}
