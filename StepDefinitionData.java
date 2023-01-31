package com.stepdefinitiondata;

import com.Maven_Project.BaseClass;
import com.po_manager.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionData extends BaseClass{
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("user launching the url")
	public void user_launching_the_url() {
		
		urlLaunch("https://adactinhotelapp.com/");

	}
	@When("user enter the {string} in the username field")
	public void user_enter_the_in_the_username_field(String username) {
		
		  passInput(pom.getObjectLogin().getName(), username);
		
	}
	@When("user enter the {string} in the password field")
	public void user_enter_the_in_the_password_field(String password) {
		
		  passInput(pom.getObjectLogin().getPass(), password);

	}
	@Then("user click the login button and its navigate to search hotel page")
	public void user_click_the_login_button_and_its_navigate_to_search_hotel_page() {
		
		  clickonElement(pom.getObjectLogin().getLogin());

	}
	
	@When("user selecting the {string} in the location field")
	public void user_selecting_the_in_the_location_field(String location) {
		
		  selectValue(pom.getObjectSearch().getLocation(), location);

	}
	@When("user selecting the {string} hotel")
	public void user_selecting_the_hotel(String hotel) {
		
		  selectValue(pom.getObjectSearch().getHotels(), hotel);

	}
	@When("user selecting the {string} room type")
	public void user_selecting_the_room_type(String roomtype) {
		
		  selectValue(pom.getObjectSearch().getRtype(),roomtype);

	}
	@When("user selecting the {string} rooms to stay")
	public void user_selecting_the_rooms_to_stay(String rooms) {
		
		  selectValue(pom.getObjectSearch().getRooms(), rooms);

	}
	@When("user checking indate {string}")
	public void user_checking_indate(String indate) {
		
		  passInput(pom.getObjectSearch().getDate(), indate);

		
	}
	@When("user checking outdate {string}")
	public void user_checking_outdate(String outdate) {
		
		  passInput(pom.getObjectSearch().getOutdate(), outdate);

	}
	@When("user selecting {string} rooms for adult")
	public void user_selecting_rooms_for_adult(String adultroom) {
		
		  passInput(pom.getObjectSearch().getOutdate(), adultroom);

	}
	@Then("user click the serach button and its navigate to continue the booking page")
	public void user_click_the_serach_button_and_its_navigate_to_continue_the_booking_page() {
		
		  clickonElement(pom.getObjectSearch().getSearch());

	}
	
	@When("user click the radio button")
	public void user_click_the_radio_button() {
		
		  clickonElement(pom.getObjectContinue().getRadiobtn());
		
	}
	@Then("user click the Continue button for confirmation of booking page")
	public void user_click_the_continue_button_for_confirmation_of_booking_page() {
		
		  clickonElement(pom.getObjectContinue().getCont());

	}
	

	@When("user type the fname {string}")
	public void user_type_the_fname(String fname) {
		
		  passInput(pom.getObjectBooking().getFname(),fname);
		
	}
	@When("user type the lname {string}")
	public void user_type_the_lname(String lname) {
		
		  passInput(pom.getObjectBooking().getLname(), lname);

	}

	@When("user type the {string}")
	public void user_type_the(String address) {
		
	      passInput(pom.getObjectBooking().getChennai(), address);

	}
	@When("user type the card number {string}")
	public void user_type_the_card_number(String cnum) {
		
		  passInput(pom.getObjectBooking().getCnum(),cnum);

	}
	@When("user select the {string} card type")
	public void user_select_the_card_type(String ctype) {
		
		  selectValue(pom.getObjectBooking().getCtype(), ctype);

	}
	@When("user select the {string} month of the credit card")
	public void user_select_the_month_of_the_credit_card(String expmonth) {
		
		  selectVisible(pom.getObjectBooking().getExpmonth(),expmonth);

	}
	@When("user select the {string} year of the credit card")
	public void user_select_the_year_of_the_credit_card(String expyear) {
		
		  selectVisible(pom.getObjectBooking().getExpyear(), "2022");

	}
	@When("user type the {string} number of the card")
	public void user_type_the_number_of_the_card(String cvv) {
		
		  passInput(pom.getObjectBooking().getCvv(), "2867");

	}
	@Then("user click the booknow button for confirmation the booking")
	public void user_click_the_booknow_button_for_confirmation_the_booking() {
		
		  clickonElement(pom.getObjectBooking().getBooknow());

	}











	
	

}
