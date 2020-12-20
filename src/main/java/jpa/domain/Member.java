package jpa.domain;

import jpa.utils.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer age;

    private String email;

    private String password;

    @Embedded
    private Favorites favorites = new Favorites();

    protected Member() {
    }

    Member(final Long id, final Integer age, final String email, final String password) {
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public Member(final Integer age, final String email, final String password) {
        this(null, age, email, password);
    }

    public void updateMember(final Member member) {
        this.age = member.age;
        this.password = member.password;
        this.email = member.email;
    }

    public void addFavorite(final Favorite favorite) {
        this.favorites.add(favorite);
    }

    public void removeFavorite(final Favorite favorite) {
        this.favorites.remove(favorite);
    }

    public Long getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Favorites getFavorites() {
        return favorites;
    }

    public Favorite getFirstFavorite() {
        return this.favorites.getFirst();
    }
}
