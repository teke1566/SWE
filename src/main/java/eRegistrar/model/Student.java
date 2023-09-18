package eRegistrar.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(nullable = false, unique = true)
    private String studentNumber;

    @Column(nullable = false)
    private String firstName;

    private String middleName;

    @Column(nullable = false)
    private String lastName;

    private Double cgpa;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date enrollmentDate;

    @Column(nullable = false)
    private String isInternational;


    public Student() {
    }
}
