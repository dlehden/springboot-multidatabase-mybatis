package multi.database.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import multi.database.mapper.home.HomeBookingMapper;
import multi.database.mapper.local.BookingMapper;

@Service
public class BookingService {
	// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
	LocalDate now = LocalDate.now();

	@Autowired
	BookingMapper bookingMapper;
	@Autowired
	HomeBookingMapper homeBookingMapper;
	
	public String selectName() {
		return bookingMapper.selectName() + "local";
	}
	
	public String homeSelectName() {
		return homeBookingMapper.selectName() + "home";
	}
	public void homeBookingInsert() {
		homeBookingMapper.insertHomeBooking( (int)(Math.random()*100) , "home"+(int)(Math.random()*100) , "booking", now);
	}

	public void localBookingInsert() {
		bookingMapper.insertLocalBooking( (int)(Math.random()*10) , "local" +(int)(Math.random()*10) , "booking", now);
	}
	
	@Transactional
	public String homeTolocalBookingInsertTx() {
		  homeBookingInsert();
		  localBookingInsert();
		return  homeBookingMapper.selectName() + "home"+ "<br>"  + bookingMapper.selectName() + "local";
	}
	
	
	public String homeTolocalBookingInsertNotTx() {
		  homeBookingInsert();
		  localBookingInsert();
		return  homeBookingMapper.selectName() + "home"+ "<br>"  + bookingMapper.selectName() + "local";
	}

}
