public class RedBlackTreePrinter {
    public static void printRedBlackTree(PV tree) {
        printRedBlackTree(tree.raiz, "", true);
    }

    private static void printRedBlackTree(No node, String indent, boolean last) {
        if (node == PV.nil) {
            System.out.println(indent + (last ? "└─ " : "├─ ") + "nil");
            return;
        }

        String color = node.cor ? "RED" : "BLACK";
        System.out.println(indent + (last ? "└─ " : "├─ ") + node.v + "[" + color + "]");

        String childIndent = indent + (last ? "    " : "│   ");
        printRedBlackTree(node.esq, childIndent, false);
        printRedBlackTree(node.dir, childIndent, true);
    }
    
    public static void searchNode(PV tree, int value) {
        No node = tree.encontra(value);
        if (node == PV.nil) {
            System.out.println("Node not found.");
            return;
        }
        
        String color = node.cor ? "RED" : "BLACK";
        String parentValue = (node.p != PV.nil) ? String.valueOf(node.p.v) : "nil";
        String parentColor = (node.p != PV.nil) ? (node.p.cor ? "RED" : "BLACK") : "";
        
        String leftChildValue = (node.esq != PV.nil) ? String.valueOf(node.esq.v) : "nil";
        String leftChildColor = (node.esq != PV.nil) ? (node.esq.cor ? "RED" : "BLACK") : "";
        
        String rightChildValue = (node.dir != PV.nil) ? String.valueOf(node.dir.v) : "nil";
        String rightChildColor = (node.dir != PV.nil) ? (node.dir.cor ? "RED" : "BLACK") : "";
        
        System.out.println("No: " + node.v + "[" + color + "]");
        System.out.println("Pai: " + parentValue + "[" + parentColor + "]");
        System.out.println("Filho Esquerdo: " + leftChildValue + "[" + leftChildColor + "]");
        System.out.println("Filho Direito: " + rightChildValue + "[" + rightChildColor + "]");
    }
}