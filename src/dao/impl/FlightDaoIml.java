package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.util.Set;

public class FlightDaoIml implements IFlightDao {

    @Override
    public void insertFlight(Flight flight) {
        System.out.println(flight);
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
