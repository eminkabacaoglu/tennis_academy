package com.atk.tennisAcademy.entities;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "member_types")
@NoArgsConstructor
@Data
public class MemberType extends PersonType{

    @Enumerated(EnumType.STRING)
    PaymentType paymentType;
    @Builder
    public MemberType(Long id, String typeCode, String description,PaymentType paymentType) {
        super(id, typeCode, description);
        this.paymentType = paymentType;
    }

    public enum PaymentType{
        Chargeable {
            public String toString() {
                return "Ücrete Tabi";
            }
        },
        FreeOfChargeable {
            public String toString() {
                return "Ücretsiz";
            }
        },
        PrivateLesson {
            public String toString() {
                return "Özel Ders";
            }
        },
        Organization {
            public String toString() {
                return "Organizasyon";
            }
        },
    }
}
