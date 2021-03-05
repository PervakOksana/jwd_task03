package by.htp.jwd.service.impl;

import java.util.List;

import by.htp.jwd.dao.ApplianceDAO;
import by.htp.jwd.dao.DAOFactory;
import by.htp.jwd.dao.exception.DAOException;
import by.htp.jwd.entity.Appliance;
import by.htp.jwd.entity.criteria.Criteria;
import by.htp.jwd.service.ApplianceService;
import by.htp.jwd.service.exception.ServiceException;
import by.htp.jwd.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances;
		try {
			appliances = applianceDAO.find(criteria);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return appliances;
	}

}
