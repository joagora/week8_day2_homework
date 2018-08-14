import db.DBFolder;
import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Folder folder1 = new Folder("Things");

        DBHelper.save(folder1);
        File file1 = new File("coding", "rb", 3, folder1);
        File file2 = new File("some_stuff", "txt", 2, folder1);
        DBHelper.save(file1);
        DBHelper.save(file2);
        file1.setName("coding_stuff");
        DBHelper.update(file1);

        List<Folder> files = DBHelper.getAll(File.class);
        File foundFile = DBHelper.findId(File.class, file1.getId());

        List<File> allFilesOfFolder = DBFolder.getAllFilesForFolder(folder1);
    }
}
