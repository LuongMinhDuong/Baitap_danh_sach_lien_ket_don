package duong.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * LinkedList
 * @author LAPTOP KIM ANH
 *
 */

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a.Dinh nghia danh sach
		List list = new List();
		
		//b.Tao danh sach nhap tu ban phim
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua danh sach: ");
		int number = sc.nextInt();
		for (int i = number; i > 0; i--) {
			System.out.println("Phan tu thu "+ i +" = ");
			int temp = sc.nextInt();
			list.chenDau(temp);
		}
		
		//In list
		list.printList();
		
		// c.In so le
		list.printLe();
		
		//d.Tinh trung binh cong
		System.out.println("\nTrung binh cong la: " + list.tinhTrungBinhCong());
		
		//e. Kiem tra x co thuoc mang ko?
		System.out.println("Nhap vao x muon kiem tra x = ");
		int x = sc.nextInt();
		if (list.checkX(x) == true) {
			System.out.println("X thuoc mang");
		} else {
			System.out.println("X khong thuoc mang");
		}
		
		//f. Dem xem co bao nhieu so chia het cho x, nhung khong chia het cho y
		System.out.println("Nhap x = ");
		int a = sc.nextInt();
		System.out.println("Nhap y = ");
		int b = sc.nextInt();
		list.checkXY(a , b);
		
		//Kiem tra danh sach
		list.sortList();
	}

}
