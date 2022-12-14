package com.djgama.dojosandninjas.services;

import com.djgama.dojosandninjas.models.Dojo;
import com.djgama.dojosandninjas.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
	private final DojoRepository dojoRepo;

	public DojoService(DojoRepository dojoRepo){
		this.dojoRepo = dojoRepo;
	}

	public List<Dojo> getAll(){
		return dojoRepo.findAll();
	}

	public Dojo getOne(Long id){
		Optional<Dojo> dojo = dojoRepo.findById(id);
		return dojo.orElse(null);
	}

	public Dojo create(Dojo dojo){
		return dojoRepo.save(dojo);
	}

//	public Dojo update(Dojo dojo){
//		return dojoRepo.save(dojo);
//	}
}
