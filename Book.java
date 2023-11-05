package ooplab;
public class Book {
    
      public static void main(String[] args) {
        Book print = new Book ();
    }
    String[] title=new String[4];
    String[] author =new String[4];
    int[] isbn=new int[4];
    Book()
    {
        bookdetails();
        AddBook();
        RemoveBook();
    }

    void bookdetails()
    { 
       title[0]="The Silent Patient";
       author[0]="David Baldacci";
       isbn[0]= 94;
       title[1]="A Brief History of time ";
       author[1]="Stephen Hawking";
       isbn[1]= 40;
       title[2]="Agni Veena ";
       author[2]="Kazi Nasrul Islam";
       isbn[2]= 985;
       title[3]="Time Machine";
       author[3]="H.G Wells";
       isbn[3]= 454;
    }
       void AddBook(){
       System.out.println("Book name :"+title[0]);
       System.out.println("Book author :"+author[0]);
       System.out.println("Book ISBN:"+isbn[0]);
       System.out.println("Book name :"+title[1]);
       System.out.println("Book author:"+author[1]);
       System.out.println("Book ISBN:"+isbn[1]);
       System.out.println("Book name:"+title[2]);
       System.out.println("Book author:"+author[2]);
       System.out.println("Book ISBN:"+isbn[2]);
       System.out.println("Book Name:"+title[3]);
       System.out.println("Book Author:"+author[3]);
       System.out.println("Book ISBN:"+isbn[3]);
       System.out.println(" ");
    }
       void RemoveBook(){ 
       System.out.println("Ater remove one book : "+title[3]);
       System.out.println(" ");
       System.out.println("Book name :"+title[0]);
       System.out.println("Book author :"+author[0]);
       System.out.println("Book ISBN:"+isbn[0]);
       System.out.println("Book name :"+title[1]);
       System.out.println("Book author:"+author[1]);
       System.out.println("Book ISBN:"+isbn[1]);
       System.out.println("Book name:"+title[2]);
       System.out.println("Book author:"+author[2]);
       System.out.println("Book ISBN:"+isbn[2]);
       }
   }
    
   