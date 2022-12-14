package com.djgama.dojosandninjas.services;

import com.djgama.dojosandninjas.models.Dojo;
import com.djgama.dojosandninjas.models.Ninja;
import com.djgama.dojosandninjas.repositories.DojoRepository;
import com.djgama.dojosandninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;

	public NinjaService(NinjaRepository ninjaRepo){
		this.ninjaRepo = ninjaRepo;
	}

	public List<Ninja> getAll(){
		return ninjaRepo.findAll();
	}

	public Ninja create(Ninja ninja){
		return ninjaRepo.save(ninja);
	}

//	public Ninja getOne(Long id){
//		Optional<Dojo> dojo = ninjaRepo.findById(id);
//		return dojo.orElse(null);
//	}


}
