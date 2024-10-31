package Document;

public class ArticleTemplate implements DocumentTemplate {
    private String content;
    private String layout;
    private String style;

    @Override
    public DocumentTemplate clone() {
        ArticleTemplate cloned = new ArticleTemplate();
        cloned.content = this.content;
        cloned.layout = this.layout;
        cloned.style = this.style;
        return cloned;
    }

    @Override
    public void customize() {
        System.out.println("Customizing Article Template...");
    }

    @Override
    public void setContent(String content) {
        this.content = content;
        System.out.println("Setting content: " + content);
    }

    @Override
    public void setLayout(String layout) {
        this.layout = layout;
        System.out.println("Setting layout: " + layout);
    }

    @Override
    public void setStyle(String style) {
        this.style = style;
        System.out.println("Setting style: " + style);
    }
}
