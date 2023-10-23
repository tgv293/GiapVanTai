package B7_Adapter;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 * Lớp ArrayListToTableModelAdapter là một lớp adapter dùng để chuyển đổi dữ liệu từ ArrayList sang DefaultTableModel
 * để sử dụng trong JTable.
 */
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
