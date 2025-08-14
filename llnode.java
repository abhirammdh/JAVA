public class llnode {
    llnode next;
    int data;
    public void addnode(int data) throws Exception {
        llnode temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new llnode();
        temp.next.data = data;
    }
    public boolean deletenode(int data) throws Exception {
        return false;
    }
    public void printnodes() {
        llnode temp = this;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        llnode head = new llnode();
        head.data = 10;
        head.addnode(20);
        head.addnode(30);
        head.deletenode(20); 
        head.printnodes();   
    }
}
