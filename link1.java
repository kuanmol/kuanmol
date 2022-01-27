class likedlist
{
    private listnode head ; 
    private static class listnode
    {
        private int data;
        private listnode next;
        public listnode(int data)
        {
            this.data = data;
            this.next=null;
        }
    }
    public void insert(int position, int value)
    {
		listnode node = new listnode(value);

		if(position == 1)
        {
			node.next = head;
			head = node;
		} 
        else 
        {
			listnode previous = head;
			int count = 1; // position - 1
            while(count < position - 1)
            {
				previous = previous.next;
				count++;
			}

			listnode current = previous.next;
			previous.next = node;
			node.next = current;
		}
    }
    public void display() 
    {
		listnode current = head;
		while(current != null) 
		{
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
    public int length() 
    {
		if(head == null) 
        {
			return 0;
		}
		int count = 0;
		listnode current = head;
		while(current != null) 
        {
			count++;
			current = current.next;
		}
		return count;
	}
    public static void main(String[] args)
    {
        likedlist sll = new likedlist();
        sll.head=new listnode(10);
        listnode second = new listnode(1);
        listnode third = new listnode(8);
        listnode fourth = new listnode(11);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
      //  sll.insert(2,3);
        sll.display();
        System.out.println();
        System.out.println(sll.length());
        
    }
}