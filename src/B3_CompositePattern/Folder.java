package B3_CompositePattern;

import java.util.*;

public class Folder extends AbstractFile {

    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public void addItem(AbstractFile abstractFile) {
        if (!list.contains(abstractFile)) {
            list.add(abstractFile);
            abstractFile.duongDan = this.duongDan + "\\" + abstractFile.duongDan;
        }
    }

    @Override
    public void removeItem(AbstractFile abstractFile) {
        if (list.contains(abstractFile)) {
            list.remove(abstractFile);
        }
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (AbstractFile f : list) {
            builder.append("\n\t");
            builder.append(f.getStringTreeFolder());
        }
        return builder.toString();
    }

}
