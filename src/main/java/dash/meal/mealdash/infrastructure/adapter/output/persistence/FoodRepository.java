package dash.meal.mealdash.infrastructure.adapter.output.persistence;

import dash.meal.mealdash.infrastructure.adapter.output.persistence.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodEntity,String> {
}
