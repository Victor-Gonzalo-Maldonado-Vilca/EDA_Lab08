import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class HuffmanCoding {
    public static void encode(Node root, String str, Map<Character, String> huffmanCode) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            huffmanCode.put(root.ch, str);
        }

        encode(root.left, str + "0", huffmanCode);
        encode(root.right, str + "1", huffmanCode);
    }

    public static int decode(Node root, int index, StringBuilder sb) {
        if (root == null) {
            return index;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.ch);
            return index;
        }

        index++;

        if (sb.charAt(index) == '0') {
            index = decode(root.left, index, sb);
        } else {
            index = decode(root.right, index, sb);
        }

        return index;
    }

    // Construir el árbol de Huffman y decodificar el input dado
    public static void buildHuffmanTree(String text) {
        // Contar la frecuencia de aparición de cada carácter y almacenarlo en un mapa
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Crear una cola de prioridad para almacenar nodos del árbol de Huffman
        PriorityQueue<Node> pq = new PriorityQueue<>(new HuffmanComparator());

        // Crear un nodo hoja para cada carácter y añadirlo a la cola de prioridad
        for (var entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Hacer hasta que haya más de un nodo en la cola
        while (pq.size() != 1) {
            // Eliminar los dos nodos de mayor prioridad (frecuencia mínima)
            Node left = pq.poll();
            Node right = pq.poll();

            // Crear un nuevo nodo interno con estos dos nodos como hijos y con una frecuencia
            // igual a la suma de las frecuencias de los dos nodos. Añadir el nuevo nodo a la cola.
            int sum = left.freq + right.freq;
            pq.add(new Node('\0', sum, left, right));
        }

        // Root stores pointer to root of Huffman Tree
        Node root = pq.peek();

        // Recorrer el árbol de Huffman y almacenar los códigos de Huffman en un mapa
        Map<Character, String> huffmanCode = new HashMap<>();
        encode(root, "", huffmanCode);

        // Print encoded string
        System.out.println("Códigos de Huffman: " + huffmanCode);
        System.out.println("Texto original: " + text);

        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(huffmanCode.get(c));
        }

        System.out.println("Texto codificado: " + sb);

        // Decodificar el string binario
        int index = -1;
        System.out.println("Texto decodificado: ");
        while (index < sb.length() - 1) {
            index = decode(root, index, sb);
        }
    }
}
