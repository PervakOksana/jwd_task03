package by.htp.jwd.service.validation;

import by.htp.jwd.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		if (criteria.getCriteria().get("POWER_CONSUMPTION") != null)
			if ((int) criteria.getCriteria().get("POWER_CONSUMPTION") < 100) {
				return false;
			}
		return true;
	}

}
