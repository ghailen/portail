/*
 * Created on 2019-10-09 ( Date ISO 2019-10-09 - Time 11:43:59 )
 * Generated by JCharzyGen version 0
*/
package com.ghailene.portail.dto;

public class HistoriqueCommandeDto {
  

	private Long historiqueId ;
	private String description ;

	private CommandeDto commande     ;

	public HistoriqueCommandeDto (){
	}


	public void setHistoriqueId(Long historiqueId) {
		this.historiqueId = historiqueId ;
	}

	public Long getHistoriqueId() {
		return this.historiqueId ;
	}


	public void setDescription(String description) {
		this.description = description ;
	}

	public String getDescription() {
		return this.description ;
	}



    public void setCommande( CommandeDto commande ) {
        this.commande  = commande ;
    }
    public CommandeDto getCommande() {
        return this.commande ;
    }

}