package Lesson;

public class Homework {
    public static void main(String[] args){
        // 1 -ая книга
        Author kafka = new Author("France", "Kafka");
        Book zamok = new Book("Zamok", 1922, kafka);
        zamok.setYearBook(1923);
        System.out.println(zamok);
        // 2 - ая книга
        Author gesse = new Author("German", "Gesse");
        Book posledneeLetoKlingzora = new Book("Poslednee leto Klingzora", 1919, gesse);
        posledneeLetoKlingzora.setYearBook(1920);
        System.out.println(posledneeLetoKlingzora);
    }
}


