import static org.junit.Assert.*;
// import java.io.PrintWriter;
import org.junit.Test;

public class TextBlockTests {

  // Test cases for Centered class
  @Test
  public void testCenteredEqual() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock centeredBlock1 = new Centered(originalBlock1, 10);
    TextBlock centeredBlock2 = new Centered(originalBlock1, 5);

    assertTrue(TBUtils.equal(centeredBlock1, centeredBlock1));
    assertTrue(TBUtils.equal(centeredBlock1, new Centered(originalBlock1, 10)));
    assertFalse(TBUtils.equal(centeredBlock1, centeredBlock2));
  }

  @Test
  public void testCenteredEqv() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock centeredBlock1 = new Centered(originalBlock1, 10);
    TextBlock centeredBlock2 = new Centered(originalBlock1, 5);

    assertTrue(TBUtils.eqv(centeredBlock1, centeredBlock1));
    assertTrue(TBUtils.eqv(centeredBlock1, new Centered(originalBlock1, 10)));
    assertFalse(TBUtils.eqv(centeredBlock1, centeredBlock2));
    assertFalse(TBUtils.eqv(centeredBlock1, new HorizontallyFlipped(originalBlock1)));
  }

  @Test
  public void testCenteredEq() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock centeredBlock1 = new Centered(originalBlock1, 10);
    TextBlock centeredBlock2 = new Centered(originalBlock1, 5);

    assertTrue(TBUtils.eq(centeredBlock1, centeredBlock1));
    assertFalse(TBUtils.eq(centeredBlock1, centeredBlock2));
  }

  @Test
  public void testHorizontallyFlippedEqual() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock flippedBlock1 = new HorizontallyFlipped(originalBlock1);
    TextBlock flippedBlock2 = new HorizontallyFlipped(originalBlock1);

    assertTrue(TBUtils.equal(flippedBlock1, flippedBlock2));
    assertFalse(TBUtils.equal(flippedBlock1, new HorizontallyFlipped(new TextLine("World"))));
  }

  @Test
  public void testHorizontallyFlippedEqv() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock flippedBlock1 = new HorizontallyFlipped(originalBlock1);
    TextBlock flippedBlock2 = new HorizontallyFlipped(originalBlock1);

    assertTrue(TBUtils.eqv(flippedBlock1, flippedBlock2));
    assertFalse(TBUtils.eqv(flippedBlock1, new HorizontallyFlipped(new TextLine("World"))));
    assertFalse(TBUtils.eqv(flippedBlock1, new Centered(originalBlock1, 10)));
  }

  @Test
  public void testHorizontallyFlippedEq() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock flippedBlock1 = new HorizontallyFlipped(originalBlock1);
    TextBlock flippedBlock2 = new HorizontallyFlipped(originalBlock1);

    assertFalse(TBUtils.eq(flippedBlock1, flippedBlock2)); // Use assertFalse for reference equality
    assertTrue(TBUtils.equal(flippedBlock1, flippedBlock2));
    assertFalse(TBUtils.equal(flippedBlock1, new HorizontallyFlipped(new TextLine("World"))));
  }

  // Test cases for ReversedText class
  @Test
  public void testReversedTextEqual() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock reversedBlock1 = new ReversedText(originalBlock1);
    TextBlock reversedBlock2 = new ReversedText(originalBlock1);

    assertTrue(TBUtils.equal(reversedBlock1, reversedBlock2));
    assertFalse(TBUtils.equal(reversedBlock1, new ReversedText(new TextLine("World"))));
  }

  @Test
  public void testReversedTextEqv() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock reversedBlock1 = new ReversedText(originalBlock1);
    TextBlock reversedBlock2 = new ReversedText(originalBlock1);

    assertTrue(TBUtils.eqv(reversedBlock1, reversedBlock2));
    assertFalse(TBUtils.eqv(reversedBlock1, new ReversedText(new TextLine("World"))));
    assertFalse(TBUtils.eqv(reversedBlock1, new Centered(originalBlock1, 10)));
  }

  @Test
  public void testReversedTextEq() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock reversedBlock1 = new ReversedText(originalBlock1);
    TextBlock reversedBlock2 = new ReversedText(originalBlock1);

    assertFalse(TBUtils.eq(reversedBlock1, reversedBlock2)); // Use assertFalse for reference
                                                             // equality
    assertTrue(TBUtils.equal(reversedBlock1, reversedBlock2));
    assertFalse(TBUtils.equal(reversedBlock1, new ReversedText(new TextLine("World"))));
  }

  // Test cases for RightJustified class
  @Test
  public void testRightJustifiedEqual() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock justifiedBlock1 = new RightJustified(originalBlock1, 10);
    TextBlock justifiedBlock2 = new RightJustified(originalBlock1, 5);

    assertTrue(TBUtils.equal(justifiedBlock1, justifiedBlock1));
    assertTrue(TBUtils.equal(justifiedBlock1, new RightJustified(originalBlock1, 10)));
    assertFalse(TBUtils.equal(justifiedBlock1, justifiedBlock2));
  }

  @Test
  public void testRightJustifiedEqv() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock justifiedBlock1 = new RightJustified(originalBlock1, 10);
    TextBlock justifiedBlock2 = new RightJustified(originalBlock1, 5);

    assertTrue(TBUtils.eqv(justifiedBlock1, justifiedBlock1));
    assertTrue(TBUtils.eqv(justifiedBlock1, new RightJustified(originalBlock1, 10)));
    assertFalse(TBUtils.eqv(justifiedBlock1, justifiedBlock2));
    assertFalse(TBUtils.eqv(justifiedBlock1, new Centered(originalBlock1, 10)));
  }

  @Test
  public void testRightJustifiedEq() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock justifiedBlock1 = new RightJustified(originalBlock1, 10);
    TextBlock justifiedBlock2 = new RightJustified(originalBlock1, 5);

    assertTrue(TBUtils.eq(justifiedBlock1, justifiedBlock1));
    assertFalse(TBUtils.eq(justifiedBlock1, justifiedBlock2));
  }

  // Test cases for Truncated class
  @Test
  public void testTruncatedEqual() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock truncatedBlock1 = new Truncated(originalBlock1, 10);
    TextBlock truncatedBlock2 = new Truncated(originalBlock1, 5);

    assertTrue(TBUtils.equal(truncatedBlock1, truncatedBlock1));
    assertTrue(TBUtils.equal(truncatedBlock1, new Truncated(originalBlock1, 10)));
    assertTrue(TBUtils.equal(truncatedBlock1, truncatedBlock2)); // Both padded to 10 characters
  }

  @Test
  public void testTruncatedEqv() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock truncatedBlock1 = new Truncated(originalBlock1, 10);
    TextBlock truncatedBlock2 = new Truncated(originalBlock1, 5);

    assertTrue(TBUtils.eqv(truncatedBlock1, truncatedBlock1)); // Same block
    assertTrue(TBUtils.eqv(truncatedBlock1, new Truncated(originalBlock1, 10))); // Same maxWidth
    assertFalse(TBUtils.eqv(truncatedBlock1, truncatedBlock2)); // Different maxWidth
    assertFalse(TBUtils.eqv(truncatedBlock1, new Centered(originalBlock1, 10))); // Different class
  }

  @Test
  public void testTruncatedEq() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock truncatedBlock1 = new Truncated(originalBlock1, 10);
    TextBlock truncatedBlock2 = new Truncated(originalBlock1, 5);

    assertTrue(TBUtils.eq(truncatedBlock1, truncatedBlock1));
    assertFalse(TBUtils.eq(truncatedBlock1, truncatedBlock2));
  }

  // Test cases for VerticallyFlipped class
  @Test
  public void testVerticallyFlippedEqual() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock flippedBlock1 = new VerticallyFlipped(originalBlock1);
    TextBlock flippedBlock2 = new VerticallyFlipped(originalBlock1);

    assertTrue(TBUtils.equal(flippedBlock1, flippedBlock2));
    assertFalse(TBUtils.equal(flippedBlock1, new VerticallyFlipped(new TextLine("World"))));
  }

  @Test
  public void testVerticallyFlippedEqv() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock flippedBlock1 = new VerticallyFlipped(originalBlock1);
    TextBlock flippedBlock2 = new VerticallyFlipped(originalBlock1);

    assertTrue(TBUtils.eqv(flippedBlock1, flippedBlock2));
    assertFalse(TBUtils.eqv(flippedBlock1, new VerticallyFlipped(new TextLine("World"))));
    assertFalse(TBUtils.eqv(flippedBlock1, new Centered(originalBlock1, 10)));
  }

  @Test
  public void testVerticallyFlippedEq() throws Exception {
    TextBlock originalBlock1 = new TextLine("Hello");
    TextBlock flippedBlock1 = new VerticallyFlipped(originalBlock1);
    TextBlock flippedBlock2 = new VerticallyFlipped(originalBlock1);

    assertFalse(TBUtils.eq(flippedBlock1, flippedBlock2)); // Use assertFalse for reference equality
    assertTrue(TBUtils.equal(flippedBlock1, flippedBlock2));
    assertFalse(TBUtils.equal(flippedBlock1, new VerticallyFlipped(new TextLine("World"))));
  }

  @Test
  public void testTruncatedWidth() throws Exception {
    TextBlock originalBlock = new TextLine("Hello, World!");

    new Truncated(originalBlock, originalBlock.width());

    // Test with maxWidth less than the width of the original block
    int maxWidth = 5;
    TextBlock truncatedBlock2 = new Truncated(originalBlock, maxWidth);

    // Check that each row is truncated to the specified maxWidth
    for (int i = 0; i < originalBlock.height(); i++) {
      String expectedRow =
          originalBlock.row(i).substring(0, Math.min(originalBlock.width(), maxWidth));
      assertEquals(expectedRow, truncatedBlock2.row(i));
    }

    // Test with maxWidth greater than the width of the original block
    maxWidth = originalBlock.width() + 5;
    TextBlock truncatedBlock3 = new Truncated(originalBlock, maxWidth);

    // Check that the width of truncatedBlock3 is equal to the width of the original block
    assertEquals(originalBlock.width(), truncatedBlock3.width());
  }

  @Test
  public void testCenteredWidth() throws Exception {
    TextBlock originalBlock = new TextLine("Hello, World!");

    // Test with width equal to the width of the original block
    int width1 = originalBlock.width();
    TextBlock centeredBlock1 = new Centered(originalBlock, width1);

    // Check if centeredBlock1 is equal to the original block
    assertTrue(TBUtils.equal(centeredBlock1, originalBlock));

    // Test with width greater than the width of the original block
    int width2 = originalBlock.width() + 5;
    TextBlock centeredBlock2 = new Centered(originalBlock, width2);

    for (int i = 0; i < originalBlock.height(); i++) {
      int padding = Math.max(0, (width2 - originalBlock.row(i).length()) / 2);
      int extraSpace = width2 - (originalBlock.row(i).length() + 2 * padding);

      // Adjust the expected row based on the extra space
      String expectedRow =
          TBUtils.spaces(padding) + originalBlock.row(i) + TBUtils.spaces(padding + extraSpace);

      assertEquals(expectedRow, centeredBlock2.row(i));
    }
  }

  @Test
  public void testRightJustifiedWidth() throws Exception {
    TextBlock originalBlock = new TextLine("Hello, World!");

    // Test with width equal to the width of the original block
    int width1 = originalBlock.width();
    TextBlock justifiedBlock1 = new RightJustified(originalBlock, width1);

    // Debug statements
    // System.out.println("originalBlock:");
    // TBUtils.print(new PrintWriter(System.out), originalBlock);
    // System.out.println("justifiedBlock1:");
    // TBUtils.print(new PrintWriter(System.out), justifiedBlock1);
    // System.out.println("width1: " + width1);

    // Check if justifiedBlock1 is equal to the original block
    assertTrue(TBUtils.equal(justifiedBlock1, originalBlock));

    // Test with width greater than the width of the original block
    int width2 = originalBlock.width() + 5;
    TextBlock justifiedBlock2 = new RightJustified(originalBlock, width2);

    // Check that each row is right-justified within the specified width
    for (int i = 0; i < originalBlock.height(); i++) {
      int padding = Math.max(0, width2 - originalBlock.row(i).length());
      String expectedRow = TBUtils.spaces(padding) + originalBlock.row(i);
      assertEquals(expectedRow, justifiedBlock2.row(i));
    }
  }

  @Test
  public void testHorizontallyFlippedNonemptyBlock() throws Exception {
    // Create a nonempty original block with two or more lines
    TextBlock originalBlock = new TextBlock() {
      @Override
      public String row(int i) throws Exception {
        return "Line " + (i + 1);
      }

      @Override
      public int height() {
        return 3; // Adjust the height as needed (two or more lines)
      }

      @Override
      public int width() {
        return 10; // Adjust the width as needed
      }
    };

    // Create a horizontally flipped block
    TextBlock flippedBlock = new HorizontallyFlipped(originalBlock);

    // Debug statements
    // System.out.println("originalBlock:");
    // TBUtils.print(new PrintWriter(System.out), originalBlock);
    // System.out.println("flippedBlock:");
    // TBUtils.print(new PrintWriter(System.out), flippedBlock);

    // Check if each row in the flipped block is the reverse of the corresponding row in the
    // original block
    for (int i = 0; i < originalBlock.height(); i++) {
      String originalRow = originalBlock.row(i);
      String flippedRow = flippedBlock.row(i);
      assertEquals(new StringBuilder(originalRow).reverse().toString(), flippedRow);
    }
  }

  @Test
  public void testVerticallyFlippedNonemptyBlock() throws Exception {
    // Create an original block with three lines
    TextBlock originalBlock = new TextBlock() {
      public String row(int i) throws Exception {
        if (i == 0) {
          return "Line 1";
        } else if (i == 1) {
          return "Line 2";
        } else if (i == 2) {
          return "Line 3";
        } else {
          throw new Exception("Invalid row index");
        }
      }

      public int height() {
        return 3;
      }

      public int width() {
        return 7; // Assuming a fixed width for simplicity
      }
    };

    // Create a vertically flipped block
    TextBlock verticallyFlippedBlock = new VerticallyFlipped(originalBlock);

    // Check if the height and width are the same
    assertEquals(originalBlock.height(), verticallyFlippedBlock.height());
    assertEquals(originalBlock.width(), verticallyFlippedBlock.width());

    // Check if each row is vertically flipped
    for (int i = 0; i < originalBlock.height(); i++) {
      String originalRow = originalBlock.row(i);
      String flippedRow = verticallyFlippedBlock.row(originalBlock.height() - 1 - i);
      assertEquals(originalRow, flippedRow);
    }
  }

  @Test
  public void testTruncatedWithZeroWidth() throws Exception {
    TextBlock originalBlock = new TextLine("Hello, World!");

    // Test with width equal to 0
    int width = 0;
    TextBlock truncatedBlock = new Truncated(originalBlock, width);

    // Check that each row in the truncated block is an empty string
    for (int i = 0; i < originalBlock.height(); i++) {
      assertEquals("", truncatedBlock.row(i));
    }

    // Check that the width of the truncated block is 0
    assertEquals(0, truncatedBlock.width());
  }

  @Test
  public void testTruncatedWithGreaterWidth() throws Exception {
    TextBlock originalBlock = new TextLine("Hello, World!");

    // Test with width greater than the width of the original block
    int width = originalBlock.width() + 5;
    TextBlock truncatedBlock = new Truncated(originalBlock, width);

    // Check that each row in the truncated block is the same as the original block
    for (int i = 0; i < originalBlock.height(); i++) {
      assertEquals(originalBlock.row(i), truncatedBlock.row(i));
    }

    // Check that the width of the truncated block is equal to the width of the original block
    assertEquals(originalBlock.width(), truncatedBlock.width());
  }

  @Test
  public void testCenteredWithWidthZero() throws Exception {
    TextBlock originalBlock = new TextLine("Hello, World!");

    // Test with width equal to 0
    int width = 0;
    TextBlock centeredBlock = new Centered(originalBlock, width);

    // Check that each row is an empty string
    for (int i = 0; i < centeredBlock.height(); i++) {
      assertEquals("", centeredBlock.row(i));
    }

    // Also, check if the centered block has the same dimensions as the original block
    if (width > 0) {
      assertEquals(originalBlock.height(), centeredBlock.height());
      assertEquals(originalBlock.width(), centeredBlock.width());
    } else {
      // When width is 0, expect the width of the centered block to be 0
      assertEquals(0, centeredBlock.width());
    }
  }

  @Test
  public void testCenteredWithSmallWidth() throws Exception {
    TextBlock originalBlock = new TextLine("Hello, World!");

    // Test with width less than the width of the original block
    int width = 5;
    TextBlock centeredBlock = new Centered(originalBlock, width);

    // Check that each row is the same as the original row
    for (int i = 0; i < centeredBlock.height(); i++) {
      assertEquals(originalBlock.row(i), centeredBlock.row(i));
    }

    // Also, check if the centered block has the same dimensions as the original block
    assertEquals(originalBlock.height(), centeredBlock.height());
    assertEquals(width, centeredBlock.width());
  }

  @Test
  public void testHorizontallyFlippedWithEmptyBlock() throws Exception {
    TextBlock originalBlock = new TextLine("");

    // Create a horizontally flipped block
    TextBlock flippedBlock = new HorizontallyFlipped(originalBlock);

    // Check that each row is an empty string
    for (int i = 0; i < flippedBlock.height(); i++) {
      assertEquals("", flippedBlock.row(i));
    }

    // Also, check if the flipped block has the same dimensions as the original block
    assertEquals(originalBlock.height(), flippedBlock.height());
    assertEquals(originalBlock.width(), flippedBlock.width());
  }

  @Test
  public void testVerticallyFlippedWithEmptyBlock() throws Exception {
    TextBlock originalBlock = new TextLine("");

    // Create a vertically flipped block
    TextBlock flippedBlock = new VerticallyFlipped(originalBlock);

    // Check that each row is an empty string
    for (int i = 0; i < flippedBlock.height(); i++) {
      assertEquals("", flippedBlock.row(i));
    }

    // Also, check if the flipped block has the same dimensions as the original block
    assertEquals(originalBlock.height(), flippedBlock.height());
    assertEquals(originalBlock.width(), flippedBlock.width());
  }
}
