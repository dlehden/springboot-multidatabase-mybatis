package multi.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import multi.database.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping("/localbooking")
	public String selectName() {
		return bookingService.selectName();
	}
	
	@RequestMapping("/homebooking")
	public String homeSelectName() {
		return bookingService.homeSelectName();
	}
	
	@RequestMapping("/hometolocaltx")
	public String homeTolocalInsetTx() {
		return bookingService.homeTolocalBookingInsertTx();
	}
	
	@RequestMapping("/hometolocalnottx")
	public String homeTolocalInsetNotTx() {
		return bookingService.homeTolocalBookingInsertNotTx();
	}

}
