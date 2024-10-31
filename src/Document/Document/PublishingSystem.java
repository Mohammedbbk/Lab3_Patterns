package Document;

public class PublishingSystem {
    public static void main(String[] args) {
        DocumentTemplate prototype = new ArticleTemplate();

        DocumentTemplate article1 = prototype.clone();
        article1.setContent("Science Article");
        article1.setLayout("Two Column");
        article1.setStyle("Academic");
        article1.customize();

        DocumentTemplate article2 = prototype.clone();
        article2.setContent("News Article");
        article2.setLayout("Single Column");
        article2.setStyle("Journal");
        article2.customize();
    }
}
