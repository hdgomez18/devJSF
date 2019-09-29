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
@Table(name = "editorial")
@NamedQueries({
    @NamedQuery(name = "Editorial.findAll", query = "SELECT e FROM Editorial e")
    , @NamedQuery(name = "Editorial.findByEdCodigo", query = "SELECT e FROM Editorial e WHERE e.edCodigo = :edCodigo")
    , @NamedQuery(name = "Editorial.findByEdNombre", query = "SELECT e FROM Editorial e WHERE e.edNombre = :edNombre")})
public class Editorial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_codigo")
    private Integer edCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ed_nombre")
    private String edNombre;

    public Editorial() {
    }

    public Editorial(Integer edCodigo) {
        this.edCodigo = edCodigo;
    }

    public Editorial(Integer edCodigo, String edNombre) {
        this.edCodigo = edCodigo;
        this.edNombre = edNombre;
    }

    public Integer getEdCodigo() {
        return edCodigo;
    }

    public void setEdCodigo(Integer edCodigo) {
        this.edCodigo = edCodigo;
    }

    public String getEdNombre() {
        return edNombre;
    }

    public void setEdNombre(String edNombre) {
        this.edNombre = edNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (edCodigo != null ? edCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editorial)) {
            return false;
        }
        Editorial other = (Editorial) object;
        if ((this.edCodigo == null && other.edCodigo != null) || (this.edCodigo != null && !this.edCodigo.equals(other.edCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Editorial[ edCodigo=" + edCodigo + " ]";
    }
    
}
