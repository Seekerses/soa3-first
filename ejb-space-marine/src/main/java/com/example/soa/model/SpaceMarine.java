package com.example.soa.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class SpaceMarine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    @NotNull
    private String name; //Поле не может быть null, Строка не может быть пустой
    @NotNull
    @Embedded
    private Coordinates coordinates; //Поле не может быть null
    @NotNull
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    @NotNull
    private Long health; //Поле не может быть null, Значение поля должно быть больше 0
    private int heartCount; //Значение поля должно быть больше 0, Максимальное значение поля: 3
    @NotNull
    private Boolean loyal; //Поле не может быть null
    @Enumerated(EnumType.STRING)
    private MeleeWeapon meleeWeapon; //Поле может быть null
    @Embedded
    private Chapter chapter; //Поле может быть null

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || org.hibernate.Hibernate.getClass(this) != org.hibernate.Hibernate.getClass(o)) return false;
        SpaceMarine that = (SpaceMarine) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
