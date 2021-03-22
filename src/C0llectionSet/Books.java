package C0llectionSet;
/*
some practice about the constructor
 */
public class Books {
    int id;
    String name,author,publisher;
    int quantity;
    public Books(int id,String name,String author,String publisher,int quantity){
        this.author=author;
        this.id=id;
        this.name=name;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}
