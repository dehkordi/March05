package org.dehkordi.gitdemo.model;

public class Contact {
	
	private String homeNumber;
	private String businessNumber;
	
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessNumber == null) ? 0 : businessNumber.hashCode());
		result = prime * result + ((homeNumber == null) ? 0 : homeNumber.hashCode());
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
		Contact other = (Contact) obj;
		if (businessNumber == null) {
			if (other.businessNumber != null)
				return false;
		} else if (!businessNumber.equals(other.businessNumber))
			return false;
		if (homeNumber == null) {
			if (other.homeNumber != null)
				return false;
		} else if (!homeNumber.equals(other.homeNumber))
			return false;
		return true;
	}

	

}
