package duong.dev;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List {
	public Node first;
	
	public List() {
		first = null;
	}

	public void chenDau(int x) { 
		Node nut = new Node(x);
		nut.next = first;
		first = nut;
	}
	
	// In mang
	public void printList() {
		Node p = first;	
		System.out.println("List la: ");
		while (p != null) {
			p.printNode();
			p = p.next;
		}
	}
	
	// In cac phan tu le
	public void printLe() {
		Node p = first;	
		System.out.println("\nCac so le là:");
		while (p != null) {
			if (p.noidung %2 == 1) {
				p.printNode();
			}
				p = p.next;
		}
	}
	
	//Kiem tra danh sach rong hay k?
	public boolean isEmpty() {
		return first == null;
	}
	
	//Trung binh cong
	public double tinhTrungBinhCong() {
		Node p = first;	
		int tong = 0;
		int dem = 0;
		while (p != null) {
			tong += p.noidung;
			dem++;
			p = p.next;
		}
		return (double) tong/dem;
	}
	
	//Kiem tra x
	public boolean checkX(int x) {
		Node p = first;	
		while (p != null) {
			if (p.noidung == x) {
				return true;
			}
			p = p.next;
		}
		return false;
	}
	
	//So phan tu chia het cho x ma khong chia het cho y
	public void checkXY(int x, int y) {
		Node p = first;
		int dem = 0;
		while (p != null) {
			if ((p.noidung % x == 0) && (p.noidung % y != 0)) {
				dem++;
			}
			p = p.next;
		}
		System.out.printf("So phan tu chia het cho %d nhung khong chia het cho %d la: %d",x,y,dem);
	}
	
	public void sortList(){
		Node p = first;
		boolean check = true;
		while (p.next != null) {
			if (p.noidung > p.next.noidung) {
				check = false;
			}
			p = p.next;
		}
		if (check == true) {
			System.out.println("\n Mang tang dan");
			printList();
		} else {
			System.out.println("\n Mang sau khi sap xep la");
			p = first;
			Node q = p.next;
			int temp;
			while (p!= null) {
				q = p.next;
				while (q != null) {
					if (p.noidung > q.noidung) {
						temp = p.noidung;
						p.noidung = q.noidung;
						q.noidung = temp;
					}
					q = q.next;
				}
				p = p.next;
			}
			printList();
		}
	}
}
