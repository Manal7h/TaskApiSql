import java.io.IOException;
import java.util.Scanner;

public class LongApi {
	
	
	Name name;
	
	
	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}





	String [] tld;
	

	public String[] getTld() {
		return tld;
	}

	public void setTld(String[] tld) {
		this.tld = tld;
	}





	String cca2;
	String ccn3;
	String cca3;
	String cioc;
	boolean independent;
	String status;
	boolean unMember;
	
	public String getCca2() {
		return cca2;
	}

	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}

	public String getCcn3() {
		return ccn3;
	}

	public void setCcn3(String ccn3) {
		this.ccn3 = ccn3;
	}

	public String getCca3() {
		return cca3;
	}

	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}

	public String getCioc() {
		return cioc;
	}

	public void setCioc(String cioc) {
		this.cioc = cioc;
	}

	public boolean isIndependent() {
		return independent;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isUnMember() {
		return unMember;
	}

	public void setUnMember(boolean unMember) {
		this.unMember = unMember;
	}





	Currencies currencies;
	Idd idd;
	
	
	public Currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Idd getIdd() {
		return idd;
	}

	public void setIdd(Idd idd) {
		this.idd = idd;
	}





	String [] capital;
	String [] altSpellings;
	String region;
	String subregion;

	public String[] getCapital() {
		return capital;
	}

	public void setCapital(String[] capital) {
		this.capital = capital;
	}

	public String[] getAltSpellings() {
		return altSpellings;
	}

	public void setAltSpellings(String[] altSpellings) {
		this.altSpellings = altSpellings;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}





	Languages languages;
	Translations translations;

	
	public Languages getLanguages() {
		return languages;
	}

	public void setLanguages(Languages languages) {
		this.languages = languages;
	}

	public Translations getTranslations() {
		return translations;
	}

	public void setTranslations(Translations translations) {
		this.translations = translations;
	}





	float[] latlng;
	boolean landlocked;
	float area;

	
	public float[] getLatlng() {
		return latlng;
	}

	public void setLatlng(float[] latlng) {
		this.latlng = latlng;
	}

	public boolean isLandlocked() {
		return landlocked;
	}

	public void setLandlocked(boolean landlocked) {
		this.landlocked = landlocked;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}





	Demonyms demonyms;
	

	public Demonyms getDemonyms() {
		return demonyms;
	}

	public void setDemonyms(Demonyms demonyms) {
		this.demonyms = demonyms;
	}





	String flag;
	

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}





	Maps maps;
	

	public Maps getMaps() {
		return maps;
	}

	public void setMaps(Maps maps) {
		this.maps = maps;
	}





	int population;
	String fifa;
	

	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getFifa() {
		return fifa;
	}

	public void setFifa(String fifa) {
		this.fifa = fifa;
	}





	Car car;
	

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}





	String [] timezones;
	String [] continents;
	
	public String[] getTimezones() {
		return timezones;
	}

	public void setTimezones(String[] timezones) {
		this.timezones = timezones;
	}

	public String[] getContinents() {
		return continents;
	}

	public void setContinents(String[] continents) {
		this.continents = continents;
	}





	Flags flags;
	CoatOfArms coatOfArms;

	public Flags getFlags() {
		return flags;
	}

	public void setFlags(Flags flags) {
		this.flags = flags;
	}


	public CoatOfArms getCoatOfArms() {
		return coatOfArms;
	}

	public void setCoatOfArms(CoatOfArms coatOfArms) {
		this.coatOfArms = coatOfArms;
	}





	String startOfWeek;
	

	public String getStartOfWeek() {
		return startOfWeek;
	}

	public void setStartOfWeek(String startOfWeek) {
		this.startOfWeek = startOfWeek;
	}





	CapitalInfo capitalInfo;
	

	public CapitalInfo getCapitalInfo() {
		return capitalInfo;
	}

	public void setCapitalInfo(CapitalInfo capitalInfo) {
		this.capitalInfo = capitalInfo;
	}

	static void MainMune(){
		
		System.out.println("Please Choice one Option:");
		
		System.out.println("1. Read From api Table");
		
		
		System.out.println("                                 ");
		
		System.out.println("2. Insert Into api Table");
		
		
		System.out.println("                                 ");
		
		
		System.out.println("3. Read From SQL ");
		
		System.out.println("                                 ");
		
		System.out.println("4. Update From api Table");
		
		System.out.println("                                 ");
		
		System.out.println("5. Delete From api Table");
		
		System.out.println("                                 ");
		
		System.out.println("6. Print From api Table");
	}





	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException  {
		Scanner sc = new Scanner(System.in);
		MainMune();

		do {
			
			int select = sc.nextInt();
			switch(select) {
			
			
			case 1:
				ReadApi.ReadApi();
				break;
			

			case 2:
				InsertFromApi.InsertFromApi();
				break;
				
			case 3:
				ReadFromSQL.ReadFromSQL();
				break;	
				
			case 4:
				UpdateFromApi.UpdateFromApi();
				break;		
	
				
			}	
		}
		while (true);

	}

}

 
