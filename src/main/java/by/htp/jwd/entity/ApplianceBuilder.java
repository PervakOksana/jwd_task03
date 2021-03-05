package by.htp.jwd.entity;

import java.util.HashMap;
import java.util.Map;

public class ApplianceBuilder {

	final private Map<String, Appliance> builders = new HashMap<>();

	public ApplianceBuilder() {
		builders.put("Laptop", new Laptop());
		builders.put("Oven", new Oven());
		builders.put("Refrigerator", new Refrigerator());
		builders.put("Speaker", new Speaker());
		builders.put("TabletPC", new TabletPC());
		builders.put("VacuumCleaner", new VacuumCleaner());

	}

	public Appliance getAppliance(String applianceName) {
		Appliance appliance = builders.get(applianceName);
		if (appliance == null) {
		}
		return appliance;
	}

}
