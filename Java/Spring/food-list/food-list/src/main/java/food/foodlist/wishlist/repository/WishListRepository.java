package food.foodlist.wishlist.repository;

import food.foodlist.db.MemoryDbRepositoryAbstract;
import food.foodlist.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
