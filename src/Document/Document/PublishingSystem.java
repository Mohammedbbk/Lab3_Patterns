package Document;

public class PublishingSystem {
    public static void main(String[] args) {
        // Create prototype
        DocumentTemplate prototype = new ArticleTemplate();

        // Clone and customize first article
        DocumentTemplate article1 = prototype.clone();
        article1.setContent("Science Article");
        article1.setLayout("Two Column");
        article1.setStyle("Academic");
        article1.customize();

        // Clone and customize second article
        DocumentTemplate article2 = prototype.clone();
        article2.setContent("News Article");
        article2.setLayout("Single Column");
        article2.setStyle("Journal");
        article2.customize();
    }
}
