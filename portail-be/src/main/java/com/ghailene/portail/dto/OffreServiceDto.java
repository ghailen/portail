/*
 * Created on 2019-10-09 ( Date ISO 2019-10-09 - Time 11:43:59 )
 * Generated by JCharzyGen version 0
*/
package com.ghailene.portail.dto;

public class OffreServiceDto {
  

	private Long serviceId ;
	private String name ;
	private String description ;
	private Long commandeId ;
    private Long typeId;
    private String url;
    private String icon;
    
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getIcon() {
		return icon;
	}


	public void setIcon(String icon) {
		this.icon = icon;
	}


	public Long getTypeId() {
		return typeId;
	}


	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}


	public OffreServiceDto (){
	}


	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId ;
	}

	public Long getServiceId() {
		return this.serviceId ;
	}


	public void setName(String name) {
		this.name = name ;
	}

	public String getName() {
		return this.name ;
	}


	public void setDescription(String description) {
		this.description = description ;
	}

	public String getDescription() {
		return this.description ;
	}


	public void setCommandeId(Long commandeId) {
		this.commandeId = commandeId ;
	}

	public Long getCommandeId() {
		return this.commandeId ;
	}



}