package alessia.U2W3D1.Spring.Web.and.Data.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogPost {

    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readingTime;
}
