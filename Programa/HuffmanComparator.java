import java.util.Comparator;

public class HuffmanComparator implements Comparator<Node> {
    @Override
    public int compare(Node a, Node b) {
        return a.freq - b.freq;
    }
}