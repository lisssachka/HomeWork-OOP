package notebook.src.notebook;

import notebook.src.notebook.controller.UserController;
import notebook.src.notebook.dao.impl.FileOperation;
import notebook.src.notebook.model.User;
import notebook.src.notebook.repository.GBRepository;
import notebook.src.notebook.repository.impl.UserRepositoryWithLog;
import notebook.src.notebook.view.UserView;

import static notebook.src.notebook.util.DBConnector.DB_PATH;
import static notebook.src.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepositoryWithLog(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
        
    }
}
