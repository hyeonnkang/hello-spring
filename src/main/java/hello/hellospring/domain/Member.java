package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity     // 이것은 jpa가 관리하는 엔티티라는 표시이다.
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)// pk를 매핑해줘야한다. 여기서는 id를 자동으로 생성해주고 있도록 설정한다.
    private Long id;
    private String name;    // 만약 name이 유저네임이면 @Column(name="username")이라고 하면 알아서 매핑된다.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
