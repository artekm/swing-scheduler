package pl.itacademy.schedule.holidays;

import pl.itacademy.schedule.util.PropertiesReader;

public class HolidaysProviderFactory {

	public static HolidaysProvider getProvider(boolean verbose) {
		PropertiesReader properties = PropertiesReader.getInstance();
		String provider = properties.readProperty("holidaysProvider");

//		HolidaysProvider webClient = HolidaysProviderType.getByName(provider).getHolidaysProviderInstance();

		String pack = HolidaysProviderFactory.class.getPackage().getName();
		String className = pack + "." + provider;
		HolidaysProvider webClient;
		try {
			webClient = (HolidaysProvider) Class.forName(className).getConstructor().newInstance();
		} catch (Exception e) {
			if (verbose)
				System.out.println("Class " + className + " not found");
			webClient = new HolidaysNone();
		}
		if (verbose)
			System.out.println("Using " + webClient.getClass().getName());
		return webClient;
	}
}
