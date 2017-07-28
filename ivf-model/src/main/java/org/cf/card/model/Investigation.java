package org.cf.card.model;

import static javax.persistence.GenerationType.AUTO;

// Generated Sep 10, 2015 2:25:00 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Investigation generated by hbm2java
 */
@Entity
@Table(name = "investigation")
public class Investigation implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "name", nullable = false, length = 45)
	private String name;

	@Column(name = "_group", nullable = false, length = 1)
	private int group;

	@Column(name = "description", length = 100)
	private String description;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "investigation")
	private Set<InvestigatinValue> investigatinValues = new HashSet<InvestigatinValue>(0);

	public Investigation() {
	}

	/**
	 * @param id
	 */
	public Investigation(Long id) {
		super();
		this.id = id;
	}

	public Investigation(String name, int group) {
		this.name = name;
		this.group = group;
	}

	public Investigation(String name, int group, String description, Set<InvestigatinValue> investigatinValues) {
		this.name = name;
		this.group = group;
		this.description = description;
		this.investigatinValues = investigatinValues;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return this.group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<InvestigatinValue> getInvestigatinValues() {
		return this.investigatinValues;
	}

	public void setInvestigatinValues(Set<InvestigatinValue> investigatinValues) {
		this.investigatinValues = investigatinValues;
	}

	@Override
	public String toString() {
		return "Investigation [name=" + name + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((description == null) ? 0 :
	 * description.hashCode()); result = prime * result + group; result = prime
	 * * result + ((id == null) ? 0 : id.hashCode()); result = prime * result +
	 * ((name == null) ? 0 : name.hashCode()); return result; }
	 *
	 * @Override public boolean equals(Object obj) { if (this == obj) return
	 * true; if (obj == null) return false; if (getClass() != obj.getClass())
	 * return false; Investigation other = (Investigation) obj; if (description
	 * == null) { if (other.description != null) return false; } else if
	 * (!description.equals(other.description)) return false; if (group !=
	 * other.group) return false; if (id == null) { if (other.id != null) return
	 * false; } else if (!id.equals(other.id)) return false; if
	 * (investigatinValues == null) { if (other.investigatinValues != null)
	 * return false; } else if
	 * (!investigatinValues.equals(other.investigatinValues)) return false; if
	 * (name == null) { if (other.name != null) return false; } else if
	 * (!name.equals(other.name)) return false; return true; }
	 *
	 * @Override public String toString() { return "Investigation [id=" + id +
	 * ", name=" + name + ", group=" + group + ", description=" + description +
	 * ", investigatinValues=" + investigatinValues + "]"; }
	 */

}