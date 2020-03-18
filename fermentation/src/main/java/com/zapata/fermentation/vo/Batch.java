package com.zapata.fermentation.vo;

public class Batch {
	
	String id;
	String startDate;
	String endDate;
	//Notification deadline object of int ?
	Analytics analytics;

	public Batch(String id, String startDate, String endDate, Analytics analytics) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.analytics = analytics;
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

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Analytics getAnalytics() {
		return analytics;
	}

	public void setAnalytics(Analytics analytics) {
		this.analytics = analytics;
	}
	
	@Override
	public String toString() {
		return "Batch [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", analytics=" + analytics
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((analytics == null) ? 0 : analytics.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		Batch other = (Batch) obj;
		if (analytics == null) {
			if (other.analytics != null)
				return false;
		} else if (!analytics.equals(other.analytics))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	
	
	
	
	
	
	
}
