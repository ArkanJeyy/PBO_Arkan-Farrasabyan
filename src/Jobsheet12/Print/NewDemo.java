package Print;

import java.util.ArrayList;

public class NewDemo {
  public static void main(String[] args) {
    WebPage webPage1 = new WebPage();
    webPage1.title = "Jurusan Teknologi Informasi Polinema";
    webPage1.url = "https://www.polinema.ac.id";
    webPage1.content = "<h1>Ini Contoh heading</h1><br/>";
    
    Document doc1 = new Document();
    doc1.filename = "PBO 2024.docx";
    doc1.content = "Contoh content Pemrograman Beriorientasi Objek";

    ArrayList<Printable> printable = new ArrayList<Printable>();
    printable.add(webPage1);
    printable.add(doc1);

    Printer printer1 = new Printer();
    printer1.cetak(webPage1);
    System.out.println();
    printer1.cetak(doc1);

  }
}
