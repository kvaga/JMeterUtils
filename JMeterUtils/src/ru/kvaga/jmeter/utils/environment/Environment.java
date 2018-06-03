package ru.kvaga.jmeter.utils.environment;

public class Environment {
	private String osName = System.getProperty("os.name").toLowerCase();
	public boolean isOSWindows() {
		return (osName.indexOf("win") >= 0);
	}

	public boolean isOSMac() {
		return (osName.indexOf("mac") >= 0);
	}

	public boolean isOSLinuxUnix() {
		return (osName.indexOf("nix") >= 0 || osName.indexOf("aix") > 0 || osName.indexOf("nux") >= 0  );
	}

	public boolean isOSLinux() {
		return (osName.indexOf("nux") >= 0  );
	}
	
	public boolean isOSSolaris() {
		return (osName.indexOf("sunos") >= 0);
	}

	public static void main(String[] args) {
		Environment os = new Environment();
		
		System.out.println(os.isOSLinux());
		System.out.println(os.isOSWindows());
	}
}
