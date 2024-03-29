package com.jmlessous.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContratAssurance implements Serializable {
    @Id
    @Column(name ="idContrat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    @Temporal (TemporalType.DATE)
    private Date dateDébut;
    @Temporal (TemporalType.DATE)
    private Date dateFin;

    private Float annuité;
    private Float prime ;
    private Float intérêt;
    private Float commission ;
    @ManyToOne
    private Utilisateur utilisateurCA;
    @ManyToOne
    private OffreAssurance offreAssurance;


}
