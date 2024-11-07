package esprit.microservices.Fiche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordRepository repository;

    public List<MedicalRecord> findAll() {
        return repository.findAll();
    }

    public Optional<MedicalRecord> findById(Long id) {
        return repository.findById(id);
    }

    public MedicalRecord save(MedicalRecord record) {
        return repository.save(record);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
