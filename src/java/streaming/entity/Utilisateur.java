/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author admin
 */
@Entity
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, unique = false)
    private String nom;
    @Column(nullable = false)
    private String mdp; 
    private boolean estConnecte;
    
    private String email;
    
    public enum Type{
        ADMIN,
        NORMAL;
    }
    public enum Valide{
        VALIDE,
        NON_VALIDE;
    }
    @Enumerated(EnumType.STRING)
    private Valide valide;
    
    @Enumerated(EnumType.STRING)
    private Type type;

    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Valide getValide() {
        return valide;
    }

    public void setValide(Valide valide) {
        this.valide = valide;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    public boolean isEstConnecte() {
        return estConnecte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public boolean estConnecte() {
        return estConnecte;
    }

    public void setEstConnecte(boolean estConnecte) {
        this.estConnecte = estConnecte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur() {
    }

    public Utilisateur(String nom, String mdp, String email) {
        this.nom = nom;
        this.mdp = mdp;
        this.email = email;
        this.type = Type.NORMAL;
        this.estConnecte = false;
        this.valide = Valide.NON_VALIDE;
    }   
    

    public Utilisateur(String nom, String mdp) {
        this.nom = nom;
        this.mdp = mdp;
        this.estConnecte = false;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Utilisateur[ id=" + id + " ]";
    }
    
}
