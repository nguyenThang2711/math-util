/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thang.util;

/**
 *
 * @author ASUS
 */
public class MathUtility {

    //fake Math of JDK với các hàm static để xài chung cho mọi nơi 
    // Math.PI.abs()  .sqrt()  .pow()  .sin()
    // cái gì là đồ xài chung không lưu trữ rieenng info nên sẽ là static
    public static final double PI = 3.15;

    //xài : MathUtility.PI 
    // HÀM tính n!= 1.2.3.4. ....n
    // n >=0 0!=1!=1 QUY ƯỚC
    // 21! tràn long type 
    // ta tỉ chính    n0<=n<=20
    // ngoài uvunfg này df số amam hay 20 ko tính và quăng ra exception
    // học caosch ném ngoại lệ .
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n muust be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
                                                                                        //TESTTING
//ta tự tin chất lượng code cao 
// nhưng team cần đươc chứng minh .
// muốn chứng minh 1 hàm chạy đúng hay ko ta cần test thử .
//test nghĩa là đưa hàm ra xa và gọi với các tham số khác nhau .
//Ex: Ta gọi hàm getFactoriial ( với các tham số khhasc nhhau )
//      getF9-5), getF(-1), getF(0), getF(5), getF920),getF(21),....
// ta gọi các thứ trên là các test case , là các tình huống test , các tình huống xài hàm ,
// Khi ta test hhamf cần quan tâm 2 việc :
//  1. Dự kiến hàm trả về giá trị gì khi hàm chạy với 1 đầu vòa nào đó 
//       Dự kiến hàm trả về giá tị , goji là EXPECTED VALUE.
//          EX: hàm sẽ trả về 120 khi gọi getF(5!)
//2. Hàm khi chajuy với 1 đầu vào nào đó , thì nó sẽ return về 1 value.
//        casivalue trả về của hàm khi chạy được gọi là ACTUAl VALYE.
//        Nghheef test là só sánh   EXPECTED VALUE với ACTUAl VALUE
//          Nếu có bằng , Hàm dúng cho case. tình huống này 
 //         Nếu ko bằng , Hàm tính toán sai , Hoặc kì vonngj sai 
 //Hàm mà tốt thì phải là   EXPECTED VALUE    =  ACTUAl VALUE mọi tình huống .
 //Nếu tốt thì ta mới đem ra xài , bán , public cộng đồng xài.
// Làm sao để test coi có tốt ko , Expected= Actual
// CÓ 2 kĩ thuật được áp dụng :
// 1: Nhìn bằng mát và so snash từng cặp Expected vs Actual
//             chính là kĩ thuật sout(Expected), sout  (Actual) Hàm return về khi chạy
//              Kĩ thuật này đơn giản nhưng rất đễ bị mắt sai xót do có quá nhiều cjapw gái trijij cần so snash bằng mắt

// 2: Nhìn bằng mắt nhưng ko cần  so sánh mà để máy so snash . mắt chỉ cần nhìn 2 màu xanh đỏ duy nhất.
// Nếu tất cả các cặp Expected vs Actual đều thỏa thì màu xanh cho tất cả
//Nếu hầu hết các cặp Expected vs Actual đều thỏa , có 1 hoặc vài cái ko thỏa . THÌ KẾT LUẬN HÀM SAI MÀU ĐỎ CHO TẤT CẢ 
// Diều d này giả thích nếu đúng thì đúung cho tất cả, còn nếu sai thì sai cho tất cả.
//Kĩ thuật 2 dùng màu sắc , muốn làm như vậy thì ohair dùng thêm các thư việc bổ xung :
//  Chính là các FILE, JAR, DLL được cung cấp thêm ngoài jdk
// các thư việc này tùy thuộc vào các ngôn ngữ lập trình , và được gọi chung là \
   //  Unit Test framewrok
   //C#: thư viện củ thể : NUnit, MSUnit
   //java:                  JUnit, TestNG, xUnit
   //PHP:                   PHPUnit
   //C++:                   CPPUnit
    }
    
    
    public static void main(String[] args) {
       //case 1:
        long expected= 120;  //tui hi vong 120 return neu:
        long Actual= MathUtility.getFactorial(5);   
        System.out.println("EX: "+expected+"; Actual "+Actual);
        //case 2:
        expected=720;
        Actual=MathUtility.getFactorial(6);
        System.out.println("EX: "+expected+"; Actual "+Actual);
        //case 3:
        System.out.println("0!?  expected : 1 ; Actual : "+MathUtility.getFactorial(0));
        //case 4:
        
        // Kì vọng nhận về ngoại lệ IllegalArgumentException.
        //Nếu gọi -5!
        MathUtility.getFactorial(-5);
        //thấy ngoại lệ lại mừng vì hàm chạy đúng .
        
    
    }
}

//cất code lên server GitHub
// cần :
// nhớ kho trên GITHUB. url : "https://github.com/NguyenDTThang/math-util.git";
// nhớ usernname và pass và email vào github của mình .
//cần tool để đẩy code từ máy lên Git .
// CMD, GUI < IDE
//Cách 1: CMD.
// cần file đặc biệt để nói với gittool rằng ai lên server ai ở lại local . file này được gọi là .gitignore (thuần text)
// nó khác nhhua tùy dự án , tùy vòa IDE , ngôn ngữ lập trình 
// có 1 dev cực kì dth đã có sẵn các file ứng với các IDE và các ngôn ngữ lập trình 

    //          https://gitignore.io
