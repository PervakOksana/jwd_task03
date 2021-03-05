package by.htp.jwd.entity;

public class Refrigerator implements Appliance {

	private String power_consumption;
	private String weight;
	private String freezer_capacity;
	private String overall_capacity;
	private String height;
	private String width;

	public Refrigerator() {
		super();
	}

	public Refrigerator(String power_consumption, String weight, String freezer_capacity, String overall_capacity,
			String height, String width) {
		super();
		this.power_consumption = power_consumption;
		this.weight = weight;
		this.freezer_capacity = freezer_capacity;
		this.overall_capacity = overall_capacity;
		this.height = height;
		this.width = width;
	}

	public String getPower_consumption() {
		return power_consumption;
	}

	public void setPower_consumption(String power_consumption) {
		this.power_consumption = power_consumption;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getFreezer_capacity() {
		return freezer_capacity;
	}

	public void setFreezer_capacity(String freezer_capacity) {
		this.freezer_capacity = freezer_capacity;
	}

	public String getOverall_capacity() {
		return overall_capacity;
	}

	public void setOverall_capacity(String overall_capacity) {
		this.overall_capacity = overall_capacity;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((freezer_capacity == null) ? 0 : freezer_capacity.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((overall_capacity == null) ? 0 : overall_capacity.hashCode());
		result = prime * result + ((power_consumption == null) ? 0 : power_consumption.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
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
		Refrigerator other = (Refrigerator) obj;
		if (freezer_capacity == null) {
			if (other.freezer_capacity != null)
				return false;
		} else if (!freezer_capacity.equals(other.freezer_capacity))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (overall_capacity == null) {
			if (other.overall_capacity != null)
				return false;
		} else if (!overall_capacity.equals(other.overall_capacity))
			return false;
		if (power_consumption == null) {
			if (other.power_consumption != null)
				return false;
		} else if (!power_consumption.equals(other.power_consumption))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [power_consumption=" + power_consumption + ", weight=" + weight + ", freezer_capacity="
				+ freezer_capacity + ", overall_capacity=" + overall_capacity + ", height=" + height + ", width="
				+ width + "]";
	}

	@Override
	public Appliance factory(String string) {

		Refrigerator refrigerator = new Refrigerator();
		String[] words = string.split("\\s");

		refrigerator.power_consumption = words[2].split("=")[1].split(",")[0];
		refrigerator.weight = words[3].split("=")[1].split(",")[0];
		refrigerator.freezer_capacity = words[4].split("=")[1].split(",")[0];
		refrigerator.overall_capacity = words[5].split("=")[1].split(",")[0];
		refrigerator.height = words[6].split("=")[1].split(",")[0];
		refrigerator.width = words[7].split("=")[1];

		return refrigerator;
	}

}
