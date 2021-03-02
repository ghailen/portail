/*
 * Created on 2019-10-09 ( Date ISO 2019-10-09 - Time 11:43:59 )
 * Generated by JCharzyGen version 0
*/
package com.ghailene.portail.service;
import com.ghailene.portail.entity.Panier;
import java.util.List;

/**
 * Service interface for Panier.
 * 
 */

public interface PanierService {

	public Panier findOne(Long panierId);

	public Panier add(Panier panier);

	public Panier update(Panier panier);

	public boolean delete(Long panierId);

	public List<Panier> findAll();

	public List<Panier>findByPage(int page, int size);

	public long count();

}

	
