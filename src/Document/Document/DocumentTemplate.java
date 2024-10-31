package Document;

public interface DocumentTemplate extends Cloneable {
    DocumentTemplate clone();
    void customize();
    void setContent(String content);
    void setLayout(String layout);
    void setStyle(String style);
}