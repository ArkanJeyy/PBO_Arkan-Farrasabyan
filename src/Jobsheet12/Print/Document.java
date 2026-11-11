package Print;

public class Document implements Printable {
  public String filename;
  public String content;

  @Override
  public String getPrintableContent() {
    return content;
  }
}
