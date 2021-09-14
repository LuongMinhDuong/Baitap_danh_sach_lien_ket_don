package duong.dev;

public class List {
public Node first;
	
	public List() {
		first = null;
	}
	//chen x vao dau mang
	public void chenDau(String hoten, byte tuoi, double dtb) { 
		Node nut = new Node(hoten, tuoi, dtb);
		nut.next = first;
		first = nut;
	}
	
	// In mang
	public void printList() {
		Node p = first;	
		System.out.println("List Student la: ");
		while (p != null) {
			p.printNode();
			p = p.next;
		}
	}
	
	//Dem xem co bao nhieu ban co diem trung binh tren 5
	public int dem() {
		Node p = first;
		int dem = 0;
		while (p != null) {
			if (p.dtb > 5) {
				dem ++;
			}
			p = p.next;
		}
		return dem;
	}
	
	public void print() {
		Node p = first;
		System.out.println("\nCac sinh vien co tuoi tren 25 va DTB > 8 la: ");
		while (p != null) {
			if ((p.tuoi > 25) && (p.dtb > 8)) {
				p.printNode();
			}
			p = p.next;
		}
	}
}
