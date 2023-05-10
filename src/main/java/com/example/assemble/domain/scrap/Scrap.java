package com.example.assemble.domain.scrap;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.example.assemble.repository.board.BoardDAO;
import com.fasterxml.jackson.annotation.JsonBackReference;

// lombok을 씀으로써 getter, setter 지정을 하지 않아도 된다.
// 어노테이션으로 명시하면 된다.
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

@Entity
@Table(name = "scrap")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ScrapId.class)
public class Scrap implements Serializable {
    @Id
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_uid")
    private User user;

    @Id
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "board_bid")
    private Board board;
}
