package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Basics {


	public static void main(String[] args) {
		//task0_MaxMinAvg();
		task1_quickSort(new int[]{0,6,9,2,5,7,3,3});
		//task2_findPrimes();
		//task3_deleteFromArr(new int[]{1,2,5,7,9,0,5}, 5);

	}

	//Поиск Максимального, минимального, среднего
	public static void task0_MaxMinAvg(){
		//ввод
		final int n = 100;
		double[] arr = new double[n];
		for (int i = 0; i<n; i++){
			arr[i] = Math.random();
		}

		double max = arr[0];
		double min = arr[0];
		double avg = 0;
		for (int i =0; i<arr.length; i++){
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
			avg += arr[i]/arr.length;
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("avg = " + avg);
	}

	//СОРТИРОВКА ПУЗЫРЬКОМ
	public static void task1_quickSort(int arr[]){
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr.length-i-1; j++){
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.print(Arrays.toString(arr));
	}



	//Поиск простых чисел от 2 до 100
	public static void task2_findPrimes(){
		boolean flag = true;
		for (int i = 2; i<=100; i++){
			for (int j = i-1; j > 1; j--){
				if (i % j == 0){
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Prime: "+i);
			flag = true;
		}
	}

	/*
	Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива
	(пропусков быть не должно).
	 */
	public static void task3_deleteFromArr(int[] arr, int n){
		int offset = 0;
		for (int i = 0; i<arr.length; i++){
			if (arr[i] == n){
				offset++;
			}
			else {
				arr[i - offset] = arr[i];
			}
		}
		int[] arr2 = Arrays.copyOf(arr, arr.length-offset);

		System.out.print(Arrays.toString(arr2));
	}



}
