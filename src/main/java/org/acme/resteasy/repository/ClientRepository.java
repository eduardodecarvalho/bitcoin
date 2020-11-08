package org.acme.resteasy.repository;

import org.acme.resteasy.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
	