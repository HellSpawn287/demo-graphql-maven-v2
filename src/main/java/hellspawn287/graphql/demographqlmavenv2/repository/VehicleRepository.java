package hellspawn287.graphql.demographqlmavenv2.repository;

import hellspawn287.graphql.demographqlmavenv2.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
