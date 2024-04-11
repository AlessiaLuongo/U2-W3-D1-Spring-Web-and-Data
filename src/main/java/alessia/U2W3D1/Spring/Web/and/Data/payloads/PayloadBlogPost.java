package alessia.U2W3D1.Spring.Web.and.Data.payloads;

import alessia.U2W3D1.Spring.Web.and.Data.entities.Author;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PayloadBlogPost {

    private String category;
    private String title;
    private String cover;
    private String content;
    private int readingTime;
    private int authorId;
}
