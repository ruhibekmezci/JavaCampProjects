package ruhiatakan.hrmsproject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruhiatakan.hrmsproject.business.abstracts.CityService;
import ruhiatakan.hrmsproject.core.utilities.results.DataResult;
import ruhiatakan.hrmsproject.core.utilities.results.ErrorDataResult;
import ruhiatakan.hrmsproject.core.utilities.results.SuccessDataResult;
import ruhiatakan.hrmsproject.dataAccess.abstracts.CityDao;
import ruhiatakan.hrmsproject.entities.concretes.City;

import java.util.List;

@Service
public class CityManager implements CityService {
    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        super();
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {

        return new SuccessDataResult<List<City>>(cityDao.findAll());
    }

    @Override
    public DataResult<City> getById(int id) {
        City city = cityDao.findById(id);
        if(city==null) return new ErrorDataResult<City>();
        return new SuccessDataResult<City>(city);
    }
}
