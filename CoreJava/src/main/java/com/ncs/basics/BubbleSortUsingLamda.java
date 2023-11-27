package com.ncs.basics;

interface BubbleSort {

	public void checkBubble(int[] a);
}

public class BubbleSortUsingLamda {

	public static void main(String[] args) {

		int[] c = { 1000, 205, 30, 4089, 5078, 7 };

		BubbleSort b = (a) -> {

			int count = 0;

			for (int i = 0; i < a.length; i++) {

				for (int j = 1; j < a.length - i; j++) {

					if (a[j - 1] > a[j]) {

						count = a[j - 1];

						a[j - 1] = a[j];

						a[j] = count;
					}

				}

			}

			for (int k = 0; k < a.length; k++) {

				System.out.print(a[k] + " ");
			}

		};

		b.checkBubble(c);

	}

}
