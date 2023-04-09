package Stepdefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class naveen {

	@Before("@DeleteAPI")
	public void beforemethod() throws IOException
	{
	Stepdefinitions h=	new Stepdefinitions();
	if(Stepdefinitions.place_id==null) {
	h.add_Place_Payload_with("manasa", "irish", "address");
	h.user_calls_with_http_request("AddPlaceAPI"
			, "POST");
	h.the_API_call_got_success_with_status_code(200);
	h.verify_place_Id_created_maps_to_using("manasa", "getPlaceAPI");
	}
	}
}
