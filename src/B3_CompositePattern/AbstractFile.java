package B3_CompositePattern;

abstract class AbstractFile {
    String name, ngayTao;
    String duongDan;

    public AbstractFile(String name, String ngayTao) {
        this.name = name;
        this.ngayTao = ngayTao;
        this.duongDan = name;
    }

    abstract public void addItem(AbstractFile abstractFile);

    abstract public void removeItem(AbstractFile abstractFile);

    abstract public String getStringTreeFolder();

    public String getDuongDan() {
        return duongDan;
    }
}
