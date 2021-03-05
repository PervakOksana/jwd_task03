package by.htp.jwd.entity;

public class Laptop implements Appliance {

	private String battery_capacity;
	private String os;
	private String memory_rom;
	private String system_memory;
	private String cpu;
	private String display_inchs;

	public Laptop() {
		super();
	}

	public Laptop(String battery_capacity, String os, String memory_rom, String system_memory, String cpu,
			String display_inchs) {
		super();
		this.battery_capacity = battery_capacity;
		this.os = os;
		this.memory_rom = memory_rom;
		this.system_memory = system_memory;
		this.cpu = cpu;
		this.display_inchs = display_inchs;
	}

	public String getBattery_capacity() {
		return battery_capacity;
	}

	public void setBattery_capacity(String battery_capacity) {
		this.battery_capacity = battery_capacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMemory_rom() {
		return memory_rom;
	}

	public void setMemory_rom(String memory_rom) {
		this.memory_rom = memory_rom;
	}

	public String getSystem_memory() {
		return system_memory;
	}

	public void setSystem_memory(String system_memory) {
		this.system_memory = system_memory;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDisplay_inchs() {
		return display_inchs;
	}

	public void setDisplay_inchs(String display_inchs) {
		this.display_inchs = display_inchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((battery_capacity == null) ? 0 : battery_capacity.hashCode());
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((display_inchs == null) ? 0 : display_inchs.hashCode());
		result = prime * result + ((memory_rom == null) ? 0 : memory_rom.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + ((system_memory == null) ? 0 : system_memory.hashCode());
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
		Laptop other = (Laptop) obj;
		if (battery_capacity == null) {
			if (other.battery_capacity != null)
				return false;
		} else if (!battery_capacity.equals(other.battery_capacity))
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (display_inchs == null) {
			if (other.display_inchs != null)
				return false;
		} else if (!display_inchs.equals(other.display_inchs))
			return false;
		if (memory_rom == null) {
			if (other.memory_rom != null)
				return false;
		} else if (!memory_rom.equals(other.memory_rom))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (system_memory == null) {
			if (other.system_memory != null)
				return false;
		} else if (!system_memory.equals(other.system_memory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [battery_capacity=" + battery_capacity + ", os=" + os + ", memory_rom=" + memory_rom
				+ ", system_memory=" + system_memory + ", cpu=" + cpu + ", display_inchs=" + display_inchs + "]";
	}

	@Override
	public Appliance factory(String string) {

		Laptop laptop = new Laptop();
		String[] words = string.split("\\s");

		laptop.battery_capacity = words[2].split("=")[1].split(",")[0];
		laptop.os = words[3].split("=")[1].split(",")[0];
		laptop.memory_rom = words[4].split("=")[1].split(",")[0];
		laptop.system_memory = words[5].split("=")[1].split(",")[0];
		laptop.cpu = words[6].split("=")[1].split(",")[0];
		laptop.display_inchs = words[7].split("=")[1];

		return laptop;
	}

}
