package vendingmachine.core;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AlphanumericGridTest {

    @Test
    public void testRetrievalOfItemNameWithKey() throws Exception {
        AlphanumericGrid alphanumericGrid = new AlphanumericGrid(10, 10);
        alphanumericGrid.loadDisplayableItems(Arrays.asList("Classic Coke", "Diary Chocolate", "Lays Original"));

        String selectionKey = "a2";
        alphanumericGrid.enterSelectionKey(selectionKey);

        Assert.assertThat("Classic Coke", Matchers.is(alphanumericGrid.getSelectedItem()));
    }
}
