/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HGOMEZ
 */
@Entity
@Table(name = "recurso")
@NamedQueries({
    @NamedQuery(name = "Recurso.findAll", query = "SELECT r FROM Recurso r")
    , @NamedQuery(name = "Recurso.findByReIsbn", query = "SELECT r FROM Recurso r WHERE r.reIsbn = :reIsbn")
    , @NamedQuery(name = "Recurso.findByReTitulo", query = "SELECT r FROM Recurso r WHERE r.reTitulo = :reTitulo")
    , @NamedQuery(name = "Recurso.findByReResumen", query = "SELECT r FROM Recurso r WHERE r.reResumen = :reResumen")
    , @NamedQuery(name = "Recurso.findByReNumpag", query = "SELECT r FROM Recurso r WHERE r.reNumpag = :reNumpag")
    , @NamedQuery(name = "Recurso.findByReTipo", query = "SELECT r FROM Recurso r WHERE r.reTipo = :reTipo")})
public class Recurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "reIsbn")
    private Integer reIsbn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "reTitulo")
    private String reTitulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "reResumen")
    private String reResumen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reNumpag")
    private int reNumpag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "reTipo")
    private String reTipo;

    public Recurso() {
    }

    public Recurso(Integer reIsbn) {
        this.reIsbn = reIsbn;
    }

    public Recurso(Integer reIsbn, String reTitulo, String reResumen, int reNumpag, String reTipo) {
        this.reIsbn = reIsbn;
        this.reTitulo = reTitulo;
        this.reResumen = reResumen;
        this.reNumpag = reNumpag;
        this.reTipo = reTipo;
    }

    public Integer getReIsbn() {
        return reIsbn;
    }

    public void setReIsbn(Integer reIsbn) {
        this.reIsbn = reIsbn;
    }

    public String getReTitulo() {
        return reTitulo;
    }

    public void setReTitulo(String reTitulo) {
        this.reTitulo = reTitulo;
    }

    public String getReResumen() {
        return reResumen;
    }

    public void setReResumen(String reResumen) {
        this.reResumen = reResumen;
    }

    public int getReNumpag() {
        return reNumpag;
    }

    public void setReNumpag(int reNumpag) {
        this.reNumpag = reNumpag;
    }

    public String getReTipo() {
        return reTipo;
    }

    public void setReTipo(String reTipo) {
        this.reTipo = reTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reIsbn != null ? reIsbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recurso)) {
            return false;
        }
        Recurso other = (Recurso) object;
        if ((this.reIsbn == null && other.reIsbn != null) || (this.reIsbn != null && !this.reIsbn.equals(other.reIsbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Recurso[ reIsbn=" + reIsbn + " ]";
    }
    
}
