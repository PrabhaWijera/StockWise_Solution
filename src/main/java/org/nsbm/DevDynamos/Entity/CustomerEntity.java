package org.nsbm.DevDynamos.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString
@Entity
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private String nIc;

    private String address;

    private int contactNumber;
}
