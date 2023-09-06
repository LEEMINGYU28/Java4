package c230906;

import java.util.List;

class Node<T> {
    public Node<T> next;
    public T data;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

class LinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public void add(T data) {
        if (data == null) {
            return;
        }

        if (head == null) {
            head = new Node<T>(data);
            tail = head;
        } else {
            Node<T> newNode = new Node<T>(data);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public Node<T> find(T data) throws Exception {
        Node<T> iter = head;
        while (iter != null && !iter.getData().equals(data)) {
            iter = iter.getNext();
        }

        if (iter == null) {
            throw new Exception(data + "은(는) 리스트에 존재하지 않습니다.");
        }

        return iter;
    }

    public boolean delete(T deleteMe) {
        Node<T> iter = head;

        if (head == null || deleteMe == null) return false;

        if (head.getData().equals(deleteMe)) {
            head = iter.getNext();
            iter = null;
            size--;

            return true;
        }

        while (iter != null) {
            if (iter.getNext() != null && iter.getNext().getData().equals(deleteMe)) {
                Node<T> temp = iter.getNext();
                iter.setNext(temp.getNext());
                temp = null;

                size--;
                return true;
            }
            iter = iter.getNext();
        }

        return false;
    }

    public int size() {
        return this.size;
    }
}

public class Homework {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();

        // 삽입
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        // 찾기
        System.out.println(list.find(0));

        // 삭제
        list.delete(4);
        System.out.println(list.size());

        // 헤드 삭제시 검색
        System.out.println(list.find(4));
    }
}
	
