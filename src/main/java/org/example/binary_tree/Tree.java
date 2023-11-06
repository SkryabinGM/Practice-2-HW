package org.example.binary_tree;

public class Tree {
    public Node rootNode;

    public Tree() {
        rootNode = null;
    }

    public void intAdd (int value){
        Node newNode = new Node();
        newNode.setValue(value);
        if (rootNode == null){
            rootNode=newNode;
        } else{
            Node currentNode = rootNode;
            while (true)
            {
                if (value == currentNode.getValue()){
                    return;
                } else if (value < currentNode.getValue()){
                    if (currentNode.getLeftNode()== null){
                        currentNode.setLeftNode(newNode);
                        return;
                    }
                    else {
                        currentNode = currentNode.getLeftNode();
                    }
                } else {
                    if (currentNode.getRightNode() == null){
                        currentNode.setRightNode(newNode);
                        return;
                    }
                    else {
                        currentNode = currentNode.getRightNode();
                    }
                }
            }

        }
    }

    public void intAdd2 (int value){
        Node newNode2 = new Node();
        newNode2.setValue(value);
        if (rootNode == null){
            rootNode = newNode2;
        } else {
            add(newNode2, rootNode);
        }
    }

    private void add(Node newNode, Node parentNode){
        if (newNode.getValue() > parentNode.getValue()) {
            if(parentNode.getRightNode() == null ){
                parentNode.setRightNode(newNode);
            } else {
                add(newNode, parentNode.getRightNode());
            }
        }
        if (newNode.getValue() < parentNode.getValue()) {
            if (parentNode.getLeftNode() == null){  // Проверка отсутствия правого потомка
                parentNode.setLeftNode(newNode);  // Назначение нового значения левым потомком
            } else {
                add(newNode, parentNode.getLeftNode());
            }
        }
    }

//    public boolean intRemove (int value){
//        Node currentNode = rootNode;
//        Node parrentNode = rootNode;
//        boolean isLeftChild = true;
//        while (currentNode.getValue() != value) {
//            parrentNode = currentNode;
//            if (value < currentNode.getValue()) {
//                isLeftChild = true;
//                currentNode = currentNode.getLeftNode();
//            }
//            else {
//                isLeftChild = false;
//                currentNode = currentNode.getRightNode();
//            }
//            if (currentNode == null)
//                return false;
//        }
//        if (currentNode.getLeftNode() == null && currentNode.getRightNode() == null) {
//            if (currentNode == rootNode)
//                rootNode = null;
//            else if (isLeftChild)
//                parrentNode.setLeftNode(null);
//            else
//                parrentNode.setRightNode(null);
//        }
//
//        else if (currentNode.getRightNode() == null) {
//            if (currentNode == rootNode)
//                rootNode = currentNode.getLeftNode();
//            else if (isLeftChild)
//                parrentNode.setLeftNode(currentNode.getLeftNode());
//            else
//                parrentNode.setRightNode(currentNode.getLeftNode());
//            }
//        else if (currentNode.getLeftNode() == null) {
//            if (currentNode == rootNode)
//                rootNode = currentNode.getRightNode();
//            else if (isLeftChild)
//                parrentNode.setLeftNode(currentNode.getRightNode());
//            else
//                parrentNode.setRightNode(currentNode.getRightNode());
//            }
//        else {
//            Node heir = receiveHeir(currentNode);
//            if (currentNode == rootNode)
//                rootNode = heir;
//            else if (isLeftChild)
//                parrentNode.setLeftNode(heir);
//            else
//                parrentNode.setRightNode(heir);
//            }
//        return true;
//    }

    private Node find (int value, Node parentNode) {
        if (value == parentNode.getValue()) {
        return parentNode;
        }
        else if (value > parentNode.getValue()) {
        if (parentNode.getRightNode() == null) {
            return null;  // Искомое значение не найдено
        } else {
            return find(value, parentNode.getRightNode());
        }
        } else {
        if (parentNode.getLeftNode() == null) {
            return null; // Искомое значение не найдено
        } else {
            return find(value, parentNode.getLeftNode());
        }
        }
    }

    public boolean intRemove2(int value) {
        Node parent = find(value, rootNode).getParent();
        if (find(value, rootNode) == null) {
            throw new RuntimeException("Value not found");
        }
        else if (find(value,rootNode).getRightNode() == null && find(value, rootNode).getRightNode() == null) {
                if (find(value, rootNode) == rootNode) {
                    rootNode = null;
                }
                if (find(value,rootNode).getValue() > parent.getValue()) {
                    parent.setRightNode(null);
                } else if (find(value,rootNode).getValue() < parent.getValue()) {
                    parent.setLeftNode(null);
                }
            } else if (find(value,rootNode).getRightNode() == null || find(value, rootNode).getLeftNode() == null){
                if (find(value,rootNode).getValue() > parent.getValue()) {
                    parent.setRightNode(null);
                }
                if (find(value,rootNode).getValue() < parent.getValue()) {
                    parent.setLeftNode(null);
                }
            }

        else if (find(value, rootNode).getRightNode() == null) {
                find(value, rootNode).setParent(find(value, rootNode).getLeftNode());
        }
        return true;
    }



//    private Node receiveHeir(Node node){
//        Node parentNode = node;
//        Node heirNode = node;
//        Node currentNode = node.getRightNode();
//        while (currentNode != null) {
//            parentNode = heirNode;
//            heirNode = currentNode;
//            currentNode = currentNode.getLeftNode();
//        }
//        if (heirNode != node.getRightNode()){
//            parentNode.setLeftNode(heirNode.getRightNode());
//            heirNode.setRightNode(node.getRightNode());
//        }
//        return heirNode;
//    }


//    public int size() {
//        Node currentNode = rootNode;
//        int amountOfElements = 0;
//        if (currentNode == null){
//            return amountOfElements;
//        } else if (currentNode.getLeftNode() == null && currentNode.getRightNode() == null) {
//            amountOfElements = 1;
//            return amountOfElements;
//        } else {
//            while (true) {
//                if (currentNode.getRightNode() != null) {
//                    amountOfElements++;
//                }
//                if (currentNode.getLeftNode() != null) {
//                    amountOfElements++;
//                }
//                return amountOfElements;
//            }
//        }
//    }
}
