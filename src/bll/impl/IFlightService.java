package bll.impl;

import bean.Flight;

import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    Flight getFlightByDepartureData(String departureData);
    void updateFlight(Flight flight);
}
