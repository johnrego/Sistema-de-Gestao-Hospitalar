/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author juan
 */
@Entity
@Table(name = "dia_semana")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiaSemana.findAll", query = "SELECT d FROM DiaSemana d")
    , @NamedQuery(name = "DiaSemana.findById", query = "SELECT d FROM DiaSemana d WHERE d.id = :id")
    , @NamedQuery(name = "DiaSemana.findByNome", query = "SELECT d FROM DiaSemana d WHERE d.nome = :nome")})
public class DiaSemana implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", unique = true)
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diaSemana", fetch = FetchType.EAGER)
    private List<HorarioAtendimento> horarioAtendimentoList;

    public DiaSemana() {
    }

    public DiaSemana(Integer id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }

    public DiaSemana(String nome) {
        this(-1, nome);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<HorarioAtendimento> getHorarioAtendimentoList() {
        return horarioAtendimentoList;
    }

    public void setHorarioAtendimentoList(List<HorarioAtendimento> horarioAtendimentoList) {
        this.horarioAtendimentoList = horarioAtendimentoList;
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
        if (!(object instanceof DiaSemana)) {
            return false;
        }
        DiaSemana other = (DiaSemana) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ufersa.controlConsult.model.jpaDAO.DiaSemana[ id=" + id + " ]";
    }

    public static List<DiaSemana> findByName(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //TODO To change body of generated methods, choose Tools | Templates.
    }

}
