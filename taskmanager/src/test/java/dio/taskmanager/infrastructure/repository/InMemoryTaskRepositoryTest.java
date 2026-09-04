package dio.taskmanager.infrastructure.repository;

import dio.taskmanager.domain.*;
import org.springframework.stereotype.Repository;

@Repository
class InMemoryTaskRepositoryTest extends TaskRepositoryTest {

    @Override
    protected TaskRepository createRepository() {
        return new InMemoryTaskRepository();
    }

}