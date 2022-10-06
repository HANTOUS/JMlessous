package com.jmlessous.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formation implements Serializable {
    @Id
    @Column(name ="idFormation ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation ;

    private String  Intitulé;
    private String  description  ;
    @Temporal (TemporalType.DATE)
    private Date dateDebut;
    @Temporal (TemporalType.DATE)
    private Date dateFin;
    private String localisation ;
    @ManyToMany()
    private Set<Utilisateur> utilisateursFormation;
}
