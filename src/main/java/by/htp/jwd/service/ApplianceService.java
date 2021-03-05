package by.htp.jwd.service;

import java.util.List;

import by.htp.jwd.dao.exception.DAOException;
import by.htp.jwd.entity.Appliance;
import by.htp.jwd.entity.criteria.Criteria;
import by.htp.jwd.service.exception.ServiceException;

public interface ApplianceService {

	List<Appliance> find(Criteria criteria) throws ServiceException;

}