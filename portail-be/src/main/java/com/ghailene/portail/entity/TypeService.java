package com.ghailene.portail.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="type_service", schema="scPortail" )
public class TypeService implements Serializable {

	private static final long serialVersionUID = 1L;

    //Entity primary key
    @Id
    @Column(name="type_id", nullable=false)
    private Long typeId ;
    
 
    @Column(name="type_name", nullable=false)
    private String typeName ;

    @Column(name="type_url", nullable=false)
    private String typeUrl ;

 // Entity links
 	@OneToMany
 	@JsonIgnore
 	private List<OffreService> listOfOffreServices;
    
 
	public String getTypeUrl() {
		return typeUrl;
	}


	public List<OffreService> getListOfOffreServices() {
		return listOfOffreServices;
	}


	public void setListOfOffreServices(List<OffreService> listOfOffreServices) {
		this.listOfOffreServices = listOfOffreServices;
	}


	public void setTypeUrl(String typeUrl) {
		this.typeUrl = typeUrl;
	}


	public Long getTypeId() {
		return typeId;
	}


	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
  
	
}
