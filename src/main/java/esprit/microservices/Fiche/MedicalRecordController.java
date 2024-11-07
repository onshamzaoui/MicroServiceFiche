package esprit.microservices.Fiche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicalRecords")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService service;

    @GetMapping
    public List<MedicalRecord> getAllRecords() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<MedicalRecord> getRecordById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public MedicalRecord createRecord(@RequestBody MedicalRecord record) {
        return service.save(record);
    }

    @PutMapping("/{id}")
    public MedicalRecord updateRecord(@PathVariable Long id, @RequestBody MedicalRecord updatedRecord) {
        Optional<MedicalRecord> existingRecord = service.findById(id);
        if (existingRecord.isPresent()) {
            updatedRecord.setRecordId(id);
            return service.save(updatedRecord);
        }
        return null; // Or throw an exception
    }

    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id) {
        service.deleteById(id);
    }
}
