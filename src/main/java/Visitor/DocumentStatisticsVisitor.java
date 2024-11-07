package Visitor;

/**
 * Concrete implementation of the DocumentVisitor that collects document statistics.
 */
public class DocumentStatisticsVisitor implements DocumentVisitor {
    private int wordCount = 0;
    private int imageCount = 0;
    private int tableCount = 0;

    @Override
    public void visit(TextSection textSection) {
        // סופרת את מספר המילים בקטע טקסט
        wordCount += textSection.getText().split("\\s+").length;
    }

    @Override
    public void visit(ImageSection imageSection) {
        // סופרת את מספר התמונות
        imageCount++;
    }

    @Override
    public void visit(TableSection tableSection) {
        // סופרת את מספר הטבלאות
        tableCount++;
    }

    /**
     * Returns the total word count.
     */
    public int getWordCount() {
        return wordCount;
    }

    /**
     * Returns the total image count.
     */
    public int getImageCount() {
        return imageCount;
    }

    /**
     * Returns the total table count.
     */
    public int getTableCount() {
        return tableCount;
    }
}
