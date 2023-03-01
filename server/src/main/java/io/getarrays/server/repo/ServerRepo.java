package io.getarrays.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.getarrays.server.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long>{
    Server findByIpAddress(String ipAddress);
}
