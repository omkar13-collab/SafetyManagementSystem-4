package com.Safety.Controller;

import java.util.List;

//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Safety.Exception.RecordNotFoundException;
import com.Safety.Model.Injury;
import com.Safety.Service.InjuryService;

@RestController
public class InjuryRestController {
	@Autowired
	InjuryService service;
	@PostMapping("/injury")
	public ResponseEntity<Injury> createInjury(@Validated @RequestBody Injury injury){
		Injury e=service.addInjury(injury);
		System.out.println(e);
		//return ResponseEntity.ok().body("new employee added successfully");
		return new ResponseEntity<Injury>(e,HttpStatus.OK);
	}
	@GetMapping("/injury")
	public ResponseEntity<List<Injury>> fetchInjury(){
		List<Injury> injury=service.findallInjury();
		//return new ResponseEntity.ok().body(injury);
		//return new ResponseEntity.ok().body(injury);
		return ResponseEntity.ok().body(injury);
		}
	@GetMapping("/injury/{injuryId}")
	public ResponseEntity<List<Injury>> getInjuryById(@PathVariable int injuryId){
		  Optional<Injury> injury=service.findByInjuryId(injuryId);
		    if(injury.isPresent())
		    {
		        return new ResponseEntity(injury.get(), HttpStatus.OK);
		    }
		    else
		    {
		        throw new RecordNotFoundException("Record not found....");
		    }
		}
		@PutMapping("/injury/{injuryId}")
		public ResponseEntity<Injury> updateInjury(@PathVariable int injuryId,@RequestBody Injury injury){
		    Injury e=service.updateInjury(injuryId,injury);
		    return new ResponseEntity<Injury>(e,HttpStatus.OK);
		
		}
		
	}