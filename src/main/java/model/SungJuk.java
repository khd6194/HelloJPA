package model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "sungjuk")
public class SungJuk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sjno;
    @Column(length = 10, nullable = false)
    private String name;
    @Column(nullable = false)
    private int kor;
    @Column(nullable = false)
    private int eng;
    @Column(nullable = false)
    private int mat;
    @Column(nullable = true)
    private int tot;
    @Column(nullable = true, precision = 5, scale = 1)
    private double avg;
    @Column(length = 1, nullable = true)
    private String grd;
    private Date regdate;

    // persist 호출전에 regdate 컬럼에 현재 날짜/시간 대입
@PrePersist
    protected void onCreate() {
            regdate = new Date();
    }
}
