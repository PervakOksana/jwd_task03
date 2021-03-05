package by.htp.jwd.entity;

public class Oven implements Appliance {

	private String power_consumption;
	private String weight;
	private String capacity;
	private String depth;
	private String height;
	private String width;

	public Oven() {
		super();
	}

	public Oven(String power_consumption, String weight, String capacity, String depth, String height, String width) {
		super();
		this.power_consumption = power_consumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
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

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
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
		result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result + ((depth == null) ? 0 : depth.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
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
		Oven other = (Oven) obj;
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
		if (depth == null) {
			if (other.depth != null)
				return false;
		} else if (!depth.equals(other.depth))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
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
		return "Oven [power_consumption=" + power_consumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}

	@Override
	public Appliance factory(String string) {

		Oven oven = new Oven();
		String[] words = string.split("\\s");

		oven.power_consumption = words[2].split("=")[1].split(",")[0];
		oven.weight = words[3].split("=")[1].split(",")[0];
		oven.capacity = words[4].split("=")[1].split(",")[0];
		oven.depth = words[5].split("=")[1].split(",")[0];
		oven.height = words[6].split("=")[1].split(",")[0];
		oven.width = words[7].split("=")[1];

		return oven;
	}

}
