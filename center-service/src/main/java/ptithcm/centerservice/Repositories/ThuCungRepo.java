package ptithcm.centerservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ptithcm.centerservice.Entity.Thucung;

public interface ThuCungRepo extends JpaRepository<Thucung,Long> {
}
