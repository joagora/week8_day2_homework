import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args) {
        Folder folder = new Folder("Things");
        DBHelper.save(folder);
        File file = new File("coding", "rb", 3, folder);
        DBHelper.save(file);

    }
}
