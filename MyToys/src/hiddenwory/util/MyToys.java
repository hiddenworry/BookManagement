
package hiddenwory.util;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Quốc Bảo
 * //class này xem như nhà kho, đồ xài chung.
 * vì xài chung nên không nhớ gì cảu bản thân nên là static
 * Trong Class thì có cả static và non-static
 * Có class thì hầu hết static, ví dụ Mạth.,String.....
 * Có một số class thì ko có static ví dụ scanner..., phải đi qua new
 * 
 */
public class MyToys {
    public static final double PI = 3.14; // dùng nhiều lần nên static
    public static final double VAT = 0.1;// dùng nhiều lần nên static
    private static Scanner sc = new Scanner(System.in);
// final là hằng số, biến chỉ đổi value ngay khi khai báo(lần đầu xuất hiện)
// Hàm nhập: chống trôi lệnh, try catch, do-while => lặp đi lặp lại => tốn thời gian=> tạo hàm riêng gói gọn lại và chỉ return
// satic để không tốn ram mỗi lần new, và cũng ko riêng tư
    public static int getAnInteger(String inputMesseger){
           int n;
           
           
           do{
               try {
                   System.out.println(inputMesseger);
                   n = Integer.parseInt(sc.nextLine());
                   return n;
               } catch (Exception e) {
                   System.out.println("Please input an Integer: ");
               }
           
           
           
           
           }while(true);




    }
}
