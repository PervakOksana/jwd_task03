package by.htp.jwd.entity;

public class Speaker implements Appliance {

	private String power_consumption;
	private String number_of_speakers;
	private String frequency_range;
	private String cord_length;

	public Speaker() {
		super();
	}

	public Speaker(String power_consumption, String number_of_speakers, String frequency_range, String cord_length) {
		super();
		this.power_consumption = power_consumption;
		this.number_of_speakers = number_of_speakers;
		this.frequency_range = frequency_range;
		this.cord_length = cord_length;
	}

	public String getPower_consumption() {
		return power_consumption;
	}

	public void setPower_consumption(String power_consumption) {
		this.power_consumption = power_consumption;
	}

	public String getNumber_of_speakers() {
		return number_of_speakers;
	}

	public void setNumber_of_speakers(String number_of_speakers) {
		this.number_of_speakers = number_of_speakers;
	}

	public String getFrequency_range() {
		return frequency_range;
	}

	public void setFrequency_range(String frequency_range) {
		this.frequency_range = frequency_range;
	}

	public String getCord_length() {
		return cord_length;
	}

	public void setCord_length(String cord_length) {
		this.cord_length = cord_length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cord_length == null) ? 0 : cord_length.hashCode());
		result = prime * result + ((frequency_range == null) ? 0 : frequency_range.hashCode());
		result = prime * result + ((number_of_speakers == null) ? 0 : number_of_speakers.hashCode());
		result = prime * result + ((power_consumption == null) ? 0 : power_consumption.hashCode());
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
		Speaker other = (Speaker) obj;
		if (cord_length == null) {
			if (other.cord_length != null)
				return false;
		} else if (!cord_length.equals(other.cord_length))
			return false;
		if (frequency_range == null) {
			if (other.frequency_range != null)
				return false;
		} else if (!frequency_range.equals(other.frequency_range))
			return false;
		if (number_of_speakers == null) {
			if (other.number_of_speakers != null)
				return false;
		} else if (!number_of_speakers.equals(other.number_of_speakers))
			return false;
		if (power_consumption == null) {
			if (other.power_consumption != null)
				return false;
		} else if (!power_consumption.equals(other.power_consumption))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speaker [power_consumption=" + power_consumption + ", number_of_speakers=" + number_of_speakers
				+ ", frequency_range=" + frequency_range + ", cord_length=" + cord_length + "]";
	}

	@Override
	public Appliance factory(String string) {

		Speaker speaker = new Speaker();
		String[] words = string.split("\\s");

		speaker.power_consumption = words[2].split("=")[1].split(",")[0];
		speaker.number_of_speakers = words[3].split("=")[1].split(",")[0];
		speaker.frequency_range = words[4].split("=")[1].split(",")[0];
		speaker.cord_length = words[5].split("=")[1];

		return speaker;
	}

}
