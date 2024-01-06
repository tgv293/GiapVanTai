package B7_Adapter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class MainB7 {
    public static void main(String[] args) {
        // Tạo ArrayList
        ArrayList<String> data = new ArrayList<>();
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");

        // Chuyển ArrayList thành TableModel
        ArrayListToTableModelAdapter adapter = new ArrayListToTableModelAdapter(data);
        DefaultTableModel model = adapter.getModel();

        // Hiển thị TableModel trong JTable
        JTable table = new JTable(model);
        JOptionPane.showMessageDialog(null, new JScrollPane(table));
    }
}
