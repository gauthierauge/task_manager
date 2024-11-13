package com.example.task_manager.services;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Secured("ROLE_ADMIN")
    public String adminAction(){
        return "Vous êtes administrateur";
    }

    @PreAuthorize("hasRole('UPPER_ROLE') or hasRole('ROLE_ADMIN')")
    public String userAction() {
        return "Vous êtes un utilisateur privé ou un Mega Super Admin !";
    }
}
