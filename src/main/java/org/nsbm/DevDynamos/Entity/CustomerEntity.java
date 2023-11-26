package org.nsbm.DevDynamos.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString
@Entity
public class CustomerEntity implements Serializable {

    @Id
    private String id;

    private String name;

    private String nIc;

    private String address;

    private int contactNumber;
}
