package food.foodlist.wishlist.service;

import food.foodlist.naver.NaverClient;
import food.foodlist.naver.dto.SearchImageReq;
import food.foodlist.naver.dto.SearchLocalReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListService {

    private final NaverClient naverClient;

    public void search(String query) {

        //지역검색
        var searchLocalReq = new SearchLocalReq();
        searchLocalReq.setQuery(query);

        var searchLocalRes = naverClient.searchLocal(searchLocalReq);

        if(searchLocalRes.getTotal() > 0) {
            var item = searchLocalRes.getItems().stream().findFirst().get();

            var imageQuery = item.getTitle().replaceAll("<[^>]*>", "");
            var searchImageReq = new SearchImageReq();
            searchImageReq.setQuery(imageQuery);

            var searchImageRes = naverClient.searchImage(searchImageReq);

            if(searchImageRes.getTotal() > 0) {
                // 결과물 리턴

            }
        }
    }
}
