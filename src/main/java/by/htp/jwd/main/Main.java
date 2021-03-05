package by.htp.jwd.main;

import java.util.List;

import by.htp.jwd.entity.Appliance;

import by.htp.jwd.entity.criteria.Criteria;
import by.htp.jwd.entity.criteria.SearchCriteria.Oven;
import by.htp.jwd.entity.criteria.SearchCriteria.TabletPC;
import by.htp.jwd.service.ApplianceService;
import by.htp.jwd.service.ServiceFactory;
import by.htp.jwd.service.exception.ServiceException;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());// "Oven"
		criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 32);

		try {
			appliances = service.find(criteriaOven);
			PrintApplianceInfo.print(appliances);
		} catch (ServiceException e) {
			System.out.println("Message obout mistake " + e);
		}

		System.out.println("///////////////////////");

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.CAPACITY.toString(), 33);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		try {
			appliances = service.find(criteriaOven);
			PrintApplianceInfo.print(appliances);
		} catch (ServiceException e) {
			System.out.println("Message obout mistake " + e);
		}

//		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		try {
			appliances = service.find(criteriaTabletPC);
			PrintApplianceInfo.print(appliances);

		} catch (ServiceException e) {
			System.out.println("Message obout mistake " + e);
		}

	}
}
