package roadgraph;

import geography.GeographicPoint;

public class MapEdges {

	//Add member variables/fields
	private String streetName;
	private GeographicPoint Start;
	private GeographicPoint End;
	private double distance;
	private String roadType;
	
	//Constructor for the MapEdges
	public MapEdges(GeographicPoint start) {
		this.Start = start;
		this.End = null;
		distance = this.getDistance();
		streetName = this.getStreet();
		roadType = this.getRoadType();
	}	
	
	//Set the road type
	public void setRoadType(String roadtype) {
		this.roadType = roadtype;
	}
	
	//Get the road type
	public String getRoadType() {
		return this.roadType;
	}
	
	//Set the street name
	public void setStreetName(String StreetName) {
		this.streetName = StreetName;
	}
	
	//Get the name of this street/edge
		public String getStreet() {
			return streetName;
	}
	
	//Set the end location
	public void setEndPoint(GeographicPoint end) {
		this.End = end;
	}
		
	//Get the start location of this edge
	public GeographicPoint getStart(){
		return Start;
	}
	
	//Get the end location of this edge
	public GeographicPoint getEnd() {
		return End;
	}
	
	//Set the distance of this edge
	public void setDistance(double Distance){
		this.distance = Distance;
	}
	
	//Get the distance of this edge
	public double getDistance() {
		return distance;
	}
		
}
