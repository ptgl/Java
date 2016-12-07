package com.csc.game;
import com.csc.game.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args){
		inputTanks();
	}
	
	private static List<Tank> inputTanks(){
		List<Tank> list = new ArrayList<Tank>();
		
		Scanner scanner = new Scanner(System.in);
		int command; 
		
		do {
			
			System.out.println("0. Exit");
			System.out.println("1. Input new Tank");
			System.out.println("2. List Tanks");
			System.out.println("3. Sort tank in the list by level");
			System.out.println("4. Sort tank in the list by Hp");
			
			command = scanner.nextInt();
			switch(command){
			case 0:
				break;
			
			case 1:
				Tank t = new Tank();
				System.out.println("HP: ");
				int hp = scanner.nextInt();
				System.out.println("Level: ");
				int level = scanner.nextInt();
				t.setHp(hp);
				t.setLevel(level);
				list.add(t);
				break;
				
			case 2:
				System.out.println(">>>>>>>>> List of Tanks: \n"); 
				for(Tank tank: list){
					System.out.println("HP: " + tank.getHp());
					System.out.println("Level: " + tank.getLevel());
					System.out.println("==========================");
										
				}
				break;
				
			case 3:
				/**
				 * return:
				 * 		0: o1 == o2
				 * 		1: o1 > o2
				 * 		-1: o1 < o2
				 *
				 */
				Comparator<Tank> comp = new Comparator<Tank>(){
					

					@Override
					public int compare(Tank o1, Tank o2) {					
						
						if(o1.getLevel() == o2.getLevel())
							return 0;
						
						if(o1.getLevel() > o2.getLevel())
							return 1;
						
						return -1;
					}
					
				};
				
				
				
				Collections.sort(list, comp );
				
				System.out.println(">>>>>>>>> List of Tanks AFTER Sorting( using Comparator): \n"); 
				printTanks(list);
				
				break;
				
			case 4:
				
				System.out.println(">>>>>>>>> List of Tanks AFTER Sorting( using Comparable): \n"); 
				
				//list.sort(null);
				
				
				Collections.sort(list);
				printTanks(list);				
				
				break;
			}
			
			
			
		}while(command != 0);
		
		return list;
		
	}
	
	public static void printTanks(List<Tank> list){
		
		for(Tank tank: list){
			System.out.println("HP: " + tank.getHp());
			System.out.println("Level: " + tank.getLevel());
			System.out.println("==========================");
								
		}
	}

}
