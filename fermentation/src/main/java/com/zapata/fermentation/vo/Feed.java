package com.zapata.fermentation.vo;

public class Feed {

	String id;
	String startDate;
	String composition;
	String mass;
	String water;
	
	public Feed(String id, String startDate, String composition, String mass, String water) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.composition = composition;
		this.mass = mass;
		this.water = water;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	@Override
	public String toString() {
		return "Feed [id=" + id + ", startDate=" + startDate + ", composition=" + composition + ", mass=" + mass
				+ ", water=" + water + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((composition == null) ? 0 : composition.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mass == null) ? 0 : mass.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((water == null) ? 0 : water.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feed other = (Feed) obj;
		if (composition == null) {
			if (other.composition != null)
				return false;
		} else if (!composition.equals(other.composition))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mass == null) {
			if (other.mass != null)
				return false;
		} else if (!mass.equals(other.mass))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (water == null) {
			if (other.water != null)
				return false;
		} else if (!water.equals(other.water))
			return false;
		return true;
	}
	
	
	
}
