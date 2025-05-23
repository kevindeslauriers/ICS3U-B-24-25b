package day4;

public class TextBook extends Book{
    private int edition;

    public TextBook(String bookTitle, double pookPrice, int bookEdition){
        super(bookTitle, pookPrice);
        edition = bookEdition;
    }

    public int getEdition(){
        return edition;
    }

    public String getBookInfo(){
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstitudeFor(TextBook tBook){
        return (getTitle().equals(tBook.getTitle()) && this.edition > tBook.edition);
    }

}
