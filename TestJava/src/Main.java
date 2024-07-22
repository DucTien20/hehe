//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

// Thêm một phần tử vào cuối chuỗi
       // sb.append(" World");

// Chèn một chuỗi vào vị trí cụ thể
       //    sb.insert(2, "Beautiful");

// Xóa một phần tử từ chuỗi
      // sb.delete(4,5);

// Thay thế một phần của chuỗi bằng một chuỗi mới
       sb.replace(2, 4, "Greetings");

        System.out.println(sb.toString());  // In ra kết quả: Greetings Beautiful World

    }
}