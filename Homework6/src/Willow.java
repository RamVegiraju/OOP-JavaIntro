

public class Willow extends java.lang.Object implements Comparable<Willow> {
	
	String neighborhood;
	int bedrooms;
	boolean garage;
	double distToCenter;
	double price; 

	  Willow(String neighborhood,
			  int bedrooms,
			  boolean garage,
			  double distToCenter,
			  double price){
		  
		this.neighborhood = neighborhood;
		this.bedrooms = bedrooms;
		this.garage = garage;
		this.distToCenter = distToCenter;
		this.price = price;
	  }

	@Override
	public int compareTo(Willow o) {
		
		if (this.price - o.price >0) {
			return 1;
		}
			else if(this.price - o.price <0){
			return -1;
			}
		//	else if (this.distToCenter - o.distToCenter ==0 && this.price - o.price ==0) {
			//	return 0;
			//}
		if (this.distToCenter - o.distToCenter >0) {
			return 1;
		}
			else if(this.distToCenter - o.distToCenter<0){
			return -1;
			}
				else {
					return 0;
				}
	}
	
	public int sortByNaturalOrdering(Willow o) {
		return compareTo(o);
	}
	
	public int sortByBedroomsAndGarage(Willow o) {
		
		Integer bedrooms = o.bedrooms;

		if (garage) { 
            int intValue = 1; 
        } 
        else { 
            int intValue = 0; 
        }

		if (this.bedrooms > o.bedrooms) {
			return 3;
		}
		else if (this.bedrooms < o.bedrooms){
			return -3;
		}
		if (this.garage == true &&  o.garage== false) {
			return -1;
		}
		else if (this.garage == false && o.garage == false) {
			return 0;
		}
		else if (this.garage== true && o.garage==true) {
			return 0;
			}
		else {
			return 1;
		}
		
	}
	public int sortByNeighborhoodAndPrice(Willow o) {
		int retVal = this.neighborhood.compareTo(o.bedrooms);
		if (retVal !=0) return retVal;
		if (this.price - o.price >0) {
					return -1;
				}
					else if(this.price - o.price <0){
					return 1;
					}	
					else {
						return 0;
					}
		
	}

	@Override
	public String toString() {
		return "Willow [neighborhood=" + neighborhood + ", bedrooms=" + bedrooms + ", garage=" + garage
				+ ", distToCenter=" + distToCenter + ", price=" + price + "]";
	}

	/**
	 * @return the neighborhood
	 */
	public String getNeighborhood() {
		return neighborhood;
	}

	/**
	 * @param neighborhood the neighborhood to set
	 */
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	/**
	 * @return the bedrooms
	 */
	public int getBedrooms() {
		return bedrooms;
	}

	/**
	 * @param bedrooms the bedrooms to set
	 */
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	/**
	 * @return the garage
	 */
	public boolean isGarage() {
		return garage;
	}

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	/**
	 * @return the distToCenter
	 */
	public double getDistToCenter() {
		return distToCenter;
	}

	/**
	 * @param distToCenter the distToCenter to set
	 */
	public void setDistToCenter(double distToCenter) {
		this.distToCenter = distToCenter;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
		
	
	}
