/**
 * Flip the text horizontally for each row in a TextBlock.
 * 
 * @author [Your Name]
 * @version 1.0 [Date]
 */
public class HorizontallyFlipped implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The original TextBlock to have its text flipped horizontally.
   */
  private TextBlock originalBlock;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block with horizontally flipped text for each row.
   */
  public HorizontallyFlipped(TextBlock originalBlock) {
    this.originalBlock = originalBlock;
  } // HorizontallyFlipped(TextBlock)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row with horizontally flipped text from the block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception {
    // Get the original row
    String originalRow = originalBlock.row(i);

    // Flip the text of the row horizontally
    return new StringBuilder(originalRow).reverse().toString();
  } // row(int)

  /**
   * Determine how many rows are in the block with horizontally flipped text.
   */
  public int height() {
    return originalBlock.height();
  } // height()

  /**
   * Determine how many columns are in the block with horizontally flipped text.
   */
  public int width() {
    return originalBlock.width();
  } // width()
} // class HorizontallyFlipped
