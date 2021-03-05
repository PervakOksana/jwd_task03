package by.htp.jwd.main;

import java.util.List;

import by.htp.jwd.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliances) {

		if (appliances != null) {
			for (Appliance appliance : appliances) {
				System.out.println(appliance.toString());
			}

		}
	}

}