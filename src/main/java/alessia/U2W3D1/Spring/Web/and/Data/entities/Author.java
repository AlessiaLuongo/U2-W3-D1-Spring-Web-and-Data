package alessia.U2W3D1.Spring.Web.and.Data.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {

    private int id;
    private String name;
    private String surname;
    private String eMail;
    private int birthdayYear;
    private String avatar;
}

