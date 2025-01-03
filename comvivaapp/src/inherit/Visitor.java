package inherit;

import java.util.Objects;

//toString
//equals
//finalize
public class Visitor {

	private int visitorId;
	private String visitorName;
	private String purpose;
	private String contactPerson;
	private int time;
	
	public Visitor() {
	}

	public Visitor(int visitorId, String visitorName, String purpose, String contactPerson) {
		super();
		this.visitorId = visitorId;
		this.visitorName = visitorName;
		this.purpose = purpose;
		this.contactPerson = contactPerson;
	}

	
	public Visitor(int visitorId, String visitorName, String purpose) {
		super();
		this.visitorId = visitorId;
		this.visitorName = visitorName;
		this.purpose = purpose;
	}

	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Override
	public String toString() {
		return "Visitor [visitorId=" + visitorId + ", visitorName=" + visitorName + ", purpose=" + purpose
				+ ", contactPerson=" + contactPerson + ", time=" + time + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactPerson, purpose, time, visitorId, visitorName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visitor other = (Visitor) obj;
		return Objects.equals(contactPerson, other.contactPerson) && Objects.equals(purpose, other.purpose)
				&& time == other.time && visitorId == other.visitorId && Objects.equals(visitorName, other.visitorName);
	}
	
	
	
}
