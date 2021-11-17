package org.tanzu.demo.model;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SensorRepository extends CrudRepository<Sensor, UUID> {
}
