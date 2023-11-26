package org.nsbm.DevDynamos.Dto;

import lombok.*;
import org.hibernate.annotations.AnyMetaDef;

import java.io.Serializable;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class CustomerDto implements Serializable {

    private String id;

    private String name;

    private String nIc;

    private String address;

    private int contactNumber;




}
