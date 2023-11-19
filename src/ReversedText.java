/**
 * Reverse the text of each row in a TextBlock.
 * 
 * @author Rene Urias Jr.
 */
public class ReversedText implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The original TextBlock to have its text reversed.
   */
  private TextBlock originalBlock;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block with reversed text for each row.
   */
  public ReversedText(TextBlock originalBlock) {
    this.originalBlock = originalBlock;
  } // ReversedText(TextBlock)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row with reversed text from the block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception {
    // Get the original row
    String originalRow = originalBlock.row(i);

    // Reverse the text of the row
    return new StringBuilder(originalRow).reverse().toString();
  } // row(int)

  /**
   * Determine how many rows are in the block with reversed text.
   */
  public int height() {
    return originalBlock.height();
  } // height()

  /**
   * Determine how many columns are in the block with reversed text.
   */
  public int width() {
    return originalBlock.width();
  } // width()
} // class ReversedText
