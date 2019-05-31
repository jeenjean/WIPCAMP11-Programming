/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package V.Selection;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class ProS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = 5, b;
        int limit = 11;
        System.out.println("Add    =1");
        System.out.println("Remove =2");
        System.out.println("Check  =3");
        System.out.println("เลือกเบอร์ :");
        int j = sc.nextInt();
        switch (j) {
            case 1:
                if (j < limit) {
                    System.out.println("ใส่จำนวนที่เพิ่ม :");
                    int a = sc.nextInt();
                    b = item + a;
                    if (b < limit) {
                        System.out.println("limit คือ :" + limit);
                        System.out.println("item คือ :" + b);
                        
                    } else {
                        System.out.println("เกินlimit");
                    }
                }   break;
            case 2:
                if (j < limit) {
                    System.out.println("ใส่จำนวนที่เอาออก");
                    int a = sc.nextInt();
                    b = item - a;
                    if (b < 0) {
                        System.out.println("ของไม่พอ");
                        
                    } else {
                        System.out.println("limit คือ :" + limit);
                        System.out.println("item คือ :" + b);
                    }
                }   break;
            case 3:
                System.out.println("limit คือ :" + limit);
                System.out.println("item คือ :" + item);
                break;
            default:
                System.out.println("ไม่มีเมนูนี้");
                break;
        }
    }
}
