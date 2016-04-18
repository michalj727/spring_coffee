package eu.skillcraft.coffee.heater;

import java.util.concurrent.TimeUnit;

public class ElectricHeater implements Heater {

	private boolean heated;

	public ElectricHeater() {
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public boolean isHot() {
		return heated;
	}

	@Override
	public void on() {
		System.out.println(" - - - heating - - -");
		heated = true;
	}

	@Override
	public void off() {
		heated = false;
	}
}
