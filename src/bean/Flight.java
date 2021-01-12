package bean;

public class Flight {
    private String id;  //主键，UUID，无业务信息
    private String flightId;
    private String planeType;   //飞机型号
    private String currentSeatsNum;   //空座位数量
    private String departureAirPort;    //出发机场
    private String destinationAirPort;  //到达机场
    private String departureData;   //日期

    public Flight(String flightId, String planeType, String currentSeatsNum, String departureAirPort, String destinationAirPort, String departureData) {
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureData = departureData;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(String currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureData() {
        return departureData;
    }

    public void setDepartureData(String departureData) {
        this.departureData = departureData;
    }

    @Override
    public String toString() {
        return
                "航班编号flightId='" + flightId + '\'' +","+"\n"+
                "机型planeType='" + planeType + '\'' +","+"\n"+
                " 座位数currentSeatsNum='" + currentSeatsNum + '\'' +","+"\n"+
                "起飞机场departureAirPort='" + departureAirPort + '\'' +","+"\n"+
                "目的机场destinationAirPort='" + destinationAirPort + '\'' +","+"\n"+
                "起飞时间departureData='" + departureData + '\'';
    }
}
