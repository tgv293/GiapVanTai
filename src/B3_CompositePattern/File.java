package B3_CompositePattern;

public class File extends AbstractFile {
    public File(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public void addItem(AbstractFile abstractFile) {
        addItem(abstractFile);
    }

    @Override
    public void removeItem(AbstractFile abstractFile) {
        removeItem(abstractFile);
    }

    @Override
    public String getStringTreeFolder() {
        return name;
    }

}
