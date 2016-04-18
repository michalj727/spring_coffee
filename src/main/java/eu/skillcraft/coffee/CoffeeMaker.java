package eu.skillcraft.coffee;

import eu.skillcraft.coffee.grinder.Grinder;
import eu.skillcraft.coffee.heater.Heater;
import eu.skillcraft.coffee.pump.Pump;

class CoffeeMaker {

	private final Grinder grinder;
	private final Heater heater;
	private final Pump pump;

	CoffeeMaker(Grinder grinder, Heater heater, Pump pump) {
		this.grinder = grinder;
		this.heater = heater;
		this.pump = pump;
	}

	Coffee brew() {
		grinder.grind();
		heater.on();
		pump.pump();
		heater.off();
		return new Coffee("[_]P");
	}
}
