package br.edu.ifpb.dac.minicrud.model;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4167105116895543725L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ID;
	private String categoria;
	private String descricao;
	private long preco;
	
	public Produto() {
	
	}
	
	public Produto(long preco, String categoria, String descricao) {
		this.preco = preco;
		this.categoria = categoria;
		this.descricao = descricao;
	}
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public long getPreco() {
		return preco;
	}
	public void setPreco(long preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Produto [ID=" + ID + ", categoria=" + categoria + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, categoria, descricao, preco);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return ID == other.ID && Objects.equals(categoria, other.categoria)
				&& Objects.equals(descricao, other.descricao) && preco == other.preco;
	}
	
}

