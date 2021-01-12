package ui;

import bean.Flight;
import bll.impl.FlightServiceImpl;
import bll.impl.IFlightService;

import java.util.Scanner;
import java.util.UUID;

public class MainUi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("按1，录入航班信息");
        System.out.println("按2，显示所有航班信息");
        System.out.println("按3，查询航班信息");
        System.out.println("按4，机票预订");
        System.out.println("按5，机票退订");
        System.out.println("按6，退出系统");

        int choice= sc.nextInt();

        if(choice ==1){
            String id= UUID.randomUUID().toString();
            System.out.println(id.replace("-",""));
            System.out.println("请输入航班编号：");
            String flightId=sc.next();
            System.out.println("请输入机型：");
            String planeType=sc.next();
            System.out.println("请输入座位数：");
            String currentSeatsNum=sc.next();
            System.out.println("请输入起飞机场：");
            String departureAirPort=sc.next();
            System.out.println("请输入目的机场：");
            String destinationAirPort=sc.next();
            System.out.println("请输入起飞时间：");
            String departureData=sc.next();

            Flight flight=new Flight(flightId,planeType,currentSeatsNum,departureAirPort,
                    destinationAirPort,departureData);

            IFlightService iFlightService =new FlightServiceImpl();
            iFlightService.insertFlight(flight);

        }
    }
}
