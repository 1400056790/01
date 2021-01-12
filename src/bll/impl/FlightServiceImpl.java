package bll.impl;

import bean.Flight;
import dao.IFlightDao;
import dao.impl.FlightDaoIml;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {
    IFlightDao iFlightDao=new FlightDaoIml();

    @Override
    public void insertFlight(Flight flight) {
        iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureData(String departureData) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }

}
