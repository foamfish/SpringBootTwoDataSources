package demo.model.secondary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "SECONDARY_MODEL")
public class SecondaryModel {
	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@SequenceGenerator(name = "SECONDARY_MODEL_ID", sequenceName = "SECONDARY_MODEL_SEQ_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SECONDARY_MODEL_ID")
	private Integer id;
	
	@NotEmpty
	@Column(name = "name", nullable = false)
	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
