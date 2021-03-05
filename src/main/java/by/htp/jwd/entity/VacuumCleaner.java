package by.htp.jwd.entity;

public class VacuumCleaner implements Appliance {

	private String power_consumption;
	private String filter_type;
	private String bag_type;
	private String wand_type;
	private String motor_speed_regulation;
	private String cleaning_width;

	public VacuumCleaner() {
		super();
	}

	public VacuumCleaner(String power_consumption, String filter_type, String bag_type, String wand_type,
			String motor_speed_regulation, String cleaning_width) {
		super();
		this.power_consumption = power_consumption;
		this.filter_type = filter_type;
		this.bag_type = bag_type;
		this.wand_type = wand_type;
		this.motor_speed_regulation = motor_speed_regulation;
		this.cleaning_width = cleaning_width;
	}

	public String getPower_consumption() {
		return power_consumption;
	}

	public void setPower_consumption(String power_consumption) {
		this.power_consumption = power_consumption;
	}

	public String getFilter_type() {
		return filter_type;
	}

	public void setFilter_type(String filter_type) {
		this.filter_type = filter_type;
	}

	public String getBag_type() {
		return bag_type;
	}

	public void setBag_type(String bag_type) {
		this.bag_type = bag_type;
	}

	public String getWand_type() {
		return wand_type;
	}

	public void setWand_type(String wand_type) {
		this.wand_type = wand_type;
	}

	public String getMotor_speed_regulation() {
		return motor_speed_regulation;
	}

	public void setMotor_speed_regulation(String motor_speed_regulation) {
		this.motor_speed_regulation = motor_speed_regulation;
	}

	public String getCleaning_width() {
		return cleaning_width;
	}

	public void setCleaning_width(String cleaning_width) {
		this.cleaning_width = cleaning_width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bag_type == null) ? 0 : bag_type.hashCode());
		result = prime * result + ((cleaning_width == null) ? 0 : cleaning_width.hashCode());
		result = prime * result + ((filter_type == null) ? 0 : filter_type.hashCode());
		result = prime * result + ((motor_speed_regulation == null) ? 0 : motor_speed_regulation.hashCode());
		result = prime * result + ((power_consumption == null) ? 0 : power_consumption.hashCode());
		result = prime * result + ((wand_type == null) ? 0 : wand_type.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bag_type == null) {
			if (other.bag_type != null)
				return false;
		} else if (!bag_type.equals(other.bag_type))
			return false;
		if (cleaning_width == null) {
			if (other.cleaning_width != null)
				return false;
		} else if (!cleaning_width.equals(other.cleaning_width))
			return false;
		if (filter_type == null) {
			if (other.filter_type != null)
				return false;
		} else if (!filter_type.equals(other.filter_type))
			return false;
		if (motor_speed_regulation == null) {
			if (other.motor_speed_regulation != null)
				return false;
		} else if (!motor_speed_regulation.equals(other.motor_speed_regulation))
			return false;
		if (power_consumption == null) {
			if (other.power_consumption != null)
				return false;
		} else if (!power_consumption.equals(other.power_consumption))
			return false;
		if (wand_type == null) {
			if (other.wand_type != null)
				return false;
		} else if (!wand_type.equals(other.wand_type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [power_consumption=" + power_consumption + ", filter_type=" + filter_type + ", bag_type="
				+ bag_type + ", wand_type=" + wand_type + ", motor_speed_regulation=" + motor_speed_regulation
				+ ", cleaning_width=" + cleaning_width + "]";
	}

	@Override
	public Appliance factory(String string) {

		VacuumCleaner vacuumCleaner = new VacuumCleaner();
		String[] words = string.split("\\s");

		vacuumCleaner.power_consumption = words[2].split("=")[1].split(",")[0];
		vacuumCleaner.filter_type = words[3].split("=")[1].split(",")[0];
		vacuumCleaner.bag_type = words[4].split("=")[1].split(",")[0];
		vacuumCleaner.wand_type = words[5].split("=")[1].split(",")[0];
		vacuumCleaner.motor_speed_regulation = words[6].split("=")[1].split(",")[0];
		vacuumCleaner.cleaning_width = words[7].split("=")[1];

		return vacuumCleaner;
	}

}
