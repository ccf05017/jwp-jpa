package jpa.domain;

import jpa.utils.IdBaseEntity;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Favorite extends IdBaseEntity {
    private Long startStationId;
    private Long destinationStationId;

    protected Favorite() {
    }

    Favorite(final Long id, final Long startStationId, final Long destinationStationId) {
        super.setId(id);
        this.startStationId = startStationId;
        this.destinationStationId = destinationStationId;
    }

    public Favorite(final Long startStationId, final Long destinationStationId) {
        this(null, startStationId, destinationStationId);
    }

    public boolean isContain(final Station station) {
        return startStationId.equals(station.getId()) || destinationStationId.equals(station.getId());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Favorite favorite = (Favorite) o;
        return Objects.equals(startStationId, favorite.startStationId) && Objects.equals(destinationStationId, favorite.destinationStationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startStationId, destinationStationId);
    }
}
