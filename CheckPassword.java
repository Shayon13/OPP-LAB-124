package ooplabwork;
import java.util.Scanner;
public class CheckPassword {
    public static void main(String[] args) 
    {
        String password;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the password: ");
        password = input.nextLine();
        
        int input_lenght = password.length();
        int char_count = 0;
        int digit_count = 0;
        int whitespace_count = 0; 
        for(int i = 0;i < input_lenght;i++)
        {
            char ch = password.charAt(i);
            
            if(Character.isLetter(ch))
                char_count++;
            else if(Character.isDigit(ch))
                digit_count++;
            
            else if(Character.isWhitespace(ch))
                whitespace_count++;
        }
        int total_character_count = char_count + digit_count + whitespace_count;
        if(total_character_count <= 10)
            System.out.println("This password is valid");
        else
            System.out.println("This password is invalid");
        
        System.out.println("\n");
}
} 

