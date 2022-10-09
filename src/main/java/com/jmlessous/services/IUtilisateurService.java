package com.jmlessous.services;

import com.jmlessous.entities.Utilisateur;

public interface IUtilisateurService {
    Utilisateur loadUser(String username);
    Utilisateur addUser(Utilisateur u);
}
