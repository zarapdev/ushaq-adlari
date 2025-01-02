package DorduncuTap;

public class EmailService {
    public  void validateAge(int age) {
        if (age<18 || age>100){
            throw new AgeOutOfRangeException("Yash 18 ile 100 arasinda olmalidir");
        }
    }
    public  void validateEmail (String email) {
        if (!email.contains("@") || ! email.contains("." )){
            throw new InvalidEmailException("E-poçt ünvanı düzgün formatda olmalıdır (məsələn: example@example.com");
        }
    }



}
