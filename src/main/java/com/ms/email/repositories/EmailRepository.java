package com.ms.email.repositories;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

// Ao extender a classe JpaRepository, consigo usar os metdos prontos
// find_all, find_by_id, save entre outros.
// Preciso definir qual entidade vou aplicar e o tipo

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}