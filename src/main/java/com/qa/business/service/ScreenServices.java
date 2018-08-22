package com.qa.business.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Screens;
import com.qa.persistence.repository.ScreenRepository;

@RestController
@RequestMapping(value = "/screen")
@CrossOrigin(origins = "http://localhost:8080")
@Service
public class ScreenServices {
	
	@Autowired
	ScreenRepository screen;
	
	
	public int getScreenNumber(Screens screens,String movietitle) {
		int screennummber = screen.findByMovieTitle(movietitle).get().getScreennumber();
		return screennummber;
	}
	}
	
	


