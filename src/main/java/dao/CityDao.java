package dao;

import model.City;

import java.util.List;

public abstract class CityDao {
    abstract void createCity(City city);

    abstract City getByIdCity(int id);

    abstract List<City> getAllCities();


    abstract void updateCity(City city);

    abstract void deleteCity(City city);
}
