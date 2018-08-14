package models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {
    private String title;
    private List<File> fileList;
    private int id;

    public Folder(){

    }
    public Folder(String title) {
        this.title = title;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
