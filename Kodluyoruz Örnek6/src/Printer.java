public class Printer {


    public static void printPDFDocument(){
        PDFDocument pdfDocument = new PDFDocument("pdf dosyasi");
        System.out.println(pdfDocument.getBody());
    }
    public static void printWordDocument(){
        WordDocument wordDocument = new WordDocument("word dosyasi");
        System.out.println(wordDocument.getBody());
    }

    public static void main(String[] args) {

        printPDFDocument();
        printWordDocument();


    }
}
