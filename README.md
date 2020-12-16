# jpa

## Step1. 엔티티 매핑
- Todo-list
- [ ] 아래 테이블을 참고해서 JPA 엔티티를 생성한다.
- Line
```sql
create table line (
    id bigint not null auto_increment,
    created_date datetime(6),
    modified_date datetime(6),
    color varchar(255),
    name varchar(255),
    primary key (id)
) engine=InnoDB

alter table line
    add constraint UK_9ney9davbulf79nmn9vg6k7tn unique (name)
```
- Station
```sql
create table station (
     id bigint not null auto_increment,
     created_date datetime(6),
     modified_date datetime(6),
     name varchar(255),
     primary key (id)
) engine=InnoDB

alter table station
    add constraint UK_gnneuc0peq2qi08yftdjhy7ok unique (name)
```
- Member
```sql
create table member (
    id bigint not null auto_increment,
    created_date datetime(6),
    modified_date datetime(6),
    age integer,
    email varchar(255),
    password varchar(255),
    primary key (id)
) engine=InnoDB
```
- favorite
```sql
create table favorite (
    id bigint not null auto_increment,
    created_date datetime(6),
    modified_date datetime(6),
    primary key (id)
) engine=InnoDB
```
- [ ] 각 엔티티별로 기본적인 CRUD 테스트를 진행한다.
- [ ] 영속성 컨텍스트를 통한 동등성 보장에 대해 학습 테스트를 진행한다.
