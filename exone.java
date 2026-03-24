package Bai1;
import java.util.HashMap;
import java.util.Map;

public class exone {
    public static void main(String[] args) {
        // 1. Tạo HashMap để lưu mã ID và tên nhân viên
        HashMap<Integer, String> employees = new HashMap<>();
        
        // 2. Thêm 3 nhân viên
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        
        System.out.println("Danh sách nhân viên ban đầu:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Tên: " + entry.getValue());
        }
        
        // 3. Lấy tên nhân viên có ID 102
        String employee102 = employees.get(102);
        System.out.println("\nNhân viên có ID 102: " + employee102);
        
        // 4. Kiểm tra ID 105 có tồn tại không
        System.out.println("\nKiểm tra ID 105: " + employees.containsKey(105));
        
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
            System.out.println("Đã thêm ID 105 với tên Unknown");
        }
        
        System.out.println("\nDanh sách nhân viên sau khi thêm:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Tên: " + entry.getValue());
        }
    }
}