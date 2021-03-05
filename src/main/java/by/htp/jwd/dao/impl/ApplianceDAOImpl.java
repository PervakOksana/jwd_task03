package by.htp.jwd.dao.impl;

import by.htp.jwd.entity.Appliance;
import by.htp.jwd.entity.ApplianceBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import by.htp.jwd.dao.ApplianceDAO;
import by.htp.jwd.dao.DAOFactory;
import by.htp.jwd.dao.exception.DAOException;
import by.htp.jwd.entity.criteria.Criteria;
import by.htp.jwd.entity.criteria.SearchCriteria.Oven;

public class ApplianceDAOImpl implements ApplianceDAO {

	private final ApplianceBuilder builder = new ApplianceBuilder();
	String PATH_FILE = "D://IT//EPAM//20210302//appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {

		criteria.getGroupSearchName();
		Map<String, Object> criteriaMap = criteria.getCriteria();
		Appliance аppliance = null;
		List<Appliance> аppliances = new ArrayList<Appliance>();
		List<String> criteriaArr = new ArrayList<String>();
		boolean result = true;
		int count = 0;
		String data = "";

		Set<Map.Entry<String, Object>> set = criteriaMap.entrySet();
		for (Map.Entry<String, Object> sg : set) {
			criteriaArr.add(sg.getKey() + "=" + criteriaMap.get(sg.getKey()));

		}

		try (FileInputStream fin = new FileInputStream(PATH_FILE)) {
			int i = -1;
			while ((i = fin.read()) != -1) {
				data = data + ((char) i);
			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}

		String[] lines = data.split("\n");

		for (int i = 0; lines.length > i; i++) {
			if (lines[i].indexOf(criteria.getGroupSearchName()) != -1) {
				for (String str : criteriaArr) {
					result = lines[i].contains(str);
					if (result)
						count++;
					if (!result)
						count--;
				}

				if (count == criteriaArr.size()) {
					аppliance = builder.getAppliance(criteria.getGroupSearchName());
					аppliance = аppliance.factory(lines[i]);
					аppliances.add(аppliance);
				}
				count = 0;
			}

		}

		return аppliances;
	}

}
