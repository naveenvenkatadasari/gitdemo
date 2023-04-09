package Data;

import java.util.ArrayList;

import pojo.addplaceapiagain;
import pojo.locationsub;

public class data {



	public addplaceapiagain addPlacePayLoad(String name, String language, String address) {
		// TODO Auto-generated method stub
		addplaceapiagain a=new addplaceapiagain();

		
		a.setAccuracy("50");
		a.setName(name);
		a.setPhone_number("+1 987456879");
		a.setAddress(address);
		a.setWebsite("Daaji.com");
		a.setLanguage(language);
		ArrayList<String> l= new ArrayList<String>();
		l.add("Shoes");
		l.add("naveen");

		a.setTypes(l);
		locationsub loc=new locationsub();
		loc.setLat(-38.383494);
		loc.setLng(33.45678);
		a.setLocation(loc);
    return a;
	}

	public String deletepayload(String placeid)
	{
		return "{\r\n    \"place_id\":\""+placeid+"\"\r\n}";
	}
}
