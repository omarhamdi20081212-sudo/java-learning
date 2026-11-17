import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== برنامج حساب الـ GPA بالتفصيل ===");
        System.out.print("أدخل عدد المواد الدراسية: ");
        int numCourses = scanner.nextInt();
        
        double totalPoints = 0;
        int totalCredits = 0;
        
        // حلقة تكرارية لإدخال بيانات كل مادة
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\n--- بيانات المادة رقم " + i + " ---");
            
            System.out.print("أدخل النقاط الخاصة بالمادة (مثلاً من 4.0 أو نظام 5.0): ");
            double gradePoints = scanner.nextDouble();
            
            System.out.print("أدخل عدد ساعات (Credits) المادة: ");
            int creditHours = scanner.nextInt();
            
            // حساب النقاط الموزونة (النقاط × عدد الساعات)
            totalPoints += (gradePoints * creditHours);
            totalCredits += creditHours;
        }
        
        // حساب الـ GPA النهائي إذا كانت الساعات أكبر من صفر
        if (totalCredits > 0) {
            double gpa = totalPoints / totalCredits;
            System.out.println("\n=================================");
            System.out.println(" نتيجة المعدل التراكمي (GPA) = " + gpa);
            System.out.println(" إجمالي الساعات المجتازة = " + totalCredits);
            System.out.println("=================================");
        } else {
            System.out.println("خطأ: لم يتم إدخال ساعات صحيحة.");
        }
        
        scanner.close();
    }
}
