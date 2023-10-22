package B7_Adapter;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ArrayListToTableModelAdapter {
    private DefaultTableModel model;

    ArrayListToTableModelAdapter(ArrayList<String> data) {
        model = new DefaultTableModel();
        model.addColumn("Column1");

        for (String item : data) {
            model.addRow(new Object[]{item});
        }
    }

    DefaultTableModel getModel() {
        return model;
    }
}
