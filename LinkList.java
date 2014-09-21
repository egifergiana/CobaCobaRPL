import java.util.Scanner;
class LinkList {
	private node head, tail;
	public Scanner dataIn=new Scanner(System.in);
	
	public LinkList (){
		head = null;
	}
	
	public void tambahDepan(int d){
		node baru = new node (d);
		if (head == null){
			head = baru;
			tail = baru;
		}
		else {
			baru.next = head;
			head = baru ;
		}
	}
	
	public void tambahBelakang (int d){
		node baru = new node (d);
		if(head == null){
			head = baru;
			tail = baru;
		}
		else{
			tail.next = baru;
			tail = baru;
		}
	}
	
	public node hapusDepan(){
		if(head != null){
			node temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
		else{
			System.out.println("List Kosong!");
			return null;
		}
	}
	
	public node hapusBelakang(){
		if(head != null){
			node temp , bantu;
			if(head.next == null){
			temp = head ;
			head = tail = null;
			}
			else{
				bantu = head;
				while (bantu.next != tail){
					bantu = bantu.next;
				}
				temp = tail;
				tail = bantu;
				tail.next = null;
			}
			return temp;
		}
		else{
			System.out.println("List Kosong!");
			return null;
		}
	}
	
	public void displayList(){
		if (head !=null){
			node bantu = head;
			System.out.println("====== Data dalam List ======");
			while(bantu != null){
				System.out.println(bantu.data+ " ");
				bantu = bantu.next;
			}
			System.out.println(" ");
		}
		else{
			System.out.println("List Kosong!");
		}
	}
	
	public int setData(){
		int input;
		System.out.print("Masukkan data berupa bilangan bulat : ");
		input=dataIn.nextInt();
	return input;
	}
	
	
}
	