package org.dehkordi.gitdemo.model;

public class Company {
	private String duns;
	private String name;

	public String getDuns() {
		return duns;
	}

	public void setDuns(String duns) {
		this.duns = duns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duns == null) ? 0 : duns.hashCode());
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
		Company other = (Company) obj;
		if (duns == null) {
			if (other.duns != null)
				return false;
		} else if (!duns.equals(other.duns))
			return false;
		return true;
	}
	
	
}
