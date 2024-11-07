package esprit.microservices.Fiche;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    private String patientId; // Reference to the Patient in the Patient Microservice
    private String date;
    private String description;
    private String treatmentDescription; // Description of the treatment provided
    private String prescription;
    private String doctorId; // Reference to the doctor who created the record
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String notes;

}
