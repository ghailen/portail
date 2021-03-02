/*
 * Created on 2019-10-09 ( Date ISO 2019-10-09 - Time 11:43:58 )
 * Generated by JCharzyGen version 0
*/
package com.ghailene.portail.entity;
import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="alerts", schema="scPortail" )
public class Alerts implements Serializable {

	private static final long serialVersionUID = 1L;

    //Entity primary key
    @Id
    @Column(name="alert_id", nullable=false)
    private Long alertId ;
  
	 // Entity data fields
    @Column(name="description", length=2147483647)
    private String description ;

 
    // Entity links


    @ManyToOne
    @JoinColumn(name="commande_id", referencedColumnName="commande_id")
    private Commande commande    ;



    // Constructor

	public Alerts() {	
		super();
	}

    // Getter and setter

    public void setAlertId( Long alertId ) {
        this.alertId = alertId ;
    }
    public Long getAlertId() {
        return this.alertId ;
    }

	public void setDescription(String description) {
		this.description = description ;
	}
	public String getDescription() {
		return this.description ;
	}

    public void setCommande( Commande commande     ) {
        this.commande     = commande     ;
    }
    public Commande getCommande() {
        return this.commande     ;
    }



}

