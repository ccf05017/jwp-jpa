package jpa.domain;

import jpa.utils.BaseEntity;

import javax.persistence.*;

@Entity
public class Distance extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int distance;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Section section;

    protected Distance() {
    }

    Distance(final Long id, final int distance, final Section section) {
        this.id = id;
        this.distance = distance;
        this.section = section;
    }

    public Distance(final int distance, final Section section) {
        this(null, distance, section);
    }

    public Long getId() {
        return this.id;
    }
}
