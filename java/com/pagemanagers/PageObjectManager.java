package com.pagemanagers;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmation;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmation bookingConfirmation;
	private CancelBookingPage cancelBookingPage;

	
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;

	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage= new BookHotelPage():bookHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null) ? selectHotelPage =new SelectHotelPage():selectHotelPage;
	}

	public BookingConfirmation getBookingConfirmation() {
		return (bookingConfirmation==null)?bookingConfirmation= new BookingConfirmation():bookingConfirmation;
	}
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage== null)?cancelBookingPage= new CancelBookingPage():cancelBookingPage;
	}


}
