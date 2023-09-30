package Airport;

import Airport.Model.Plane;
import Airport.Service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();

        Plane plane = service.creatPlane();
        Plane plane2 = service.creatPlane();
        Plane plane3 = service.creatPlane();
        Plane[] planes = {plane, plane2, plane3};

        System.out.println("______________");
//        System.out.println(plane.getName());
//        System.out.println(plane.getHoursInAir());
//        System.out.println(plane.getReleaseYear());
//        System.out.println(plane.isMilitary());
        service.printNameAndReleaseDate(plane);
        System.out.println("_____________________");
//        plane.printInfo();
        service.printNameOrHours(plane);
        System.out.println("_____________________");
        System.out.println(service.nameOfPlaneWithBiggerTime(plane, plane2));
        System.out.println("_____________________");
        service.planeWithBiggerName(plane, plane2).printInfo();
        System.out.println("_____________________");
        service.printPlaneArray(planes);
        System.out.println("_____________________");
        service.printMilitaryPlanesAfter2010(planes);
        System.out.println("_____________________");
        service.maxHoursInAir(planes).printInfo();
        System.out.println("_____________________");
        service.printOldestPlane(planes);
        System.out.println("_____________________");
        service.printNewestMilitary(planes);
        System.out.println("_____________________");
        service.sortByReleaseYear(planes);
    }
}
