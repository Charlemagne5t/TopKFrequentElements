import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void topKFrequentTest1() {
        int[] array = {1, 1, 1, 2, 2, 3};
        int[] answer = {1, 2};
        Assert.assertArrayEquals(answer, new Solution().topKFrequent(array, 2));
    }

    @Test
    public void topKFrequentTest2() {
        int[] array = {1};
        int[] answer = {1};
        Assert.assertArrayEquals(answer, new Solution().topKFrequent(array, 1));
    }
}
