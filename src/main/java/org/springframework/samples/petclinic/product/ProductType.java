package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
	@Size(min = 3, max = 50)
	@NotNull
	@Column(unique=true)
    String name;
}
