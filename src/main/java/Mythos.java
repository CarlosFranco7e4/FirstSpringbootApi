import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Mythos {

    @Id
    private Long id;
    private String name;
    private String mythos;
    private String description;
}
