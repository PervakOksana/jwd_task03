package by.htp.jwd.entity;

public class TabletPC implements Appliance {

	private String battery_capacity;
	private String display_inches;
	private String memory_rom;
	private String flash_memory_capacity;
	private String color;

	public TabletPC() {
		super();
	}

	public TabletPC(String battery_capacity, String display_inches, String memory_rom, String flash_memory_capacity,
			String color) {
		super();
		this.battery_capacity = battery_capacity;
		this.display_inches = display_inches;
		this.memory_rom = memory_rom;
		this.flash_memory_capacity = flash_memory_capacity;
		this.color = color;
	}

	public String getBattery_capacity() {
		return battery_capacity;
	}

	public void setBattery_capacity(String battery_capacity) {
		this.battery_capacity = battery_capacity;
	}

	public String getDisplay_inches() {
		return display_inches;
	}

	public void setDisplay_inches(String display_inches) {
		this.display_inches = display_inches;
	}

	public String getMemory_rom() {
		return memory_rom;
	}

	public void setMemory_rom(String memory_rom) {
		this.memory_rom = memory_rom;
	}

	public String getFlash_memory_capacity() {
		return flash_memory_capacity;
	}

	public void setFlash_memory_capacity(String flash_memory_capacity) {
		this.flash_memory_capacity = flash_memory_capacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((battery_capacity == null) ? 0 : battery_capacity.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((display_inches == null) ? 0 : display_inches.hashCode());
		result = prime * result + ((flash_memory_capacity == null) ? 0 : flash_memory_capacity.hashCode());
		result = prime * result + ((memory_rom == null) ? 0 : memory_rom.hashCode());
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
		TabletPC other = (TabletPC) obj;
		if (battery_capacity == null) {
			if (other.battery_capacity != null)
				return false;
		} else if (!battery_capacity.equals(other.battery_capacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (display_inches == null) {
			if (other.display_inches != null)
				return false;
		} else if (!display_inches.equals(other.display_inches))
			return false;
		if (flash_memory_capacity == null) {
			if (other.flash_memory_capacity != null)
				return false;
		} else if (!flash_memory_capacity.equals(other.flash_memory_capacity))
			return false;
		if (memory_rom == null) {
			if (other.memory_rom != null)
				return false;
		} else if (!memory_rom.equals(other.memory_rom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [battery_capacity=" + battery_capacity + ", display_inches=" + display_inches + ", memory_rom="
				+ memory_rom + ", flash_memory_capacity=" + flash_memory_capacity + ", color=" + color + "]";
	}

	@Override
	public Appliance factory(String string) {

		TabletPC tabletPC = new TabletPC();
		String[] words = string.split("\\s");

		tabletPC.battery_capacity = words[2].split("=")[1].split(",")[0];
		tabletPC.display_inches = words[3].split("=")[1].split(",")[0];
		tabletPC.memory_rom = words[4].split("=")[1].split(",")[0];
		tabletPC.flash_memory_capacity = words[5].split("=")[1].split(",")[0];
		tabletPC.color = words[6].split("=")[1];

		return tabletPC;
	}

}
