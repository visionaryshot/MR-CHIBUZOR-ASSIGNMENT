import data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.VehicleRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryTest {

    private VehicleRepository repository;
    private Vehicle vehicle1;
    private Vehicle vehicle2;

    @BeforeEach
    void setUp() {
        repository = new VehicleRepository();

        vehicle1 = new Vehicle();
        vehicle1.setName("Toyota");

        vehicle2 = new Vehicle();
        vehicle2.setName("Honda");

        repository.save(vehicle1);
        repository.save(vehicle2);
    }

    @Test
    void testFindById() {
        Vehicle found = repository.findById(1);
        assertNotNull(found);
        assertSame(vehicle1, found);
    }

    @Test
    void testFindAll() {
        List<Vehicle> all = repository.findAll();
        assertEquals(2, all.size());
        assertTrue(all.contains(vehicle1));
        assertTrue(all.contains(vehicle2));
    }

    @Test
    void testDeleteById() {
        repository.deleteById(1);
        assertNull(repository.findById(1));
        assertEquals(1, repository.findAll().size());
    }

    @Test
    void testDeleteAll() {
        repository.deleteAll();
        assertTrue(repository.findAll().isEmpty());
    }

    @Test
    void testDeleteVehicle() {
        repository.delete(vehicle2);
        List<Vehicle> remaining = repository.findAll();
        assertEquals(1, remaining.size());
        assertSame(vehicle1, remaining.get(0));
    }
}
