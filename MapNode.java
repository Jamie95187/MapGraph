/**
* A class that represents a MapNode on the graph (MapGraph). 
* A MapNode is a geographical point of interest/an intersection
* between edges (Streets).
*/

package roadgraph;

import java.util.ArrayList;
import java.util.List;

import geography.GeographicPoint;

public class MapNode {

	//List of nodes connected to this node
	private List<MapNode> neighbours;
	//List of edges connected to this node
	private List<MapEdges> streets;
	private GeographicPoint location;
	
	public MapNode(GeographicPoint here) {
		neighbours = new ArrayList<MapNode>();
		streets = new ArrayList<MapEdges>();
		location = here;
	}

	//Add a neighbour node to this node
	public void addNeighbour(MapNode node) {
		neighbours.add(node);
	}
	
	//Add a street to this node
	public void addStreet(MapEdges street) {
		streets.add(street);
	}
	
	//Get the MapEdge from the list of streets
	public MapEdges getEdge(MapEdges edge) {
		for(int i = 0; i < streets.size(); i++) {
			if(streets.get(i).equals(edge)) {
				return streets.get(i);
			}
		}
		return null;
	}
	
	//Get a list of all the nodes connected to this node
	public List<MapNode> getNeighbours(){
		return neighbours;
	}
	
	//Get a list of all the streets connected to this node
	public List<MapEdges> getStreets(){
		return streets;
	}
	
	public GeographicPoint getNodeAsGP() {
		return location;
	}
}
