package com.facilite.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 * Définit l'interface d'un objet pouvant être un composant
 * d'un autre objet de l'arborescence.
 */




//@MappedSuperclass
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Composant {
  
    // Nom de "Composant"
   
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    protected int id;
    protected String nom;
    protected String description;
    protected String etat;
    protected  int progressionEtatEn100;
    protected Date debutIncident;
    protected Date finIncident; 
    protected Integer rto ;
	public  enum etat {RECUPERATION,CONFIGURATION,TEST}

    public int getId() {
		return id;
	}
    
    public void setId(int id) {
		this.id = id;
	}
   
  
    /**
     * Constructeur
     * @param pNom Nom du "Composant"
     */
	  public Composant() {
			// TODO Auto-generated constructor stub
		}
	  
    public Composant(final String pNom) {
        nom = pNom;
    }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getProgressionEtatEn100() {
		return progressionEtatEn100;
	}

	public void setProgressionEtatEn100(int progressionEtatEn100) {
		this.progressionEtatEn100 = progressionEtatEn100;
	}

	public Date getDebutIncident() {
		return debutIncident;
	}

	public void setDebutIncident(Date debutIncident) {
		this.debutIncident = debutIncident;
	}

	public Date getFinIncident() {
		return finIncident;
	}

	public void setFinIncident(Date finIncident) {
		this.finIncident = finIncident;
	}

	

	public Integer getRto() {
		return rto;
	}

	public void setRto(Integer rto) {
		this.rto = rto;
	}

	//	public final static Map<etat, Integer> AllPhases;
//	static {
//		AllPhases
//		for (etat phase : etat.values()) {
//			pourcentage_davancement=pourcentage_davancement+pourcentage_davancement;
//			AllPhases.put(phase,pourcentage_davancement);
//		}
//	}
//	Map<TYPE_PHASE, Integer> mapping = new HashMap<TYPE_PHASE, Integer>();
//
//	private void initMap() {
//		mapping.put(TYPE_PHASE.BUREAUTIQUE, 10);
//		mapping.put(TYPE_PHASE.CONFIGURATION, 20);
//		mapping.put(TYPE_PHASE.TEST, 30);
//		mapping.put(TYPE_PHASE.RECUPERATION, 40);
//	}

	public boolean isFonctionAffaires(){
		return false;
	}
	public boolean isSystemes(){
		return false;
	}
	public boolean isServeurs(){
		return false;
	}
	public boolean isInfrastructures(){
		return false;	
	}
    /**
     * Opération commune à tous les "Composant"
     * 
     * 	private Map<String, Integer> etats;
	
	 
	    public ComposantService() {
	        etats = new HashMap<String, Integer>();
	        populate(etats);
	    }
	    public Map<String, Integer> findAll() {
	        logger.info("Affichage des etats ");
	        return etats;
	    }
	 
	    private void populate(Map<String, Integer> etats) {
	        etats.put("Bureautique",10);
	        etats.put("Configuration",20);
	        etats.put("Test",0);
	 
	    }
     * 
     * 
     * 
     */
    //public abstract void operation();
}
