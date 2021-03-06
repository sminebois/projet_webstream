/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author ETY
 */
@Entity
public class Serie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titre;
    private String synopsis;
    
    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private Genre genre;
    
    @OneToMany(mappedBy = "serie")
    private List<Saison> saisons = new ArrayList<>();
    
    @ManyToMany
    @JoinTable(name = "real_serie")
    private List<Personne> realisateurs = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "acteur_serie")
    private List<Personne> acteurs = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "pays_serie")
    private List<Pays> pays = new ArrayList<>();
    
    public Serie(){
        
    }

    public Serie(String titre, String sin, Genre g) {
        this.titre = titre;
        this.synopsis = sin;
        this.genre = g;
    }
    
    
    

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<Saison> getSaisons() {
        return saisons;
    }

    public void setSaisons(List<Saison> saisons) {
        this.saisons = saisons;
    }

    public List<Personne> getRealisateurs() {
        return realisateurs;
    }

    public void setRealisateurs(List<Personne> realisateurs) {
        this.realisateurs = realisateurs;
    }

    public List<Personne> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Personne> acteurs) {
        this.acteurs = acteurs;
    }

    public List<Pays> getPays() {
        return pays;
    }

    public void setPays(List<Pays> pays) {
        this.pays = pays;
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
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpql.entity.Serie[ id=" + id + " ]";
    }
    
}
