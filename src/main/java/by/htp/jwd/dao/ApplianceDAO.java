package by.htp.jwd.dao;

import java.util.List;

import by.htp.jwd.dao.exception.DAOException;
import by.htp.jwd.entity.Appliance;
import by.htp.jwd.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws DAOException;
}
