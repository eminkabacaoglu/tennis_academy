package com.atk.tennisAcademy.entities;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "member_types")
@NoArgsConstructor
@Data
public class MemberType extends PersonType{

//    @Enumerated(EnumType.STRING)
    @ManyToOne()
    @JoinColumn(name = "payment_type_id")
    private PaymentType paymentType;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "last_modified_at")
    @UpdateTimestamp
    private Date lastModifiedAt;

    private String createdBy;
    private String modifiedBy;
    @Builder
    public MemberType(Long id, String typeCode, String description, Date createdAt, Date lastModifiedAt, String createdBy,String modifiedBy,PaymentType paymentType) {
        super(id, typeCode, description,createdAt,lastModifiedAt, createdBy,modifiedBy);
        this.paymentType = paymentType;
    }

//    public enum PaymentType{
//        Chargeable {
//            public String toString() {
//                return "Ücrete Tabi";
//            }
//        },
//        FreeOfChargeable {
//            public String toString() {
//                return "Ücretsiz";
//            }
//        },
//        PrivateLesson {
//            public String toString() {
//                return "Özel Ders";
//            }
//        },
//        Organization {
//            public String toString() {
//                return "Organizasyon";
//            }
//        },
//    }
}
