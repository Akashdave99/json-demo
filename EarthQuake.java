package json_demo;

public class EarthQuake {
	private Double mag;
	private String place, url;
	public Double getMag() {
		return mag;
	}
	public void setMag(Double mag) {
		this.mag = mag;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "EarthQuake [mag=" + mag + ", place=" + place + ", url=" + url + "]";
	}
	
	
}
