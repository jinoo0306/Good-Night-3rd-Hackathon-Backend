package com.techeer.tree.Good_Night_3rd_Hackathon_Backend.dto.response;

import com.techeer.tree.Good_Night_3rd_Hackathon_Backend.entity.Wish;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WishResponse {
  private Long id;
  private String title;
  private String content;
  private String category;

  public static WishResponse from(Wish wish) {
    return new WishResponse(wish.getId(), wish.getTitle(), wish.getContent(), wish.getCategory());
  }

  @Getter
  @AllArgsConstructor
  public static class WishCreateResponse {
    private Long id;
    private String title;
    private String content;
    private String category;

    public static WishCreateResponse from(Wish wish) {
      return new WishCreateResponse(wish.getId(), wish.getTitle(), wish.getContent(), wish.getCategory());
    }
  }

  @Getter
  @AllArgsConstructor
  public static class WishDeleteResponse {
    private Long id;
    private int status;
    private String message;

    public static WishDeleteResponse success(Long id) {
      return new WishDeleteResponse(id, 200, "소원 삭제 성공");
    }

    public static WishDeleteResponse failure(Long id, String message) {
      return new WishDeleteResponse(id, 400, message); // 예: 400 Bad Request
    }
  }

  @Getter
  @AllArgsConstructor
  public static class WishUpdateResponse {
    private Long id;
    private int status;
    private String message;

    public static WishUpdateResponse success(Long id) {
      return new WishUpdateResponse(id, 200, "소원 수정 성공");
    }

    public static WishUpdateResponse failure(Long id, String message) {
      return new WishUpdateResponse(id, 400, message);
    }
  }
}
