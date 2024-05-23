package roomescape.infrastructure;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import roomescape.domain.ReservationWaiting;

@Repository
public interface ReservationWaitingRepository extends JpaRepository<ReservationWaiting, Long> {

    List<ReservationWaiting> findAllByMemberId(Long memberId);

    List<ReservationWaiting> findAll();

    boolean existsByReservationIdAndMemberId(Long reservationId, Long memberId);

    long countByReservationId(Long reservationId);
}
