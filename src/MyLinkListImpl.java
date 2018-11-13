public class MyLinkListImpl implements MyLinkList{

    int numberOfLinks;
    Node head;

    public MyLinkListImpl(Object dat){
        head= new Node(dat);
    }

    class Node{

        private Object data;
        private Node next;

        private Node(Object dat){
            data = data;
        }

        public Object getData(){
            return data;
        }

    }

    public void addAtHead(Object dat) {
        Node temp = head;
        head = new Node(dat);
        head.next=temp;
        numberOfLinks++;

    }

    public void addAtTail(Object dat) {

        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(dat);
        numberOfLinks++;
    }

    public void addAtIndex(int index, Object dat) {

        Node holder;
        Node temp;
        temp = head;

        for (int i = 0; i<index-1 && temp.next!=null; i++){
            temp=temp.next;
        }
        holder = temp.next;
        temp.next=new Node(dat);
        temp.next.next=holder;
        numberOfLinks++;

        //gå igennem, gem den der kommer før, dens .next skal ændres
        //gem den der står på pladsen
        // den nye skal peje på den gamle


    }

    public void deleteAtIndex(int index) {

        //gem referance.
        Node temp;
        temp = head;
        Node holder;

        for (int i = 0; i<index-1 && temp.next!=null; i++){
            temp=temp.next;
        }
        holder = temp.next.next;
        temp.next=holder;
        numberOfLinks--;

    }

    public void deleteFirst(Object node) {

        Node temp;
        Node holder;
        temp = head;
        Boolean deleted = true;

        while (deleted) {

            for (int i = 0; i < numberOfLinks; i++) {
                if (temp.getData() == node) {
                    holder = temp.next.next;
                    temp.next = holder;
                }
                temp = temp.next;
                deleted = false;
            }
        }
    }


    public int find(Object node) {

        Node temp;
        temp = head;
        for (int i = 0; i<numberOfLinks; i ++){
            if (node == temp.getData()){
                return i;
            }
        }
        return -1;
    }

    public Object getAtIndex(int index) {
        Node temp;

        temp = head;

        for (int i = 0; i <index; i ++){
            temp=temp.next;
        }
        return temp;
    }

    public void add(Object node){

    }

    public int getSize(){
        return numberOfLinks;
    }
}
