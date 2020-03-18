package com.zapata.fermentation.vo;

public class Analytics {
	
	String pH;
	String taste;
	String flavor;
	Feed feed;
	
	public Analytics(String pH, String taste, String flavor, Feed feed) {
		super();
		this.pH = pH;
		this.taste = taste;
		this.flavor = flavor;
		this.feed = feed;
	}

	public String getpH() {
		return pH;
	}

	public void setpH(String pH) {
		this.pH = pH;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	

	@Override
	public String toString() {
		return "Analytics [pH=" + pH + ", taste=" + taste + ", flavor=" + flavor + ", feed=" + feed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feed == null) ? 0 : feed.hashCode());
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + ((pH == null) ? 0 : pH.hashCode());
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
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
		Analytics other = (Analytics) obj;
		if (feed == null) {
			if (other.feed != null)
				return false;
		} else if (!feed.equals(other.feed))
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (pH == null) {
			if (other.pH != null)
				return false;
		} else if (!pH.equals(other.pH))
			return false;
		if (taste == null) {
			if (other.taste != null)
				return false;
		} else if (!taste.equals(other.taste))
			return false;
		return true;
	}

	
	
	
	
}
