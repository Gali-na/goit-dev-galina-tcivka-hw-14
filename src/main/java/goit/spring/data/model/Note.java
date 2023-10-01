package goit.spring.data.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Note {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String title;
    @Column(name = "content_note")
    private String contentNote;
}

