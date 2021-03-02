/*
 * Created on 2019-10-09 ( Date ISO 2019-10-09 - Time 11:43:59 )
 * Generated by JCharzyGen version 0
*/
package com.ghailene.portail.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="offre_service", schema="scPortail" )
public class OffreService implements Serializable {

	private static final long serialVersionUID = 1L;

    //Entity primary key
    @Id
    @Column(name="service_id", nullable=false)
    private Long serviceId ;
  
	 // Entity data fields
    @Column(name="name", length=2147483647)
    private String name ;
    @Column(name="description", length=2147483647)
    private String description ;
    @Column(name="commande_id")
    private Long commandeId ;
    @Column(name="url")
    private String url;
    @Column(name="icon")
    private String icon;
 

    public TypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}


	@ManyToOne
	@JoinColumn(name = "type_id")
	private TypeService typeService;
    
    // Entity links


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

	@JsonIgnore
	@OneToMany(mappedBy="offreService", targetEntity=Commande.class)
    private List<Commande> listOfCommande;


	@JsonIgnore
    @OneToMany(mappedBy="offreService", targetEntity=Reports.class)
    private List<Reports> listOfReports;


	@JsonIgnore
    @OneToMany(mappedBy="offreService", targetEntity=News.class)
    private List<News> listOfNews  ;



    // Constructor

	public OffreService() {	
		super();
	}

    // Getter and setter

    public void setServiceId( Long serviceId ) {
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

    public void setListOfCommande( List<Commande> listOfCommande ) {
        this.listOfCommande = listOfCommande ;
    }
    public List<Commande> getListOfCommande() {
        return this.listOfCommande ;
    }

    public void setListOfReports( List<Reports> listOfReports ) {
        this.listOfReports = listOfReports ;
    }
    public List<Reports> getListOfReports() {
        return this.listOfReports ;
    }

    public void setListOfNews( List<News> listOfNews   ) {
        this.listOfNews = listOfNews   ;
    }
    public List<News> getListOfNews() {
        return this.listOfNews   ;
    }

}

