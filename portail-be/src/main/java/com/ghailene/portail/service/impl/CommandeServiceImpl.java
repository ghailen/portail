/*
 * Created on 2019-10-09 ( Date ISO 2019-10-09 - Time 11:43:58 )
 * Generated by JCharzyGen version 0
*/
package com.ghailene.portail.service.impl;
import com.ghailene.portail.entity.Commande;
import java.util.List;
import com.ghailene.portail.repository.CommandeRepository;
import com.ghailene.portail.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Service implementation for Commande.
 * 
 */

@Service
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	private CommandeRepository commandeRepository;

	@Override
	public Commande findOne(Long commandeId){
		
				return commandeRepository.findById(commandeId).get();
			}

	@Override
	public Commande add(Commande commande){

		return commandeRepository.save(commande);
	}

	@Override
	public Commande update(Commande commande){
		Commande com = new Commande();
		com = commandeRepository.findById(commande.getCommandeId()).get();
		com.setStatus(commande.getStatus());	
		return commandeRepository.save(com);
	}
	
	@Override
	public boolean delete(Long commandeId){

				if (commandeRepository.findById(commandeId) != null) {
			commandeRepository.deleteById(commandeId);
			return true;
		}
				return false;
	}

	@Override
	public List<Commande> findAll(){
		return commandeRepository.findAll();
	}

	@Override
	public List<Commande> findByPage(int page, int size){
		return commandeRepository.findByPage(PageRequest.of(page, size)).getContent();
	}

	@Override
	public long count() {
		return commandeRepository.count();
	}
	
	@Override
	public List<Commande> findByStatus(String status){
		return commandeRepository.findByStatus(status);
	}
	
}


